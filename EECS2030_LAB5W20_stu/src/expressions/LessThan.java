package expressions;

public class LessThan extends Expression {
	int left;
	int right;
	
	public LessThan(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}

	void evaluate() {
		value = this.left < this.right;
	}

}
