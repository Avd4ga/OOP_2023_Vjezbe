package Random.OptionalWork;

public class Printer<T> {

    private T print;
    public Printer(T print){
        this.print=print;
    }
    public void setPrinter(T value){
        this.print=value;
    }
    public T getPrint(){
        return this.print;
    }

}
