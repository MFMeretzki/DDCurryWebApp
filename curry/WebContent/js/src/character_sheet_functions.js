function attributeMod(ATTR) {
	var attr = "";
	
	switch(ATTR){
	case "STR":
		attr = "fuerza";
		break;
	case "CON":
		attr = "constitucion";
		break;
	case "DEX":
		attr = "destreza";
		break;
	case "INT":
		attr = "inteligencia";
		break;
	case "WIS":
		attr = "sabiduria";
		break;
	case "CHA":
		attr = "carisma";
		break;
	}
	
	if (attr == "") return;
	
	var baseAttr = "punt_caract_" + attr;
	var tmpAttr = "punt_temp_" + attr;
	var modAttr = "mod_caract_" + attr;
	var tempModAttr = "mod_temp_" + attr;
	
	var value = Number.parseInt(document.getElementById(baseAttr).value);
	var tempValue = Number.parseInt(document.getElementById(tmpAttr).value);
	
	if (Number.isNaN(value)) {
		value = 0;
	}
	if (Number.isNaN(tempValue)) {
		tempValue = 0;
	}
	
	var mod = Math.floor((value-10)/2);
	document.getElementById(modAttr).value = mod;
	
	var modTemp = Math.floor((value+tempValue-10)/2);
	document.getElementById(tempModAttr).value = modTemp;
}