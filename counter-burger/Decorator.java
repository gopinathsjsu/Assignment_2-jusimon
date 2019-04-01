public class Decorator implements Component {

    private Component component;

    public Decorator(Component c) {
       component = c;
    }

    public Double getPrice() {
       return component.getPrice();
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

    public void printDescription() {

        component.printDescription();
    }
}
