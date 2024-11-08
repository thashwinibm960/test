public class MaxSum{
	public static void main(String[] args) {
		int[] numb={3,7,8,9,2};
		int sum=0;
		int sum2=sum;
		for (int i=0;i<numb.length;i++ ) {
			if (numb[i] > sum) {
				sum=numb[i]+numb[i+1];
				sum2 = sum;
				
	
			}
			
			
		}
		System.out.println("max sum of two digite is:"+sum2);
		
		
		
	}
	
}