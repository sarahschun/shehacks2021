import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class content {

	public static void main(String[] args) {
	//	new JPanelBackgroundColorTest();
		JFrame frame = new JFrame();
		Object result = JOptionPane.showInputDialog(frame, "Enter what you want to say:");
		//String result = result;
		String str = String. valueOf(result) ;
		//String str = "This is just not a good idea guys sorry"; //user input
		String fin;
		fin = splitString(str);

		System.out.println(fin);
		JOptionPane.showMessageDialog (null, fin, "Title", JOptionPane.INFORMATION_MESSAGE);

	}

	public static String splitString(String str){ 

		//String[] res = str.split(" ");
		String[] res = str.replaceAll("[^a-zA-Z ]", "").split("\\s+");

		for (int x = 0; x < res.length; x++) { 
			//System.out.println(res[x]);
			res[x] = replaceText(res[x]); 
		} 

		String fin = "";
		for (int x = 0; x < res.length; x++) { 

			if (res[x].equals(" "))
				fin = fin; 
			else
				fin = fin + res[x]+" " ; 
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
