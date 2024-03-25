package youtube;

public class Contant {
	 ContantType contantType;
	 String Message="msg";
	 public Contant() {
		 
	 }
	public Contant(ContantType contantType, String message) {
		super();
		this.contantType = contantType;
		Message = message;
	}
	public ContantType getContantType() {
		return contantType;
	}
	public void setContantType(ContantType contantType) {
		this.contantType = contantType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	 
	 
}
