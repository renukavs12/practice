class Bank{  
	int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
	int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
	int getRateOfInterest(){return 7;}  
}  
 class Methodoverriding{  
	 public static void main(String args[]){  
     SBI s=new SBI();  
     ICICI i=new ICICI();  
     System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
     System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
     }  
}  