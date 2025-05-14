package Composition;

public class Main {
    public static void main(String[] args) {
        Resolution resolution =new Resolution(1920,1080);

        Monitor monitor = new Monitor("VAS485DS","LG",24,resolution);

        Kasa kasa = new Kasa("A85SD42","SONY","GRANİT");

        Anakart anakart = new Anakart("2S5D4C575", "Hp",20,"Windows 11");

        Bilgisayar bilgisayar = new Bilgisayar(monitor,kasa,anakart);

        bilgisayar.getKasa().bilgisayarAc();//iç içe objelere referanslar sayesinmde erişebiliyoruz
        bilgisayar.getMonitor().monitorKapat();
    }
}
