package atividadeavaliativaumprofwesley;

/**
 *
 * @author natan
 */
public class Loja {
    private String razaoSocial;
    private String cnpj;
    private double saldoCofre;
    
    public void comprarMercadoria(int adicional, double preco, Produto produto){
        double valorTotalCompra = adicional * preco;
        
        produto.setQuantidade(produto.getQuantidade() + adicional); 
        saldoCofre -= valorTotalCompra;
        System.out.println("Produto comprado e adicionado ao estoque, o saldo no cofre eh de: R$" + saldoCofre + "\n");
    }    
        
    public void venderMercadoria(int qtd, Produto produto){
        if(qtd <= produto.getQuantidade()){
            double valorTotalVenda = qtd * produto.getPreco();
            saldoCofre += valorTotalVenda;
            produto.setQuantidade(produto.getQuantidade() - qtd);
            System.out.println("Produto vendido, o saldo no cofre eh de: R$" + saldoCofre + "\n");  
        }else System.out.println("Informe uma quantidade disponivel do produto no estoque\n");
    }
                 
    public void pagarFornecedor(double valor){
        saldoCofre = saldoCofre - valor;
        System.out.println("Pagamento para o fornecedor no valor de R$" + valor + " realizado com sucesso\n");
        System.out.println("Saldo do cofre atualizado para: R$" + saldoCofre + "\n"); 
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
