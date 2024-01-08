package LabWeek13.Builder;

public class BuilderTest {

        public static void main(String[] args) {
            Person becir = new Person.PersonBuilder("Becir")
                    .setAge(150)
                    .build();
            System.out.println(becir.getName());
            System.out.println(becir.getAge());
        }

}
