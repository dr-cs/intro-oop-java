importjava.util.ArrayList;
importjava.util.List;
importjava.util.Collections;
importjava.util.Comparator;
importjava.util.Set;
importjava.util.HashSet;

publicclassSuperTroopers{

staticclassTrooperimplementsComparable<Trooper>{

privateStringname;
privatebooleanmustached;

publicTrooper(Stringname,booleanhasMustache){
this.name=name;
this.mustached=hasMustache;
MustacheComparatormc=newMustacheComparator();
}

publicStringgetName(){returnname;}
publicbooleanhasMustache(){returnmustached;}

publicStringtoString(){
returngetName()+(hasMustache()?":-{":":-|");
}

publicbooleanequals(Objectother){
if(null==other)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofTrooper))returnfalse;
Trooperthat=(Trooper)other;
returnthis.name.equals(that.name)&&this.mustached==that.mustached;
}

publicinthashCode(){
intresult=17;
result=31*result+name.hashCode();
result=31*result+(mustached?1:0);
returnresult;
}

publicintcompareTo(Trooperother){
returnthis.name.compareTo(other.name);
}
}

staticclassMustacheComparatorimplementsComparator<Trooper>{

publicintcompare(Troopera,Trooperb){
if(a.hasMustache()&&!b.hasMustache()){
return1;
}elseif(b.hasMustache()&&!a.hasMustache()){
return-1;
}else{
returna.getName().compareTo(b.getName());
}
}
}

publicstaticvoidmain(String[]args){
List<Trooper>troopers=newArrayList();
troopers.add(newTrooper("Thorny",true));
troopers.add(newTrooper("Farva",true));
troopers.add(newTrooper("Farva",true));
troopers.add(newTrooper("Ursula",false));
troopers.add(newTrooper("Rabbit",false));
troopers.add(newTrooper("Mac",true));
troopers.add(newTrooper("Foster",true));

System.out.println("Beforesorting:\n"+troopers);

//Notethatsort()isdestructive,thatis,itmodifiesthe
//collectionratherthanreturningasortedcopy.
Collections.sort(troopers);
System.out.println("\nAftersorting:\n"+troopers);

Collections.sort(troopers,newMustacheComparator());
System.out.println("\nAftermustache-basedsorting:\n"+troopers);

Collections.sort(troopers,newComparator<Trooper>(){
publicintcompare(Troopera,Trooperb){
if(a.hasMustache()&&!b.hasMustache()){
return-1;
}elseif(b.hasMustache()&&!a.hasMustache()){
return1;
}else{
return-a.getName().compareTo(b.getName());
}
}
});
System.out.println("\nAfterreversemustache-basedsorting:\n"+troopers);


//Collections.sort(troopers,newReverseMustacheComparator());
//System.out.println("\nAfterreversemustache-basedsorting:\n"
//+troopers);




//Noticethatyoucancreateanewcollectionbypassingan
//existingcollectiontotheconstructor.Thisisa
//conventioninthecollectionsframework,butisnot
//guaranteedbyanylanguagefeatureofJava.
Set<Trooper>trooperSet=newHashSet<>(troopers);

//Noticethatduplicatesareremoved,whichisgood,'cuzwho
//needstwoFarvas?
System.out.println("\nAsaset:\n"+trooperSet);

System.out.println("Mac'shashCode:"
+newTrooper("Mac",true).hashCode());
System.out.println("Mac'shashCode:"
+newTrooper("Mac",true).hashCode());
System.out.println("Mac'shashCode:"
+newTrooper("Mac",true).hashCode());

//Macisintheset,butwedon'tfindhimbecausewedidn't
//overridehashCode().
System.out.println("\nOops!Didn'toverridehashCode():");
System.out.println("trooperSet.contains(newTrooper(\"Mac\",true))="
+trooperSet.contains(newTrooper("Mac",true)));
}

}
