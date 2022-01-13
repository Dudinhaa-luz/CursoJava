package entities;

public class Comment {
	private String Text;
	
	public Comment(){
		
	}

	public Comment(String text) {
		super();
		Text = text;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}
}
