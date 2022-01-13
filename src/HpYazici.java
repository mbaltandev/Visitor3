public class HpYazici implements IYazdirici{
    @Override
    public void Yazdir(ElektronikCihaz elektronikCihaz) {
        System.out.println(elektronikCihaz.name + " Tarafından Hp Yazici ile yazdırılma işlemi yapılıd");
    }
}
