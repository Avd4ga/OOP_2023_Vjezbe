package LabWeek6.Sky;

import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density=0.1;
    }

    public NightSky(double density) {
        this.density = density;
        this.height=10;
        this.width=20;
    }

    public String printLine(){
       String str="";
       Random rand=new Random();

       for(int i=0;i<=this.width;i++){
           int randt = rand.nextInt(10);

           if(randt<this.density){
               str+="+";
               starsInLastPrint++;
           }else{
               str+=" ";
           }

       }

        return str;
    }
    public String print(){
        String str="";
        this.starsInLastPrint=0;
        for (int i=1;i<=this.height;i++){
            System.out.println(printLine());


        }
        return str;
    }
    public int starsInLastPrint(){

        return starsInLastPrint;
    }

}
