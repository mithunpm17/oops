public class matrix{
	public static void main(String[] args) {
		
		int a[][] = {{3,4,5},
		             {5,3,7},
		             {4,5,7}},
		    b[][]={{3,4,5},
		          {5,6,7},
		          {7,8,9}};

		int c[][] = new int[3][3];

		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){

				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] +" ");
			}

			System.out.println();
		}
	}
}