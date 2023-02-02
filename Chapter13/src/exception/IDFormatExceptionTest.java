package exception;

public class IDFormatExceptionTest {
	
	private String userID;
	
	

	public String getUserID() {
		return userID;
	}



	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("ID Couldn't be null.");
		}
		else if( userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("Please fill in an ID from 8 to 10 spelling.");
		}
		
		this.userID = userID;
	}



	public static void main(String[] args) {
		
		IDFormatExceptionTest idTest = new IDFormatExceptionTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		myId = "123456";
		
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
