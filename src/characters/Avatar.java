package characters;

import java.util.HashSet;

import characters.actions.Skill;
import effects.Buff;
import effects.Debuff;

public class Avatar {
	private Double hp, hpReg, mp, mpReg;
	private Integer phyRes, magRes, effectRes;
	private HashSet<Buff> buffs = new HashSet<Buff>();
	private HashSet<Debuff> debuffs = new HashSet<Debuff>();
	private HashSet<Skill> skillSet = new HashSet<Skill>();
	private HashSet<Allegiance> allegiances = new HashSet<Allegiance>();
	
}