package sec4;

public class Animal {
	protected String name;
	protected boolean spine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public String print() {
		return "Animal [name=" + name + ", spine=" + spine + "]";
	}
}
