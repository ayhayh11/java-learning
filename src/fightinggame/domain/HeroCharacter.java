package fightinggame.domain;

import java.util.ArrayList;

public class HeroCharacter extends  Character{
     public ArrayList<String>skillList;

    public HeroCharacter() {

    }

    public HeroCharacter(String name,int hp,int attack, int defense ) {
        super(attack, defense, hp, name);
        this.skillList = new ArrayList<>();

    }


    public String showskill() {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < skillList.size(); i++) {
          sb.append(skillList.get(i));
          if (i != skillList.size() - 1) {
              sb.append(", ");
          }
      }
      return sb.toString();
    }
}
