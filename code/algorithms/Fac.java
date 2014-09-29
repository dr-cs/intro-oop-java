publicclassFac{

publicstaticvoidmain(String[]args){
intn=Integer.parseInt(args[0]);
System.out.println("facLoop("+n+")="+facLoop(n));
System.out.println("facTail("+n+")="+facTail(n));
System.out.println("fac("+n+")="+fac(n));
}

/**
*Thefactorialofnisn*facotrialofn-1forn>1,otherwise1.
*/
publicstaticintfac(intn){
if(n<=1){
return1;
}else{
returnn*fac(n-1);
}
}

publicstaticintfacLoop(intn){
intfactorial=1;
for(intx=n;x>0;x--){
factorial*=x;
}
returnfactorial;
}

/**
*Atailrecursivefactorialfunctionusingarecursivehelpermethod
*tocreatetheiterations.
*/
privatestaticintfacTail(intn){
returnfacIter(n,1);
}

/**
*DesignedtobecalledbyfacIter.accumaccumulatestheansweras
*ndecrementstothebasecase.
*/
privatestaticintfacIter(intn,intaccum){
if(n<=1){
returnaccum;
}else{
returnfacIter(n-1,n*accum);
}
}

/*
Iterativeprocess
facIter(5);
facIter(4,5);
facIter(3,20);
facIter(2,60);
facIter(1,120);
120

Recursiveprocess
fac(5);
5*fac(4);
5*4*fac(3);
5*4*3*fac(2);
5*4*3*2*fac(1);
5*4*3*2*1;
5*4*3*2;
5*4*6;
5*24;
120;
*/
}
