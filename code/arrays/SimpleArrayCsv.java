importjava.io.File;
importjava.io.FileNotFoundException;
importjava.util.Scanner;

publicclassSimpleArrayCsv{

publicstaticvoidmain(String[]args)throwsFileNotFoundException{
int[][]data=newint[3][5];
FiledataFile=newFile("array-data.csv");
ScannerfileReader=newScanner(dataFile);
fileReader.useDelimiter("[,\n]");
for(introw=0;row<3;++row){
for(intcol=0;col<5;++col){
Stringtoken=fileReader.next();
System.out.println("Reading:"+token);
data[row][col]=Integer.parseInt(token);
}
}
System.out.println("data[][]nowcontains:");
for(introw=0;row<3;++row){
for(intcol=0;col<5;++col){
System.out.print(data[row][col]+"");
}
System.out.println();
}

}
}
