import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("enter how many numbers");
		int n=sc.nextInt();
		int a[]=new int[n],i;
		for(i=0;i<n;i++)
		{
		System.out.print("enter element"+(i+1)+":");
		a[i]=sc.nextInt();
		}
		System.out.print("enter element to search");
		int item=sc.nextInt();
			int low=0;
			int high=n-1;
			int mid=0;
			boolean found=false;
			while(low<=high)
			{
				mid=(low+high)/2;
				if(a[mid]==item)
				{
				  found=true;
				  break;
				}
				else if (item>a[mid])
				  low=mid+1;
				else
				  high=mid-1;
			}
				if(found==true)
				System.out.print("found at pos "+(mid+1));
				else
				System.out.print("not found");

	}
}

