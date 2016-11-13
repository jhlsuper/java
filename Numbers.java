import java.util.ArrayList;

public	 class Numbers{

	Numbers(){};
	
	ArrayList<Integer> myList = new ArrayList<Integer>();

	public void setNumbers(){
		int i;		
		for (i=1;i<=1000;i++ ) {
			if (i%4==0 && i%5!=0) {
				myList.add(i);				
			}					
		}
	}

	int sumList(){
		int sum=0;
		for(int j:myList){
			sum+=j;
		}
		return sum;
	}


	public static void main(String[] args) {
		Numbers num = new Numbers();
		num.setNumbers();
		System.out.println("sum:" + num.sumList());
	}

	
}