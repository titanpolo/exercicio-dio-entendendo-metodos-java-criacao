package com.company;

public class Mensagem {

    public static void receberMensagem(int hora){
        if(hora>4 && hora<13) mandarBomDia();
        if(hora>12 && hora<18) mandarBoaTarde();
        if((hora>17 && hora<25) || (hora>0 && hora<5)) mandarBoaNoite();
    }

    public static void mandarBomDia(){
        System.out.println("Bom dia!");
    }

    public static void mandarBoaTarde(){
        System.out.println("Boa tarde!");
    }

    public static void mandarBoaNoite(){
        System.out.println("Boa noite!");
    }
}
