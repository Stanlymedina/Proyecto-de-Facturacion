package sistemafact;

public class SistemaFact 
{

    
    
    
    public static void main(String[] args) 
    {
        try
        {
        Cliente cliente1 = new Cliente("Juan","123456678","Jardines","32215061");
        Factura factura1 = new Factura(-1234,"21-07-2024",cliente1);
        categoriaProducto categoria1= new categoriaProducto("Bebidas",4);
        Producto producto1 = new Producto("Coca Cola 3 lts.",34.50,categoria1,2);
        Producto producto2 = new Producto("Ginger Ale Lata.",24.00,categoria1,5);
        factura1.agregarProducto(producto1);
        factura1.agregarProducto(producto2);
        factura1.mostrarInfo();
        double total = pagarFactura(factura1);
        System.out.println("Total Factura");
        System.out.println("El total a pagar es de: "+total);
        }catch(IllegalArgumentException e) 
        {
        System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public static double pagarFactura(Factura factura) 
       {
        double total = 0.0;
        for (Producto producto : factura.getProductos()) 
        {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
      }    
}
