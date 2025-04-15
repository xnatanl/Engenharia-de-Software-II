package atividadeavaliativaumprofwesley;

/**
 * 
 * @author natan
 */
public class Funcionario extends Pessoa  {
    private int id;
    private String funcao;
    private double salarioHora;
    
    public void promocao(String novaFuncao){
        System.out.println(super.getNome() + " foi promovido para " + novaFuncao + "\n");
        if(novaFuncao.equals("Estoquista") || novaFuncao.equals("Gerente") || novaFuncao.equals("Caixa"))
        {
            switch (novaFuncao) {
                case "Estoquista" -> salarioHora = 7.00;
                case "Gerente" -> salarioHora = 12.00;
                case "Caixa" -> salarioHora = 8.00;   
            }
        }else System.out.println("Nova funcao nao identificada\n");  
    }
    
    public void pagarFuncionario(int horasTrabalhadas, Loja loja){
        double pagamento = horasTrabalhadas * salarioHora;
        double bonus = pagamento * 0.15;
        if(horasTrabalhadas > 8){
            pagamento += bonus;
        }
        loja.setSaldoCofre(loja.getSaldoCofre() - pagamento);
        System.out.println("Pagamento do dia para " + super.getNome() + " = R$" +  pagamento + "\n");
        System.out.println("Saldo do cofre atualizado para: R$" + loja.getSaldoCofre() + "\n");
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
        if(funcao.equals("Estoquista") && salarioHora != 7.00)
        {
            this.salarioHora = 7.00;
        }
        
        if(funcao.equals("Gerente") && salarioHora != 12.00)
        {
            this.salarioHora = 12.00;
        }
        
        if(funcao.equals("Caixa") && salarioHora != 8.00)
        {
            this.salarioHora = 8.00;
        }        
    } 
}
