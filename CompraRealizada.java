import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CompraRealizada {

    ArrayList<String> listaCompra;
    ArrayList<String>dispTec;
    ArrayList<String>clientAsoc;
    ArrayList<String>fechaCompra;

    public void mostrarFecha() {
        Date dt = new Date();
        System.out.println(new SimpleDateFormat("dd-mm-yyyy").format(dt));
    }

    public CompraRealizada(ArrayList<String> listacompra, ArrayList<String> dispTec, ArrayList<String> clientAsoc, ArrayList<String> fechaCompra) {
        this.listaCompra = listacompra;
        this.dispTec = dispTec;
        this.clientAsoc = clientAsoc;
        this.fechaCompra = fechaCompra;
    }

    public ArrayList<String> getListacompra() {
        return listaCompra;
    }

    public void setListacompra(ArrayList<String> listacompra) {
        this.listaCompra = listacompra;
    }

    public ArrayList<String> getDispTec() {
        return dispTec;
    }

    public void setDispTec(ArrayList<String> dispTec) {
        this.dispTec = dispTec;
    }

    public ArrayList<String> getClientAsoc() {
        return clientAsoc;
    }

    public void setClientAsoc(ArrayList<String> clientAsoc) {
        this.clientAsoc = clientAsoc;
    }

    public ArrayList<String> getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(ArrayList<String> fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
