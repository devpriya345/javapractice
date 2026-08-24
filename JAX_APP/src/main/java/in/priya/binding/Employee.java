package in.priya.binding;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employee {
	
	private Integer id;
	 private String name;
	 private String email;
	 private Long phno;
	 
	 public Employee() {
		 
	 }

	 public Integer getId() {
		 return id;
	 }

	 public void setId(Integer id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getEmail() {
		 return email;
	 }

	 public void setEmail(String email) {
		 this.email = email;
	 }

	 public Long getPhno() {
		 return phno;
	 }

	 public void setPhno(Long phno) {
		 this.phno = phno;
	 }
	 @Override
	 public String toString() {
	 	return "Employee [id=" + id + ", name=" + name +
	 			", email=" + email + ", phno=" + phno + "]";
	 }
}
