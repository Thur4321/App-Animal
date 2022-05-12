
package classes;

public class Gato extends Animal{

    public Gato(int idade, float peso, float tamanho) {
        super(idade, peso, tamanho);
    }
    
    @Override
    public String alimentaçao(){
        return "A alimentação dos gatos é, fundamentalmente, a ração seca e a úmida de acordo com a fase de idade que ele se encontra.";
    }
    
    public String som(){
        return "Miado";
    }
    
    @Override
    public String dados(){
        return "Gato:" + 
                "\n" + super.dados();
    }
}
