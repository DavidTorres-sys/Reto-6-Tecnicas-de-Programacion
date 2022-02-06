import java.util.ArrayList;

public class Cliente {

  private String nombreCliente;
  private String paisCliente;
  private int cedula;
  private int numeroLocalizar;

  ArrayList<Articulo> articulo = new ArrayList<Articulo>();

  public Cliente(String nombreCliente, String paisCliente, int cedula, int numeroLocalizar) {
    this.nombreCliente = nombreCliente;
    this.paisCliente = paisCliente;
    this.cedula = cedula;
    this.numeroLocalizar = numeroLocalizar;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "nombreCliente='" + nombreCliente + '\'' +
        ", paisCliente='" + paisCliente + '\'' +
        ", cedula=" + cedula +
        ", numeroLocalizar=" + numeroLocalizar +
        '}';
  }


  public String getNombreCliente() {
    return nombreCliente;
  }

  public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
  }

  public String getPaisCliente() {
    return paisCliente;
  }

  public void setPaisCliente(String paisCliente) {
    this.paisCliente = paisCliente;
  }

  public int getCedula() {
    return cedula;
  }

  public void setCedula(int cedula) {
    this.cedula = cedula;
  }

  public int getNumeroLocalizar() {
    return numeroLocalizar;
  }

  public void setNumeroLocalizar(int numeroLocalizar) {
    this.numeroLocalizar = numeroLocalizar;
  }

}
