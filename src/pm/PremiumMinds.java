package pm;

public class PremiumMinds {
	
	public static void main(String[] args) {
		PremiumMinds pm  = new PremiumMinds();
		
		System.out.println(pm.catchPokemon("E"));
		System.out.println(pm.catchPokemon("NESO"));
		System.out.println(pm.catchPokemon("NSNSNSNSNS"));
	}

	public int catchPokemon (String input) {
		int size = input.length();

		if(size < 1) return 1;
		else {
			
			int[][] grid = new int[(2*size)+1][(2*size)+1];

			int count = 1;
			int a  = (int) Math.floor((2*size)/2);
			int b = (int) Math.floor((2*size)/2);
			grid[a][b] = -1;
			
			for (int i = 0; i < size; i++) {
				if ('N' == input.charAt(i)) a--; 
				else if ('S' == input.charAt(i)) a++;
				else if ('E' == input.charAt(i)) b++;
				else if ('O' == input.charAt(i)) b--;
				if(grid[a][b] != -1) {
					count++;
					grid[a][b] = -1;
				}
			}
			return count;
		}
	}
}
