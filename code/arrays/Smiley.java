publicclassSmiley{

publicstaticvoidmain(String[]args){
char[][]grid={{'','','','','','','','','',''},
{'','','','','','','','','',''},
{'','*','*','','','','','*','*',''},
{'','*','*','','','','','*','*',''},
{'','','','','*','*','','','',''},
{'','','','','*','*','','','',''},
{'','*','','','','','','','*',''},
{'','','*','','','','','*','',''},
{'','','','*','*','*','*','','',''},
{'','','','','','','','','',''}};

//Row-majorsmiley
System.out.println("Row-majorsmiley:");
for(introw=0;row<grid.length;++row){
for(intcol=0;col<grid[row].length;++col){
System.out.print(grid[row][col]);
}
System.out.println();
}

//Column-majorsmiley.
//Notethatwe'reassumingeachrowissamelength
System.out.println("Column-majorsmiley:");
for(intcol=0;col<grid[0].length;++col){
for(introw=0;row<grid.length;++row){
System.out.print(grid[row][col]);
}
System.out.println();
}

//Row-majorsmileyusingnestedfor-each
System.out.println("Row-majorsmileyusingnestedfor-each:");
for(char[]row:grid){
for(charcell:row){
System.out.print(cell);
}
System.out.println();
}
}
}
