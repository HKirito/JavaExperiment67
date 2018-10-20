package Experiment7.T8;

public class Cannonball{
    private double x_position;
    private double y_position;
    private double x_velocity;
    private double y_velocity;
    private boolean shooted = false;


    public double getX() {
        return (double)Math.round(x_position*1000)/1000;
    }

    public double getY() {
        return (double)Math.round(y_position*1000)/1000;
    }

    public Cannonball(double x){
        x_position = x;
        y_position = 0;
    }

    public void Move(double sec){
        if (getY()<=0 && shooted ==true){

            System.out.println(this.toString());
            System.exit(0);
        }
        else {
            System.out.println("X :"+getX()+" Y :"+getY());
            x_position = x_position + x_velocity * sec;
            y_position = (sec*y_velocity-(0.5*(9.81)*sec*sec));
            y_velocity = y_velocity - (9.81*sec);
            shooted = true;
        }
    }

    public void Shoot(double a, double v){
        x_velocity = v * Math.cos(a*Math.PI/180);
        y_velocity = v * Math.sin(a*Math.PI/180);
        System.out.println(x_velocity+","+y_velocity);
        while (true){
            this.Move(0.01);
        }
    }

    @Override
    public String toString() {
        return "Cannonball{" +
                "x_position=" +getX() +
                ", y_position="+getY()+
                '}';
    }
}
