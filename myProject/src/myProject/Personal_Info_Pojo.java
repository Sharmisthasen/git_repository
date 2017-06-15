package myProject;

public class Personal_Info_Pojo {
	String name , addr , gender;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	
	public String toString(){
		return 
				"\n"+getName()+"||"+getAddr()+"||"+getGender()+"\n";
	}
	

}
