package Exceptions;

public class NoSuchStaffTypeException extends Exception {

	public NoSuchStaffTypeException() {
		
		super("There is no such staff role available at this time.");
	}

	public NoSuchStaffTypeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoSuchStaffTypeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NoSuchStaffTypeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoSuchStaffTypeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
