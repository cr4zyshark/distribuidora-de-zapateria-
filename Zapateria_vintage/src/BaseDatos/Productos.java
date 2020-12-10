
package BaseDatos;

public class Productos{
    private int id_producto;
    private String tipo;
    private String marca;
    private int talla;
    private int traslado;
    private int tienda_asociada;

    public Productos() {
    }
    
    
    public Productos(int id_producto, int traslado, int tienda_asociada) {
    this.id_producto = id_producto;
    this.traslado = traslado;
    this.tienda_asociada = tienda_asociada;
    }
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getTienda_asociada() {
        return tienda_asociada;
    }
    
    
    
    public int getTraslado() {
        return traslado;
    }

    public void setTraslado(int traslado) {
        this.traslado = traslado;
    }



    public void setTienda_asociada(int tienda_asociada) {
        this.tienda_asociada = tienda_asociada;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

   

}
