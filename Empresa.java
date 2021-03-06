
public class Empresa
{
    private String nombreEmpresa;
    private int capital ;
    private Sucursal[] sucursales;
    private int numSucursal = 0;
    
    public Empresa(String nombre, int capital){
        this.sucursales = new Sucursal[30];
        this.nombreEmpresa = nombre;
        this.capital = capital;
    }
    
    public void agregarSucursal(Sucursal sucursal){
        this.sucursales[numSucursal] = sucursal;
        numSucursal++;
    }
    
    public void agregarTrabajador(Trabajador trabajador, int idSucursal){
        this.sucursales[idSucursal].agregarTrabajador(trabajador);
    }
    
    public int calcularGananciaEmpresa(){
        int tGanancia = 0;
        for(int i = 0; i < numSucursal; i++){
            tGanancia += sucursales[i].calcularGananciaSucursal();
        }
        return tGanancia;
    }
    
    public int calcularGastosEmpresa(){
        int tPagos = 0;
        for(int i = 0; i < numSucursal; i++){
            tPagos += sucursales[i].calcularGastosSucursal();
        }
        return tPagos;
    }
    
    public void verificarEstadoEmpresa (){
        if(calcularGananciaEmpresa() < calcularGastosEmpresa()){
            System.out.println("Las ganancias no estan cubriendo los gastos,el estado actual de la empresa es deficiente");
        }else{
            System.out.println("Las ganancias estan cubriendo los gastos,el estado actual de la empresa es eficiente");
        }
    }
    
    public void capitalFinMes(){
        capital += calcularGananciaEmpresa();
        capital -= calcularGastosEmpresa();
    }
    
    public void visualizar(){
        System.out.println("----------------------------------------------");
        System.out.println("Empresa: " + nombreEmpresa + ", con un capital de " + capital);
        System.out.println("|");
        for(int i = 0; i < numSucursal; i++){
            System.out.print("|-----Sucursal #" + i);
            sucursales[i].visualizar();
        }
        System.out.println("----------------------------------------------");
    }
}
