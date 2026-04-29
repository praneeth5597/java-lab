class Display
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Morning:");
			try
			{
				{
					Thread.sleep(1000);
			}
			catch (InterruptedException e);
			{
				System.out.println(e);
			}
			System.out.println(name);
			}
		}
	}
}
class Mythread extends Thread
{
	Display d;
	String name;
	Mythread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class synchronizedde
{
	public static void main(String args[])
	{
		Display d1=new Display();
		Mythread t1=new Mythread(d1,"CSE");
		Mythread t2=new Mythread(d1,"IT");
		t1.start();
		t2.start();
	}
}