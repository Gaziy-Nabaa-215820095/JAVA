package expressions;

public class Multiplication extends Expression {
	
	int left;
	int right;
	
	public Multiplication(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}

	void evaluate() {
		value = this.left*this.right;
	}
}
