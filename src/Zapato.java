public class Zapato {

    private String marca;
    private float precio;
    private int talla;

    public Zapato(String marca, float precio, int talla) {
        this.marca = marca;
        this.precio = precio;
        this.talla = talla;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return  marca +
                " | precio: " + precio +
                ", talla: " + talla;
    }
}
