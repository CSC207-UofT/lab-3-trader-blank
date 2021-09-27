public class Bus implements Tradable, Drivable{
    public int seats;
    public int speed;

    public Bus(int seats) {
        this.seats = seats;
        this.speed = 80;
    }

    @Override
    public int getPrice() {
        return 10000 + 100 * this.seats;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public void downgradeSpeed() {
        this.speed -= 5;
    }

    @Override
    public void upgradeSpeed() {
        this.speed += 5;
    }
}
