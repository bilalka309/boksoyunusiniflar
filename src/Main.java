public class Main {
    public static void main(String[] args) {
        Fighter marc=new Fighter("Marc",13,90,79,36);
        Fighter alex=new Fighter("Alex",19,63,111,46);
        Ring r = new Ring(marc,alex , 75 , 115,50.0);
        r.run();
    }
}