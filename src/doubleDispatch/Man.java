package doubleDispatch;

public class Man extends Person{


    @Override
    public void accept(Waiter waiter) {
        waiter.visit(this);
    }
}
