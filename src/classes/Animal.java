
package classes;

public abstract class Animal {
    
    private int idade;
    
    private float peso, tamanho;

    public Animal(int idade, float peso, float tamanho) {
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    
    public String alimentaçao(){
        return null;
    }
    
    public String som(){
        return null;
    }
    
    public String dados(){
        return "Idade: " + idade + " anos"
                +"\nPeso: " + peso + " Kg"
                +"\nTamanho: " + tamanho + " Cm"
                +"\nAlimentaçãp: " + alimentaçao()
                +"\nSom: " + som();
    }
}
