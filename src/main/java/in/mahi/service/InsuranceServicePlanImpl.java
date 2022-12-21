package in.mahi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.mahi.entity.InsurancePlanEntity;
import in.mahi.repository.InsurancePlanRepository;
import in.mahi.request.SearchRequest;
import in.mahi.response.SearchResponse;

@Service
public class InsuranceServicePlanImpl implements InsurancePlanService {

	@Autowired
	private InsurancePlanRepository repository;
	
	@Override
	public List<SearchResponse> SearchPlans(SearchRequest searchRequest) {
		// TODO Auto-generated method stub
		
		//select * from Insurance_plans where PlanName = ? and PlanStatus = ? and StartDate < ? and 
		// endDate < ? 
				
		InsurancePlanEntity entity = new InsurancePlanEntity();
		
		if(searchRequest.getPlanName() != null && !searchRequest.getPlanName().equals("")) {
			entity.setPlaneName(searchRequest.getPlanName());
		}
		
		if(searchRequest.getPlanStatus() != null && !searchRequest.getPlanStatus().equals("")) {
			entity.setPlanStatus(searchRequest.getPlanStatus());
		}
		
		Example<InsurancePlanEntity> of = Example.of(entity);
		List<InsurancePlanEntity> findAll = repository.findAll(of);
		List<SearchResponse> plans = new ArrayList<>();
		
		for(InsurancePlanEntity planentity : findAll) {
			SearchResponse searchRes = new SearchResponse();
			BeanUtils.copyProperties(planentity, searchRes);
			plans.add(searchRes);
		}
		return plans;
	}

	@Override
	public List<String> getPlanNames() {
		return repository.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return repository.getPlanStatus();
	}

}
