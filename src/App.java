public class App {
    public static void main(String[] args) throws Exception {
         for ( int p = 2; p <= 100; p++){
          int suma = 0;
          for ( int c = 1; c <= p; c++){
              int residuo = p%c;
  
              if ( residuo == 0){
                  suma += 1;
              }
          } if ( suma <= 2) {
              System.out.println("El numero " + p + " es primo");
          } else {
              System.out.println("El numero " + p + " NO es primo");
          }
         }
      }
  }
  