package livraria;

public class ConsultaDescontos {

    public static void main(String[] args) {

        CuponsDesconto manager = new CuponsDesconto();
        Double desc = manager.getValue("cab11");

        if(desc!=null){
            System.out.println("Cupom valido!");
            System.out.println("Valor do desconto:"+desc);
        }
        else{
            System.out.println("Esse cupom não existe!");
        }
    }

}
