import java.util;

public class matSym{

	static void checkSymmetric(int mat[][],int row,int col) {
		int i,j,flag =1;
		System.out.println("the matrix format is :");

		for(i = 0; i < row; i++){
			for(j = 0; j<col ; j++){

               System.out.print(mat[i][j]);

			}

		  System.out.print(" ");	
		}

		int [][] transpose = new int[row][col];

		//tanspose

		for( i = 0; i<row; i++){
			
				for(j = 0; j<col ; j++){

					transpose[j][i]= mat[i][j];
				}
		    }


		if(row == col){

			 for( i = 0; i<row; i++){
			
				for(j = 0; j<col ; j++){

					if(mat[i][j] !=transpose[i][j]){
						flag = 0;
						break;
					}
				}

               
				if(flag == 0){
					System.out.println("Matrix is not symmetric ");
					break;
				}

				if(flag == 1){
					System.out.println("Matrix is symmetric ");
					break;
				}
		}
		//todo check paranthesis

		else { System.out.println("Msrix is not symmetric");
	    }
       }


     public static void main(String[] args) {
       	Scanner s =new Scanner(System.in);
       	int i,j,row,col,flag =1;

       	System.out.println("No of ROW ?");
       	row = s.nextInt();

       	System.out.println("No of COL ?");
       	col = s.nextInt();

        int mat[][] =new int [row][col];

        System.out.println("Enter the elements :");

        for(i =0;i<row ;i++){
        	for(j=0;j<col;j++){

        		mat[i][j] =s.nextInt();
        	}
        }
        checkSymmetric(mat,row,col);
       }  

    }


 