public class pilas_test
{
    public static void main(String[] args)
    {
        pila miPila = new pila();
        miPila.insertarNodo(10);
        miPila.insertarNodo(20);
        miPila.insertarNodo(30);
        miPila.insertarNodo(40);
        miPila.insertarNodo(50);

        miPila.mostrarValores();

        System.out.println(miPila.tamanioPila());

        System.out.println(miPila.eliminarNodo());

        System.out.println(miPila.tamanioPila());

        miPila.mostrarValores();
    }
}