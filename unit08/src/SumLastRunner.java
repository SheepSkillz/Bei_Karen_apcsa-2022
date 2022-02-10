//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] list1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(list1));
		
		int[] list2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(list2));
		
		int[] list3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(list3));
		
		int[] list4 = {32767};
		System.out.println(RaySumLast.go(list4));
		
		int[] list5 = {255,255};
		System.out.println(RaySumLast.go(list5));
		
		int[] list6 = {9,10,-88,100,-555,2};
		System.out.println(RaySumLast.go(list6));
		
		int[] list7 = {-111,1,2,3,9,11,20,1};
		System.out.println(RaySumLast.go(list7));
		
		int[] list8 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(RaySumLast.go(list8));
		
		int[] list9 = {12,15,18,21,23,1000};
		System.out.println(RaySumLast.go(list9));
		
		int[] list10 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(RaySumLast.go(list10));
		
		int[] list11 = {9,10,-8,10000,-5000,-3000};
		System.out.println(RaySumLast.go(list11));
	}
}