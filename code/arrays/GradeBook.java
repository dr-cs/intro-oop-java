publicclassGradeBook{

privateint[]scores;
privateintlastScore;

publicGradeBook(){
this(10);
}

publicGradeBook(intcapacity){
scores=newint[capacity];
lastScore=0;
}

publicvoidadd(intscore){
scores[lastScore++]=score;
}

publicvoidmodifyScore(intindex,intnewScore){
scores[index]=newScore;
}

publicint[]getScores(){
returnscores;
}
}
