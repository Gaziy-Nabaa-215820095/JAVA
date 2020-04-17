package expressions;

public class Addition extends Expression {
	int left;
	int right;
	
	public Addition(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
		
	}
	
	void evaluate() {
		value = this.left+this.right;
	}
	
	
}
	