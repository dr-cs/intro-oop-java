importjava.util.Arrays;

publicclassSort{

publicstaticvoidinsertionSort(Comparable[]a){
for(intj=1;j<a.length;++j){
assertisSorted(a,0,j-1);
Comparablekey=a[j];
inti=j-1;
while(i>=0&&(a[i].compareTo(key)>0)){
a[i+1]=a[i];
i=i-1;
}
a[i+1]=key;
}
}

publicstaticvoidquickSort(Comparable[]a){
qs(a,0,a.length-1);
}

privatestaticvoidqs(Comparable[]a,intbegin,intend){
if((end-begin)<=1){//Basecase:nothingtosort
return;
}
intpivot=partition(a,begin,end);
qs(a,begin,pivot);
qs(a,pivot+1,end);
}

privatestaticintpartition(Comparable[]a,intbegin,intend){
intsize=end-begin;
Comparable[]temp=newComparable[size];
ComparablepivotValue=a[size/2];
inti=begin-1;
for(intj=begin;j<=size-1;j++){
if(a[j].compareTo(pivotValue)<=0){
i++;
swap(a,i,j);
}
}
swap(a,i+1,size-1);
returni+1;
}

privatestaticvoidswap(Comparable[]a,inti,intj){
Comparabletmp=a[i];
a[i]=a[j];
a[j]=tmp;
}


//privatestaticintsplit(Comparable[]a,intbegin,intend){
//intsize=end-begin+1;
//Comparable[]temp=newComparable[size];
//ComparablepivotValue=a[begin];
//intup=0;
//intdown=size-1;

//for(inti=begin+1;i<=end;i++){
//if(a[i].compareTeo(splitValue)<=0){
//temp[up]=a[i];
//up++;
//}else{
//temp[down]=a[i];
//down--;
//}
//}
//temp[up]=a[begin];


//}

privatestaticbooleanisSorted(Comparable[]array,intstart,intend){
for(inti=start;i<end;++i){
if(!(array[i].compareTo(array[i+1])<0))
returnfalse;
}
returntrue;
}

publicstaticvoidmain(String[]args){
Integer[]a={5,2,4,6,1,3};
System.out.println("Unsortedaray:"+Arrays.toString(a));
quickSort(a);
System.out.println("Sortedaray:"+Arrays.toString(a));
}

}
