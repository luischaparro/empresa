import java.util.Random;

public class Trabajador
{
    Random rdm = new Random();
    private String nombre;
    private int edad;
    private int salario;
    private int produccionMensual;
    
    public Trabajador(String nombre, int edad, int salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.produccionMensual = 50 + rdm.nextInt(151);
    }
    
    public int getSalario(){
        return salario;
    }
    
    public int getProduccionMensual(){
        return produccionMensual;
    }
    
    public void visualizar(){
        System.out.println(", nombre: " + nombre + ", edad: " + edad + ", salario: " + salario + ", produccion: " + produccionMensual);
    }
}