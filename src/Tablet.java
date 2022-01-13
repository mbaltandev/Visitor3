public class Tablet extends ElektronikCihaz{
    public Tablet(String name, String tür) {
        super(name, tür);
    }

    @Override
    void Accept(IYazdirici yazdirici) {
        yazdirici.Yazdir(this);

    }
}
