//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int count = 0;
		int longest = 0;
		for (int i = 0; i < ray.size() - 1; i++) { 
			if (ray.get(i) % 2 != 0) {
				count = 0;
				for (int j = i + 1; j < ray.size(); j++) {
					count += 1;
					if (ray.get(j) % 2 == 0) {
						if (count > longest) {
							longest = count;
						}
					}
				}
			}
		}
		if (longest != 0) {
			return longest;
		}
		return -1;
	}
}