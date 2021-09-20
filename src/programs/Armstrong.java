package programs;

public class Armstrong {

	public static void main(String[] args) {
		
		int r;
		int cube=0;
		int num=153;
		int t;
		t=num;
		
		while(num!=0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
		if(t==cube) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("not armstrong number");
	}

}
