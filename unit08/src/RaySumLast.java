//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int last = ray[ray.length - 1];
		int count = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > last) {
				count += ray[i];
			}
		}
		if (count > 0) {
			return count;
		}
		return -1;
	}
}