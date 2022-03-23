//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// essentially getting an index value from 0 to length - 1
				int v = (int)(Math.random() * vals.length);
				String val = vals[v];
				grid[i][j] = val;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = "";
		int m = 0;
		int count = 0;
		for (String s : vals) {
		  	/*for (String[] row : grid) {
		  		for (String w : row) {
		 			if(w.equals(s)) {
		  				count ++;
		  			}
		 		}
		  		
			}*/
			count = countVals(s);
			// set both the new max value to the count and its corresponding string
	  		if (count > m) {		  			
	  			m = count;
	  			max = s; 
		  	}
		 }	 
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	// why does it have to be private?? im confused
	public int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j].equals(val)) {
					count += 1;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}