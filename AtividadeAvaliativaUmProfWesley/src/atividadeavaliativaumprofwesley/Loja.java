package atividadeavaliativaumprofwesley;

/**
 *
 * @author natan
 */
public class Loja {
    private String razaoSocial;
    private String cnpj;
    private double saldoCofre;
    
    public Loja(String razaoSocial, String cnpj, double saldoCofre) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.saldoCofre = saldoCofre;
    }
    
    public void comprarMercadoria(int adicional, double preco, Produto produto){  
        double valorTotalCompra = adicional * preco;
       
        if(valorTotalCompra <= saldoCofre){
            produto.setQuantidade(produto.getQuantidade() + adicional); 
            
            System.out.println("*Compra*\nSaldo anterior da loja: R$" + saldoCofre 
                + "\nCompra de " + adicional + " " + produto.getNome() + " " + produto.getTipo() + " no valor de R$" + preco + " adicionado ao estoque."
                + "\nQuantidade do produto em estoque: " + produto.getQuantidade());
                saldoCofre -= valorTotalCompra;
                System.out.println("O saldo no cofre eh de: R$" + saldoCofre + "\n");
        } else System.out.println("Saldo insuficiente para realizar compra\n");    
    }  
        
    public void venderMercadoria(int qtd, Produto produto){
        double valorTotalVenda = qtd * produto.getPreco();
        
        if(qtd <= produto.getQuantidade()){
            
            System.out.println("*Venda*\nSaldo anterior da loja: R$" + saldoCofre 
                + "\nVenda de " + qtd + " " + produto.getNome() + " " + produto.getTipo() + " no valor de R$" + produto.getPreco() + " cada"
                + "\nQuantidade do produto em estoque: " + produto.getQuantidade());
                saldoCofre += valorTotalVenda;
                System.out.println("O saldo no cofre eh de: R$" + saldoCofre + "\n");
        } else System.out.println("Quantidade requerida para venda esta acima do disponivel em estoque\n");   
    }
                 
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSaldoCofre() {
        return saldoCofre;
    }

    public void setSaldoCofre(double saldoCofre) {
        this.saldoCofre = saldoCofre;
    }
}
