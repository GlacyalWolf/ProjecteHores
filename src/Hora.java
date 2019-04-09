public class Hora {
    private int horas;
    private int minutos;
    private int segons;

    Hora(){
        this.horas=0;
        this.minutos=0;
        this.segons=0;
    }
    Hora(int h,int m,int s){
        if(h>0){
            this.horas =h;
        }
        else{
            this.horas=0;
        }

        if(m>=0 && m<=59){
            this.minutos =m;

        }
        else{
            this.minutos=0;
        }

        if(s>=0 && s<=59){
            this.segons =s;
        }
        else{
            this.segons=0;
        }

    }

    public int getHoras(){
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegons(){
        return segons;
    }

    public void setHoras(int horas){

        if(horas>=0) {
            this.horas = horas;
        }

    }
    public void setMinutos(int minutos){
        if(minutos>=0 && minutos<=59){
            this.minutos=minutos;
        }

    }
    public void setSegundos(int segons){
        if(segons>=0 && segons<=59) {
            this.segons = segons;
        }
    }





}

