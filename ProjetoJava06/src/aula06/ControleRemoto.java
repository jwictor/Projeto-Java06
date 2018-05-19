
package aula06;


public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodos especiais
      //Construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        
    }
    //Metodo Get e Set
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? ------MENU-------" + this.getLigado());
        System.out.println("Esta tocando?" + this.getTocando());
        System.out.print("volume" + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+= 10){
            System.out.print("I");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("TV desligada, impossivel modificar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -5);
        }else{
            System.out.println("TV desligada, impossivel modificar volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado () && this.getVolume()>0){
            this.setVolume(0);
        }else{
            System.out.println("TV desligada impossivel realizar essa função");
        }
    
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("TV desligada");
        }
    }

    @Override
    public void play() {
        if (this.getLigado()&& ! (this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("TV desligada");
        }
        
    }

    @Override
    public void pause() {
        if(this.getLigado()&& this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("TV desligada");
        }
    }
    
    
}
