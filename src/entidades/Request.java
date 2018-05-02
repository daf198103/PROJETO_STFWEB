package entidades;

public class Request {
		
		private Integer requestId;
		private String title;
		private String companyName;
		private String customer;
		private String startDate;
		private Integer allocationTime;
		private String allocationType;
		private Boolean english;
		private String requestDescription;
		private Integer userId;
		private Technology technology;
		
		
		
		public Request(Integer RequestId,String Title,String CompanyName,String Customer,Technology Technology,String StartDate,
				Integer AllocationTime,String AllocationType,Boolean English,String RequestDescription,Integer UserID){
			this.requestId = RequestId;
			this.title = Title;
			this.companyName = CompanyName;
			this.customer = Customer;
			this.technology = Technology;
			this.startDate = StartDate;
			this.allocationTime = AllocationTime;
			this.allocationType = AllocationType;
			this.english = English;
			this.requestDescription = RequestDescription;
			this.userId = UserID;
		}
		
		public Request(){}

		public Integer getRequestId() {
			return requestId;
		}

		public void setRequestId(Integer requestId) {
			this.requestId = requestId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCustomer() {
			return customer;
		}

		public void setCustomer(String customer) {
			this.customer = customer;
		}

		public Technology getTechnology() {
			return technology;
		}

		public void setTechnology(Technology Technology) {
			this.technology = Technology;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public Integer getAllocationTime() {
			return allocationTime;
		}

		public void setAllocationTime(Integer allocationTime) {
			this.allocationTime = allocationTime;
		}

		public String getAllocationType() {
			return allocationType;
		}

		public void setAllocationType(String allocationType) {
			this.allocationType = allocationType;
		}

		public Boolean getEnglish() {
			return english;
		}

		public void setEnglish(Boolean english) {
			this.english = english;
		}

		public String getRequestDescription() {
			return requestDescription;
		}

		public void setRequestDescription(String requestDescription) {
			this.requestDescription = requestDescription;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		
		
}


