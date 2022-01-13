public class Main {

    public static void main(String[] args) {
	ElektronikCihaz HpBilgisyar= new Bilgisayar("Hp Bilgisayar","Bilgisayar");
    ElektronikCihaz SamsungTablet=new Tablet("Samsung Tablet","Tablet");

    IYazdirici HpYazici=new HpYazici();
    IYazdirici CanonYazici=new Canonyazici();

    HpBilgisyar.Accept(HpYazici);
    HpBilgisyar.Accept(CanonYazici);
    SamsungTablet.Accept(CanonYazici);

    }
}
