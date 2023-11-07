package LabWeek6.Sky;

public class NightSkyMain {
    public static void main(String[] args) {
        NightSky sky=new NightSky(1,40,6);
        System.out.println(sky.printLine());
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println(sky.print());
        System.out.println(sky.starsInLastPrint());
    }
}
