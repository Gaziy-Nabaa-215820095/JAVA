package expressions;

public class GreaterThan extends Expression{
	int left;
	int right;
	
	public GreaterThan(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}

	void evaluate() {
		value = this.left > this.right;
	}

}
