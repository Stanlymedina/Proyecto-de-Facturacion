
package sistemafact;

public class categoriaProducto 
{
    private String nombre;
    private int pasillo;
    
    categoriaProducto(String nombre, int pasillo)
    {
    setNombre(nombre);
    setPasillo(pasillo);
    }
    
    public void setNombre(String nombre)
    {
        if(nombre.isEmpty())
        {
        throw new IllegalArgumentException("Este campo (Nombre de categoria) no puede estar vacio");
        }
        this.nombre = nombre;
    }
    
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public void setPasillo(int pasillo)
    {
        if(pasillo<=0)
        {
        throw new IllegalArgumentException("El campo (Pasillo) no puede ser menor o igual a 0");
        }
    }

    public int getPasillo() 
    {
        return pasillo;
    }
    
    public void mostrarInfo() 
    {
        System.out.println("Categoría: " + this.nombre + " (Pasillo: " + this.pasillo + ")");
    }

    @Override
    public String toString() 
    {
        return nombre + " (Pasillo: " + pasillo + ")";
    }
    
}
