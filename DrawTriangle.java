class DrawTriangle {

public static void maketriangle() {
String t="*";
String e=" ";
StringBuffer sbuf=new StringBuffer();
for(int i=0;i<6;i++) {
    for(int j=0;j<(6-i);j++) {
        sbuf.append(e);
    }
    for(int j=0;j<(i*2)-1;j++){
        sbuf.append(t);
    System.out.printf("%d %s\n",i,sbuf.toString());
    sbuf.delete(0, sbuf.length());
}

}

public static void main(String[] args) {

maketriangle();
}
}
