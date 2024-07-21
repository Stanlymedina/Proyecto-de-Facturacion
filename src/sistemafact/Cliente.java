
package sistemafact;

public class Cliente 
{
    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;
    
    Cliente(String nombre, String rtn, String direccion, String telefono) 
    {
    setNombre(nombre);
    setRtn(rtn);
    setDireccion(direccion);
    setTelefono(telefono);
    }
    
    public void setNombre (String nombre)
    {
        if(nombre.isEmpty())
        {
        throw new IllegalArgumentException("El campo (Nombre del cliente) no puede estar vacio");
        }
    this.nombre =  nombre;
    }
    
    public String getNombre ()
    {
    return nombre;
    }
        
    public void setRtn(String rtn) 
    {
        if(rtn.isEmpty())
        {
        throw new IllegalArgumentException("El campo (RTN) no puede estar vacio");
        }
        this.rtn = rtn;
    }   
    
    public String getRtn() 
    {
        return rtn;
    }

    public void setDireccion(String direccion) 
    {
        if(direccion.isEmpty())
        {
        throw new IllegalArgumentException("El campo (Direccion) no puede estar vacio");
        }
        this.direccion = direccion;
    }
    
    public String getDireccion() 
    {
        return direccion;
    }
    
    public void setTelefono(String telefono)
    {
        if(telefono.isEmpty())
        {
        throw new IllegalArgumentException("El campo (telefono) no puede estar vacio");
        }
        this.telefono = telefono;
    }

    public String getTelefono() 
    {
        return telefono;
    }
    
    public void mostrarInfoCliente()
    {
        System.out.println("Nombre del cliente: "+this.nombre);
        System.out.println("RTN: "+this.rtn);
        System.out.println("Direccion: "+ this.direccion);
        System.out.println("Telefono: "+ this.telefono);
    }
}
