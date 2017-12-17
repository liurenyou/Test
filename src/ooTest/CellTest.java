package ooTest;

public class CellTest {

	public static void main(String[] args) {
		Tetromino o1 = new T(2,5);
		printWall(o1);
		
		J o2 = new J(1,6);
		printWall(o2);
	}
	public static void printWall(Tetromino t){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++ ){
				boolean flag = true;
				for(int k=0;k<t.cells.length;k++){
					if(i==t.cells[k].row && j==t.cells[k].col){
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.print("- ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
