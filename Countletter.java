import java.util.*;
class Countletter{

static Map sangmyung(String sang){
	char[] myung = sang.toCharArray();
	Map<String, Integer> map = new HashMap<String, Integer>();
	String t;
	for(char m:myung){
		t = Character.toString(m);
		if(map.containsKey(t)){
			map.put(t, map.get(t)+1);
			}
		else{
			map.put(t,1);
	}
}
return map;
}

public static void main(String[] args){
	String a = "sangmyung university";
	Map b = sangmyung(a);
	System.out.println(b);
	}
}