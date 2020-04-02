package ALPHABAT;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if((i==0||i==3)&&(j!=0&&j!=5)||((j==0||j==5)&&(i!=0))) {	
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			
			}

	}

}
