package ooTest;

public class Cell {
	int row;
	int col;
	Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	 void drop(){
		 row++;
	 }
	 void moveLeft(int n){
		 col-=n;
	 }
	 String getCellInfo(){
		 return row+","+col;	
	 }
	 
	 
}
