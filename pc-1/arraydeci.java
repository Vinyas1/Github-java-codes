package jav1;

public class arraydeci {
	public static void main (String args[]) {
		int m[][];
		m=new int[1][5];
		int k=0;
		double o[][];
		o=new double[3][2];
		double z=0.5;
		
		for(int i=0;i<1;i++) {
			for(int j=0;j<5;j++) {
			m[i][j]=k;
			
		}
		}
		for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			o[i][j]=z;
			z=z+0.5;
		}	
		}
		for(int i=0;i<1;i++) {
			for(int j=0;j<5;j++) {
			System.out.print(m[i][j] + "\t");
			
		}
			System.out.println();
		}
		 System.out.println("Matrix o:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(o[i][j] + "\t");
	            }
	            System.out.println(); 
	        }
	    }
	}


