package entidades;



public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"David","david.franca01@fatec.sp.gov.br","123","981730364");
		Technology tech1 = new Technology(1,"java","j");
		Technology tech2 = new Technology(2,"C#","h");
		Request req1 = new Request(1,"Stf_Job","Stefanini","Doug",tech1,
				"25/10/20018",10,"full time",true,"working as hell",1);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Username:"+user1.getUserName()+"\n");
		sb.append("Technology Name:"+req1.getTechnology().getTechnologyName()+"\n");
		sb.append("Technology Type:"+req1.getTechnology().getTechnologyType()+"\n");
		
		System.out.println(sb);
			
	}

}
