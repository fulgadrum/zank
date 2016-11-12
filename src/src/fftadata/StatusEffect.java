package fftadata;

public enum StatusEffect
{
	POISON			("Poison",			1,	"is <strong><span style=\"color:maroon\">poisoned</strong></span>!"),
	BLIND 			("Blind",			1,	"is <strong><span style=\"color:maroon\">blinded</strong></span>!"),
	SILENCE			("Silence",			3,	"is <strong><span style=\"color:maroon\">silenced</strong></span>!"),
	SLOW 			("Slow",			3,	"is <strong><span style=\"color:maroon\">slowed</strong></span>!"),
	PETRIFY			("Petrify",			1,	"is <strong><span style=\"color:maroon\">petrified</strong></span>!"),
	STOP 			("Stop",			2,	"<strong><span style=\"color:maroon\">stops moving</strong></span>!"),
	QUICK 			("Quick",			1,	""),
	HASTE 			("Haste",			1,	""),
	SPEED_DOWN 		("Speed Down",		1,	""),
	SLEEP 			("Sleep",			1,	""),
	EXPERT_GUARD 	("Expert Guard",	1,	""),
	HIBERNATE 		("",	1,	""),
	FROG 			("",	1,	""),
	
	CONFUSE 		("",	1,	""),
	ASTRA 			("",	1,	""),
	BERSERK 		("",	1,	""),
	WATK_UP 		("",	1,	""),
	WATK_DOWN 		("",	1,	""),
	MPOW_UP 		("",	1,	""),
	MPOW_DOWN 		("",	1,	""),
	BOOST 			("",	1,	""),
	SHELL 			("",	1,	""),
	PROTECT 		("",	1,	""),
	DEFENSE 		("",	1,	""),
	WDEF_UP 		("",	1,	""),
	WDEF_DOWN 		("",	1,	""),
	MRES_UP 		("",	1,	""),
	MRES_DOWN 		("",	1,	"");
	
	public final String NAME, REPORT;
	public final int DEFAULT_DURATION;
	
	StatusEffect(String name, int defaultDuration, String report)
	{
		NAME = name;
		DEFAULT_DURATION = defaultDuration;
		REPORT = report;
	}
}