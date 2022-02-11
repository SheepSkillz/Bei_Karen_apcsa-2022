//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
		int total = 0;
		for (int i = 0; i < ray.length; i++) {
			total += ray[i];
		}
		return total;
	}
}