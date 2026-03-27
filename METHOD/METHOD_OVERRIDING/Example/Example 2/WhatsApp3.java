package wharsapp;

public class WhatsApp3 extends WhatsApp2 {
	@Override
	public void sendMessage() {
		super.sendMessage();
		System.out.println("Blue Tick supported");
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("Video Call supported");
	}
	public void status() {
		System.out.println("Uplode Status");
	}
	
	public static void main(String[] args) {
		WhatsApp3 wa3 = new WhatsApp3();
		wa3.sendMessage();
		System.out.println("----------------------");
		wa3.call();
		System.out.println("----------------------");
		wa3.status();
	}

}
