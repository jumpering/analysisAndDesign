package doubleDispatchWithoutCycle;

public class Man extends Person {


    @Override
    public void accept(StaffRestaurant staffRestaurant) {
        staffRestaurant.visit(this);
    }
}
