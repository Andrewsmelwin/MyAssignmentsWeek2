package week3.day2;

public class Iphone extends TouchMobile implements Mobile {

	public static void main(String[] args) {
		
		Iphone ph=new Iphone();
		
		ph.dialNumber();
		ph.makeCall();
		ph.sendSMS();
		ph.Switchon();
		ph.touchPad();
		

	}

	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	public void dialNumber() {
		// TODO Auto-generated method stub
		
	}

	public void Switchon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeCall() {
		System.out.println("Make call from Iphone");
		
	}

	@Override
	public void touchPad() {
		// TODO Auto-generated method stub
		
	}

}
