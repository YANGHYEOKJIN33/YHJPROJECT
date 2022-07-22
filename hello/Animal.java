class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(name + "(이)가 음식을 먹습니다.");
	}
	public void sleep() {
		System.out.println(name + "(이)가 잠을 잡니다.");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
