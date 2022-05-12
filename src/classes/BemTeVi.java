
package classes;

public class BemTeVi extends Animal{

    public BemTeVi(int idade, float peso, float tamanho) {
        super(idade, peso, tamanho);
    }
    
    @Override
    public String alimentaçao(){
        return "ele é insetívoro, podendo comer centenas de insetos em apenas um dia. No entanto, ele também pode se alimentar de ovos, frutas, peixes e crustáceos, bem como girinos de lagos de menor profundidade.";
    }
    
    public String som(){
        return "Canto";
    }
    
    @Override
    public String dados(){
        return "Bem-te-vi:" + 
                "\n" + super.dados();
    }
}
