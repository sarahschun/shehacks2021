

function readText() {
	var x = document.getElementById("");
	var word = x.elements[0].value;
	var wordLength = word.length;

//I'm sorry

	if (word = "sorry"){
		word = "thank you";
    console.log(word);
	
  } else {
		word = "sorry";
	}
	
//I think
	
	if (word = "I think"){
		word = "It'd";
    cosole.log(word);
	} else {
		word = "I think";
	}
	
  //guys -> everyone or y'all
	
	if (word = "guys"){
		word = "everyone";
    cosole.log(word);
	} 
  else {
		word = "guys";
	}

	//sorry
	
	if (word = "sorry"){
		word = "nice catch ";
    cosole.log(word);
	} else {
		word = "sorry";
	}

  //just
  if (word = "just"){
    word = " ";
  console.log(word);
  }
  else{
    word = "just";
  }
  
  document.getElementById("estimate").innerHTML = "Total cost of your sign: <br> £" + totalCorrect;
	document.getElementById("prettySign").innerHTML = sign;
}