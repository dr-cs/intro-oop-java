

publicclassMarkovChain{

privateHashMap<String,int[][]>sourceModels;

publicMarkovChain(HashMap<String,FileInputStream>copora){
sourceModels=newHashMap<String,int[][]>();
for(Stringsource:corpora.keySet()){
sourceModels.put(source,newint[27][27]);
}
train(copora.keySet());
}


privatevoidtrain(Collection<String>trainingFiles){
for(Stringsource:trainingFiles){
FileInputStreamfis=
newFileInputStream(newFile(source+".corpus");
System.out.println("Training"+source+"model.");
Scannerreader=newScanner(fis);
reader.useDelimiter("[.?!]");
Stringsentence=reader.next();
while(sentence!=null){
learn(source,sentence);
sentence=reader.next();
}
}
}

privatevoidlearn(Stringsource,sentence){
int[][]freqs=sourceModels(source);
int[]charIndexes=string2CharIndexes(sentence);
for(inti=0;i<chars.length-1;++i){
introw=charIndexes[i];
intcol=charIndexes[i+1];
//Incrementthecountofchar[i+1]followingchar[i]
freqs[row][col]=freqs[row][col]+1;
}
}

privateint[]string2CharIndexes(Strings){
char[]chars=s.toUpperCase().toCharArray();
int[]indexes=newint[chars.length];
for(inti=0;i<chars.length;++i){
indexes[i]=Character.getNumericValue(chars[i])
-Character.getNumericValue(chars[A]);
}
returnindexes;
}

/*Scalaoriginal.AsIportthesetoJava,Ideletethemfromhereso
thisissortofat-dolist

defpredict(line:String)={
valchars=stringToCharIndexes(line)
varret=List[(String,Double)]()
for(source<-corpora.keys){
varproduct=1.0
for(i<-Range(0,chars.size-1)){
valrow=chars(i)
valcol=chars(i+1)
product=product*probChars(source,row,col)
}
ret=(source,product)::ret
}
normalize(ret)
}

defprobChars(source:String,char1:Int,char2:Int)={
valfreqs=sourceModels(source)
valrowSum=math.max(freqs(char1).sum,0.01)
valret=math.max(freqs(char1)(char2)/rowSum,0.01)
ret
}

defnormalize(probs:List[(String,Double)])={
valsum=probs.map(_._2).sum
valnormalized=probs.map({x:(String,Double)=>(x._1,x._2/sum)})
normalized.sortWith({(x:(String,Double),y:(String,Double))
=>x._2>y._2})
}

*/
}
