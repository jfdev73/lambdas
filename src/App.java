public class App {
  public static void main(String[] args) {

    FunctionTest ft = () -> System.out.println("Hola mundo");
    App ap = new App();
    ap.miMetodo(ft);
  }

  public void miMetodo(FunctionTest parametro) {
    parametro.saludar();

  }
}
