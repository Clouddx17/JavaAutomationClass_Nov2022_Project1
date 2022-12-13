package pkg1;

public class Arithmatic2 {

	// (10*2)-2)+2)-2)/2
		int a ;
		static int b =2 ;
		
		public int sum (int a , int b)
		{ int c ;
		 c = a+b ;
		 System.out.println("Sum is equal to "+ c);
		 return c;
		 
		}
		
		public int sub (int a , int b)
		{ int d ;
		 d = a-b ;
		 System.out.println("Sub is equal to "+ d);
		 return d;
		 
		}
		
		public int multi (int a , int b)
		{ int mul ;
		 mul = a*b ;
		 System.out.println("Multi is equal to "+ mul);
		 return mul;
		}
		
		public int div (int a , int b)
		{ int Di ;
		 Di = a/b ;
		 System.out.println("Division is equal to "+ Di);
		 return Di;
		 
		}
	public static void main(String[] args) {
		Arithmatic t = new Arithmatic();
		int s1 = t.multi(10, b);
		int s2 = t.sub(s1, b);
		int d = t.sum(s2, b);
		int m = t.sub(d, b);
		int di = t.div(m, b);
		
	System.out.println("Final result is equal to" +" "+ di );


	}

}
