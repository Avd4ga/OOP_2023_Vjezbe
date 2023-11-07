package LabWeek6.HashMaps.Promissory;

public class MainPro {
    public static void main(String[] args) {

        PromissoryNote mattisNote=new PromissoryNote();
        mattisNote.setLoan("Arto",1000);
        mattisNote.setLoan("Mikael",400);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));
        System.out.println(mattisNote.howMuchIsTheDebt("Mikael"));
    }
}
