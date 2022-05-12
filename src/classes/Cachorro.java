
package classes;

public class Cachorro extends Animal{
    
    private String raça;

    public Cachorro(String raça, int idade, float peso, float tamanho) {
        super(idade, peso, tamanho);
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    @Override
    public String alimentaçao(){
        return "Filhotes de até 8 semanas de idade devem se alimentar de leite materno; cãezinhos de 2 a 4 meses de idade já podem receber alimentos sólidos, e devem comer, pelo menos, 4 vezes ao dia; doguinhos de 4 a 8 meses, devem comer 3 vezes ao dia; a partir dos 8 meses, os catioros devem comer 2 vezes ao dia.";
    }
    
    @Override
    public String som(){
        return "Latido";
    }
    
    @Override
    public String dados(){
        return "Cachorro:"
                +"\nRaça: " + raça
                +"\n" + super.dados();
    }
}
