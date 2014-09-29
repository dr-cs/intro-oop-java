publicclassBugs{

/**
*Ahelpermethodthatsendsanemailmessage.
*/
privatestaticvoidsendEmail(Stringbody,Stringrecipient){
//Pretendwehavecodethatsendsemailhere.
}


publicstaticvoidmain(String[]args){
//Ifnocommandlinearguments,whatisargs.length?
email=args[0];

//Whatifemailnotassignedavalueafterinitialization?
intlen=email.length();

//Whatifemail,anaribitraryString,isnotavalidemailaddress?
sendEmail("Hi!",email);
}
}
