importjava.text.NumberFormat;
importjava.util.Locale;

publicclassCurrencyFormatting{

publicstaticvoidmain(String[]args){
NumberFormatus=NumberFormat.getCurrencyInstance();
System.out.println(us.format(3.14));

NumberFormatde=
NumberFormat.getCurrencyInstance(Locale.GERMANY);
System.out.println(de.format(3.14));
}
}