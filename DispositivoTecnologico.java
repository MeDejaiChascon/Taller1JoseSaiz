public class DispositivoTecnologico {
    private String marca;
    private String memoriaRam;
    private String memoriaAlm;
    private String procesador;
    private String modelo;
    private int aniofabricacion;
    private int precio;
    private int cantStock;

    public DispositivoTecnologico(String marca, String memoriaRam, String memoriaAlm, String procesador, String modelo, int aniofabricacion, int precio, int cantStock) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.memoriaAlm = memoriaAlm;
        this.procesador = procesador;
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaAlm() {
        return memoriaAlm;
    }

    public void setMemoriaAlm(String memoriaAlm) {
        this.memoriaAlm = memoriaAlm;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }
}
