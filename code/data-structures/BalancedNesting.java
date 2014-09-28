import java.util.*;

public class BalancedNesting {

public static boolean isBalanced(String s) {
Map<Character, Character> openers = new HashMap<>();
openers.put(')', '(');
openers.put(']', '[');
openers.put('}', '{');
openers.put('>', '<');
Stack<Character> stack = new Stack<Character>();
for (int i = 0; i < s.length(); i++) {
Character c = s.charAt(i);
if (openers.values().contains(c)) {
stack.push(c);
} else if (openers.keySet().contains(c)) {
if (stack.isEmpty()) {
return false;
}
Character opener = stack.pop();
if (!opener.equals(openers.get(c))) {
return false;
}
}
}
return stack.isEmpty();
}

public static void main(String[] args) {
String[] testStrings = {
"( { [ ] } )", "( { [ } ] )", "} ( { [ ] } )",
"(map (lambda (x) (* x x)) (list 1 2 3 4))",
"(map (lambda (x) (* x x)) (list 1 2 3 4)))"
};
for (String s: testStrings) {
System.out.printf("%s is balanced: %s.%n", s, isBalanced(s));
}
}
}
