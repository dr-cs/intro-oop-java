publicclassVarArgs{

publicstaticintmax(int...numbers){
intmax=numbers[0];
for(inti=1;i<numbers.length;++i){
if(numbers[i]>max)max=numbers[i];
}
returnmax;
}

publicstaticvoidmain(String...args){
inttopScore=max(92,87,56,97,89,98);
int[]nums={24,45,67,789};
inttopNum=max(nums);
System.out.printf("Topsscoreis%d%n",topScore);
}
}
