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
			for (int j = 0; j < grid[0].length; j++) {
				// essentially getting an index value from 0 to length - 1
				int v = (int)Math.random() * vals.length;
				String val = vals[v];
				grid[i][j] = val;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		int count = 0;
		String most = "";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if ()
			}
		}
		/*
		 * for (String s : vals) {
		 * 		for (String[] row : grid) {
		 * 			for (String w : row) {
		 * 				if(w.equals(s)) {
		 * 					count ++;
		 * 				}
		 *			}
		 *		}
		 *}
		 */
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		return 0;
	}

	//display the grid
	public String toString()
	{
		String output="";
		return output;
	}
}