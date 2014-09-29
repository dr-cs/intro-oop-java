importjava.util.ArrayList;

publicclassArrayListPrimitivesDemo{

publicstaticvoidmain(String[]args){
ArrayListints=newArrayList();
ints.add(newInteger(42));
ints.add(newInteger(66));
ints.add(newDouble(2.2));
//Withanuntypedcollection,Javawillauto-boxwhenadding
ints.add(99);
System.out.println(ints);

//However,autoboxingdoesn'thappenwhenretrieving
//fromanuntypedcollection
//intnum=ints.get(0);//won'tcompile

//Sotheold-stylewayistocastittowrappertype,thenunboxing
//isdoneonthecastedwrapperobject
//Thiscompilesandworksatrun-time
intnum=(Integer)ints.get(0);
System.out.println(num);

//ThiscompilesbutcausesaClassCastExceptionatrun-time
//becausewehaveaDoubleinstanceatindex2
intnum2=(int)(double)(Double)ints.get(2);
System.out.println(num2);
}

}
