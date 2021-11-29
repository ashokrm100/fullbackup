public class InterfaceWorks{
	public static void main(String args[])
	{
	B valu = new B();
	valu.print();
	//valu.min;
	System.out.println(valu.min);
	}
}


	interface sample1
	{
		int min=5;
		void print();
	}


class B implements sample1
{
	public interface sample2
	{
		void getval();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("from B");
	}
}