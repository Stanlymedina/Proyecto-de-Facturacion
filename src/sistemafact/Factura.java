
package sistemafact;

import java.util.ArrayList;


public class Factura 
{
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
Factura (int numero, String fecha, Cliente cliente)
{
setNumero(numero);
setFecha(fecha);
this.cliente = cliente;
this.productos = new ArrayList<>();
}

public void agregarProducto (Producto producto)
{
    if(producto==null)
    {
    throw new IllegalArgumentException("El producto no puede ser nulo");
    }
productos.add(producto);
}

 public ArrayList<Producto> getProductos() {
        return productos;
    }

public void setNumero (int numero)
    {
    if(numero <= 0) 
        {
            throw new IllegalArgumentException("El numero de factura no puede ser negativo");
        }
        this.numero = numero;
    }

public int getNumero()
    {
        return numero;
    }

public void setFecha(String fecha)
    {
        if(fecha.isEmpty())
        {
        throw new IllegalArgumentException("El campo (fecha) no puede estar vacio");
        }
        this.fecha=fecha;
    }

    public String getFecha() 
    {
        return fecha;
    }
    
    



  public void mostrarInfo() 
  {
        System.out.println("Factura : #" + numero);
       System.out.println("Fecha: "+"'"+ fecha + '\'' + "\n"+
                "=========Cliente==========");
        cliente.mostrarInfoCliente();
        System.out.println("=========productos==========");
        for (Producto producto : productos) 
        {
            producto.mostrarInfo();
        }
        System.out.println("========================");
    }

}
