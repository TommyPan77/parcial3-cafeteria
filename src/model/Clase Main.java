public class Main {

    public static void main(String[] args) {

        ProductoFactory fabricaBebidas = new BebidaFactory();

        Producto bebida = fabricaBebidas.crearProducto(
            "Limonada",
            5000,
            "Limonada natural"
        );

        ProductoFactory fabricaPlatos = new PlatoFactory();

        Producto plato = fabricaPlatos.crearProducto(
            "Hamburguesa",
            15000,
            "Hamburguesa con queso"
        );

        System.out.println("=== PRODUCTOS DE LA CAFETERÍA ===");

        System.out.println("\nBEBIDA");
        System.out.println("Nombre: " + bebida.getNombre());
        System.out.println("Precio: $" + bebida.getPrecio());
        System.out.println("Descripción: " + bebida.getDescripcion());

        System.out.println("\nPLATO");
        System.out.println("Nombre: " + plato.getNombre());
        System.out.println("Precio: $" + plato.getPrecio());
        System.out.println("Descripción: " + plato.getDescripcion());
    }
}
