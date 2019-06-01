package vectors;

import java.util.Stack;

public class StackVector {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("Boss");
		s.push("sai");
		s.push("jersey");
		
		
		System.out.println(s);
		//s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("jersey"));
		
		
		
	}

}
