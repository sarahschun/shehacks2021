function splitString(){

	var str = "I think this is just a good idea guys."; //user input 
	var res = str.split(" ");
	for (var x = 0; x < res.length; x++) {
  		//document.getElementById(x);
		res(x) = replaceText();
	}
	var result = res.toString();
}

function replaceText() {

//	var x = document.getElementById("");
//	var word = x.elements[0].value;
//	var wordLength = word.length;

//I'm sorry

	if (word.equals("sorry")){
		word = "thank you";
    console.log(word);
  	} 
	
//I think
	if (word.equals("I think")){
		word = "It'd";
    cosole.log(word);
	} 
  //guys -> everyone or y'all
	
	if (word.equals("guys")){
		word = "everyone";
    cosole.log(word);
	} 
  
	//sorry
	
	if (word.equals("sorry")){
		word = "nice catch";
    cosole.log(word);
	}

  //just
  if (word.equals("just")){
    word = " ";
  console.log(word);
  }
  return word;

}
