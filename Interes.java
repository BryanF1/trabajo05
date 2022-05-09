package proyecto.src.clase1;    //ruta

public class Interes    //para que la clase main pueda tener acceso a la clase Interes
{
   
    public Double numero1;          //Public es el modificador de accesos
    public Double numero2;             //creamos datos de tipo primitivos-doouble
    public Double numero3;
    public double M;
 
    
    

    //constructor  
    Interes(double capital, Double inte, Double tiempo)
    {
      establecerNumero1(capital);         //creamos el constructor llamada interes
      establecerNumero2(inte);           //la creamos para poder inicializar una instancia(esta en la clase main)
      establecerNumero3(tiempo);        // de nuestra clase interes
    }



    void establecerNumero1(Double capital)/*Empezamos a encapsular la cual los ayudara a agrupar variables, metodos
                                            que operan esn estos miembros de datos en una solo unidad*/
    {
        numero1 = capital;
    }
    Double obtenerNumero1()
    {
        return numero1;
    }
    void establecerNumero2(Double inte)
    {
       numero2 = inte;
         
    }
    double obtenerNumero2()
    {
        return numero2;
    }
  
    void establecerNumero3 (Double tiempo) //parametro
    {
        numero3 = tiempo;
    }
     Double obtenerNumero3()
    {
        return numero3;
    }
    
   
    
    void calcularMontoAcumulado()
    {
        M = Math.pow((obtenerNumero2()+1), obtenerNumero3()) * obtenerNumero1(); 
        System.out.println("el monto acumulado seria: "+M);
    }   

}

