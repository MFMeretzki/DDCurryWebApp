package curry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "character_sheet")
public class Character_Sheet {
	
	@Id
	@Column(name = "ID")
	public long _ID;
	@Column(name = "name")
	public String name;
	
	/*
	@Column(name = "name")
	public int _classID;
	@Column(name = "name")
	public String className;

	@Column(name = "name")
	public int _raceID;
	@Column(name = "name")
	public String race;

	@Column(name = "name")
	public int _aligmentID;
	@Column(name = "name")
	public String aligment;

	@Column(name = "name")
	public int _deityID;
	@Column(name = "name")
	public String deity;

	@Column(name = "level")
	public int level;
	*/

	@Column(name = "strBase")
	public int strBase;
	@Column(name = "strTemp")
	public int strTemp;

	@Column(name = "dexBase")
	public int dexBase;
	@Column(name = "dexTemp")
	public int dexTemp;

	@Column(name = "conBase")
	public int conBase;
	@Column(name = "conTemp")
	public int conTemp;

	@Column(name = "intBase")
	public int intBase;
	@Column(name = "intTemp")
	public int intTemp;

	@Column(name = "wisBase")
	public int wisBase;
	@Column(name = "wisTemp")
	public int wisTemp;

	@Column(name = "chaBase")
	public int chaBase;
	@Column(name = "chaTemp")
	public int chaTemp;
}
