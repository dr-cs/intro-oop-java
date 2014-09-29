publicclassComplex{
//ThesearethedataoftheADT

privatedoublereal;
privatedoubleimaginary;

//ThesearetheoperationsoftheADT

publicComplex(doublereal,doubleanImaginary){
this.real=real;
imaginary=anImaginary;
}

publicComplexplus(Complexother){
doubleresultReal=this.real+other.real;
doubleresultImaginary=this.imaginary+other.imaginary;
returnnewComplex(resultReal,resultImaginary);
}

publicStringtoString(){
return"Complex("+real+","+imaginary+")";
}

publicstaticvoidmain(String[]args){
Complexa=newComplex(1.0,2.0);
Complexb=newComplex(3.0,4.0);
Complexc=a.plus(b);
System.out.println(a+"plus"+b+"="+c);
}
}
