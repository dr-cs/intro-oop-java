importjava.util.*;

publicclassCollectionsDemo{

publicstaticvoidmain(String[]args){
List<String>nameList=Arrays.asList("Alan","Ada","Alan");
Set<String>nameSet=newHashSet<>(nameList);
System.out.println("nameSet:"+nameSet);

Map<String,String>capitals=newHashMap<>();
capitals.put("Georgia","Atlanta");
capitals.put("Alabama","Montgomery");
capitals.put("Florida","Tallahassee");
for(Stringstate:capitals.keySet()){
System.out.println("Capitalof"+state+"is"
+capitals.get(state));
}
}
}
