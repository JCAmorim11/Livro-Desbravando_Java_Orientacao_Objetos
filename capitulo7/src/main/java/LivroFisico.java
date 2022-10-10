public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor() *0.05;
    }

    @Override
    public boolean desconto(double discount){
        if(discount > 0.3){
            return false;
        }
        System.out.println("livro com desconto!");
        discount = getValor() * discount;
        setValor(getValor() - discount);
        return true;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
