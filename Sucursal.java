
public class Sucursal
{
    private String nombre;
    private int numTrabajador = 0;
    private int precioProducto;
    private Trabajador[] tr;
    
    public Sucursal(String nombre,int precioProducto){
        this.tr = new Trabajador[30];
        this.nombre = nombre;
        this.precioProducto = precioProducto;
    }
    
    public void agregarTrabajador(Trabajador trabajador){
        this.tr[numTrabajador] = trabajador;
        numTrabajador++;
    }

    public int calcularGananciaSucursal(){
        int tGanancia = 0;
        for(int i = 0; i < numTrabajador; i++){
            tGanancia += tr[i].getProduccionMensual() * precioProducto;
        }
        return tGanancia;
    }
    
    public int calcularGastosSucursal(){
        int tPagos = 0;
        for(int i = 0; i < numTrabajador; i++){
            tPagos += tr[i].getSalario();
        }
        return tPagos;
    }
    
    public void visualizar(){
        System.out.println(", nombre " + nombre + ", precio del producto " + precioProducto + " con " + numTrabajador + "de trabajadores");
        for(int i = 0; i < numTrabajador; i++){
            System.out.print("|\t|-----Trabajador #" + i);
            tr[i].visualizar();
        }
    }

}