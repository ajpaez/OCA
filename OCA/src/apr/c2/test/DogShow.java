package apr.c2.test;

class Dog {
    public void bark() {
	System.out.print("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
	System.out.print("sniff ");
    }

    public void bark() {
	System.out.print("howl ");
    }
}

public class DogShow {
    public static void main(String[] args) {
	new DogShow().go();
    }

    void go() {
	new Hound().bark();
	((Dog) new Hound()).bark();
	((Dog) new Hound()).sniff();
    }
}
