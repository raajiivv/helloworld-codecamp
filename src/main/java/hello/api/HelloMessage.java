package hello.api;

@org.codehaus.jackson.annotate.JsonPropertyOrder({"id", "content"})


public class HelloMessage {
	
	private static int id;
	private String content = "Hello,";
	
	/**
	 * 
	 */
	public HelloMessage() {
		super();
		HelloMessage.id++;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		HelloMessage.id = id++;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String msg) {
		content = msg;
	}

}
