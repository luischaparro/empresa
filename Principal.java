import java.util.Scanner;

public class Principal
{
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        int opcion;
        String nombreEmp;
        System.out.println("Ingrese el nombre de la empresa ");
        nombreEmp = entrada.nextLine();
        System.out.println("Ingrese el capital inicial de la empresa ");
        Empresa emp = new Empresa(nombreEmp, entrada.nextInt());
        do {
            menu_1();
            opcion = entrada.nextInt();
            verificarMenu_1(opcion, emp);
        } while(opcion != 0);
        System.out.println("------------Fin Del Programa-------------");
    }
    
    public static void menu_1(){
        System.out.println("Que accion desea realizar: " +
                "\n\t1) Nueva Sucursal" +
                "\n\t2) Nuevo Trabajador" +
                "\n\t3) Visualizar Empresa" +
                "\n\t4) Estado" +
                "\n\t0) Salir");
    }
    
    public static void verificarMenu_1(int opcion, Empresa emp){
        switch(opcion) {
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    String nombreSuc;
                    System.out.println("Ingrese nombre de la sucursal");
                    nombreSuc = entrada.next();
                    int precio;
                    System.out.println("Ingrese el precio del producto en la sucursal");
                    precio = entrada.nextInt();
                    Sucursal sucursal = new Sucursal(nombreSuc, precio);
                    emp.agregarSucursal(sucursal);
                    System.out.println("Nueva sucursal registrada con exito...");
                    break;
                case 2:
                    int id;
                    System.out.println("Ingrese id de la sucursal donde sera registrado en nuevo trabajador");
                    id = entrada.nextInt();
                    String nombreTrab;
                    System.out.println("Ingrese nombre del trabajador");
                    nombreTrab = entrada.next();
                    int edadTrab;
                    System.out.println("Ingrese edad del trabajador");
                    edadTrab = entrada.nextInt();
                    int salario;
                    System.out.println("Ingrese el salario del trabajador");
                    salario = entrada.nextInt();

                    emp.agregarTrabajador(new Trabajador(nombreTrab, edadTrab, salario), id);
                    System.out.println("Nuevo trabajador registrado con exito...");
                    break;
                case 3:
                    emp.visualizar();
                    break;
                case 4:
                    emp.verificarEstadoEmpresa();
                    break;
                default:
                    break;
            }
    }
}
