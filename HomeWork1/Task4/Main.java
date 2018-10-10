package Task4;

public class Main {

	public static void main(String[] args) {
		Network net = new Network();
	    Phone phoneOne = new Phone(380639754590l, net);
	    phoneOne.registration();
	    
	    Phone phoneTwo= new Phone(380973898358l, net);
	    phoneTwo.registration();
	    
	    Phone phoneTree = new Phone(380074840622l,net);
	    phoneTree.registration();
	    
	    phoneTree.callTo(phoneOne.getNumber());
	    phoneTree.callTo(380973898358l);
	    phoneTree.callTo(380934658457l);
	}

}
