@FunctionalInterface
public interface Promocional {

   boolean desconto(double discount);
   //boolean naoMaisFuncional();

   default boolean desconto10(){
      return desconto(0.1);
   }





}
