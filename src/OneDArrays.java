
public class OneDArrays {
	public static void main(String [] args) {
		
		int kenya=453;
		int tz = 3587;
		int ug = 384;
		int rwanda = 344;
		
		int[] pop = new int[] {342,2424,242,245};
		
		int[] statePopulation = new int [4];
		pop[0]=242;
		pop[1]=1334;
		pop[2]=343;
		pop[3]=314;
		
		
		
		
//		for each loop
		int count = 0;
		for (int state : pop) {
			count = count + state;
			System.out.println(state);
		}
		System.out.println("Total Population is:" + count);
	}

}
