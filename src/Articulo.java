import java.util.ArrayList;
import java.util.Objects;
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
  Scanner input = new Scanner(System.in);

  @Override
  public String toString() {
    return "Articulo{" +
        "valorArticulo= $" + valorArticulo +
        ", nombreArticulo='" + nombreArticulo + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  public void agregarArticulo(long l, ArrayList<Articulo> articuloCuenta) {
    System.out.print("Ingrese el Valor del Articulo: ");
    double valorArticulo = input.nextDouble();

    System.out.print("Ingrese el Nombre del Articulo: ");
    input.nextLine();
    String nombreArticulo = input.nextLine();

    System.out.print("Ingrese la descripcion del Articulo: ");
    String description = input.nextLine();
    articuloCuenta.add(new Articulo(valorArticulo, nombreArticulo, description));
  }

  public void eliminarArticulo(String i, ArrayList<Articulo> listaArticulo) {
    boolean encontrado = false;
    for ( int j = 0; j < listaArticulo.size(); j++){
      if(Objects.equals(i, listaArticulo.get(j).getNombreArticulo())){
        listaArticulo.remove(j);
        encontrado = true;
        System.out.println("El articulo con número " + i + " fue eliminada de nuestra plataforma!");
      }
    }
    if(!encontrado){
      System.out.println("El articulo" + i + " no se pudo eliminar porque no está en nuestra plataforma!");
    }
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
