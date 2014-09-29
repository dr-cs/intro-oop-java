importjava.io.File;
importjava.io.FileNotFoundException;
importjava.util.Scanner;

publicclassArrayCsv{

publicstaticvoidmain(String[]args)throwsFileNotFoundException{
FiledataFile=newFile("array-data.csv");
ScannerfileReader=newScanner(dataFile);
fileReader.useDelimiter("[,\n]");
int[][]data=newint[3][5];
for(introw=0;row<3;++row){
System.out.print("Read:");
for(intcol=0;col<5;++col){
data[row][col]=fileReader.nextInt();
System.out.print(data[row][col]+"");
}
System.out.println();
}

for(introw=0;row<3;++row){
for(intcol=0;col<5;++col){
System.out.print(data[row][col]+"");
}
System.out.println();
}
}
}
