package classes_encapsulamento_java.maquina_banho_pet;

public class Pet {
    private final String NOME_PET;
    private boolean limpo;
    
    public Pet(String nomePet) {
        this.NOME_PET = nomePet;
        this.limpo = false;
    }
    
    public String getNomePet() {
        return NOME_PET;
    }
    public boolean isLimpo() {
        return limpo;
    }
    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
    


}
