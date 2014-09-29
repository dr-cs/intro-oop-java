publicclassGtStudent{

privateStringname;
privateMajormajor;

publicGtStudent(StringaName,MajoraMajor){
name=aName;
major=aMajor;
}
publicStringgetName(){returnname;}

publicMajorgetMajor(){returnmajor;}

publicStringtoString(){
returnname+"("+major+")";
}
}
