package doubleDispatchWithoutCycle;

public class Chef implements StaffRestaurant{


    public void Serve(Person person){
        System.out.println("El chef le trae la bebida: ");
        person.accept(this);
        System.out.println("saludos desde cocina!");
    }

    @Override
    public void visit(Woman woman) {
        System.out.println("Aquí tiene su vino blanco señorita");
    }

    @Override
    public void visit(Man man) {
        System.out.println("Aquí tiene su vino negro caballero");
    }

    public static void main(String[] args) {
        new Chef().Serve(new Woman());
        new Chef().Serve(new Man());
    }
}
