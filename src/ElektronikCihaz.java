public abstract class ElektronikCihaz {
    String name;
    String tür;
    public ElektronikCihaz(String name,String tür)
    {
        this.name=name;
        this.tür=tür;
    }
    abstract void Accept(IYazdirici yazdirici);
}
