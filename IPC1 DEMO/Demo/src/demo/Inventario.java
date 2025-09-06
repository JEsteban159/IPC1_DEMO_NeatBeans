package demo;

public class Inventario {
     public static Producto[] productos = new Producto[5];
    
    
    public static void listarProductos() {
        for(Producto producto: productos) {
            System.out.println(producto);
        }
    }
}
