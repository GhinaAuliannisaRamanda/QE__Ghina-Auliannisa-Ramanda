package section11;

public class omnivor extends hewan {
    String type;

    @Override
    void tampil() {
        System.out.println("Hi I'm " + this.type + ", My name is " + this.name + ", My Food is " + this.typeFoods + ", I have " + this.teeth + " Teeth" );
    }
}
