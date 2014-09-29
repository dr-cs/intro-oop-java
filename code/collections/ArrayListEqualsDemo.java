importjava.util.ArrayList;

publicclassArrayListEqualsDemo{

staticabstractclassPerson{
publicStringname;
publicPerson(Stringname){
this.name=name;
}
}

staticclassLostPersonextendsPerson{
publicLostPerson(Stringname){super(name);}
}

staticclassFoundPersonextendsPerson{
publicFoundPerson(Stringname){super(name);}

publicbooleanequals(Objectother){
if(null==other)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofPerson))returnfalse;
return((Person)other).name.equals(this.name);
}
}

staticclassOverloadedPersonextendsPerson{
publicOverloadedPerson(Stringname){super(name);}

publicbooleanequals(OverloadedPersonother){
if(null==other)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofOverloadedPerson))returnfalse;
return((OverloadedPerson)other).name.equals(this.name);
}
}

publicstaticvoidmain(String[]args){
ArrayList<Person>peeps=newArrayList<>();
//NoticethatwecanputsubclassesofPersoninpeeps
Personwilma=newLostPerson("Wilma");
peeps.add(wilma);
peeps.add(newFoundPerson("Fred"));
peeps.add(newLostPerson("Barney"));
peeps.add(newOverloadedPerson("Bam-Bam"));

System.out.println("Ineachcasebelow,therightansweristrue.");
//1:
//Willprinttruebecuasethedefaultimplementationofequals
//uses==forobjectidentity,andwe'reusingthesamereference
//that'sstoredinpeeps
System.out.println("1:Queryingwithalias:"+peeps.contains(wilma));
System.out.println("1.1:Queryingwithequal-valueddistinctobject:"
+peeps.contains(newLostPerson("Wilma")));

//Therestoftheexampleseachusenewobjects,socan'trely
//onobjectidentity
System.out.println("\nRemainingexamplesquerywithequal-valued"
+"distinctobjects.");

//2:
//Willprinttruebecausewe'requeryingwithaFoundPerson,
//whichhasaproperlyimplementedequals()
System.out.println("\nSearchingforFoundPersoninlist.");
System.out.println("2:QueryingwithFoundPersonobject:"
+peeps.contains(newFoundPerson("Fred")));

//3:
//Willprintfalsebecausewe'requeryingwithaLostPerson,
//whichdoesnothashaveaproperlyimplementedequals()
System.out.println("3:QueryingwithLostPerson:"
+peeps.contains(newLostPerson("Fred")));

//4:
//Willprinttruebecausewe'requeryingwithaFoundPerson,
//whichhasaproperlyimplementedequals().
//Noticeitdoesn'tmatterthattheobjectinthelistisof
//typeLostPerson.Thequeryobject'sequals()methodisused.
System.out.println("\nSearchingforLostPersoninlist.");
System.out.println("\nNoticethatcontainsmethodusesqueryobject's"
+"equalsmethod.");
System.out.println("4:QueryingwithFoundPerson:"
+peeps.contains(newFoundPerson("Barney")));

//5:
//Willprintfalsebecausewe'requeryingwithaLostPerson,
//whichdoesnothashaveaproperlyimplementedequals()
System.out.println("5:QueryingwithLostPerson:"
+peeps.contains(newLostPerson("Barney")));

System.out.println("\nSearchingforOverloadedPersoninlist.");
System.out.println("5:QueryingwithOverloadedPerson:"
+peeps.contains(newOverloadedPerson("Bam-Bam")));
}

}
