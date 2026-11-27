package patterns.decorator;

import model.Producto;

public class CremaBatida extends AdicionDecorator {
    public CremaBatida(Producto producto) {
        super(producto);
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion() + " + Crema batida";
    }

    @Override
    public double getPrecio() {
        return productoEnvuelto.getPrecio() + 2000.0;
    }
}