public class ComputadorEscritorio extends DispositivoTecnologico {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private String pantalla;

    public ComputadorEscritorio(String marca, String memoriaRam, String memoriaAlm, String procesador, String modelo, int aniofabricacion, int precio, int cantStock, String tarjetaVideo, String fuentePoder, String chasis, String pantalla) {
        super(marca, memoriaRam, memoriaAlm, procesador, modelo, aniofabricacion, precio, cantStock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }
}
