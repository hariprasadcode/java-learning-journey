package instagram;

public class Instagram2 extends Instagram1 {
	
	@Override
	public void uplode() {
		super.uplode();
		System.out.println("Uploding Vedios Supported");
		System.out.println("Uploding GIF Supported");
	}
	
	public void dm() {
		System.out.println("send text Messzge Supported");
	}

}
