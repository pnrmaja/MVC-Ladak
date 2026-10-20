
package model;

public class Lada {

    private int sorszam;
    private String szin;
    private String felirat;
    private boolean kincsetRejt;

    public Lada(int sorszam, String szin, String felirat, boolean kincsetRejt) {
        this.sorszam = sorszam;
        this.szin = szin;
        this.felirat = felirat;
        this.kincsetRejt = kincsetRejt;
    }

    public int getSorszam() {
        return sorszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincsetRejt() {
        return kincsetRejt;
    }
}
