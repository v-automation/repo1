class BinarySearch
{

public static void main(String args[])
{
	
	int data[]={2,5,8,74,89,255,895,6589,14748};
	int element=895;
	int l=0;
	int h=data.length-1;
	
	
	while(l<=h)
	{
		int mid=(l+h)/2;
		if(data[mid]==element){
			System.out.println("element found");
		System.exit(0);
		}
		else if(data[mid]<element)
		{
			l=mid+1;
		}
		else
			h=mid-1;
	}
	System.out.println("not  found");
}

}