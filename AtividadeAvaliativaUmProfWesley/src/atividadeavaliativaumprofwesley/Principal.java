package atividadeavaliativaumprofwesley;

/**
 *
 * @author natan
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setCpf("111.222.333-44");
        p1.setNome("Paulo");
        
        Funcionario f1 = new Funcionario();
        f1.setCpf("235.556.888.99");
        f1.setNome("Fabio");
        f1.setId(01);
        f1.setFuncao("Estoquista");
        f1.setSalarioHora(7.00);
        
        Cliente c1 = new Cliente();
        c1.setCpf("144.579.232-51");
        c1.setNome("Claudia");
        c1.setEndereco("Rua Estados Unidos, 1555 - Serra Negra");
        c1.setTelefone("(34)99875-4560");
        c1.setNomeSpc(false);
        
        Produto roupa = new Produto();
        roupa.setId(201);
        roupa.setNome("Camiseta");
        roupa.setTipo("Polo");
        roupa.setQuantidade(50);
        roupa.setPreco(100.00);
        
        Loja atacarejo = new Loja();
        atacarejo.setRazaoSocial("HT Calcados");
        atacarejo.setCnpj("12.512.877/0001-21");
        atacarejo.setSaldoCofre(50000.00);
        
        f1.promocao("Gerente");
        f1.pagarFuncionario(10, atacarejo);
        c1.consultarNome();
        roupa.consultarProduto();
        atacarejo.comprarMercadoria(1, 50, roupa);
        atacarejo.venderMercadoria(100, roupa);
        atacarejo.pagarFornecedor(1000.00);
    }
}
