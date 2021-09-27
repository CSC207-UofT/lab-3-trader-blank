public class Bike implements Tradable, Drivable{
    private int maxSpeed;
    private int capacity;
    private int price;

    public Bike(int capacity, int price) {
        this.maxSpeed = 1;
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        if (this.maxSpeed > 0){
            this.maxSpeed--;
        }
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ", Capacity: "+ this.capacity + ", Price:" + this.price +")";
    }
}
