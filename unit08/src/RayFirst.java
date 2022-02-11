//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		if (ray.length == 0) {
			return false;
		}
		
		int first = ray[0];
		for (int i = 1; i < ray.length; i++) {
			if (ray[i] == first) {
				return true;
			}
		}
		return false;
	}
}