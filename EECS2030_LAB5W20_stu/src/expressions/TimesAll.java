package expressions;

public class TimesAll extends ExpressionCollector {
	void evaluate() {

		if (this.expressions.size() == 0) {
			this.value = 1;
		} else {
			Integer product = 1;
			for (Expression exp : this.expressions) {
				exp.evaluate();
				product *= (Integer) exp.getValue();
			}
			this.value = product;
		}
	}

	public Object getValue() {
		return this.value;
	}

}
