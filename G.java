package ALPHABAT;

public class G {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if((j==0)|| (j==4 &&(i!=2)||((i==0||i==5)&&(j!=5)||(i==3)&&(j!=1&&j!=2)))) {	
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			
			}

	}

}
