package NumberPro;

public class EvenOddProgram {
	public static void main(String[]args) {
		int[] a= {2,4,5,7,8}
		         ;
		for(int i=0;i<=a.length-1;i++)
		{
			
		if(a[i]%2==0)
		{
			System.out.println(a[i]+ " is even");
			
		}else
		{
			System.out.println(a[i]+ " is odd");
		}
	}

	}
}
