/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package IO      .Github     .TheyousTK      .RolePlanner        .Beans;

import  IO      .Github     .TheyousTK      .RolePlanner        .TES    .Skyrim .SkyrimAvatar;
import  IO      .Github     .TheyousTK      .RolePlanner        .TES    .Skyrim .SkyrimPerk;
import  IO      .Github     .TheyousTK      .RolePlanner        .TES    .Skyrim .SkyrimSkillTree;
import  java    .io         .Serializable;
import  java    .util       .ArrayList;
import  java    .util       .List;
import  java    .util       .Random;
import  javax   .ejb        .Stateful;
import  javax   .faces      .bean           .ManagedBean;
import  javax   .faces      .bean           .SessionScoped;
import  javax   .faces      .context        .FacesContext;
import  javax   .faces      .event          .ActionEvent;
import  javax   .faces      .event          .ValueChangeEvent;

/**
 *  @version    0.0.0.A
 *  @author     Theyous <Theyous @ TheyousTK.Github.IO>;
 */

@Stateful
@SessionScoped
@ManagedBean (name = "skyrimBean")
public  class   SkyrimBean  implements  Serializable {
    private static  final   long                    serialVersionUID    = 0xCB0000L;
    private                 SkyrimAvatar            avatar              = new SkyrimAvatar ();
    private                 List<SkyrimSkillTree>   skillTrees          = new ArrayList<> ();
    
    public  SkyrimBean () {
        SkyrimPerk      sp1 = new SkyrimPerk ();
            sp1.setName("Novice Destruction");
            sp1.setLevels(1);
            sp1.setActiveLevels(0);
            sp1.setActive(false);
        SkyrimPerk      sp2 = new SkyrimPerk ();
            sp2.setName("Apprentice Destruction");
            sp2.setLevels(1);
            sp2.setActiveLevels(0);
            sp2.setActive(false);
        SkyrimPerk      sp3 = new SkyrimPerk ();
            sp3.setName("Adept Destruction");
            sp3.setLevels(1);
            sp3.setActiveLevels(0);
            sp3.setActive(false);
        SkyrimSkillTree sst = new SkyrimSkillTree ();
            sst.getPerks().add(sp1);
            sst.getPerks().add(sp2);
            sst.getPerks().add(sp3);
        SkyrimPerk      spA = new SkyrimPerk ();
            spA.setName("Novice Conjuration");
            spA.setLevels(1);
            spA.setActiveLevels(0);
            spA.setActive(false);
        SkyrimPerk      spB = new SkyrimPerk ();
            spB.setName("Apprentice Conjuration");
            spB.setLevels(1);
            spB.setActiveLevels(0);
            spB.setActive(false);
        SkyrimPerk      spC = new SkyrimPerk ();
            spC.setName("Adept Conjuration");
            spC.setLevels(1);
            spC.setActiveLevels(0);
            spC.setActive(false);
        SkyrimSkillTree st2 = new SkyrimSkillTree ();
            st2.getPerks().add(spA);
            st2.getPerks().add(spB);
            st2.getPerks().add(spC);
    }
    
    public  void            characterClassValueChanged      (ValueChangeEvent vce) {
        avatar.setCharClass((String) vce.getNewValue());
        avatar.checkSkillSet();
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public  void            characterGenderValueChanged     (ValueChangeEvent vce) {
        avatar.setGender((String) vce.getNewValue());
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public  void            characterRaceValueChanged       (ValueChangeEvent vce) {
        avatar.setRace((String) vce.getNewValue());
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public  void            levelUpMagicka              (ActionEvent ae) {
        if (avatar.getLevel() < 81) {
            avatar.setLevel(avatar.getLevel() + 1);
            avatar.setMagicka(avatar.getMagicka() + 10);
        } else {
            
        }
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public  void            levelUpHealth              (ActionEvent ae) {
        if (avatar.getLevel() < 81) {
            avatar.setLevel(avatar.getLevel() + 1);
            avatar.setHealth(avatar.getHealth() + 10);
        } else {
            
        }
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public  void            levelUpStamina              (ActionEvent ae) {
        if (avatar.getLevel() < 81) {
            avatar.setLevel(avatar.getLevel() + 1);
            avatar.setStamina(avatar.getStamina() + 10);
        } else {
            
        }
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public  void            randomBuild                 (ActionEvent ae) {
        Random  r   = new Random ();
        switch (r.nextInt(6)) {
            case 1:
                avatar.setCharClass("Archer");
                avatar.setGender("Female");
                avatar.setHealth(500);
                avatar.setLevel(81);
                avatar.setMagicka(250);
                avatar.setRace("Orsimer");
                avatar.setStamina(250);
                break;
            case 2:
                avatar.setCharClass("Barbarian");
                avatar.setGender("Male");
                avatar.setHealth(200);
                avatar.setLevel(81);
                avatar.setMagicka(450);
                avatar.setRace("Breton");
                avatar.setStamina(450);
                break;
            case 3:
                avatar.setCharClass("Archmage");
                avatar.setGender("Female");
                avatar.setHealth(100);
                avatar.setLevel(81);
                avatar.setMagicka(800);
                avatar.setRace("Khajiit");
                avatar.setStamina(200);
                break;
            case 4:
                avatar.setCharClass("Paladin");
                avatar.setGender("Male");
                avatar.setHealth(400);
                avatar.setLevel(81);
                avatar.setMagicka(200);
                avatar.setRace("Dunmer");
                avatar.setStamina(500);
                break;
            default:
                avatar.setCharClass("Paladin");
                avatar.setGender("Female");
                avatar.setHealth(400);
                avatar.setLevel(81);
                avatar.setMagicka(200);
                avatar.setRace("Argonian");
                avatar.setStamina(500);
                break;
        }
        avatar.checkImage();
        avatar.checkSkillSet();
        FacesContext.getCurrentInstance().renderResponse();
    }

    public  SkyrimAvatar    getAvatar   () {
        return avatar;
    }

    public void             setAvatar   (SkyrimAvatar avatar) {
        this.avatar = avatar;
    }
}