package doubleDispatchWithoutCycle;

public class Woman extends Person {


    @Override
    public void accept(StaffRestaurant staffRestaurant) {
        staffRestaurant.visit(this);
    }
}
