import java.util.Scanner;
public class rocks {
	Scanner reader=new Scanner(System.in);
	public static void main(String[] args){
		rocks r=new rocks();
		

	}
		
	
		rocks(){
			irock();
			rocker("bob");
			truth("justin beiber");
			echo("league");
			repeat("annoying", 5);
			String theBest = getTheBestCoder();
			System.out.println(theBest);
			int sum=add(1,2);
			System.out.println(sum);
			evenOrOdd(1234567890);
		}
		

		
		
		private void evenOrOdd(int i) {
			if (i%2==0)
				System.out.println("is even");
		else{
			System.out.println("it is false");
		}
		}


		private void evenOrOdd() {
			// TODO Auto-generated method stub
			
		}


		private int add(int i, int j) {
			int sum=i+j;
			// TODO Auto-generated method stub
			return sum;
		}


		private static String getTheBestCoder() {
			String theBest="bill gates";
			return theBest;
		}
	private void repeat(String string, int i) {
		for(int x=0; x<=i;x++)
			System.out.println(string);
			// TODO Auto-generated method stub
			
		}
	private void echo(String l) {
		System.out.println(l+" "+l);
			// TODO Auto-generated method stub
			
		}
	private void truth(String s) {
		
		if(s.equals("justin beiber")){
			System.out.println(s+"sucks");
		}
		
		else{
			System.out.println(s+" is awesome");
		}
			// TODO Auto-generated method stub
			
		}
	private void rocker(String n) {
		System.out.println("your name is: "+n);
		// TODO Auto-generated method stub
		
	}

	private void irock() {
		String name;
		System.out.println("jack rocks");
		
		
		// TODO Auto-generated method stub
		
	}

}
