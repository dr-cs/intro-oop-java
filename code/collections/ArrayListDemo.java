importjava.util.ArrayList;

publicclassArrayListDemo{

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
if(this==other)returntrue;
if(!(otherinstanceofPerson))returnfalse;
return((Person)other).name.equals(this.name);
}
}

publicstaticvoidmain(String[]args){
ArrayList<Person>peeps=newArrayList<>();
//NoticethatwecanputsubclassesofPersoninpeeps
Personwilma=newFoundPerson("Wilma");
peeps.add(wilma);
peeps.add(newFoundPerson("Fred"));
peeps.add(newLostPerson("Barney"));

//1:
//Willprinttruebecuasethedefaultimplementationofequals
//uses==forobjectidentity,andwe'reusingthesamereference
//that'sstoredinpeeps
System.out.println("1:"+peeps.contains(wilma));

//Therestoftheexampleseachusenewobjects,socan'trely
//onobjectidentity

//2:
//Willprinttruebecausewe'requeryingwithaFoundPerson,
//whichhasaproperlyimplementedequals()
System.out.println("2:"+peeps.contains(newFoundPerson("Fred")));

//3:
//Willprintfalsebecausewe'requeryingwithaLostPerson,
//whichdoesnothashaveaproperlyimplementedequals()
System.out.println("3:"+peeps.contains(newLostPerson("Fred")));

//4:
//Willprinttruebecausewe'requeryingwithaFoundPerson,
//whichhasaproperlyimplementedequals().
//Noticeitdoesn'tmatterthattheobjectinthelistisof
//typeLostPerson.Thequeryobject'sequals()methodisused.
System.out.println("4:"+peeps.contains(newFoundPerson("Barney")));

//5:
//Willprintfalsebecausewe'requeryingwithaLostPerson,
//whichdoesnothashaveaproperlyimplementedequals()
System.out.println("5:"+peeps.contains(newLostPerson("Barney")));
}

}
