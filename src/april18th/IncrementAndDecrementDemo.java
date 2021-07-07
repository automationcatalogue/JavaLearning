package april18th;

public class IncrementAndDecrementDemo {
	public static void main(String[] args) {
		int i=5;
		++i;//Pre Increment
		System.out.println("Value of i is :"+i);//6
		
		i++;//Post Increment
		System.out.println("Value of i is :"+i);//7
		
		int j=10;
		--j;//Pre Decrement
		System.out.println("Value of j is :"+j);//9
		
		j--;//Post Decrement
		System.out.println("Value of j is :"+j);//8
	}
}

class IncrementAndDecrementDemo1{
	public static void main(String[] args) {
		int i=5,j=10;
		System.out.println(++i);//6
		System.out.println(i++);//6
		System.out.println("Value of i is "+i);
		System.out.println(--j);//9
		System.out.println(j--);//9
		System.out.println("value of j is :"+j);
	}
}

class IncrementAndDecrementDemo2{
	public static void main(String[] args) {
		int a=50;
		int b=a--;
		System.out.println("b= "+ b);//49
		System.out.println("a= "+ a);//49
		
		int x=5;
		int y=(x++) + (++x) + (--x);//5+7+6
			
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}





















