public class Ebook extends Livro  {

    private String watermark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean desconto(double discount){
        if(discount > 0.15){
            return false;
        }
        System.out.println("ebook com desconto!");
        discount = getValor() * discount;
        setValor(getValor() - discount);
        return true;
    }
}
