public class ReverseHello{

	public void ReversedHello(){
		String k = "Hello";
		char[] chArr = k.toCharArray();

		StringBuilder h = new StringBuilder();

		for(int i=chArr.length-1; i>=0; i--){
			h.append(chArr[i]);
		}
		System.out.println(h);

	}
	public static void main(String[] args) {
		ReverseHello r = new ReverseHello();
		r.ReversedHello();
		
	}
}


