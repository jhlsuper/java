

class MultiplesOfThreeAndFive{
	int sum=0;
	int n;
	void getSum(int n){
		for(int i=1;i<n;i++){
			if(i%3==0||i%5==0){
				sum=sum+i;
			}
		}	
		System.out.println(sum);
	}
	public static void main(String[] args){
		MultiplesOfThreeAndFive m=new MultiplesOfThreeAndFive();
		m.getSum(1000);
		
	}

}