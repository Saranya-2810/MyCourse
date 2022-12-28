package week1.day1;

public class VariableScope {
	//global variable
	String name ="Saranya";
	public void accessVariable() {
		//local variable
		String shortName="Saran";
		System.out.println("name : " + name);
		System.out.println("shortName : " + shortName);
	}
	
	public static void main(String args[]) {
		VariableScope pvtvar =new VariableScope();
		pvtvar.accessVariable();
	}

}
