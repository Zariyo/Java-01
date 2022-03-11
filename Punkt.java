import java.lang.Math;

public class Punkt {
    private double x;
    private double y;

    public Punkt(){
        this(0,0);
    }

    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){ return x; }

    public void setX(double x) { this.x = (x < 0 ? -x: x); }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = (y< 0 ? -y: y);
    }

    public void shift(double x, double y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public double distance(Punkt p){
        double dist = Math.pow(Math.pow((p.x - this.x), 2)+(Math.pow((p.y - this.y), 2)), 0.5);
        return dist;
    }


}
