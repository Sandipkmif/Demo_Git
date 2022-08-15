package main;

public class Base {

	int id=10;
	String name="Pawan";
	char sex= 'M';
	
	public Base(int id,String name, char sex){
		this.id=id;
		this.name=name;
		this.sex=sex;
	}

	public Base() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Base [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
	}
