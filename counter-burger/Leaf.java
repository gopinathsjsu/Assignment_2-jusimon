import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    private Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public void printDescription() {
        System.out.print( description + " " ) ;
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

    public Double getPrice() {
        return price;
    }
}
