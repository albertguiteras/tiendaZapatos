public class Deporte extends Zapato{

    private String tipoDeporte;
    private String tipoSuela;

    public Deporte(String marca, float precio, int talla, String tipoDeporte, String tipoSuela) {
        super(marca, precio, talla);
        this.tipoDeporte = tipoDeporte;
        this.tipoSuela = tipoSuela;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }
    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
    public String getTipoSuela() {
        return tipoSuela;
    }
    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

    public String obtenerCuidado(){
        return "Limpiar a fondo o en la lavadora.";
    };

    @Override
    public String toString() {
        return  super.toString() +
                ", tipoDeporte: " + tipoDeporte +
                ", tipoSuela: " + tipoSuela;
    }
}
