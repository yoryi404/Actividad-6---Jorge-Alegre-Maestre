public class Main {

    public static void main(String[] args) {

        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
       
        double saldoActual;
        operativa_cuenta(cuenta1, 695);

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
   
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);
   
        try {
            cuenta1.retirar(cantidad);
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
   
        try {
            System.out.println("Ingreso en cuenta...");
            cuenta1.ingresar(cantidad);
            System.out.println("Ingreso exitoso. Nuevo saldo: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
   
}
