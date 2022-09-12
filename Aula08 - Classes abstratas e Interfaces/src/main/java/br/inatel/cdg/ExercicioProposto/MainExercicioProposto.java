package br.inatel.cdg.ExercicioProposto;

import br.inatel.cdg.classesAbstratasEInterfaces.Arquiteto;
import br.inatel.cdg.classesAbstratasEInterfaces.Engenheiro;
import br.inatel.cdg.classesAbstratasEInterfaces.Professor;

public class MainExercicioProposto {
    public static void main(String[] args) {
        // Criando um array de 5 referências para Carro
        Carro []carros=new Carro[5];

        // Criando três objetos
        SUV suv=new SUV("Azul",2004,45000,"Dianteira");

        Sedan sedan=new Sedan("Amarelo",2010,70000,4);

        Hatch hatch=new Hatch("Vermelho",2000,650000,2);

        // Adicionando os objetos no array de carros
        carros[0]=suv;
        carros[1]=sedan;
        carros[2]=hatch;

        for(int i=0;i< carros.length;i++){
            if(carros[i]!=null){
                if(carros[i] instanceof SUV){
                    SUV auxSuv=(SUV)carros[i]; // Casting

                    // Acessando os métodos
                    auxSuv.mostraInfos();
                    auxSuv.taxa();

                }else if(carros[i] instanceof Sedan){
                    Sedan auxSedan=(Sedan)carros[i];// Casting

                    // Acessando os métodos
                    auxSedan.mostraInfos();
                    auxSedan.taxa();

                }else{
                    Hatch auxHatch=(Hatch)carros[i];// Casting

                    // Acessando os métodos
                    auxHatch.mostraInfos();
                    auxHatch.taxa();
                }
            }
        }
    }


}
