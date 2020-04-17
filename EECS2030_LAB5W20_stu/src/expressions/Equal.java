package expressions;

public class Equal extends Expression{
	private boolean equals;
	
	int left;
	int right;
	
	public Equal (int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}

	void evaluate() {
		value = this.left == this.right;
	}
	
	public Object getValue() {
		return this.value;
	}

}
