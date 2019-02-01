//progrm to simulate a free fall by a sky diver 

/**@author Madhav Shekhar Sharma
 * Date: 1/2/19
 */
public class Skydiver {
    private double mass;
    private double radius;
    private double weight;
    private double projected_area;
    private double air_friction;
    private double total_force;
    private double acceleration;
    private double delta_v;
    private double delta_p;
    private double velocity;
    private double position;
    private double position_open;
    private boolean parachute_open;
    public final double ACCELERATION_GRAV = -9.81;
    public final double DELTA_T = 0.01;

    public Skydiver(double mass, double radius, double position, double position_open) {
        this.mass = mass;
        this.radius = radius;
        this.velocity = 0;
        this.position = position;
        this.position_open = position_open;
        this.parachute_open = false;

        this.weight = this.mass * ACCELERATION_GRAV;
        this.projected_area = Math.PI * this.radius * this.radius;
    }

    private void updatePosition() {
        if (!this.parachute_open && this.position <= this.position_open) {
            this.radius = 3;
            this.projected_area = Math.PI * this.radius * this.radius;
            this.parachute_open = true;
        }
        this.air_friction = -0.65 * this.projected_area * this.velocity * Math.abs(this.velocity);
        this.total_force = this.weight + this.air_friction;
        this.acceleration = this.total_force/this.mass;

        this.delta_v = this.acceleration;
        this.velocity = this.velocity + this.delta_v * this.DELTA_T;

        this.delta_p = this.velocity;
        this.position = this.position + this.delta_p * this.DELTA_T;
    }

    private String printData(long t) {
        String out = "";
        if (t % 10 == 0) {
            out += "time (s) acceleration (m/s^2) velocity (m/s) position (m) air friction (N) total force (N)\n";
            out += "**************************************************************************\n";
        }
        out += String.format("%8d %20.2f %14.2f %12.2f %16.2f %15.2f",t,this.acceleration,this.velocity,this.position,this.air_friction,this.total_force);
        return out;
    }

    public void runSimulation() throws InterruptedException {
        double t = 0;
        long interval = Math.round(1/this.DELTA_T);
        while(this.position > 0) {
            updatePosition();
            if (Math.round(t*interval)%interval == 0) {
                System.out.println(printData(Math.round(t)));
            }
            t += this.DELTA_T;
            Thread.sleep(1000/interval);
        }
    }

    
}