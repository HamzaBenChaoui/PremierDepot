package HelloWorldServer;


public class HelloServant extends HelloPOA {
	private String message= "Bonjour tousle monde";
	private ORB orb;
	
	public void setOrb(ORB orb) {
		thid.orb=orb;
	}
	@Override
	public StringHelloMessage() {
		//TODO 
	}
	@Override
	PUBLIC VOID HelloMessage(String newHelloMessage ) {
		message=newHelloMessage;
	}
}
