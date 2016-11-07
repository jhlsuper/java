class RockPaperScissors{

	static void RPS(String a, String b){
		if (a.equals("R")) {
			if (b.equals("R")) {
				System.out.println("Draw");
			}
			else if (b.equals("P")){
				System.out.println("B wins");
			}
			else if (b.equals("S")){
				System.out.println("A wins");
			}						
		}
		else if (a.equals("P")) {
			if (b.equals("R")) {
				System.out.println("A wins");
			}
			else if (b.equals("P")){
				System.out.println("Draw");
			}
			else if (b.equals("S")){
				System.out.println("B winns");
			}						
		}
		else if (a.equals("S")) {
			if (b.equals("R")) {
				System.out.println("B wins");
			}
			else if (b.equals("P")){
				System.out.println("A wins");
			}
			else if (b.equals("S")){
				System.out.println("Draw");
			}						
		}
		else{
			System.out.println("error");
		}


	}

	public static void main(String[] args) {
		RockPaperScissors game = new RockPaperScissors();
		game.RPS("R","S");
		game.RPS("P","S");
		game.RPS("S","S");
	}


}