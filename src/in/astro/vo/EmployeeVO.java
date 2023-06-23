package in.astro.vo;

public class EmployeeVO {

	private String eid;
	private String ename;
	private String eage;
	private String eaddress;
	private String esalary;
	private String hikeAmount;

	

	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress
				+ ", esalary=" + esalary + ", hikeAmount=" + hikeAmount + "]";
	}



	public String getEid() {
		return eid;
	}



	public void setEid(String eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getEage() {
		return eage;
	}



	public void setEage(String eage) {
		this.eage = eage;
	}



	public String getEaddress() {
		return eaddress;
	}



	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}



	public String getEsalary() {
		return esalary;
	}



	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}



	public String getHikeAmount() {
		return hikeAmount;
	}



	public void setHikeAmount(String hikeAmount) {
		this.hikeAmount = hikeAmount;
	}

	
}
