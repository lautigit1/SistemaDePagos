// PayPal.java
public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal...");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado.");
    }
}
