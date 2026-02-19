package insuranceapp.entity;

import insuranceapp.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeId", nullable = false)
	private Integer employeeId;
	
	@Column(name = "employeeName", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "contactNo", nullable = false)
	private String contactNo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "role", nullable = false)
	private Role role;
	
	@Column(name = "password", nullable = false)
	private String password;	
}
