public class Parel {
    private int vusota;
    private int dlina;
    private int shirina;


    public Parel() {
    }

    public void parel(int v, int d, int sh){
        double res = 0;
        res = (v*d)+(d*sh)+(v*sh)*2;
        System.out.println("Площадь прямогульника 🟩: "+res);
        double ress = 0;
        ress = v*d*sh;
        System.out.println("Объем прямогульника 🟥: "+ress);
    }
}
