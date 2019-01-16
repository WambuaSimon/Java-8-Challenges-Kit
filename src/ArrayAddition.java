
public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};
		int [][] b = {
				{2,2,2},
				{2,2,2},
				{2,2,2},
		};
		
		System.out.println("==Matrix A==");
		for(int[]i:a) {
			for(int j:i) {
				System.out.print(j+ "  ");
			}
			System.out.println();	
		}
		
		System.out.println("==Matrix B==");
		for(int []i:b) {
			for(int j:i) {
				System.out.print(j+ "  ");
			}
			System.out.println();
		}
		
		int[][] c = new int [3][3];
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]= a[i][j] + b[i][j];
			}
			System.out.println();
		}
		
		
		
		System.out.println("==Matrix C==");
		for(int i =0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+ "  ");
			}
			System.out.println();
		}

	}

}
