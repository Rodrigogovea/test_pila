public class pila 
{
    private nodo UltimoValorAgregado;
    int tamanio = 0;
    String lista = "";

    public pila()
    {
        UltimoValorAgregado = null;
        tamanio = 0;
    }

    public boolean verificarVacia()
    {
        if(UltimoValorAgregado == null)
            return true;
        else
            return false;
    }
    public void insertarNodo(int dato)
    {
        nodo nuevo_nodo = new nodo(dato);
        nuevo_nodo.siguiente = UltimoValorAgregado;
        UltimoValorAgregado = nuevo_nodo;
        tamanio++;
    }

    public int eliminarNodo()
    {
        int aux = UltimoValorAgregado.informacion;
        UltimoValorAgregado = UltimoValorAgregado.siguiente;
        tamanio--;
        return aux;
    }

    public int mostrarUltimo()
    {
        return UltimoValorAgregado.informacion;
    }

    public int tamanioPila()
    {
        return tamanio;
    }

    public void vaciarPila()
    {
        while(!verificarVacia())
        {
            eliminarNodo();
        }
    }


    public void mostrarValores()
    {
        nodo recorrido = UltimoValorAgregado;
        while(recorrido != null)
        {
            lista+=recorrido.informacion + "\n";
             recorrido = recorrido.siguiente;
        }

        System.out.println(lista);
        lista = "";
    }
}
