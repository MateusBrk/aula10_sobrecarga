

public class horario {
    public static void main(String[] args) {
        
        //instancia objeto da classe relogio
        //utilizando construtor vazio
        relogio r1 = new relogio();
        System.out.println("- Utilizando construtor vazio");
        System.out.println("horario " + r1.gethora() + ":" + r1.getminuto() + ":" + r1.getsegundo());
        

        //instancia objeto da classe relogio
        //utilizando construtor que requer hora. minuto, segundo
        relogio r2 = new relogio(12, 30, 50);
        System.out.println("horario " + r2.gethora() + ":" + r2.getminuto() + ":" + r2.getsegundo());
        

        //instancia objeto da classe relogio
        //utilizando construtor que requer hora
        relogio r3 = new relogio(20);
        System.out.println("horario " + r3.gethora() + ":" + r3.getminuto() + ":" + r3.getsegundo());
        

        //instancia objeto da classe relogio
        //utilizando construtor que requer hora, minuto
        relogio r4 = new relogio(10,30);
        System.out.println("horario " + r4.gethora() + ":" + r4.getminuto() + ":" + r4.getsegundo());
        

        //instancia objeto da classe relogio
        //utilizando construtor vazio
        relogio r5 = new relogio();
        System.out.println("- Utilizando construtor vazio...");
        System.out.println("...Mas atribuindo valores atraves dos metodos de acesso");
        //mas atribuindo valores atraves dos metodos de acesso
        r5.sethora(13);
        r5.setminuto(40);
        r5.setsegundo(10);
        System.out.println("horario " + r5.gethora() + ":" + r5.getminuto() + ":" + r5.getsegundo());
        System.out.println("\n\n");//pula duas linhas



    }
}
