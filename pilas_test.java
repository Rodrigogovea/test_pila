public class pilas_test
{
    public static void main(String[] args)
    {
        pila miPila = new pila();
        miPila.insertarNodo(50);
        miPila.insertarNodo(45);
        miPila.insertarNodo(56);
        miPila.insertarNodo(34);
        miPila.insertarNodo(45);

        miPila.mostrarValores();

        System.out.println(miPila.tamanioPila());

        miPila.eliminarNodo();

        System.out.println(miPila.tamanioPila());
    }
}