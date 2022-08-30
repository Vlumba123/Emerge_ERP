package emerge.exception;
/**
 * RecordNotFoundException thrown when a record not found occurred.
 * 
 * @author vishu lumba
 * 
 */
public class RecordNotFoundException extends Exception {
	public RecordNotFoundException(String msg){
		super(msg);
	}
}
