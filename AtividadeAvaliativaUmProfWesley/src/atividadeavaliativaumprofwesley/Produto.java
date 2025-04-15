package atividadeavaliativaumprofwesley;

/**
 *
 * @author natan
 */
public class Produto {
    private int id;
    private String nome;
    private String tipo;
    private int quantidade;
    private double preco;
    
    public void consultarProduto(){
        if(nome.equals("Camiseta")){
            System.out.println("\nProduto: "
                    + id
                    + "\nNome: " + nome
                    + "\nTipo: " + tipo
                    + "\nDisponivel em estoque: " + quantidade
                    + "\nPreco: " + preco + "\n");
        }else System.out.println("Produto nao cadastrado\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
            
   
            
}
