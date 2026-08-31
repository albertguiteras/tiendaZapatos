public class Elegante extends Zapato {

    private boolean tieneHebilla;

    public Elegante(String marca, float precio, int talla, boolean tieneHebilla) {
        super(marca, precio, talla);
        this.tieneHebilla = tieneHebilla;
    }

    public boolean isTieneHebilla() {
        return tieneHebilla;
    }
    public void setTieneHebilla(boolean tieneHebilla) {
        this.tieneHebilla = tieneHebilla;
    }

    public String obtenerCuidado(){
        return "Limpiar con un paño húmedo.";
    };

    @Override
    public String toString() {
        if(tieneHebilla == true){
            return super.toString() + ", con Hebilla";
        } else {
            return super.toString() + ", sin Hebilla";
        }

    }
}
