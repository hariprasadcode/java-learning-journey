package instagram;

public class Instagram3 extends Instagram2 {
	@Override
	public void uplode() {
		super.uplode();
		System.out.println("Uploding Reel Supported");
	}
	@Override
	public void dm() {
		super.dm();
		System.out.println("Send emoji Supported");
	}
	
	public void story() {
		System.out.println("Uploding Story Supported");
	}

}
