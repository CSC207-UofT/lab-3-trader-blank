/* A Reindeer class
 */

import java.awt.*;

public class Reindeer implements Tradable, Domesticatable, Drivable{
    private int maxSpeed;
    private Color noseColour;

    public Reindeer(){
        this.maxSpeed = 1;
        this.noseColour = Color.red;
    }

    public void setNoseColour(Color noseColour) {
        this.noseColour = noseColour;
    }

    public Color getNoseColour(){
        return this.noseColour;
    }

    @Override
    public String sound() {
        return "Grunt...";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 3;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 3;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        if (noseColour == Color.red){
            return this.maxSpeed * 10;
        } else{
            return this.maxSpeed * 5;
        }
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +", Price: " + this.getPrice() + ")";
    }
}
