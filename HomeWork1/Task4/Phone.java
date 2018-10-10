package Task4;

public class Phone {
    private long number;
    Network net;

	public Phone(long number, Network network) {
		super();
		this.number = number;
		net = network;
	}

	public Phone() {
		super();
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
    
	public void registration (){
		net.registrNumber(number);
	}
	
	public void callTo(long checkNum){
		boolean result = net.checkNumber(checkNum);
		if(result == true){
			System.out.println("Calling...");
		}else{
			System.out.println("You dialed an invalid number!");
		}
	}
	
}
