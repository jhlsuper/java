class DrawTriangle {

public static void maketriangle() {
String t="*";
StringBuffer sbuf=new StringBuffer();
for(int i=0;i<5;i++) {
    for(int j=0;j<i;j++) {
        sbuf.append(t);
    }
    System.out.printf("%d %s\n",i,sbuf.toString());
    sbuf.delete(0, sbuf.length());
}

}

public static void main(String[] args) {

maketriangle();
}
}
