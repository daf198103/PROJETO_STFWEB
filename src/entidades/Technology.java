package entidades;

public class Technology {
	
	private Integer technologyId;
	private String technologyName;
	private String technologyType;
	
	public Technology(Integer TechnologyId,String TechnologyName,String TechnologyType){
		this.technologyId = TechnologyId;
		this.technologyName = TechnologyName;
		this.technologyType = TechnologyType;
	}
	
	public Technology(){}

	public Integer getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(Integer technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public String getTechnologyType() {
		return technologyType;
	}

	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
	
	
	

}
