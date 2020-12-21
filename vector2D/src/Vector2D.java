import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;
    public static int count=0;
    public Vector2D(){
        this.vX=1;
        this.vY=1;
        count++;
    }
    public Vector2D(double vX,double vY){
        this.vX=vX;
        this.vY=vY;
        count++;
    }
    public Vector2D(Vector2D copy){
        vX=copy.vX;
        vY= copy.vY;
        count++;
    }
    public void print(){

        System.out.println(String.format(Locale.ROOT, "(%.2f, %.2f)",vX,vY));
    }

    public double length(){
        return Math.sqrt(Math.pow(vX,2)+Math.pow(vY,2));
    }
    public void add(Vector2D v){
        vX+=v.vX;
        vY+=v.vY;
    }
    public void sub(Vector2D v){
        vX-=v.vX;
        vY-=v.vY;
    }
    public void scale(double scaleFactor){
        vX*=scaleFactor;
        vY*=scaleFactor;
    }
    public void normalized(){
        double Invlength= 1/this.length();
        vX*=(Invlength);
        vY*=(Invlength);
    }
    public double dotProduct(Vector2D v){
        return vX*v.vX+vY*v.vY;
    }
}
