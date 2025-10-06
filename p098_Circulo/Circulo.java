package p098_Circulo;

public class Circulo {
      private double Radio;

      public Circulo(){

      }
      public Circulo(double radio){
            Radio = radio;
      }
      public double getRadio(){
            return Radio;
      }
      public void setRadio(double radio){
            Radio = radio;
      }
      public double getArea(){
            return Math.PI * Radio * Radio;
      }
      public double getCircunferencia(){
            return 2 * Math.PI * Radio;
      }
      public String toString(){
            return "Circulo [Radio=" + Radio + "]";
      }



      



}
    
    
