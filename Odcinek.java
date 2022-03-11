public class Odcinek {
    private Punkt p1;
    private Punkt p2;

    public Odcinek(){
        this(new Punkt(0,0), new Punkt(0,0));
    }

    public Odcinek(Punkt p1, Punkt p2){
        this.p1 = p1;
        this.p2 = p2;
    }
}
