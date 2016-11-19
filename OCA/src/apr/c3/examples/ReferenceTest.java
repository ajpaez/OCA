package apr.c3.examples;

import java.awt.Dimension;

class ReferenceTest {
    public static void main(String[] args) {
	Dimension d = new Dimension(5, 10);
	System.out.println("creado objeto  con id: " + System.identityHashCode(d));
	ReferenceTest rt = new ReferenceTest();
	System.out.println("Before modify() d.height = " + d.height);
	rt.modify(d);
	System.out.println("After modify() d.height = " + d.height);

	System.out.println("=============================================");
	int a = 1;
	System.out.println("Before modify() a = " + a);
	rt.modify(a);
	System.out.println("After modify() a = " + a);

    }

    void modify(Dimension dim) {
	System.out.println("modificando objeto con hash code: " + System.identityHashCode(dim));
	dim.height = dim.height + 1;
	System.out.println("dim = " + dim.height);
    }

    void modify(int number) {
	number = number + 1;
	System.out.println("number = " + number);
    }

}
