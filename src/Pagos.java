import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodosDePago;

    public Pagos() {
        metodosDePago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodo) {
        metodosDePago.add(metodo);
    }

    public void realizarPagos() {
        for (MetodoPago metodo : metodosDePago) {
            metodo.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodosDePago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    public void mostrarMetodosDePago() {
        for (MetodoPago metodo : metodosDePago) {
            System.out.println("Titular: " + metodo.titular);
        }
    }
}
