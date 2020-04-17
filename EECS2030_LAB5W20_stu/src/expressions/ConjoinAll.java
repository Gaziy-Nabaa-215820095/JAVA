package expressions;

public class ConjoinAll extends ExpressionCollector {
	void evaluate() {
		Boolean conjoin = true;
		if (this.expressions.size() == 0) {
			this.value = true;
		} else {
			for (Expression exp : this.expressions) {
				exp.evaluate();
				conjoin = conjoin && (Boolean) exp.value;
			}

			this.value = conjoin;
		}
	}

	@Override
	public Object getValue() {
		return this.value;
	}

}
