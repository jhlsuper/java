﻿public class Player {
    private String name=null;
    int num=0;
    public Player(String _name) {
        name=_name;
    }
    public void play() {
        dice d=new dice();
        //num=d.roll();
        d.roll();
        num=d.getNum();
    }
    public String getName() {
        return this.name;
    }
    public int getNum() {
        return this.num;
    }
}
Player p=new Player("jh");
p.play();