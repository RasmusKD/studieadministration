import java.util.ArrayList;

public class Skole {
    private ArrayList<Studerende> klasseListe;
    private ArrayList<Fag> fagListe;
    private ArrayList<Laerer> laererListe;

    public Skole() {
    }

    public Skole(ArrayList<Studerende> klasseListe, ArrayList<Fag> fagListe, ArrayList<Laerer> laererListe) {
        this.klasseListe = klasseListe;
        this.fagListe = fagListe;
        this.laererListe = laererListe;
    }

    public ArrayList<Studerende> getKlasseListe() {
        return klasseListe;
    }

    public void setKlasseListe(ArrayList<Studerende> klasseListe) {
        this.klasseListe = klasseListe;
    }

    public ArrayList<Fag> getFagListe() {
        return fagListe;
    }

    public void setFagListe(ArrayList<Fag> fagListe) {
        this.fagListe = fagListe;
    }

    public ArrayList<Laerer> getLaererListe() {
        return laererListe;
    }

    public void setLaererListe(ArrayList<Laerer> laererListe) {
        this.laererListe = laererListe;
    }

    public Studerende getStuderende(int stdNr){
        int studerendeIndex = getStuderendeIndexNr(stdNr);
        return klasseListe.get(studerendeIndex);
    }

    public Fag getFag(int fagNr){
       int fagIndex = getFagIndexNr(fagNr);
       return fagListe.get(fagIndex);
    }

    public Fag getFag(String fagnavn){
        int fagIndex = getFagIndexNr(fagnavn);
        return fagListe.get(fagIndex);
    }

    public Laerer getLaerer(int laererNr){
        int LaererIndex = getLaererIndexNr(laererNr);
        return laererListe.get(LaererIndex);
    }

    private int getStuderendeIndexNr(int stdNr){
        for (int i = 0; i < klasseListe.size(); i++){
            if (stdNr == klasseListe.get(i).getStdnr()){
                return i;
            }
        }
        return -1;
    }

    private int getStuderendeIndexNr(Studerende s){
        for (int i = 0; i < klasseListe.size(); i++){
            if (s == klasseListe.get(i)){
                return i;
            }
        }
        return -1;
    }

    private int getFagIndexNr(int fagNr){
        for (int i = 0; i < fagListe.size(); i++){
            if (fagNr == fagListe.get(i).getFagnr()){
                return i;
            }
        }
        return -1;
    }

    private int getFagIndexNr(String fagnavn){
        for (int i = 0; i < fagListe.size(); i++){
            if (fagnavn == fagListe.get(i).getFagNavn()){
                return i;
            }
        }
        return -1;
    }

    private int getFagIndexNr(Fag f){
        for (int i = 0; i < fagListe.size(); i++){
            if (f == fagListe.get(i)){
                return i;
            }
        }
        return -1;
    }

    private int getLaererIndexNr(int laererNr){
        for (int i = 0; i < laererListe.size(); i++){
            if (laererNr == laererListe.get(i).getLaererNr()){
                return i;
            }
        }
        return -1;
    }

    private int getLaererIndexNr(Laerer l){
        for (int i = 0; i < laererListe.size(); i++){
            if (l == laererListe.get(i)){
                return i;
            }
        }
        return -1;
    }

    public void opretStuderende(Studerende s){
        klasseListe.add(s);
    }

    public void opretStuderende(int stnNr,String f,String e, String a, String p, String m, char k){
        Studerende s = new Studerende(stnNr, f, e, a, p , m , k);
        klasseListe.add(s);
    }

    public void opretLaerer(Laerer l){
        laererListe.add(l);
    }

    public void opretLaerer(int lNr, String f, String e,String a,String p, String m){
        Laerer l = new Laerer(lNr, f, e, a, p, m);
        laererListe.add(l);
    }

    public void opretFag(Fag f){
        fagListe.add(f);
    }

    public void opretFag(int fagNr,String navn){
        Fag f = new Fag(fagNr, navn);
        fagListe.add(f);
    }

    public void tilmeldStuderendeFag(Studerende s, Fag f){
        ArrayList <Fag> tilmeldteFag = s.getTilmeldteFag();
        tilmeldteFag.add(f);
        s.setTilmeldteFag(tilmeldteFag);
    }

