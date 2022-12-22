import java.time.LocalDate;

public class IslaiduIrasas {
    private int suma;
    private String dataSuLaiku;
    private String kategorija;
    private String atsiskaitymoBudas;
    private String papildomaInfo;

    public IslaiduIrasas(int suma, LocalDate dataSuLaiku, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        this.suma = suma;
        this.dataSuLaiku = String.valueOf(dataSuLaiku);
        this.kategorija = kategorija;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getDataSuLaiku() {
        return dataSuLaiku;
    }

    public void setDataSuLaiku(String dataSuLaiku) {
        this.dataSuLaiku = dataSuLaiku;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
}
