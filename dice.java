for(int i=0; i<10;i++)
    d.roll();
class dice {
    private int number = 0;
    public void roll() {
        number = (int) (Math.random() * 6);
        System.out.println("Turn on " + number);
    }
    public int getNum() {
        return this.number;
    }
}