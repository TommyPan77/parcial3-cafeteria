package patterns.decorator;

import model.Producto;

public abstract class AdicionDecorator implements Producto {
    protected Producto productoEnvuelto;

    public AdicionDecorator(Producto producto) {
        this.productoEnvuelto = producto;
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return productoEnvuelto.getPrecio();
    }
}