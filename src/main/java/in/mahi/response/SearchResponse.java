package in.mahi.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchResponse {

	private Integer planId;
	private String planeName;
	private String planHolertName;
	private String planHolderEmail;
	private Integer planHolderContactNumber;
	private String planHolderGender;
	private Long planHolderSsn;
	private String planStatus;
	private LocalDate StartDate;
	private LocalDate EndDate;
}
