/* A sample class that implements the given interfaces.
 */
public class DonkeySupercar implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public DonkeySupercar() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Vrooom!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

}
