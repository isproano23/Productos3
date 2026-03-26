public class Cliente {
    private String nombre;
    private String correo;
    private double saldo;
    private int totalCompras;
    
    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
        this.totalCompras = 0;
    }
    
    public void mostrarPerfil() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Compras realizadas: " + totalCompras);
    }
    
    public void realizarCompra(double monto) {
        if (saldo >= monto) {
            saldo = saldo - monto;
            totalCompras = totalCompras + 1;
            System.out.println("Compra exitosa por $" + monto);
            System.out.println("Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
        }
    }
    
    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }
}