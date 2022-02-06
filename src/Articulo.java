import java.util.Scanner;

public class Articulo {

  private double valorArticulo;
  private String nombreArticulo;
  private String description;

  public Articulo(double valorArticulo, String nombreArticulo, String description) {
    this.valorArticulo = valorArticulo;
    this.nombreArticulo = nombreArticulo;
    this.description = description;
  }

  @Override
  public String toString() {
    return "Articulo{" +
        "valorArticulo= $" + valorArticulo +
        ", nombreArticulo='" + nombreArticulo + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  public double getValorArticulo() {
    return valorArticulo;
  }

  public void setValorArticulo(double valorArticulo) {
    this.valorArticulo = valorArticulo;
  }

  public String getNombreArticulo() {
    return nombreArticulo;
  }

  public void setNombreArticulo(String nombreArticulo) {
    this.nombreArticulo = nombreArticulo;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
