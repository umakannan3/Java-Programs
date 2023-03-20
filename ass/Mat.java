public class Mat {
	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	int r = 5,c = 3,count=0;
	int mat[][] = new int[r][c];

	for(int i=0; i<r; i++) {
   		for(int j=0; j<c; j++) {
     			 mat[i][j] = arr[count];
      count++;
  	 }
	}

	System.out.println("Matrix:");

		for(int i=0; i<r; i++) {
   		for(int j=0; j<c; j++) {
     		 System.out.print(mat[i][j]+" ");
   	}
  	 System.out.println();
}
}
}