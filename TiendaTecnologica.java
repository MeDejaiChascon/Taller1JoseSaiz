import java.util.ArrayList;

public class TiendaTecnologica {
    private String direccion;
    ArrayList<String>catalogoDisp;

    public TiendaTecnologica(String direccion, ArrayList<String> catalogoDisp) {
        this.direccion = direccion;
        this.catalogoDisp = catalogoDisp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getCatalogoDisp() {
        return catalogoDisp;
    }

    public void setCatalogoDisp(ArrayList<String> catalogoDisp) {
        this.catalogoDisp = catalogoDisp;
    }
}
