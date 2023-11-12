import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Laerer l1 = new Laerer(1, "navn1", "enavn1", "adresse1", "postnr1", "mobilnr1", 'a');
        Laerer l2 = new Laerer(2, "navn2", "enavn2", "adresse2", "postnr2", "mobilnr2", 'b');
        Studerende s1 = new Studerende(1, "navn1", "enavn1", "adresse1", "postnr1", "mobilnr1", 'a');
        Studerende s2 = new Studerende(2, "navn2", "enavn2", "adresse2", "postnr2", "mobilnr2", 'b');
        Fag f1 = new Fag(1, "Programming");
        Fag f2 = new Fag(2, "Systemudvikling");



        ArrayList<Laerer> lListe = new ArrayList<>();
        lListe.add(l1);
        lListe.add(l2);
        System.out.println(lListe);
        ArrayList<Studerende> sListe = new ArrayList<>();
        sListe.add(s1);
        sListe.add(s2);
        System.out.println(sListe);
        ArrayList<Fag> fListe = new ArrayList<>();
        fListe.add(f1);
        fListe.add(f2);
        System.out.println(fListe);

        Skole sk1 = new Skole(sListe, fListe, lListe);

        sk1.opretStuderende(3, "navn3", "enavn3", "adresse3", "postnr3", "mobilnr3", 'a');

        sk1.tilmeldStuderendeFag(s1, f1);
        System.out.println(sk1);
        sk1.tilmeldStuderendeFag(2, 1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sk1.tilmeldteTilFag(1));
        sk1.setLaererFag(1, 1);
        System.out.println(sk1.laererUnderviserFag("Programming"));
        System.out.println(sk1.klasseListe('a'));
        sk1.tilmeldStuderendeKlasse(2, 'a');
        System.out.println(sk1.klasseListe('a'));
    }
}