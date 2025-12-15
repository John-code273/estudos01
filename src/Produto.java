public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double totalValor(){
        return quantidade*preco;
    }
    public void adicionar(int quantidade){
        this.quantidade +=quantidade;
    }
    public void remover(int quantidade){
        this.quantidade -=quantidade;
    }

    @Override
    public String toString() {
        return nome + ", $ "
                +String.format("%2f", preco)
                +", "+quantidade+" unidades, total : "+
                String.format("%2f", totalValor());
    }
}
