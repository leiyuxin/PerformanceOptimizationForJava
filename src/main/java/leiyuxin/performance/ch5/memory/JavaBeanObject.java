package leiyuxin.performance.ch5.memory;

public abstract class JavaBeanObject {
	private String name = "java";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void ab();
}
