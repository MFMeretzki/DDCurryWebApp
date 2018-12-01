package curry.upload;

@SuppressWarnings("serial")
public class ForbbidenPathException extends Exception{
	public ForbbidenPathException() { super(); }
	public ForbbidenPathException(String message) { super(message); }
	public ForbbidenPathException(String message, Throwable cause) { super(message, cause); }
	public ForbbidenPathException(Throwable cause) { super(cause); }
}
