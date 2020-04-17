package expressions;

public class Subtraction extends Expression{
	int left;
	int right;
	
	public Subtraction(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
		
	}
	
	void evaluate () {
		value = this.left-this.right;
	}

}
