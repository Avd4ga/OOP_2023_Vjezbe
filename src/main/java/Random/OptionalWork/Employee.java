package Random.OptionalWork;

public record Employee(int id,String name,double salary) {
    public Employee(int id,String name){
        this(id,name,5);
    }
}
