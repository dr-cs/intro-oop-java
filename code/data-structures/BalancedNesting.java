importjava.util.*;

publicclassBalancedNesting{

publicstaticbooleanisBalanced(Strings){
Map<Character,Character>openers=newHashMap<>();
openers.put(')','(');
openers.put(']','[');
openers.put('}','{');
openers.put('>','<');
Stack<Character>stack=newStack<Character>();
for(inti=0;i<s.length();i++){
Characterc=s.charAt(i);
if(openers.values().contains(c)){
stack.push(c);
}elseif(openers.keySet().contains(c)){
if(stack.isEmpty()){
returnfalse;
}
Characteropener=stack.pop();
if(!opener.equals(openers.get(c))){
returnfalse;
}
}
}
returnstack.isEmpty();
}

publicstaticvoidmain(String[]args){
String[]testStrings={
"({[]})","({[}])","}({[]})",
"(map(lambda(x)(*xx))(list1234))",
"(map(lambda(x)(*xx))(list1234)))"
};
for(Strings:testStrings){
System.out.printf("%sisbalanced:%s.%n",s,isBalanced(s));
}
}
}
