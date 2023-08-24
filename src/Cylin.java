public class Cylin {
    private int vusota;
    private int radius;
    private final double PI = 3.14;

    public Cylin() {
    }
    public void celind (int v,int r){
        double plosh = 0;
        plosh = 2*PI*r*(v+r);
        System.out.println("Площадь цилиндра🟢: "+plosh);
        double res = 0;
        res = PI*r*r*v;
        System.out.println("Объем цилиндра🔴: "+res);
    }
}
