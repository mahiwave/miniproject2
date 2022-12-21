package in.mahi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.mahi.entity.InsurancePlanEntity;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlanEntity, Serializable> {

	//@Query()  to get distict list of planNames
	@Query("select distinct planeName from InsurancePlanEntity")
	List<String> getPlanNames();

	//@Quesry
	@Query("select distinct planStatus from InsurancePlanEntity")
	List<String> getPlanStatus();

}
