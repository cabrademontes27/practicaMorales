public class ClaseExterna {
    private String nombre = "Morales";




    public void metodoExternos()
    {
        class ClaseLocal
        {
            public  void saludar()
            {
                System.out.println("Hola");
            }
        }
        ClaseLocal cl = new ClaseLocal();
        cl.saludar();


    }

}




