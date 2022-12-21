package in.mahi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mahi.request.SearchRequest;
import in.mahi.response.SearchResponse;
import in.mahi.service.InsurancePlanService;

@RestController
public class InsuranceController {

	@Autowired
	private InsurancePlanService service;

	@PostMapping("/plans")
	public ResponseEntity<List<SearchResponse>> getPlans(@RequestBody SearchRequest request) {
		List<SearchResponse> searchPlans = searchPlans = service.SearchPlans(request);
		return new ResponseEntity<>(searchPlans, HttpStatus.OK);
	}
	
	@PostMapping("/plannames")
	public ResponseEntity<List<String>> getPlansName() {
		List<String> planNames = service.getPlanNames();
		return new ResponseEntity<>(planNames, HttpStatus.OK);
	}
	
	@PostMapping("/planstatus")
	public ResponseEntity<List<String>> getPlanStatus() {
		List<String> planStatus = service.getPlanNames();
		return new ResponseEntity<>(planStatus, HttpStatus.OK);
	}

}
