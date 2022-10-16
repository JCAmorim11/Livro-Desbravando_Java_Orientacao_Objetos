package livraria;

import java.util.*;

public class CuponsDesconto {

   private Map<String, Double> cupons;

   public CuponsDesconto() {
     // this.cupons = new HashSet<String>();
     // cupons.addAll(Arrays.asList( "CUP15","CUP91", "CUP221", "CUP327", "CUP96", "CUP119",
       //       "CUP115", "CUP222", "CUP272", "CUP484", "CUP174", "CUP275","CUP1","CUP410", "CUP158","CUP327","CUP14"));
     this.cupons = new HashMap<>();
     cupons.put("cab11",10.0);
     cupons.put("cab22",12.0);
     cupons.put("cab33",13.0);
     cupons.put("cab44",14.0);
     cupons.put("cab55",15.0);
     cupons.put("cab66",16.0);
     cupons.put("cab77",17.0);
     cupons.put("cab88",18.0);
     cupons.put("cab99",19.0);
     cupons.put("cab111",20.0);
     cupons.put("cab122",21.0);




   }

   public boolean validaCupom(String cupom){
      return this.cupons.containsKey(cupom);
   }

   public double getValue(String cupom){
      return this.cupons.get(cupom);
   }
}
