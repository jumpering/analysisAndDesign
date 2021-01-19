package doubleDispatch;

public class Woman extends Person{


    @Override
    public void accept(Waiter waiter) {
        waiter.visit(this);
    }
}
