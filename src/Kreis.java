public class Kreis implements Forms1,Forms2,Umfang {
    private double radius;
    private static int anzahlKreise;

    Kreis() {
        anzahlKreise++;
    }

    Kreis(int radius){
        this.radius=radius;
        anzahlKreise++;
    }

    @Override
    public double berrechneFläche() {
        return Math.pow(Math.PI*radius,2);
    }

    @Override
    public double umfang() {
        return radius*1*Math.PI;
    }

    @Override
    public String toString() {
        return "Kreis:{"+
                "Radius= "+ radius+
                ", Farbe= "+ FARBE +
                "}";
    }
}
