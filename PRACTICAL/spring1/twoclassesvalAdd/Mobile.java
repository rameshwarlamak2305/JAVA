package Spring.EmpSpring;

import lombok.Data;

@Data
public class Mobile {
	
	private String brand;
	private String mobileColor;
	private String modelnumber;
	private int screenSize;
	
	private Sim sim;
public void showMobile() {
	System.out.println("brand :"+this.brand);
	System.out.println("color :"+this.mobileColor);
	System.out.println("model :"+this.modelnumber);
	System.out.println("size :"+this.screenSize);
	
	if(sim!=null) {
		sim.call();
		sim.internet();
	}
	else {
		System.out.println("not inserted sim");
	}
	
}
}
