package in.mahi.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {

	private String planName;
	private String planStatus;
	private LocalDate StartDate;
	private LocalDate EndDate;
}
