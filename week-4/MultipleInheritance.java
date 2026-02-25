class  student
{
	int rollNumber;
	void getNumber(int n){
		rollNumber=n;
	}
	void printNumber(){
		System.out.println("Roll Number = " + rollNumber);
	}
}
class test extends student
{
	float part1,part2;
	void getMarks(float a,float b){
		part1=a;
		part2=b;
	}
	void putMarks(){
	System.out.println("Part1=" + part1 + ", Part2=" + part2);
	}
}
interface sports{
	float sportwt=6.0F;
	void putwt();
}
class results extends test implements sports
{
	float total;
	public void putwt(){
		System.out.println("Sports marks="+sportwt);
	}
	void display(){
		total=part1+part2+sportwt;
	        System.out.println("Roll Number = " + rollNumber + ", Total = " + total);
	}
}
class MultipleInheritance
{
	public static void main(String[] args){
	results a=new results();
	a.getNumber(101);
	a.printNumber();
	a.getMarks(80.0F,75.0F);
	a.putMarks();
	a.putwt();
	a.display();
	}
}




