package atividadeavaliativaumprofwesley;

/**
 * 
 * @author natan
 */
public class Funcionario extends Pessoa  {
    private int id;
    private String funcao;
    private double salarioHora;

    public Funcionario(String cpf, String nome, int id, String funcao, double salarioHora) {
        super(cpf, nome);
        this.id = id;
        this.funcao = funcao;
        this.salarioHora = salarioHora;
    }
    
    public void promocao(String novaFuncao){
        System.out.println("*Mudanca de cargo*");
        if(funcao != novaFuncao && novaFuncao.equals("Estoquista") || novaFuncao.equals("Gerente") || novaFuncao.equals("Caixa"))
        {
            System.out.println(super.getNome() + " foi promovido para " + novaFuncao + "\n");
            switch (novaFuncao) {
                case "Estoquista" -> salarioHora = 7.00;
                case "Gerente" -> salarioHora = 12.00;
                case "Caixa" -> salarioHora = 8.00;   
            }
        }else System.out.println("Nova funcao invalida\n");  
    }
    
    public void pagarFuncionario(int horasTrabalhadas, Loja loja){
        double pagamento = horasTrabalhadas * salarioHora;
               
        if(horasTrabalhadas > 8){
            double bonus = pagamento * 0.15;
            pagamento += bonus;
        }
        
        if(pagamento <= loja.getSaldoCofre()){
            
            System.out.println("*Pagamento do dia*\nSaldo anterior: R$" + loja.getSaldoCofre() 
                    + "\nFuncionario: " + super.getNome() + " = R$" +  pagamento);
            loja.setSaldoCofre(loja.getSaldoCofre() - pagamento);
            System.out.println("Saldo do cofre atualizado para: R$" + loja.getSaldoCofre() + "\n");
        }   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
        if(funcao.equals("Estoquista") && salarioHora != 7.00){
            this.salarioHora = 7.00;
        }
        
        if(funcao.equals("Gerente") && salarioHora != 12.00){
            this.salarioHora = 12.00;
        }
        
        if(funcao.equals("Caixa") && salarioHora != 8.00){
            this.salarioHora = 8.00;
        }        
    } 
}
