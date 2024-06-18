package Quesn;

public class Whatsapp
{
private int phno;
private String statu;
private String bio;

public Whatsapp(int phno, String statu, String bio) 
{
	this.setPhno(phno);
	this.setStatu(statu);
	this.setBio(bio);
}

public int getPhno() {
	return phno;
}

public void setPhno(int phno) {
	this.phno = phno;
}

public String getStatu() {
	return statu;
}

public void setStatu(String statu) {
	this.statu = statu;
}

public String getBio() {
	return bio;
}

public void setBio(String bio) {
	this.bio = bio;
}

}

