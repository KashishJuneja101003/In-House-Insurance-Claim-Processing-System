package insuranceapp.entity;

import java.math.BigDecimal;
import java.util.List;

import insuranceapp.enums.PolicyStatus;
import insuranceapp.enums.PolicyType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policyNumber", nullable = false)
	private Integer policyNumber;

	@Column(name = "coverageAmount", nullable = false)
	private BigDecimal coverageAmount;

	@Enumerated(EnumType.STRING)
	@Column(name = "policyType", nullable = false)
	private PolicyType policyType;

	@Enumerated(EnumType.STRING)
	@Column(name = "policyStatus", nullable = false)
	private PolicyStatus status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "policyHolderId", nullable = false)
	private PolicyHolder policyHolder;

	@OneToMany(mappedBy = "policy")
	private List<Claim> claims;

}
