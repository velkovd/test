package datastructures.linear.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] exmaples = new String[] { "[{}]", "[{}]((){}[])" };

		for (int i = 0; i < exmaples.length; i++) {
			test(exmaples[i]);
		}

	}

	private static void test(String exmaple) {
		Deque<Character> stack = new ArrayDeque<Character>();
		Map<Character, Character> charMap = new HashMap<>();
		charMap.put('{', '}');
		charMap.put('[', ']');
		charMap.put('(', ')');

		char[] chars = exmaple.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			if (!stack.isEmpty()) {
				Character character = charMap.get(stack.peek());
				if (character != null && character == chars[i]) {
					stack.pop();
					continue;
				}
			}

			stack.addFirst(chars[i]);

		}

		System.out.println(stack.size());
	}
}
