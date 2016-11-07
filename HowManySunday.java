import java.util.Calendar;
class HowManySunday{
	int sunday=0;
	void countsunday(){
		Calendar c=Calendar.getInstance(); 
		for(int i=1901;i<=2000;i++){
			for(int j=0;j<12;j++){
				c.set(i,j,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					sunday+=1;
				}
			}
		}
		System.out.printf("There are %d sundays on the first of a month",sunday);
}
	public static void main(String[] args){
		HowManySunday hms=new HowManySunday();
		hms.countsunday();
	}
}