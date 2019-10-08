package tugas3;

/**
 *
 * @author azki0082
 */
public class LinearEquation {
    private double a,b,c;
    private int x,y;
    
    public LinearEquation(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.x = 0;
        this.y = 0;
    }
    public LinearEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a = a;
    }
    public double getA(){
        return this.a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getB() {
        return b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }
    public void cetak(){
        if (getB()<0)
            System.out.println(getA() + "x - "+getB()*(-1)+"y = "+getC());
        else
            System.out.println(getA() + "x + "+getB()+"y = "+getC());
    }
    public boolean cekSolusi(LinearEquation l){
        return ((getA()*l.b)-(getB()*l.a))==0;
    }
    public double getX(LinearEquation l){
        double x = ((getC()*l.b) - (getB()*l.c))/((getA()*l.b)-(getB()*l.a));
        int angka = 2;
        double temp = Math.pow(10,2);
        double x1 = Math.round(x*temp)/temp;
        return x1;
    }
    public double getY(LinearEquation l){
        double y = ((getA()*l.c) - (getC()*l.a))/((getA()*l.b)-(getB()*l.a));
        int angka = 2;
        double temp = Math.pow(10,2);
        double y1 = Math.round(y*temp)/temp;
        return y1;
    }
}