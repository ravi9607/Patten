package ALPHABAT;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=4;
		for(int row=i=0;row<5;row++) {
			for(int col=0;col<5;col++) {
			    if((row==i&&col==j)) {	
					System.out.print("*");
					i+=1;
					j-=1;
				} 
				else if((row==col))  {
					System.out.print("$");
				}
			
				else {
					System.out.print(" ");
				}
					}System.out.println();
			}	

	}

}
