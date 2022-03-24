import java.lang.Math;

public class Odcinek {
    private Punkt p1;
    private Punkt p2;

    public Odcinek(){
        this(new Punkt(0,0), new Punkt(0,0));
    }

    public Odcinek(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Odcinek(int x1, int y1, int x2, int y2){
        this.p1 = new Punkt(x1,y1);
        this.p2 = new Punkt(x2,y2);
    }

    public double getCoordsx1(){
        return this.p1.getX();
    }

    public void shift(int x, int y){
        this.p1.setX((this.p1.getX() + x));
        this.p1.setY((this.p1.getY() + y));
        this.p2.setX((this.p2.getX() + x));
        this.p2.setY((this.p2.getY() + y));
    }

    public double distance(Punkt p){
        double a;
        a = ((this.p2.getY() - this.p1.getY())/(this.p2.getX()-this.p1.getX()));
        double b;
        b = this.p2.getY() - this.p2.getX()*a;
        return Math.abs(a*p.getX() + p.getY() + b)/Math.sqrt(Math.pow(a, 2)+1);
    }
}
