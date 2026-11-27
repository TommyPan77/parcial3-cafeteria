package patterns.decorator;

import model.Producto;

public class QuesoExtra extends AdicionDecorator {
    public QuesoExtra(Producto producto) {
        super(producto);
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion() + " + Queso extra";
    }

    @Override
    public double getPrecio() {
        return productoEnvuelto.getPrecio() + 3500.0;
    }
}