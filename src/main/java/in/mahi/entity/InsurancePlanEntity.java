package in.mahi.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="INSURANCE_PLANS")
public class InsurancePlanEntity {

	@Id
	@Column(name="PLAN_ID")
	private Integer planId;
	
	@Column(name="PLAN_NAME")
	private String planeName;
	
	@Column(name="PLAN_HOLDER_NAME")
	private String planHolertName;
	
	@Column(name="PLAN_HOLDER_EMAIL")
	private String planHolderEmail;
	
	@Column(name="PLAN_HOLDER_SSN")
	private Long planHolderSsn;
	
	@Column(name="PLAN_HOLDER_CONCAT_NUM")
	private Integer planHolderContactNumber;
	
	@Column(name="PLAN_HOLDER_GENDER")
	private String planHolderGender;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name = "START_DATE")
	@CreationTimestamp
	private LocalDate StartDate;
	
	@UpdateTimestamp
	@Column(name = "END_DATE")
	private LocalDate EndDate;
	
	
}
