public class Customer5{
String name;
	int ph;
    int dob;
	String add;
	String vot;
	String mai;
Customer5(String name, int ph, int dob,String add){
this.name=name;
this.ph=ph;
this.dob=dob;
this.add=add;
}	
Customer5(String name, int ph, int dob,String add,String mai,String vot){
this.name=name;
this.ph=ph;
this.dob=dob;
this.add=add;
this.mai=mai;
this.vot=vot;
}		
	
Customer5(String name, int ph,String add){
this.name=name;
this.ph=ph;

this.add=add;
}		
	
	

public static void main(String[] args){

Customer5 cus1=new Customer5("sara",97,065,"address");
Customer5 cus2=new Customer5("santhiya",9887,905,"address","mailm","vot");
Customer5 cus3=new Customer5("sara",987,"address");
Bank5 db=new Bank5();
db.update(cus1);	
db.update(cus2);
db.update(cus3);	
}
/*public void applyPan(String name, int ph, int dob,String add){ 


}
	public void applyPan(String name, int ph, int dob,String add,String mai,String vot){ 


}
	public void applyPan(String name, int ph,String add){ 


}*/
	public void update(){ 
//System.out.println(name+" "+ ph+" "+dob+" "+add+" "+mai+" "+vot);
}

}