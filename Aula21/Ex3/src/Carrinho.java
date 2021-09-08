import java.util.List;

public class Carrinho {

    public List<Produto> listaDeProdutos;
    private double valorTotal;

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public void addProduto(Produto produto){
        listaDeProdutos.add(produto);
    }

    public void removeProduto(Produto produto){
        listaDeProdutos.remove(produto);
    }

    public void addCombo(Combo combo , double desconto){
        Produto produtoA = combo.getProdutoA();
        Produto produtoB = combo.getProdutoB();

        double valorComDescontoA = calcularDesconto(desconto,produtoA);
        double valorComDescontoB = calcularDesconto(desconto, produtoB);

        produtoA.setValor(valorComDescontoA);
        produtoB.setValor(valorComDescontoB);
        listaDeProdutos.add(produtoA);
        listaDeProdutos.add(produtoB);
    }

    public double calcularDesconto(double desconto, Produto produto){

        return produto.getValor()-desconto;
    }

    public double valorTotal(){
        for (int i= 0;i<listaDeProdutos.size();i++){
             Produto produtoTemp = this.listaDeProdutos.get(i);
             valorTotal += produtoTemp.getValor();
        }
        return valorTotal;
    }
}

