import java.util.Arrays;
class array5{
	public static void main(String args[]){
		int temp;
		int a[] = new int[]{2,90,45,1,7,34};
		System.out.println("Before Sorting" +Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println("After sorting" +Arrays.toString(a));
} 
}