
class LenearSearch{

public static void main(String args[])

{
int []a={10,20,45,21,47,585,2,12,4,144,14,1,4,125,2,4,};
int element=14;
for(int i =0 ;i<=a.length;i++)
{
if(a[i]==element)
{
System.out.println("element found");
System.exit(0);
}
}
System.out.println("element not found");
}


}