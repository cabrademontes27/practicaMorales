public class Calculador {
    public static int Pi = 3;

    public static  void Suma(int a, int b)
    {
        int resultado = a + b;
        System.out.println("Resultado " + resultado);

    }

    public  static  void Suma(int a, int b, int c)
    {
        int resultado = a + b + c;
        System.out.println("Resultado " + resultado);
    }

    public  static void  Suma(double a, double b, double c)
    {
        double resultado = a + b + c;
        System.out.println("Resultado " + resultado);
    }


    public static class  ClaseAnidada
    {
        public  void  mostrarNumero()
        {
            System.out.println("El numero de pi es: " + Pi );
        }
    }


}
