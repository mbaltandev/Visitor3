public class Canonyazici implements IYazdirici{
    @Override
    public void Yazdir(ElektronikCihaz elektronikCihaz) {
        System.out.println(elektronikCihaz.name + " Tarafından Canon Yazici ile yazdırılma işlemi yapıldı");
    }
}
