package expressions;



public class DisjoinAll extends ExpressionCollector {

	

	void evaluate() {
		Boolean disjoin = false;
		if (this.expressions.size() == 0) {
			this.value = false;
		} else {
			for (Expression exp : this.expressions) {
				exp.evaluate();
				disjoin = disjoin || (Boolean) exp.value;
			}

			this.value = disjoin;
		}
	}

	@Override
	public Object getValue() {
		return this.value;
	}
}