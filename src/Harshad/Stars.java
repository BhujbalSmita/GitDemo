package harshad;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=7;i++) {
			for (j=i;j>0;j--) {
			System.out.print("*");
			}
			System.out.println("");
		}
		for(i=6;i>=1;i--) {
			for (j=i;j>0;j--) {
			System.out.print("*");
			}
			System.out.println("");
		}
	}

}
