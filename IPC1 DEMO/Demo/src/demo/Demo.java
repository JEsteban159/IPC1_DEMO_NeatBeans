package demo;

public class Demo {

    public static void main(String[] args) {

        Producto producto1 = new Producto(1,"Laptop", 12000.00);
        Producto producto2 = new Producto(2,"Mouse", 250.00);
        Producto producto3 = new Producto(3,"Auricular", 450.00);
        Producto producto4 = new Producto(4,"Teclado", 300.00);
        Producto producto5 = new Producto(5,"Microfono", 225.00);

        producto1.mostrarInfo();
        producto2.mostrarInfo();
        producto3.mostrarInfo();
        producto4.mostrarInfo();
        producto5.mostrarInfo();
   
        System.out.println();
        Inventario.productos[0] = producto1;
        Inventario.productos[1] = producto2;
        Inventario.productos[2] = producto3;
        Inventario.productos[3] = producto4;
        Inventario.productos[4] = producto5;
       
        Inventario.listarProductos();
    }  
}