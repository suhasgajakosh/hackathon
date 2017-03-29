package paranthesis;

public class Stacks {

	public static void main(String[] args) {

		String input = "([[)";
		String output = validateParantesis(input);
		System.out.println(output);
	}

	private static String validateParantesis(String input) {
		
		String str = "NO";
		char[] stack = new char[input.length() / 2];
		char[] arr = input.toCharArray();
		int top = -1;
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			if('(' == arr[i] || '{' == arr[i] || '[' == arr[i]) {
				top = push(stack, arr[i], top);
			} else if (')' == arr[i] || '}' == arr[i] || ']' == arr[i]) {
				top = pop(stack, top, arr[i]);	
				if (top == -1) {
					
					break;
				}
			}
		}
		
		if (top == 0) {
			str = "YES";
		}		
		return str;
	}

	private static int pop(char[] stack, int top, char ch) {
		if (('{' == stack[top] && '}' == ch) || ('[' == stack[top] && ']' == ch) || ('(' == stack[top] && ')' == ch)) {
			stack[top] = ' ';
			top --;			
		} else {
			top = -1;
		}
		return top;
	}

	private static int push(char[] stack, char c, int top) {

		if (null != stack && top < stack.length - 1) {
			top ++;
			stack[top] = c;			
		}
		
		return top;
	}

}
