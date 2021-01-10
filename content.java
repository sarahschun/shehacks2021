
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class content {

	public static void main(String[] args) {
	//	JFrame frame = new JFrame();
//		Object result = JOptionPane.showInputDialog(frame, "Enter printer name:");
		//String result = result;
		String str = "I think this is just a good idea guys"; //user input
		String result;
		result = splitString(str);
		System.out.println(result);

	}

	public static String splitString(String str){ 
		  
		String[] res = str.split(" ");		 

		for (int x = 0; x < res.length; x++) { 
			//System.out.println(res[x]);
			res[x] = replaceText(res[x]); 
			
		} 
		String fin = "";
		for (int x = 0; x < res.length; x++) { 
			
			if (res[x].equals(" "))
				fin = fin+res[x] ; 
			else
				fin = fin+ res[x]+" " ; 
		} 
		
		return fin;

	} 
	public static String replaceText(String word) { 
		if (word.equals("sorry")){ 
			word = "thank you"; 
		}  
		
		//guys -> everyone or y'all 
		if (word.equals("guys")){ 
			word = "everyone"; 
			//System.out.println("aaaa");
		}  
		//sorry 
		if (word.equals("sorry")){ 
			word = "nice catch"; 

		} 
		//just 
		if (word.equals("just")){ 
			word = " "; 

		} 
		return word;
	}
}








