public class Bilgisayar extends ElektronikCihaz{
    public Bilgisayar(String name, String tür) {
        super(name, tür);
    }

    @Override
    void Accept(IYazdirici yazdirici) {
        yazdirici.Yazdir(this);

    }
}
