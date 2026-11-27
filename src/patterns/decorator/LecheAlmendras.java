package patterns.decorator;

import model.Producto;

public class LecheAlmendras extends AdicionDecorator {
    public LecheAlmendras(Producto producto) {
        super(producto);
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion() + " + Leche de almendras";
    }

    @Override
    public double getPrecio() {
        return productoEnvuelto.getPrecio() + 2500.0;
    }
}
