import java.time.LocalDate;

public class PajamuIrasas {
    private int suma;
    private String data;
    private String kategorija;
    private String pozymisArIBanka;
    private String papildomaInfo;


    public PajamuIrasas(int suma, LocalDate data, String kategorija, String pozymisArIBanka, String papildomaIndo) {
        this.suma = suma;
        this.data = String.valueOf(data);
        this.kategorija = kategorija;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaIndo;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(String pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

    public String getpapildomaInfo() {
        return papildomaInfo;
    }

    public void setpapildomaInfo(String papildomaIndo) {
        this.papildomaInfo = papildomaIndo;
    }
}
