
public class TwoDArrays {

	public static void main(String [] args) {
	int [][] worldPopulation = {
			
			{3133,1213,133,313,313,331},
			{1231,131,131,3134,1231},
			{313,3131,424,113,1213,132}
	};
	/*
	for(int i=0;i<worldPopulation.length;i++) {
		for(int j=0;j<worldPopulation[i].length;j++) {
			System.out.print(worldPopulation[i][j]+" ");
		}
		System.out.println();
	}*/
	
//	using for-each
	
	for(int[]i:worldPopulation) {
		for(int j:i) {
			System.out.print(j + " ");
			
		}
		System.out.println();
		
	}
		
	}
		
	}

