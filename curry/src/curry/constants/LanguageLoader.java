package curry.constants;

public class LanguageLoader {

	private String userLanguage;
	
	LanguageLoader(String language) {
		userLanguage = language;
		
		//TODO maybe load the strings into a HashMap<String, String>
	}
	
	public String getString(String wordId) {
		//TODO obtain from the data base the word in the current language
		
		//Maybe this:
		//SELECT word FROM " + userLanguage + " WHERE word_id = wordId
		//or
		//SELECT " + userLanguage + " FROM words_table WHERE word_id = wordId
		
		return null;
	}
	
	public static String getCurrentLanguage()
	{
		//TODO load from data base the user language
		return "es_ES";
	}
	
}
