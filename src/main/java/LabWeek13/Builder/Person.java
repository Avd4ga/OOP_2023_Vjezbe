package LabWeek13.Builder;

class Person {

    private String name;
    private int age;

    private Person(PersonBuilder builder){
        this.name=builder.name;
        this.age=builder.age;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder(String name) {
            this.name = name;
        }
        public PersonBuilder setAge(int age){
            this.age=age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
