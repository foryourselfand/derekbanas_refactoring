package L6_ConditionsToMethodsOrPoly;

class Animal {
	private String sound;

	public Animal(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String toString() {
		return getSound();
	}
}