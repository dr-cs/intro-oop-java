publicclassConsoleOutput{

publicstaticvoidmain(String[]args){
//Allthesewillbeprintedononeline
System.out.print("A");
System.out.print("wagon");
System.out.print("full");
System.out.println("of...");

//Thiswillbeprintedonanewlinebecausethepreviousoutput
//methodwasprintln(insteadofprint)
System.out.println("pancakes!\n");

//Youcanuse\ntoaddanewlinesoprintfactslikeprintln
System.out.printf("%d%s.\n",7"Samurai");

//Bettertouse%ntahn\nbecause%nisplatform-independent
System.out.printf("Ilike%5.3f.%n%n",Math.PI);

//NoticethatyoucanuseanyString-valuedexpression
//fortheformatstring
System.out.printf("%eishowJavaprintsthescientific"
+"notationequivalentof%f.\n",.001,.001);
StringmsgWithENotation="%eishowJavaprintsthescientific"
+"notationequivalentof%f.%n%n";
//Noticethatneedtowrite1000f(fmeansfloatingpointconstant)
//becausethe%econversiontakesafloatingpointnumber
System.out.printf(msgWithENotation,1000f,1000f);

//Withnofieldwidthspecifier,%fdefaultsto6significantdigits
doublex=42.0000001;
System.out.printf("Where'sthe1in%f?\n",x);

//Useafieldwidthspecifierifyouneedmore
System.out.printf("Thereitis:%.7f.%n%n",x);

//Formattedfieldsareright-justifiedbydefault
StringscoreLine="%12s%2d%n";
System.out.printf(scoreLine,"GeorgiaTech",21);
System.out.printf(scoreLine,"USC",7);
System.out.println();

//Adda-afterthe%toleft-justifyafield
StringbetterScoreLine="%-12s%2d%n";
System.out.printf(betterScoreLine,"GeorgiaTech",21);
System.out.printf(betterScoreLine,"USC",7);
}
}
