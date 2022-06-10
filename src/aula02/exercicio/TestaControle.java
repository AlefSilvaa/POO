package aula02.exercicio;


public class TestaControle {
        public static void main (String[] args) {
        
    Controle con1 =  new Controle();
    con1.modelo = "Dual Shock";
    con1.cor = "Preto";
    con1.marca = "PlayStation 4";
    con1.ligar();
    con1.status();
    con1.precionar();
    
    }  
}
