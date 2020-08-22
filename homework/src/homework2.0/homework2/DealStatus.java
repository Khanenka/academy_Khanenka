package homework2;

public enum DealStatus {
	NEW("new"), IN_PROGRESS("In Progress"), DONE("Done");

	private String value;

	private DealStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
