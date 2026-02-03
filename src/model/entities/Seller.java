package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8659444772332342046L;
	private Integer Id;
	private String Name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department departiment;
	
	public Seller() {
		
	}

	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department departiment) {
		super();
		Id = id;
		Name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.departiment = departiment;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartiment() {
		return departiment;
	}

	public void setDepartiment(Department departiment) {
		this.departiment = departiment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Seller [Id=" + Id + ", Name=" + Name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + ", departiment=" + departiment + "]";
	}
	
	

}
