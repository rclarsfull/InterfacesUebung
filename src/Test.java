public class Test {
    public static void main(String[]args){
        Kreis k=new Kreis(5);
        Rechteck r=new Rechteck(5,4);

        System.out.println(k.berrechneFläche());
        System.out.println(k.toString());

        System.out.println(r.berrechneFläche());
        System.out.println(r.toString());
    }


}
