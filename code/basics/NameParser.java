/**
*NameParsertakesasingleString-valuedcommandlineargumentof
*theform"last_name,first_name"andprintsthefirstandlastnames
*separately.
*/
publicclassNameParser{

publicstaticStringextractLastName(Stringname){
intcommaPos=name.indexOf(",");
StringlastName=name.substring(0,commaPos).trim();
returnlastName;
}

publicstaticStringextractFirstName(Stringname){
intcommaPos=name.indexOf(",");
intlen=name.length();
StringfirstName=name.substring(commaPos+1,len).trim();
returnfirstName;
}

publicstaticvoidmain(String[]args){
StringfullName=args[0];
StringlastName=extractLastName(fullName);
StringfirstName=extractFirstName(fullName);
System.out.println("Firstname:\t"+firstName);
System.out.println("Lastname:\t"+lastName);
}

}
