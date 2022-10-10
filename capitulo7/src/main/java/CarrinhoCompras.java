public class CarrinhoCompras {
    private double total;
  /*  public void add(LivroFisico fisico){
        System.out.println("Adicionando: "+fisico);
    }

    public void add(Ebook ebook){
        System.out.println("Adicionando: "+ebook);
    }
    Metodo ruim de ser feito muita repetição de codigo
    */

    //Melhor forma de ser feito
    public void add(Produto livro){
        System.out.println("Adicionando: "+ livro);
        total +=livro.getValue();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
