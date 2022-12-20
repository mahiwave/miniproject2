package in.mahi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return null;
	}

}
