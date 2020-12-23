package Demo;

class Demo
{
	public static void main(String[] args) 
	{
		int [] i=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;i[3]=50;i[4]=60;
		System.out.println(i[2]);
		for(int x:i)
		{
			System.out.println(x);
		}
	}
}