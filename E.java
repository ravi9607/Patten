package ALPHABAT;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++) {
			for(int j=0;j<5;j++) {
				//if(((j==1 || j==5)&& i!=1)&&((i==1||i==4||i==7)&&(j>0||j<4))) {
				if(((i==3&&(j!=4))||(i==0)||(i==6))||((j==0))){	
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			
			}

	}

}
