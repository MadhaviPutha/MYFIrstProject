package MyPackage;

class inheritanceConstructor {
	inheritanceConstructor() {
		System.out.println("0 arg parent cons");
	}
}

public class InheritParent extends inheritanceConstructor {

	public static void main(String[] args) {
		new InheritParent();
	}
}
