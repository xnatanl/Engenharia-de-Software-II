package atividadeavaliativaumprofwesley;

/**
 *
 * 
 * @author natan
 */
public class Cliente extends Pessoa {
    private String telefone;
    private String endereco;
    private boolean nomeSpc;

    public Cliente(String cpf, String nome, String telefone, String endereco, boolean nomeSpc) {
        super(cpf, nome);
        this.telefone = telefone;
        this.endereco = endereco;
        this.nomeSpc = nomeSpc;
    }
    
    public void consultarNome(){
        if(nomeSpc){
            System.out.println(super.getNome() + " esta com nome negativado\n");
        }else System.out.println("Nada consta em nome de " + super.getNome() + "\n");
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void comprar(String nomeProduto, int quantidade){
        
    }

    public boolean isNomeSpc() {
        return nomeSpc;
    }

    public void setNomeSpc(boolean nomeSpc) {
        this.nomeSpc = nomeSpc;
    }
}
