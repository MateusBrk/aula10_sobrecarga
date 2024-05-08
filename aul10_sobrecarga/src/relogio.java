
public class relogio {
   
private int hora;
private int minuto;
private int segundo;

//construtor #1
public relogio (){
    hora = 0;
    minuto = 0;
    segundo = 0;
}

//construtor #2
public relogio (int h){
    hora = h;
    minuto = 0;
    segundo = 0;
}

//construtor #3
public relogio (int h, int m){
    hora = h;
    minuto = m;
    segundo = 0;
}

//construtor #4
public relogio (int h, int m, int s){
    hora = h;
    minuto = m;
    segundo = s;
}

//metodos de acesso
public void sethora(int x){
    hora = x;
}

public int gethora(){
    return hora;
}

public void setminuto(int x){
    minuto = x;
}

public int getminuto(){
    return minuto;
}

public void setsegundo(int x){
    segundo = x;
}

public int getsegundo(){
    return segundo;
}
//final da classe
    
        
        
    
    
}
