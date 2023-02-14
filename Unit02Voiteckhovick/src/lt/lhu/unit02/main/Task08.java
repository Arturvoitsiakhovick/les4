package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double x;
		double Fx;
		
		double a = 0;
		double b = 10;
		double h = 3;
		
		
		for (x = a; x <= b; x += h) {
			System.out.print("x = " + x);
			if (x < b){
				Fx = 2 * (Math.tan(x / 2) + 1);
				System.out.println("  F(x) = " + Fx);
				
			}
		}
		

		
		}

	}
