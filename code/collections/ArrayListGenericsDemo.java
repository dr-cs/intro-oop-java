importjava.util.ArrayList;

publicclassArrayListGenericsDemo{


/**
*lkjasdgklhjaalksdhgdfgakhahfgklhadf;lkghhjkdfghhjkdfhgk
*kldfghlkdfklflkdfhgklhdfk;ghhdfkjhgkldh;kjdfhgkjdfh
*jkdafhgk;ahkjdhafgkjdakjdfhdfkjgdkjhgfkjdfhkjdfh
*jkhjkdhkhgf
*/
publicstaticvoidmain(String[]args){
//ljdlkfgajskldjfklasdkldsfjlkahsdklfaskdhkadshdhssdjk
//sdjkghghjkdshgkjdhgkjhfgkhkjhajkd
ArrayList<String>strings=newArrayList<String>();
strings.add("Helluva");
strings.add("Engineer!");
IntegerBULL_DOG=Integer.MIN_VALUE;
//Sincestringsisatypedcollection,Javatypechecks
//insertionsandretrievals
strings.add(BULL_DOG);//Won'tcompile
System.out.println(strings);

//Noticethatwedon'tneedtorepeatthetypeparameterinthe
//creationexpression,becuaseJavainfersthetypefrom
//thedeclaration
ArrayList<Integer>ints=newArrayList<>();
ints.add(newInteger(42));
ints.add(newInteger(66));
//Asbefore,Javawillauto-boxaprimitiveintinanInteger
ints.add(99);
System.out.println(ints);

//Andsincewehaveatypedcollection,Javawillalsoautobox
//whenweretrieveelementsformthecollection
intnum=ints.get(0);
}

}
