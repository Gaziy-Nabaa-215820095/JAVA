package expressions;

public class AddAll extends ExpressionCollector {
	
	void evaluate() {
		Integer sum = 0;
		for (Expression exp : this.expressions) {
			exp.evaluate();
			sum += (Integer) exp.getValue();
		}
		this.value = sum;
	}

	public Object getValue() {
		return this.value;
	}

}
