package doubleDispatch;

public class Waiter {

    private Person person;

    public void greet(Person person){
        System.out.println("Hola cliente, voy a saludar según su género: ");
        person.accept(this);
        System.out.println("Ya está saludad@");
    }

    public void visit(Woman woman){
        System.out.print("Es mujer: Que guapa!");
    }

    public void visit(Man man){
        System.out.print("Es hombre: Que guapo!");
    }

    public static void main(String[] args) {
        new Waiter().greet(new Woman());
    }
}
