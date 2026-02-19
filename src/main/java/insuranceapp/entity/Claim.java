package insuranceapp.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import insuranceapp.enums.ApprovalStatus;
import insuranceapp.enums.ClaimStatus;
import insuranceapp.enums.ClaimType;
import insuranceapp.enums.VerificationStatus;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "claimId", nullable = false)
	private Integer claimId;

	@ManyToOne
	@JoinColumn(name = "policyNumber", nullable = false)
	private Policy policy;

	@Enumerated(EnumType.STRING)
	@Column(name = "claimType", nullable = false)
	private ClaimType claimType;

	@Column(name = "amount", nullable = false)
	private BigDecimal claimedAmount;

	@Column(name = "date", nullable = false)
	private LocalDate incidentDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "claimStatus", nullable = false)
	private ClaimStatus status;

	@Enumerated(EnumType.STRING)
	@Column(name = "verificationStatus", nullable = false)
	private VerificationStatus verificationStatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "approvalStatus", nullable = false)
	private ApprovalStatus approvalStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employeeId", nullable = false)
	private Employee processedBy;
}
