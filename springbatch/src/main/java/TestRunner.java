
public class TestRunner {

	    static int pos=1;
	    public int numDecodings(String s) {
	        String combi="";
	        getCombi(s,combi);
	        return pos+1;
	    }
	    
	    
	    
	    
	    
	    public static void getCombi(String s,String combi)
		{
			
			if(s.length()==1)
			{
				if(!s.contains("0")) {
				 System.out.println("combi"+combi+s.charAt(0));
				 // pos++;
				 return;
				}
				else
				{
					System.out.println("combi"+combi+s.charAt(0));
					pos--;
					return;
				}
				
				

			}
//			if(s.length()==0)
//			{
//				return;
//			}
			
			System.out.println("#"+s.charAt(0)+"#");
			
			

			String temp=s.substring(1,s.length());
			combi=combi+","+s.charAt(0)+",";
		
	        getCombi(temp,combi);
			System.out.println(temp+"hjkl");
			System.out.println(","+s.charAt(0)+s.charAt(1)+",");
			combi=combi+","+s.charAt(0)+s.charAt(1)+",";
			String temp1=s.substring(2,s.length());
			System.out.println("temp1"+temp1);
			if(Integer.valueOf(   Integer.valueOf(   ( (""+s.charAt(0) + s.charAt(1)+"" )).toString() ) )   <27) {
				
		   
			}
			if(temp1.length()!=0)
			{
//				System.out.println("integer value"+(    Integer.valueOf(   ( (""+s.charAt(0) + s.charAt(1)+"" )).toString() ) )     ) ;
			pos++;
			
			 getCombi(temp1,combi);
			
				
			 
			}
			
		
			return;
			
		}
	
	
	
	
	
	public static void main(String[] args) {
		TestRunner testRunner=new TestRunner();
		testRunner.numDecodings("226");
	
	}

}
