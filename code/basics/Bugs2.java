publicclassBugs{

publicstaticvoidmain(String[]args){
Stringemail=null;
if(args.length>0){
email=args[0];
}else{
System.out.println("Needcommandlineargs.");
System.exit(0);
}

//Ifnocommandlinearguments,whatisargs.length?
//email=args[0];


//Whatifemailnotassignedavalueafterinitialization?
intlen=email.length();

//Whatifemail,anaribitraryString,isnotavalidemailaddress?
booleanisEmailValid=
(email.endsWith(".com")
||email.endsWith(".org")
||email.endsWith(".edu"))
&&containsAtSymbol(email);
}

/**
*Ahelpermethodtocheckforthepresenseofthe@symbolinaString
*
*@paramsaString
*@returntrueifscontains@,falseotherwise
*/
privatestaticbooleancontainsAtSymbol(Strings){
booleancontainsAt=false;
//Canyouspotthebugsherebeforeweruntheprogram?
for(inti=0;i<=s.length();i++){
if(s.substring(i,i)=="@")containsAt=true;
//Whatif@isearlyinthestring?
}
returncontainsAt;
}
}
