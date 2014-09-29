importjava.util.Scanner;
importjava.io.FileInputStream;
importjava.io.FileNotFoundException;

publicclassCourseAverage{

publicstaticvoidmain(String[]args){
int[]exams=newint[3];
doubleexamAvg,hwAvg,finalExam,courseAvg;
ScannergradeFile=null;
try{
gradeFile=newScanner(newFileInputStream("grades.txt"));
}catch(FileNotFoundExceptione){
System.out.println(e.getMessage());
System.exit(0);
}
for(inti=0;i<3;++i){
exams[i]=gradeFile.nextInt();
}
examAvg=calcAverage(exams);
hwAvg=gradeFile.nextDouble();
finalExam=gradeFile.nextDouble();
courseAvg=.2*hwAvg+.6*examAvg+.2*finalExam;
System.out.printf("Yourcourseaverageis%.1f%n",courseAvg);
}

privatestaticdoublecalcAverage(int[]numbers){
doublesum=0;
for(intnumber:numbers){
sum+=number;
}
return(double)sum/numbers.length;
}
}
