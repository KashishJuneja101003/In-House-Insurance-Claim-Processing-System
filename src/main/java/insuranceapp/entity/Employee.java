package insuranceapp.entity;

import insuranceapp.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeId", nullable = false)
	private String employeeId;
	
	@Column(name = "employeeId", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "contactNo", nullable = false)
	private String contactNo;
	
	@Column(name = "role", nullable = false)
	private Role role;
	
	@Column(name = "password", nullable = false)
	private String password;	
}
