//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int index = 0;
    	m = new String[size][size];
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			m[i][j] = str.substring(index, index + 1);
    			index++;
    		}
    	}
    	
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			System.out.print(m[i][j] + " ");
    		}
    		System.out.println();
    	}   	
    }
    
    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			if (checkRight(word, i, j) || checkLeft(word, i , j) || checkUp(word, i, j) || checkDown(word, i, j) ||
    				checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || 
    				checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
	{
		/*int index = 0;
				int count = 0;
				boolean consec = false;
		//for (int i = 0; i < m.length; i++) {
			for (int j = c; j < m[r].length; j++) {
				for (int k = 0; k < w.length(); k++) {
				//	System.out.println(m[r][j]);
					if (index < w.length() && m[r][j].equals(w.substring(index, index + 1))) {
						index ++;
						count += 1;
						consec = true;
					}
					else {
						consec = false;
					}
					
				}	
			}
		//}
	 if (count == w.length() && consec == true) return true;
		return false;*/
		String comp = "";
		for (int i = c; i <= m[r].length - w.length(); i++) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r][c + j];
			}
			if (w.equals(comp)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String comp = "";
		for (int i = c; i >= w.length() - 1; i--) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r][c - j];
			}
			if (w.equals(comp)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String comp = "";
		for (int i = r; i >= w.length() - 1; i--) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r - j][c];
			}
			if (w.equals(comp)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
	{
		String comp = "";
		for (int i = r; i <= m[r].length - w.length(); i++) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r + j][c];
			}
			if (w.equals(comp)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		/*String comp = "";
		for (int i = m[r].length; i <= m[r].length - w.length(); i--) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r][c + j];
			}
			if (w.equals(comp)) {
				return true;
			}
		}*/
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		/*String comp = "";
		for (int i = m[r].length; i <= m[r].length - w.length(); i--) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r][c + j];
			}
			if (w.equals(comp)) {
				return true;
			}
		}*/
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
	{
		String comp = "";
		if (c > m[r].length - w.length()) return false;
		for (int i = r; i <= m[r].length - w.length(); i++) {
			for (int j = 0; j < w.length(); j++) {
				comp += m[r + j][c + j];
			}
			if (w.equals(comp)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
	/* comp = "";
		//if (c < m[r].length - w.length()) return false;
		for (int i = r; i <= m[r].length - w.length(); i--) {
			for (int j = 0; j < w.length(); j++) {
				
				comp += m[r + j][c];
			}
			if (w.equals(comp)) {
				return true;
			}
		}*/
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
