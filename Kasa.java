package Composition;

public class Kasa {
    private String  model;
    private String uretici;
    private String  malzeme;

    Kasa(String model, String uretici, String malzeme) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setMalzeme(malzeme);
    }
    void bilgisayarAc(){
        System.out.println("Bilgisayar açılıyor...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
}
