package curry.constants;

public interface RequestKeys {
	
	public interface Salt {
		public static final String SALT = "MandaHuevos";
	}
	
	public interface Forms {
		public static final String USERNAME = "username_field";
		public static final String PASSWORD = "passowrd_field";
		public static final String PASSWORD2 = "passowrd2_field";
	}
	
	public interface Parameters {
		public static final String STATUS = "status";
	}
	
	public interface CharacterSheetForm {
		public static final String NAME = "character_name_field";
		public static final String LEVEL = "level_field";

		public static final String STRBASE = "str_base_field";
		public static final String STRTEMP = "str_temp_field";
		public static final String STRBASEMOD = "str_base_mod_field";
		public static final String STRTEMPMOD = "str_temp_mod_field";
		
		public static final String DEXBASE = "dex_base_field";
		public static final String DEXTEMP = "dex_temp_field";
		public static final String DEXBASEMOD = "dex_base_mod_field";
		public static final String DEXTEMPMOD = "dex_temp_mod_field";
		
		public static final String CONBASE = "con_base_field";
		public static final String CONTEMP = "con_temp_field";
		public static final String CONBASEMOD = "con_base_mod_field";
		public static final String CONTEMPMOD= "con_temp_mod_field";
		
		public static final String INTBASE = "int_base_field";
		public static final String INTTEMP = "int_temp_field";
		public static final String INTBASEMOD = "int_base_mod_field";
		public static final String INTTEMPMOD = "int_temp_mod_field";
		
		public static final String WISBASE = "wis_base_field";
		public static final String WISTEMP = "wis_temp_field";
		public static final String WISBASEMOD = "wis_base_mod_field";
		public static final String WISTEMPMOD = "wis_temp_mod_field";
		
		public static final String CHABASE = "cha_base_field";
		public static final String CHATEMP = "cha_temp_field";
		public static final String CHABASEMOD = "cha_base_mod_field";
		public static final String CHATEMPMOD = "cha_temp_mod_field";
	}

}
