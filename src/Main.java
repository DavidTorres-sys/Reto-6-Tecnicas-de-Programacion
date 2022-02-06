import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    int opcion;
    int opcionAgregar;
    int AgregarArticulos;

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Articulo> articulos = new ArrayList<>();
    do{
      System.out.println("1. Agregar/Quitar Clientes");
      System.out.println("2. Agregar/Quitar Articulos");

      System.out.print("Ingrese una Opcion: ");
      opcion = Banco.input.nextInt();

      switch(opcion){
        case 1:
          do {
            System.out.println("1. Agregar Clientes");
            System.out.println("2. Quitar Clientes");
            System.out.print("Ingrese una Opcion: ");
            opcionAgregar = Banco.input.nextInt();
            switch(opcionAgregar){
              case 1:
              System.out.print("Ingrese el Nombre del Cliente: ");
              Banco.input.nextLine();
              String nombreCliente = Banco.input.nextLine();

              System.out.print("Ingrese el Pais del Cliente: ");
              String paisCliente = Banco.input.nextLine();

              System.out.print("Ingrese la Cedula del Cliente: ");
              int cedula = Banco.input.nextInt();

              System.out.print("Ingrese el Numero Localizador del Cliente: ");
              int numeroLocalizar = Banco.input.nextInt();

              Cliente cliente= new Cliente(nombreCliente, paisCliente, cedula, numeroLocalizar);
              clientes.add(cliente);
              break;
              case 2:
                int eliminar = 0;
                System.out.println(clientes);
                System.out.print("Que Cliente Desea Eliminar: ");
                eliminar = Banco.input.nextInt();
                clientes.remove(eliminar);
                break;
            }
            System.out.println(clientes);
            break;
          }while(opcionAgregar<1||opcionAgregar>2);
        case 2:
          do{
            System.out.println("1. Agregar Articulos");
            System.out.println("2. Quitar Articulos");
            System.out.print("Ingrese una Opcion: ");
            AgregarArticulos = Banco.input.nextInt();
            switch(AgregarArticulos){
              case 1:
                System.out.print("Ingrese el Valor del Articulo: ");
                double valorArticulo = Banco.input.nextDouble();

                System.out.print("Ingrese el Nombre del Articulo: ");
                Banco.input.nextLine();
                String nombreArticulo = Banco.input.nextLine();

                System.out.print("Ingrese la descripcion del Articulo: ");
                String description = Banco.input.nextLine();

                Articulo articulo = new Articulo(valorArticulo, nombreArticulo, description);
                articulos.add(articulo);
                break;
              case 2:
                int eliminar = 0;
                System.out.println(articulos);
                System.out.print("Que Cliente Desea Eliminar: ");
                eliminar = Banco.input.nextInt();
                articulos.remove(eliminar);
                break;
            }
            System.out.println(articulos);
            break;
          }while(AgregarArticulos<1||AgregarArticulos>2);
          break;
      }
    }while(opcion<1||opcion>5);
  }
}
