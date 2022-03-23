//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> i = new ArrayList<>();//(m.length);
    	int index = 0;
    	for (int j = 0; j < m.length; j++) {
    		int sum = 0;
    		for (int k = 0; k < m[j].length; k++) {
    			sum += m[j][k];
    		}
    		i.add(sum);
    		index++;
    	}
		return i; 	
    }
}
