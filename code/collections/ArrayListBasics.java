importjava.util.ArrayList;
importjava.util.Collections;
importjava.util.Iterator;

publicclassArrayListBasics{

privatestaticclassPerson{
privateStringname;
publicPerson(Stringname){
this.name=name;
}
publicStringgetName(){
returnname;
}
}

publicstaticvoidmain(String[]args){
ArrayList<Person>peeps=newArrayList<>(10);
peeps.add(newPerson("Aaron"));
peeps.add(newPerson("Evan"));

for(Personp:peeps){
System.out.println(p.getName());
}


//ArrayListtasks=newArrayList();
//tasks.add("Eat");
//tasks.add("Sleep");
//tasks.add("Code");

//System.out.println("LifeofaCSmajor:");

////Bestwaytoiterate:usingfor-eachloop
//for(Objecttask:tasks){
//System.out.println(task);
//}

//System.out.println("\nLet'sbereal:");
//tasks.remove("Sleep");

////Anotherwaytoiterate,usingiteratorandwhile
//IteratortasksIter=tasks.iterator();
//while(tasksIter.hasNext()){
//Objecttask=tasksIter.next();
//System.out.println(task);
//}

//System.out.println("\nOK,maybe:");
//tasks.add("RedBull");

////Usingiteratorandfor(noticewe'reincrementingthe
////iteratorinthebody,notthefor-loopheader).
//for(Iteratoriter=tasks.iterator();iter.hasNext();){
//Objecttask=iter.next();
//System.out.println(task);
//}

//System.out.println("\nPerhapsinadifferentorder:");
//tasks.remove("Code");
//tasks.add("Code");

////Usingindexesandfor:
//for(inti=0;i<tasks.size();i++){
//Objecttask=tasks.get(i);
//System.out.println(task);
//}
//System.out.println("\nNah,weneedsleep!");
//tasks.add(1,"Sleep");
//for(inti=0;i<tasks.size();i++){
//Objecttask=tasks.get(i);
//System.out.println(task);
//}

//System.out.println("\nOrletthecomputersortitout:");
//Collections.sort(tasks);
//for(Objecttask:tasks){
//System.out.println(task);
//}
}

}
