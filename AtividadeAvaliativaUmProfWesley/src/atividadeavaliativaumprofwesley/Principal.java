package atividadeavaliativaumprofwesley;

/**
 *
 * @author natan
 */
public class Principal {

    public static void main(String[] args) {
        Loja atacarejo = new Loja("Hering", "12.512.877/0001-21", 50000.00);
        
        Produto roupa = new Produto(101, "Camiseta", "Polo", 10, 100.00);
        
        Produto roupa2 = new Produto(202, "Short", "Jeans", 5, 50.00);
        
        roupa2.consultarProduto();
        
        atacarejo.comprarMercadoria(10, 20.00, roupa2);
        
        roupa.consultarProduto();
        
        atacarejo.venderMercadoria(2, roupa);
       
        Funcionario f1 = new Funcionario("235.556.888.99", "Fabio", 01, "Estoquista", 7.00);
        
        f1.pagarFuncionario(10, atacarejo);
        
        Cliente c1 = new Cliente("144.579.232-51", "Claudia", "Rua Estados Unidos, 1555 - Serra Negra", "(34)99875-4560", false);
        
        c1.consultarNome();
        
        f1.promocao("Gerente");
        
        f1.pagarFuncionario(10, atacarejo);
        
        
    }
}
