package aula02.exercicio;

public class Controle {
     String modelo;
    String cor;
    String marca;
    boolean desligado;
    
    void status (){
        System.out.println("Um controle: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Esta desligado ? " + this.desligado);
    }
   
    void  ligar (){
    this.desligado= false;
}
    void desligar () {
     this.desligado = true;
    }
    
    void precionar (){
    if(desligado == false){
        System.out.println("precionando botaõ Start, para entrar no jogo");
    }else {
        System.out.println("O controle está desligado, não tem como entrar no jogo");
    }
}
}
