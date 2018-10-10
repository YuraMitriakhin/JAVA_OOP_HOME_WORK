package Task4;

public class Network {
    private long[] archiveNumbers = new long[100];
    
    public Network() {
		super();
	}

	public long[] getArchiveNumbers() {
		return archiveNumbers;
	}

	public void registrNumber(long number){
    	for(int i=0; i<archiveNumbers.length; i++){
    		if(archiveNumbers[i]==0){
    			archiveNumbers[i]=number;
    			break;
    		}
    	}
    }
	
	public boolean checkNumber(long number){
		boolean result = false;
		for(int i=0; i<archiveNumbers.length; i++){
			if(archiveNumbers[i]==number){
				result = true;
				break;
			}
		}
		return result;
	}
}
