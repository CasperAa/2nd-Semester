package Genopfriskning.Bog;

public class Bog {

    final int ISBNnumber;
    final String titel;
    final int udgivelsesår;

    public Bog(int isbNnumber, String titel, int udgivelsesår) {
        this.ISBNnumber = isbNnumber;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return  "Titel        = " + titel + "\n" +
                "ISBNnumber   = " + ISBNnumber + "\n" +
                "Udgivelsesår = " + udgivelsesår + "\n";
    }

    public int getISBNnumber() {
        return ISBNnumber;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }
}
