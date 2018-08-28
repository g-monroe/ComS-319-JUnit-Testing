package cs319.lab1;

public class MyClass {

	public int findMax(int x, int y, int z)
	{
	int max;
	if((x>y) && (x>z))
	{
	max = x;
	}
	else if(y>x)
	{
	max = y;
	}
	else
	{
	max = z;
	}
	return max;
	}

}
