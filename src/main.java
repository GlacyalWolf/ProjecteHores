import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    static void incrementa(Hora h1){
        int horas=h1.getHoras();
        int minutos=h1.getMinutos();
        int segundos=h1.getSegons();
        segundos++;
        if (segundos>59) {
            segundos = 0;
            minutos++;
            if (minutos > 59) {
                minutos = 0;
                horas++;
            }
        }
        h1.setHoras(horas);
        h1.setMinutos(minutos);
        h1.setSegundos(segundos);
    }

    void seguent(int inseg,Hora h1){
        int meLlevo;
        int horas=h1.getHoras();
        int minutos=h1.getMinutos();
        int segundos=h1.getSegons();
        meLlevo=(segundos+inseg)%60;
        segundos=segundos+inseg/60;
        minutos=minutos+meLlevo;
        meLlevo=minutos/60;
        minutos=minutos%60;
        horas=horas+meLlevo;

        h1.setSegundos(segundos);
        h1.setMinutos(minutos);
        h1.setHoras(horas);

    }

    void decrementa(){

    }

    void decrementa(int restseg){

    }

    int compareTo(int Hora){
        return 1;
    }

    String tostring(){
        return "hola";
    }
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Hora h1=new Hora(12,40,59);

        incrementa(h1);
        System.out.println(h1.getHoras() + ":" + h1.getMinutos() + ":" + h1.getSegons());

    }
}