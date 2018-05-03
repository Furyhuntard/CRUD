
import java.util.*;
import java.util.Iterator;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }
    
    public boolean insertarProducto (Producto p){
        boolean insertado = true;
        int codigo = p.getCodigo();
        lista.put(codigo,p);
        return insertado;
     }
    
    public boolean borrarProducto (int codigo){
        Producto productoABorrar = buscarProducto(codigo);
        lista.remove(productoABorrar.getCodigo());
        return false;
      }
    
    public Producto buscarProducto (int codigo) {
    	if (lista.containsKey(codigo)) 
    	{
    		return lista.get(codigo);
    	} 
    	return null;
    }
    
    public void listarProductos (){
    	for (Map.Entry pareja: lista.entrySet()) {
    		System.out.println(pareja.getValue());
    		}
    }
    
    public void listarPocoStock() {
    	for (Map.Entry pareja: lista.entrySet()) 
    	{
    		Producto p = (Producto) pareja.getValue();
    		if (p.getStock()<p.getStock_min())
    		{
    			System.out.println(pareja.getValue());
    		}
    	}
    	
    }
    
    public boolean modificarProducto (Producto nuevo){
        return false;
        
     }
    
}