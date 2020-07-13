package animals;

public class Kitten extends Cat{

    public Kitten(String name, int age) {
        super(name, age,"Female");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
