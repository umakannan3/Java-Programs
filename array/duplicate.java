class duplicate{
	public static void main(String args[]){
		int c[] = {1,2,3,4,4,3,2,1};
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j] && i!=j){
					System.out.println(c[i]);
}
}
}
}
}