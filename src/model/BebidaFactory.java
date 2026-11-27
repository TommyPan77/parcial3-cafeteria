public class BebidaFactory extends ProductoFactory {

    @Override
    public Producto crearProducto(
        String nombre,
        double precio,
        String descripcion
    ) {
        return new Bebida(nombre, precio, descripcion);
    }
}
