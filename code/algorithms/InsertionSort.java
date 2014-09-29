importjava.util.Arrays;

publicclassInsertionSort{

publicstaticvoidmain(String[]args){
int[]a={5,2,4,6,1,3};
System.out.println("Unsortedaray:"+Arrays.toString(a));
for(intj=1;j<a.length;++j){
assertisSorted(a,0,j-1);
intkey=a[j];
inti=j-1;
while(i>=0&&a[i]<key){
a[i+1]=a[i];
i=i-1;
}
a[i+1]=key;
}
System.out.println("Sortedaray:"+Arrays.toString(a));
}

privatestaticbooleanisSorted(int[]array,intstart,intend){
for(inti=start;i<end;++i){
if(!(array[i]<array[i+1])){
returnfalse;
}
}
returntrue;
}
}
