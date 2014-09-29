importjava.awt.Color;

publicclassHipsterextendsPerson{

privateintbeardLength;
privateColorbeanieColor;

publicHipster(Stringname,intjeanBagginess,
intbeardLength,ColorbeanieColor){
super(name);
if(jeanBagginess>0){
thrownewIllegalArgumentException("Jeansmustbeskinny!");
}
this.beardLength=beardLength;
this.beanieColor=beanieColor;
}

publicintgetBeardLength(){
returnbeardLength;
}

publicColorgetBeanieColor(){
returnbeanieColor;
}

publicbooleanequals(Objectother){
if(null==other)returnfalse;
if(this==other)returntrue;
if(!(otherinstanceofHipster))returnfalse;
Hipsterthat=(Hipster)other;
returnsuper.equals(that)
&&this.beardLength==that.beardLength
&&this.beanieColor.equals(that.beanieColor);
}
}
