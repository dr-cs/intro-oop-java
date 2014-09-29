publicclassPersonimplementsComparable<Person>{

privateStringname;

publicPerson(Stringname){
setName(name);
}

publicvoidsetName(Stringname){
if(name==null||name.equals("")){
thrownewIllegalArgumentException("namecan'tbenullorempty");
}
this.name=name;
}

publicStringgetName(){
returnname;
}

publicStringtoString(){
returnname;
}

publicintcompareTo(Personother){
returnname.compareTo(other.name);
}

publicbooleanequals(Objectother){
if(null==other)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofPerson))returnfalse;
Personthat=(Person)other;
returnthis.name.equals(that.name);
}

publicinthashCode(){
returnname.charAt(0)-'A';
}
}
