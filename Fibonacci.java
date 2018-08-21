import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t1=0,t2=1;
		int sum=0;
		 while (t1 < n)
	        {   sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	            System.out.print(t1+" ");
	}
}}
