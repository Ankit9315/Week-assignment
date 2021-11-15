package homework3;

public class reversepattern {
	public static void main(String[]aargs) {
		int n=5;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=n-1-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
