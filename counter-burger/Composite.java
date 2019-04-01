import java.text.DecimalFormat;
import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

	public void printDescription() {
        System.out.println( description );
        DecimalFormat fmt = new DecimalFormat("0.00");
        for (Component obj  : components)
        {
            obj.printDescription();
            if (!obj.getPrice().equals(0.0))
                System.out.println( fmt.format(obj.getPrice()));
        }
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
    public Double getPrice() {
        return 0.0;
    }
}
