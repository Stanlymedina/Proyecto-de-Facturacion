
package sistemafact;

public class Producto 
{
    private String nombre;
    private double precio;
    private categoriaProducto categoria;
    private int cantidad;
    
    Producto(String nombre, double precio, categoriaProducto categoria, int cantidad)
    {
    setNombre(nombre);
    setPrecio(precio);
    this.categoria = categoria;
    setCantidad(cantidad);
    }
    
    public void setPrecio(double precio)
    {
    if(precio<=0)
    {
    throw new IllegalArgumentException("El precio no puede ser negativo");
    }
    this.precio = precio;
    }
    
    public double getPrecio()
    {
    return precio;
    }
    
    
    public void setCantidad(int cantidad)
    {
    if(cantidad<=0)
    {
    throw new IllegalArgumentException("La cantidad ingresada no es valida");
    }
    this.cantidad = cantidad;
    }

    public int getCantidad() 
    {
        return cantidad;
    }
    
    public void setNombre(String nombre)
    {
    if(nombre.isBlank())
    {
    throw new IllegalArgumentException("Este campo (Nombre de producto) no puede estar vacio");
    }
    this.nombre = nombre;
    }
    
    public String getNombre()
    {
    return nombre;
    }
    
    
    
    public void mostrarInfo()
    {
        System.out.println("Producto: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Categoria: "+this.categoria.toString());
        System.out.println("Cantidad: "+this.cantidad);
    }
    
}
