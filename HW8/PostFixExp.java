import java.util.*;

//13.7 - Angela Bonsol 

public class PostFixExp {

	private Stack<Integer> stack;
	
	public PostFixExp() {
		stack = new Stack<Integer>();
	}
	
	public int express(String expression) {
		StringTokenizer line = new StringTokenizer(expression);
		
		int num1, num2, result =0;
		String operator;
		
		while (line.hasMoreTokens()) {
			operator = line.nextToken();
				if (operator.equals("+") ) {
					num2 = (stack.pop()).intValue();
					num1 = (stack.pop()).intValue();
					result = num1 + num2;
					stack.push(new Integer(result));
				} 
				if (operator.equals("-")) {
					num2 = (stack.pop()).intValue();
					num1 = (stack.pop()).intValue();
					result = num1 - num2;
					stack.push(new Integer(result));
				} 
				if (operator.equals("*")) {
					num2 = (stack.pop()).intValue();
					num1 = (stack.pop()).intValue();
					result = num1 * num2;
					stack.push(new Integer(result));
				} 
				if (operator.equals("/")) {
					num2 = (stack.pop()).intValue();
					num1 = (stack.pop()).intValue();
					result = num1 / num2;
					stack.push(new Integer(result));
				} 
				
				
				else {
					stack.push(new Integer(Integer.parseInt(operator)));
				} 
			}
			return result;
		} 

}
		