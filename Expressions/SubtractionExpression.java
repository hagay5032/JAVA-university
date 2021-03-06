package Expressions;


/**
 * This class represent an subtraction expression
 * 
 * @author Hagay Enoch
 * @version 203089917
 */
public class SubtractionExpression extends CompoundExpression {
	
	/*
	 * Create a new AdditionExpression object 
	 * @param first - is the first expression or the left expression of the new AdditionExpression
	 * @param sec - is the second expression or the right expression of the new AdditionExpression
	 */
	public SubtractionExpression(Expression first ,Expression sec) {
		super(first,sec);
	}
	
	/*
	 * Return the value of the SubtractionExpression object 
	 * @return Return the value of SubtractionExpression object
	 */	
	public double calculate() {
		double sum = 0;
		sum = exp_one.calculate() - exp_two.calculate();
		return sum;
		}
	
	/*
	 * Return a string representation of SubtractionExpression object 
	 * @return Return a string representation of SubtractionExpression object
	 */
	public String toString() {
		String str;
		if(exp_one instanceof AtomicExpression)
			if(exp_two instanceof AtomicExpression)
				str = exp_one.toString() +"-"+ exp_two.toString();// the first and second expressions are atomic
			else
				str = exp_one.toString() +"-("+ exp_two.toString()+")";// the first expression is atomic and the second not
		else { 
			if(exp_two instanceof AtomicExpression)
				str = "("+exp_one.toString()+")-"+ exp_two.toString();// the second expression is atomic and the first not
			else
				str = "("+exp_one.toString()+")-("+ exp_two.toString()+")";// the first and second expressions aren't atomic
		}
		return str;
	}
}

