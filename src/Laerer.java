import java.util.ArrayList;

public class Laerer {
    private int laererNr;
    private String fnavn;
    private String enavn;
    private String adresse;
    private String postnr;
    private String mobil;
    private char klasse;
    private ArrayList<Fag> fagListe = new ArrayList<>();

    public Laerer() {
    }

    public Laerer(int laererNr, String fnavn, String enavn, String adresse, String postnr, String mobil) {
        this.laererNr = laererNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.mobil = mobil;
    }

    public Laerer(int laererNr, String fnavn, String enavn, String adresse, String postnr, String mobil, char klasse) {
        this.laererNr = laererNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.mobil = mobil;
        this.klasse = klasse;
    }

    public Laerer(int laererNr, String fnavn, String enavn, String adresse, String postnr, String mobil, char klasse, ArrayList<Fag> fagListe) {
        this.laererNr = laererNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.mobil = mobil;
        this.klasse = klasse;
        this.fagListe = fagListe;
    }

    public int getLaererNr() {
        return laererNr;
    }

    public void setLaererNr(int laererNr) {
        this.laererNr = laererNr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPostnr() {
        return postnr;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public char getKlasse() {
        return klasse;
    }

    public void setKlasse(char klasse) {
        this.klasse = klasse;
    }

    public ArrayList<Fag> getFagListe() {
        return fagListe;
    }

    public void setFagListe(ArrayList<Fag> fagListe) {
        this.fagListe = fagListe;
    }

    @Override
    public String toString() {
        return "Laerer{" +
                "laererNr=" + laererNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr='" + postnr + '\'' +
                ", mobil='" + mobil + '\'' +
                ", klasse=" + klasse +
                ", fagListe=" + fagListe +
                '}';
    }
}
