public class Rechteck implements Forms1, Forms2, Umfang {

    public static int anzahlRechtecke;
    public double a,b;

    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
        anzahlRechtecke++;
    }

    @Override
    public double berrechneFläche() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "a=" + a +
                ", b= " + b +
                ", Farbe= "+ FARBE +
                '}';
    }

    @Override
    public double umfang() {
        return 2*a+2*b;
    }
}
