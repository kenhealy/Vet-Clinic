package Exceptions;

public class EmptyQueueException extends Exception {

	public EmptyQueueException() {
		
		super("The queue is  empty");
	}

	public EmptyQueueException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmptyQueueException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public EmptyQueueException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmptyQueueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
