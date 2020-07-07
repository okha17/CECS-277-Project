
public class Education implements Cloneable {
	
	private String degree;
	private String major;
	private int research;
	
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	Education() {
		degree = null;
		major = null;
		research = 0;
	}
	
	Education(String d, String m, int r) {
		this.setDegree(d);
		this.setMajor(m);
		this.setResearch(r);
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String d) {
		this.degree = d;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String m) {
		this.major = m;
	}
	
	public int getResearch() {
		return research;
	}
	
	public void setResearch(int r) {
		this.research = r;
	}
}
