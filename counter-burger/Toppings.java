import java.util.ArrayList;

public class Toppings extends Decorator {

    private ArrayList<String> options;
    private Double price;

    public Toppings(Component c) {
        super(c);
        options = new ArrayList<>();
        price = 0.0;
    }

    public void setOptions(String desc, Double price) {
        options.add(desc);
        this.price += price;
    }

    public Double getPrice() {
        return price + super.getPrice();
    }

    public void printDescription() {
        int count = 0;

        super.printDescription();

		for(String option : options){
			System.out.print(option);
            count ++;
            if(count < options.size())
                System.out.print(" + ");
		}
        System.out.println();

	}
}
