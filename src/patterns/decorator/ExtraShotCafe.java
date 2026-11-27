package patterns.decorator;

import model.Producto;

public class ExtraShotCafe extends AdicionDecorator {
    public ExtraShotCafe(Producto producto) {
        super(producto);
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion() + " + Extra shot de café";
    }

    @Override
    public double getPrecio() {
        return productoEnvuelto.getPrecio() + 3000.0;
    }
}