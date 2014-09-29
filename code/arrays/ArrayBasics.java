importjava.util.Arrays;

publicclassArrayBasics{

classDog{
publicvoidspeak(){
System.out.println("Woof,woof!");
}
}


publicstaticdouble[][]scalarMult(doublex,double[][]a){
double[][]result=a;//newdouble[a.length][a[0].length];
for(inti=0;i<a.length;i++){
for(intj=0;j<a[0].length;j++){
result[i][j]=x*a[i][j];
}
}
returnresult;
}

publicstaticStringarrayToString(double[]a){
StringBuildersb=newStringBuilder();
for(doublee:a)sb.append(e+"");
returnsb.toString();
}

publicstaticStringarrayToString(double[][]a){
StringBuildersb=newStringBuilder();
for(double[]row:a){
sb.append(Arrays.toString(row));
//for(doublee:row){
//sb.append(e+"");
//}
sb.append(System.lineSeparator());
}
returnsb.toString();
}


publicstaticvoidmain(String[]args){
double[]scores=newdouble[5];
System.out.println("Afterdouble[]scores=newdouble[5]:");
for(inti=0;i<5;++i){
System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
}

scores[0]=89;
scores[1]=100;
scores[2]=95.6;
scores[3]=84.5;
scores[4]=91;
scores[scores.length-1]=99.2;
System.out.println("Afterelement-by-elementinitialization:");
//Note:muchbetterwaytoboundloop:usingscores.length
for(inti=0;i<scores.length;++i){
System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
}


//Usingtraditionalforloopwithindex,youcanupdatearrayelements
for(inti=0;i<scores.length;++i){
scores[i]=scores[i]-10;
}
System.out.println("Eachelementdecreasedby10:");
for(inti=0;i<scores.length;++i){
System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
}


//For-eachloopparameterisatemporaryvariable/read-onlyiterator
for(doublescore:scores){
score=score-10;
}
System.out.println("For-eachdoesn'tallowupdatestoarray:");
for(inti=0;i<scores.length;++i){
System.out.printf("scores[%d]=%.2f%n",i,scores[i]);
}

//System.out.println("Tryingscores[scores.length]=100causes:");
//scores[scores.length]=100;

double[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("Matrix:");
System.out.println(Arrays.toString(matrix));
double[][]doubledMatrix=scalarMult(2,matrix);
System.out.println("DoubledMatrix:");
System.out.println(arrayToString(doubledMatrix));
}
}
