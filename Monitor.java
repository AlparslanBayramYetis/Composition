package Composition;

public class Monitor {
    private String model;
    private String uretici;
    private int boyut;
    private Resolution resolution;

    public Monitor(String model, String uretici, int boyut, Resolution resolution) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setBoyut(boyut);
        this.setResolution(resolution);
    }
    void monitorKapat(){
        System.out.println("Monitor kapatılıyor...");
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

    public int getBoyut() {
        return boyut;
    }

    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
