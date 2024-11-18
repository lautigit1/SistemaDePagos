// SistemaDePagos.java
public class SistemaPagos {
    public static void main(String[] args) {
        // Crear instancias de métodos de pago
        TarjetaCredito tarjeta = new TarjetaCredito("Juan Perez", "1234-5678-9012-3456", "12/25", "123");
        PayPal paypal = new PayPal("Maria Lopez", "987654321", "maria@gmail.com");

        // Crear el sistema de pagos
        Pagos sistemaPagos = new Pagos();
        sistemaPagos.agregarMetodoPago(tarjeta);
        sistemaPagos.agregarMetodoPago(paypal);

        // Mostrar métodos de pago
        System.out.println("Métodos de Pago:");
        sistemaPagos.mostrarMetodosDePago();

        // Realizar pagos
        System.out.println("\nRealizando Pagos:");
        sistemaPagos.realizarPagos();

        // Cancelar pagos
        System.out.println("\nCancelando Pagos:");
        sistemaPagos.cancelarPagos();
    }
}