    public void tilmeldStuderendeFag(int stdNr, int fagNr){
        Studerende s = getStuderende(stdNr);
        Fag f = getFag(fagNr);

        ArrayList <Fag> tilmeldteFag = s.getTilmeldteFag();
        tilmeldteFag.add(f);
        s.setTilmeldteFag(tilmeldteFag);
    }

    public void setLaererFag(Laerer l, Fag f){
        ArrayList <Fag> laererFag = l.getFagListe();
        laererFag.add(f);
        l.setFagListe(laererFag);
    }

    public void setLaererFag(int laererNr, int fagNr){
        Laerer l = getLaerer(laererNr);
        Fag f = getFag(fagNr);

        ArrayList <Fag> tilmeldteFag = l.getFagListe();
        tilmeldteFag.add(f);
        l.setFagListe(tilmeldteFag);
    }

    public void frameldStuderendeFag(Studerende s, Fag f){
        ArrayList <Fag> tilmeldteFag = s.getTilmeldteFag();
        tilmeldteFag.remove(f);
        s.setTilmeldteFag(tilmeldteFag);
    }

    public void frameldStuderendeFag(int stdNr, int fagNr){
        Studerende s = getStuderende(stdNr);
        Fag f = getFag(fagNr);

        ArrayList <Fag> tilmeldteFag = s.getTilmeldteFag();
        tilmeldteFag.remove(f);
        s.setTilmeldteFag(tilmeldteFag);
    }

    public void fjernLaererFag(Laerer l, Fag f){
        ArrayList <Fag> laererFag = l.getFagListe();
        laererFag.remove(f);
        l.setFagListe(laererFag);
    }

    public void fjernLaererFag(int laererNr, int fagNr){
        Laerer l = getLaerer(laererNr);
        Fag f = getFag(fagNr);

        ArrayList <Fag> tilmeldteFag = l.getFagListe();
        tilmeldteFag.remove(f);
        l.setFagListe(tilmeldteFag);
    }

    public ArrayList<Studerende> tilmeldteTilFag(int fagNr){
        ArrayList<Studerende> s = new ArrayList<>();
        Fag f = getFag(fagNr);
        for (int i = 0; i < klasseListe.size(); i++){
            if(klasseListe.get(i).getTilmeldteFag().contains(f)){
                s.add(klasseListe.get(i));
            }
        }
        return s;
    }

    public ArrayList<Studerende> tilmeldteTilFag(Fag f){
        ArrayList<Studerende> s = new ArrayList<>();
        for (Studerende studerende : klasseListe) {
            if (studerende.getTilmeldteFag().contains(f)) {
                s.add(studerende);
            }
        }
        return s;
    }

    public ArrayList<Laerer> laererUnderviserFag(String fagNavn){
        ArrayList<Laerer> l = new ArrayList<>();
        Fag f = getFag(fagNavn);
        for (Laerer laerer : laererListe) {
            if (laerer.getFagListe().contains(f)) {
                l.add(laerer);
            }
        }
        return l;
    }

    public ArrayList<Studerende> klasseListe(char kl){
        ArrayList<Studerende> s = new ArrayList<>();
        for (Studerende studerende : klasseListe) {
            if (studerende.getKlasse() == kl) {
                s.add(studerende);
            }
        }
        return s;
    }

    public void tilmeldStuderendeKlasse(int stdNr, char kl){
        Studerende s = getStuderende(stdNr);
        s.setKlasse(kl);
    }

    public void tilmeldStuderendeKlasse(Studerende s, char kl){
        s.setKlasse(kl);
    }

    public void fjernStuderendeKlasse(int stdNr, char kl){
        Studerende s = getStuderende(stdNr);
        s.setKlasse(' ');
    }

    public void fjernStuderendeKlasse(Studerende s, char kl){
        s.setKlasse(' ');
    }

    @Override
    public String toString() {
        return "Skole{" +
                "klasseListe=" + klasseListe +
                ", fagListe=" + fagListe +
                ", laererListe=" + laererListe +
                '}';
    }
}
