package com.company;

public class Emprestimo {

    public static void calcular(double valor, int parcelas){

        double taxa = calcularTaxa(parcelas);

        System.out.println(valor * (taxa + 1));
    }

    public static double calcularTaxa(int parcelas){
        return parcelas * 0.15;
    }
}
