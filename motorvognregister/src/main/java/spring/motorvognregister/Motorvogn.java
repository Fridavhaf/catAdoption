package spring.motorvognregister;

public class Motorvogn {
    private String personnummer;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String bilmerke;
    private String biltype;

    public Motorvogn(String personnummer, String navn, String adresse, String kjennetegn, String bilmerke, String biltype){
        this.personnummer = personnummer;
        this.navn = navn;
        this.adresse = adresse;
        this.kjennetegn = kjennetegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;
    }
    public Motorvogn(){}

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public void setBilmerke(String bilmerke) {
        this.bilmerke = bilmerke;
    }

    public String getBilmerke() {
        return bilmerke;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getBiltype() {
        return biltype;
    }
}
