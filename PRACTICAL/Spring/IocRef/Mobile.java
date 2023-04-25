package Spring.EmpSpring;

import lombok.Data;

@Data
public class Mobile {
	
	private String brand;
	private String mobileColor;
	private String modelnumber;
	private int screenSize;
	
	private Sim sim;

}
