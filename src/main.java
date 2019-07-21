import com.predic8.wsdl.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WSDLParser parser = new WSDLParser();
		 
	    Definitions defs = parser
	        .parse("/Volumes/Develop_Data_MacOS/All_Workspace/JavaWorkspace/WSDLParsing/wsdl/Phylotastic_Tree_Generation.wsdl");
	    /*
	    for (PortType pt : defs.getPortTypes()) {
	      System.out.println(pt.getName());
	      for (Operation op : pt.getOperations()) {
	           System.out.println(" -" + op.getName());
	      }
	    }
	    
	    for (Message binding : defs.getMessages()){
	    	System.out.println(binding.getParts().get(0).getName());
	    }
	    */
	    for (Service service : defs.getServices()) {
		      System.out.println(service.getName());
		      for(Port port : service.getPorts()){
		    	  System.out.println(port.getName());
		    	  System.out.println(port.getAddress().getLocation());
		      }
		}
	    
	    
	    
	}

}
