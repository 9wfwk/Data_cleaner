import java.util.regex.*; 
import java.io.*; 
  
class Test2 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		PrintWriter pw = new PrintWriter(args[1]);
		Pattern p = Pattern.compile("(0/91/+91)?[7-9][0-9]{9}"); 

		BufferedReader br = new BufferedReader (new FileReader(args[0])); 
		String line = br.readLine(); 

		while (line != null){ 
			Matcher m = p.matcher(line); 

			while (m.find()){ 
				pw.println(m.group()); 
			} 

			line = br.readLine(); 
		} 
		pw.flush(); 
		
		
		PrintWriter pw1 = new PrintWriter(args[2]);
       		Pattern p1 = Pattern.compile("[a-zA-Z0-9]"+"[a-zA-Z0-9_.]"+"*@[a-zA-Z0-9]"+"+([.][a-zA-Z]+)+"); 
  	        BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
  	        
  	        String line1 = br1.readLine();
  	        
  	        while(line1!=null){
  	        	Matcher m = p1.matcher(line1);
  	        	
  	        	while(m.find()){
  	        		pw1.println(m.group());
  	        	}
  	        	
  	        	line1 = br1.readLine();
  	        }
  	        
  	        pw1.flush();
	} 
}
