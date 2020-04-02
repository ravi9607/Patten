package ALPHABAT;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				//if(((j==1 || j==5)&& i!=1)&&((i==1||i==4||i==7)&&(j>0||j<4))) {
				if((i==j)|| ((j==0||j==4))) {	
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			
			}

	}

}
