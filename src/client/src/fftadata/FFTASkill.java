package fftadata;

import java.io.Serializable;

public enum FFTASkill implements Serializable
{
	FIGHT			("Fight", 			Targeting.AS_WEAPON, 1, true, 0, 0, 0, Element.AS_WEAPON, true),
	CURE			("Cure",			null, 0, true, 0, 0, 0, Element.NULL, false),
	CURA			("Cura", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	CURAGA			("Curaga", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ESUNA			("Esuna", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	LIFE			("Life", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FULL_LIFE		("Full-Life", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AUTO_LIFE		("Auto-Life", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SHELL			("Shell", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	PROTECT			("Protect", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DISPEL			("Dispel", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	HOLY			("Holy", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BARRIER			("Barrier", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	JUDGE			("Judge", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BREAK			("Break", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	WATER			("Water", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	AERO			("Aero", 			Targeting.FREE_SELECT,	3, true, 1200, 1, 2, Element.WIND, true),
	DRAIN			("Drain", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BLIND			("Blind", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	RAISE			("Raise",			null, 0, true, 0, 0, 0, Element.NULL, false),
	GIGA_FLARE		("Giga Flare",		null, 0, true, 0, 0, 0, Element.NULL, false),
	BIO				("Bio", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ULTIMA_BLOW		("Ultima Blow", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRE			("Fire",			null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRA			("Fira",			null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRAGA			("Firaga",			null, 0, true, 0, 0, 0, Element.NULL, false),
	THUNDER			("Thunder", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	THUNDARA		("Thundara", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	THUNDAGA		("Thundaga", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLIZZARD		("Blizzard", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLIZZARA		("Blizzara", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLIZZAGA		("Blizzaga", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SLEEP			("Sleep", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	DOUBLECAST		("Doublecast", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	QUICKEN			("Quicken", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SLOW			("Slow", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	REFLECT			("Reflect",			null, 0, true, 0, 0, 0, Element.NULL, false),
	STOP			("Stop", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	QUARTER			("Quarter", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DEMI			("Demi", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SILENCE			("Silence", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	HASTE			("Haste", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	PROMINENCE		("Prominence", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	TEMPEST			("Tempest", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FREEZEBLINK		("Freezeblink", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	STAR_CROSS		("Starcross", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	STARDUST		("Stardust", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DELUGE			("Deluge", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SOIL_EVIDENCE	("Soil Evidence", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	WILD_TORNADO	("Wild Tornado", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRE_WHIP		("Fire Whip", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	EARTH_HEAL		("Earth Heal", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	WHITE_FLAME		("White Flame", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SHINING_AIR		("Shining Air", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	EVIL_GAZE		("Evil Gaze", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	HEAVY_DUST		("Heavy Dust",		null, 0, true, 0, 0, 0, Element.NULL, false),
	SLIPRAIN		("Sliprain", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ELEMENTALSHIFT	("Elementalshift", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	ASTRA			("Astra", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	RASP			("Rasp", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	DEATH			("Death", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	METEOR			("Meteor", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FLARE			("Flare", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	POISON			("Poison", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	TOAD			("Toad", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	UNICORN			("Unicorn", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	IFRIT			("Ifrit", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	RAMUH			("Ramuh", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SHIVA			("Shiva",			null, 0, true, 0, 0, 0, Element.NULL, false),
	KIRIN			("Kirin", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	CARBUNCLE		("Carbuncle", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	PHOENIX			("Phoenix", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MADEEN			("Madeen", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRST_AID		("First Aid",		null, 0, true, 0, 0, 0, Element.NULL, false),
	POWERBREAK		("Powerbreak", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MINDBREAK		("Mindbreak", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MAGICBREAK		("Magicbreak", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SPEEDBREAK		("Speedbreak", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MUG				("Mug", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	PROVOKE			("Provoke", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SENSOR			("Sensor", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BODY_SLAM		("Body Slam", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	GREASED_BOLT	("Greased Bolt",	null, 0, true, 0, 0, 0, Element.NULL, false),
	DOWNSIZE		("Downsize", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	NURSE			("Nurse", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	COVER			("Cover", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SUBDUE			("Subdue", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	PARLEY			("Parley", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SAINT_CROSS		("Saint Cross", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	HOLY_BLADE		("Holy Blade", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DEFENSE			("Defense", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DROP_WEAPON		("Drop Weapon", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	TREMOR			("Tremor", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	HIBERNATE		("Hibernate", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOW_DOWN		("Mow Down", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AURA			("Aura", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	EXPERT_GUARD	("Expert Guard", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MELTDOWN		("Meltdown", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	WHIRLWIND		("Whirlwind", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	EARTH_RENDER	("Earth Render", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	CHAKRA			("Chakra", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	REVIVE			("Revive", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	EXORCISE		("Exorcise", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	HOLY_SIGN		("Holy Sign", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AIR_RENDER		("Air Render", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FAR_FIST		("Far Fist", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AIR_BLAST		("Air Blast", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BACKDRAFT		("Backdraft", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	RUSH			("Rush", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	WILD_SWING		("Wild Swing", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BEATDOWN		("Beatdown", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLITZ			("Blitz", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRE_SWORD		("Fire Sword", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BOLT_SWORD		("Bolt Sword", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ICE_SWORD		("Ice Sword", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ULTIMA_SWORD	("Ultima Sword", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	WARCRY			("Warcry", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	CHEER			("Cheer", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SOUL_SPHERE		("Soul Sphere", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	LIFEBREAK		("Lifebreak", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	JUMP			("Jump", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	LANCET			("Lancet", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	WYRMTAMER		("Wyrmtamer", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRE_BREATH		("Fire Breath", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	BOLT_BREATH		("Bolt Breath", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	ICE_BREATH		("Ice Breath", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	WYRMKILLER		("Wyrmkiller", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BANGAA_CRY		("Bangaa Cry", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_ATTACK		("Mog Attack", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_GUARD		("Mog Guard", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_LANCE		("Mog Lance", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_RUSH		("Mog Rush", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_SHIELD		("Mog Shield", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_PEEK		("Mog Peek", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	MOG_AID			("Mog Aid", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ULTIMA_CHARGE	("Ultima Charge", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SWARMSTRIKE		("Swarmstrike", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SHADOWSTICK		("Shadowstick", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	CHECKMATE		("Checkmate", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FEATHERBLOW		("Featherblow", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SWALLOWTAIL		("Swallowtail", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MANASTRIKE		("Manastrike", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	PIERCETHROUGH	("Piercethrough", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	NIGHTHAWK		("Nighthawk", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	THROW			("Throw", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	WOOD_VEIL		("Wood Veil", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRE_VEIL		("Fire Veil", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	EARTH_VEIL		("Earth Veil",		null, 0, true, 0, 0, 0, Element.NULL, false),
	METAL_VEIL		("Metal Veil", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	WATER_VEIL		("Water Veil", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	UNSPELL			("Unspell", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	OBLIVION		("Oblivion", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SHADOWBIND		("Shadowbind", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	LAST_BREATH		("Last Breath", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	APHONIA			("Aphonia", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	NIGHTMARE		("Nightmare", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AGUE			("Ague", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ROCKSEAL		("Rockseal", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ULTIMA_MASHER	("Ultima Masher", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_ARMOR		("Steal: Armor",	null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_SHIELD	("Steal: Shield", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_ACCESS	("Steal: Access", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_HELM		("Steal: Helm", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_WEAPON	("Steal: Weapon", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_GIL		("Steal: Gil", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_EXP		("Steal: EXP", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_JP		("Steal: JP", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	STEAL_ABILITY	("Steal: Ability", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	BOOST			("Boost", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	AIM_LEGS		("Aim: Legs", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AIM_ARM			("Aim: Arm", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CUPID			("Cupid", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BURIAL			("Burial", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	TAKE_AIM		("Take Aim", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FASTER			("Faster", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BLACKOUT		("Blackout", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SONIC_BOOM		("Sonic Boom", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	OUST			("Oust", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ADVICE			("Advice", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	AIM_VITALS		("Aim: Vitals", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	HUNTING			("Hunting", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ADDLE			("Addle", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ULTIMA_SHOT		("Ultima Shot", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SIDEWINDER		("Sidewinder", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CAPTURE			("Capture", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	GOBLIN			("Goblin", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FLAN			("Flan", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BOMB			("Bomb", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	DRAGON			("Dragon", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	LAMIA			("Lamia", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BUG				("Bug", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	PANTHER			("Panther",			null, 0, true, 0, 0, 0, Element.NULL, false),
	MALBORO			("Malboro", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FLOATEYE		("Floateye", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	HURL			("Hurl", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	RING			("Ring", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FIREBOMB		("Firebomb", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BALL			("Ball", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	DAGGER			("Dagger", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SMILE			("Smile", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	GIL_TOSS		("Gil Toss", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BESO_TOXICO		("Beso Toxico", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	DEATH_SICKLE	("Death Sickle", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	CONCEAL			("Conceal", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DOOM_ARCHER		("Doom Archer", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	DOUBLESHOT		("Doubleshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AIM_ARMOR		("Aim: Armor", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	AIM_WEAPON		("Aim: Weapon", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	AIM_WALLET		("Aim: Wallet", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SHEEP_COUNT		("Sheep Count", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	WOOL			("Wool", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	CUISINE			("Cuisine", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	TAIL_WAG		("Tail Wag", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CHOCOBO_RUSH	("Chocobo Rush", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	FROGSONG		("Frogsong", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FRIEND			("Friend", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	CATNIP			("Catnip", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FIRESHOT		("Fireshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BOLTSHOT		("Boltshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ICESHOT			("Iceshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CONFUSHOT		("Confushot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CHARMSHOT		("Charmshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLINDSHOT		("Blindshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SILENSHOT		("Silenshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	STOPSHOT		("Stopshot", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	RED_SPRING		("Red Spring", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLUE_SCREW		("blue Screw", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	GREEN_GEAR		("Green Gear", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SILVER_DISC		("Silver Disc", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	GOLD_BATTERY	("Gold Battery", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	BLACK_INGOT		("Black Ingot", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	CHROMA_GEM		("Chroma Gem", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	YELLOW_SPRING	("Yellow Spring", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	POTION			("Potion", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	HI_POTION		("Hi-Potion", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	X_POTION		("X-Potion", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ETHER			("Ether", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ELIXIR			("Elixir", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	PHOENIX_DOWN	("Phoenix Down", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	ECHO_SCREEN		("Echo Screen", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MAIDEN_KISS		("Maiden Kiss", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SOFT			("Soft", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	HOLY_WATER		("Holy Water", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ANTIDOTE		("Antidote", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	EYE_DROPS		("Eye Drops", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BANDAGE			("Bandage", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CUREALL			("Cureall", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DRAW_WEAPON		("Draw Weapon", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	GOBLIN_PUNCH	("Goblin Punch", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MAGIC_HAMMER	("Magic Hammer", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MUTILATE		("Mutilate", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ACID			("Acid", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	SACRIFICE		("Sacrifice", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BLOWUP			("Blowup", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FLAME_ATTACK	("Flame Attack", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	CHILL			("Chill", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	MIGHTY_GUARD	("Mighty Guard", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	GUARD_OFF		("Guard-Off", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DRAGON_FORCE	("Dragon Force",	null, 0, true, 0, 0, 0, Element.NULL, false),
	NIGHT			("Night", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	TWISTER			("Twister", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	HAND_SLAP		("Hand Slap", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	POISON_FROG		("Poison Frog", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	KISS			("Kiss", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	LV3_DEF_LESS	("LV3 Def-Less", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	SANDSTORM		("Sandstorm", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	LV5_DEATH		("LV5 Death", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	SUFFOCATE		("Suffocate", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	RESONATE		("Resonate", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	LIMIT_GLOVE		("Limit Glove", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MATRA_MAGIC		("Matra Magic", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MUNCH			("Munch", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	POISON_CLAW		("Poison Claw", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	HASTEBREAK		("Hastebreak", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	REND			("Rend", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	BLASTER			("Blaster", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	BAD_BREATH		("Bad Breath", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	STARE			("Stare", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ROULETTE		("Roulette", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	DEVIL_GAZE		("Devil Gaze", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	CIRCLE			("Circle", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	DRAIN_TOUCH		("Drain Touch", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	LVQ_S_FLARE		("LV? S-Flare", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	WHITE_WIND		("White Wind", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	ANGEL_WHISPER	("Angel Whisper", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	ADRAMMALECH		("Adrammalech", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	MATEUS			("Mateus", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ULTIMA			("Ultima", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	EXODUS			("Exodus", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	FAMFRIT			("Famfrit", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	OMEGA			("Omega", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	ABYSS			("Abyss", 			null, 0, true, 0, 0, 0, Element.NULL, false),
	LIFE_RENDER		("Life Render", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	HEART_RENDER	("Heart Render", 	null, 0, true, 0, 0, 0, Element.NULL, false),
	RIPCIRCLE		("Ripcircle", 		null, 0, true, 0, 0, 0, Element.NULL, false),
	FURYCIRCLE		("Furycircle", 		null, 0, true, 0, 0, 0, Element.NULL, false);
	
	public final String NAME;
	public final Targeting TARGETING;
	public final boolean NOTSELF, IMPLEMENTED;
	public final int dmgType;	// 1 = physical, 2 = magical
	public final int COST, power, RADIUS, VERTICAL, RANGE;
	public final Element element;
	public static final FFTASkill values[] = values();
	
	FFTASkill(String name, Targeting targeting, int range, boolean notSelf, int cost, int radius,
				int vertical, Element element, boolean implemented)
	{
		NAME = name;
		TARGETING = targeting;
		RANGE = range;
		NOTSELF = notSelf;
		
		RADIUS = radius;
		VERTICAL = vertical;
		IMPLEMENTED = implemented;
		this.element = element;
		
		dmgType = 1;
		COST = cost;
		power = -1;
	}
	
	public static boolean canUseSkill(FFTASkill sk, ActiveUnit au)
	{
		int mpCost = sk.COST;
		if (au.unit.support == FFTASupport.HALF_MP)
			mpCost /= 2;
		else if (au.unit.support == FFTASupport.TURBO_MP)
			mpCost *= 2;
		
		return (sk.IMPLEMENTED && sk.COST < au.currMP);
	}
}