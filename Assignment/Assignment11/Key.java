package Assignment11;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

    @Override
    public String toString() {
        return "Key{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return getFirstName().equals(key.getFirstName()) && getLastName().equals(key.getLastName());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += result + getFirstName().hashCode();
        result += result + getLastName().hashCode();
        return result;
    }
}
