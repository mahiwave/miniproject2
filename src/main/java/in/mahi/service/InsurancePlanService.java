package in.mahi.service;

import java.util.List;

import in.mahi.request.SearchRequest;
import in.mahi.response.SearchResponse;

public interface InsurancePlanService {
  public List<SearchResponse> SearchPlans(SearchRequest searchRequest);
}
