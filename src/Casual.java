public class Casual extends Zapato {

    private String material;
    private String tipoCierre;

    public Casual(String marca, float precio, int talla, String material, String tipoCierre) {
        super(marca, precio, talla);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTipoCierre() {
        return tipoCierre;
    }
    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", material: " + material +
                ", tipoCierre: " + tipoCierre;
    }
}
