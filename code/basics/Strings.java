publicclassStrings{
publicstaticvoidmain(String[]args){
//ThesearealllegalwaysofinitializingStrings.
Stringfoo=newString("foo");
Stringbar="bar";//Themostcommonway
Stringbaz;
baz="baz";

//StringscanbeconcatenatedwithotherStrings
Stringbam=foo+bar+baz;

//Stringscanalsobeconcatenatedwithotherobjects
Strings=bam+(42+1);
Stringt=42+1+bam;//tis"42foobarbaz"

System.out.println("bam=\""+bam+"\"");
System.out.println("s=\""+s+"\"");
System.out.println("t=\""+t+"\"");

/*Stringsareimmutable.Noneofthepreviousoperations
modifiedtheoriginalStrings*/
System.out.println("foo=\""+foo+"\"");
System.out.println("bar=\""+bar+"\"");
System.out.println("baz=\""+baz+"\"");
System.out.println("bam=\""+bam+"\"");

//TheStringclasscontainsmanyusefulmethods
intbPos=bam.indexOf("b");
System.out.println("Inbam,\"b\"firstoccursatindex"+bPos);

System.out.println("bam.substring(3,6)=\""+bam.substring(3,6)+"\"");

System.out.println("\"a\".compareTo(\"z\")"+"returns"
+"a".compareTo("z"));


//TheemptyStringisjustthat:
Stringempty="";
System.out.println("emptyhaslength"+empty.length());
intaPos=empty.indexOf("a");
System.out.println("Inempty,\"a\"firstoccursatindex"+aPos);
Stringboom=null;
intaPosInBoom=boom.indexOf("a");//NullPointerException
}
}
