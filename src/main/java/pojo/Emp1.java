package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Emp1 {

	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Emp1 [eid=" + eid + ", ename=" + ename + "]";
	}
	public Emp1(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Emp1() {
		super();
	}
	
}
