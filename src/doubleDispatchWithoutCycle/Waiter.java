package doubleDispatchWithoutCycle;

public class Waiter implements StaffRestaurant{

    private Person person;

    public void greet(Person person){
        System.out.println("Hola cliente, voy a saludar según su género: ");
        person.accept(this);
        System.out.println("Ya está saludad@");
    }

    @Override
    public void visit(Woman woman){
        System.out.print("Es mujer: Que guapa!");
    }

    @Override
    public void visit(Man man){
        System.out.print("Es hombre: Que guapo!");
    }

    public static void main(String[] args) {
        new Waiter().greet(new Woman());
    }
}
