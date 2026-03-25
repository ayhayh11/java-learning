package fightinggame.domain;

public class EnemyCharacter extends  Character{
    public String skill;
    public boolean buff;

    public EnemyCharacter(String name, int hp, int attack, int defense,  String skill) {
        super(attack, defense, hp, name);
        this.skill = skill;
    }

    public EnemyCharacter() {
       super();
    }

    @Override
    public void takedamage(int damage) {
        if(buff){
            damage=damage/2>1?damage/2:1;
            buff=false;
        }
        super.takedamage(damage);
    }
}
