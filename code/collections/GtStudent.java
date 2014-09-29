publicclassGtStudentextendsPerson{

publicenumMajor{
CS,CM,CMPE,EE,IE,ME,AE,ARCH,BME,STAC,MGT,EIA
}

privateintyear;
privateMajormajor;

publicGtStudent(StringaName,intaYear,MajoraMajor){
name=aName;
year=aYear;
major=aMajor;
}

publicStringtoString(){
returnname+","+year+"-year"+major;
}
}
