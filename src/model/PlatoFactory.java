public class PlatoFactory extends ProductoFactory {

    @Override
    public Producto crearProducto(
        String nombre,
        double precio,
        String descripcion
    ) {
        return new Plato(nombre, precio, descripcion);
    }
}
