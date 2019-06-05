public class Playground extends Attraction implements ISecurity{


    public Playground(String name, int i) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        return visitor.getAge() >= 15;
    }
}
