/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package IO  .Github .TheyousTK      .RolePlanner.TES    .Skyrim;

import  IO  .Github .TheyousTK      .RolePlanner.General.DiaryEntry;
import  java.io     .Serializable;
import  java.util   .ArrayList;
import  java.util   .List;

/**
 *  @version    0.0.0.A;
 *  @author     Theyous <Theyous @ TheyousTK.Github.IO>;
 */

public  class   SkyrimAvatar    implements  Serializable {
    private static  final   long                    serialVersionUID    = 0xCC0000L;
    private                 String                  avatarName;
    private                 String                  charClass;
    private                 String                  gender;
    private                 String                  image;
    private                 String                  skill1;
    private                 String                  skill2;
    private                 String                  skill3;
    private                 String                  skill4;
    private                 String                  skill5;
    private                 String                  skill6;
    private                 int                     level;
    private                 int                     magicka;
    private                 int                     health;
    private                 int                     stamina;
    private                 String                  race;
    private                 String                  stoneGuardian;
    private                 List<DiaryEntry>        diary               = new ArrayList<> ();
    private                 List<SkyrimLevelData>   levelData           = new ArrayList<> ();
    
    public  SkyrimAvatar () {
        this.avatarName     = "[Insert the name here.]";
        this.charClass      = "Archer";
        this.gender         = "Male";
        this.image          = "http://images.uesp.net//thumb/b/b6/SR-race-M-Altmer.jpg/426px-SR-race-M-Altmer.jpg";
        this.skill1         = "Archery";
        this.skill2         = "Light_Armor";
        this.skill3         = "Lockpicking";
        this.skill4         = "Restoration";
        this.skill5         = "Speech";
        this.skill6         = "Smithing";
        this.level          = 1;
        this.magicka        = 100;
        this.health         = 100;
        this.stamina        = 100;
        this.race           = "Argonian";
        this.stoneGuardian  = "Apprentice";
        DiaryEntry      intro   = new DiaryEntry ();
            intro.setChapterNumber(0);
            intro.setChapterName("The Dovahkiin Rises");
            intro.setChapterValue(
                "This is an example of a description of a unknown adventurer across Tamriel."
            );
        DiaryEntry      chapter = new DiaryEntry ();
            chapter.setChapterNumber(1);
            chapter.setChapterName("The Unknown Chapter");
            chapter.setChapterValue("This is an example of a random chapter in this tale.");
        this.diary.add(intro);
        this.diary.add(chapter);
        SkyrimLevelData data    = new SkyrimLevelData ();
            data.setLevel(1);
            data.setAttribute("Initialization");
            data.setPerk("Initialization");
    }
    
    public  String  checkImage      () {
        if (gender.equals("Male")) {
            if (race.equals("Altmer")) {
                return  "http://images.uesp.net//thumb/b/b6/SR-race-M-Altmer.jpg/426px-SR-race-M-Altmer.jpg";
            } else if (race.equals("Argonian")) {
                return  "http://images.uesp.net//thumb/f/fa/SR-race-M-Argonian.jpg/444px-SR-race-M-Argonian.jpg";
            } else if (race.equals("Bosmer")) {
                return  "http://images.uesp.net//thumb/4/4b/SR-race-M-Bosmer.jpg/427px-SR-race-M-Bosmer.jpg";
            } else if (race.equals("Breton")) {
                return  "http://images.uesp.net//thumb/2/21/SR-race-M-Breton.jpg/425px-SR-race-M-Breton.jpg";
            } else if (race.equals("Dunmer")) {
                return  "http://images.uesp.net//thumb/0/0a/SR-race-M-Dunmer.jpg/435px-SR-race-M-Dunmer.jpg";
            } else if (race.equals("Imperial")) {
                return  "http://images.uesp.net//thumb/9/9e/SR-race-M-Imperial.jpg/430px-SR-race-M-Imperial.jpg";
            } else if (race.equals("Khajiit")) {
                return  "http://images.uesp.net//thumb/e/eb/SR-race-M-Khajiit.jpg/421px-SR-race-M-Khajiit.jpg";
            } else if (race.equals("Nord")) {
                return  "http://images.uesp.net//thumb/a/a1/SR-race-M-Nord.jpg/428px-SR-race-M-Nord.jpg";
            } else if (race.equals("Orsimer")) {
                return  "http://images.uesp.net//thumb/7/7d/SR-race-M-Orc.jpg/438px-SR-race-M-Orc.jpg";
            } else if (race.equals("Redguard")) {
                return  "http://images.uesp.net//thumb/f/f2/SR-race-M-Redguard.jpg/425px-SR-race-M-Redguard.jpg";
            }
        } else {
            if (race.equals("Altmer")) {
                return  "http://images.uesp.net//thumb/b/b9/SR-race-F-Altmer.jpg/451px-SR-race-F-Altmer.jpg";
            } else if (race.equals("Argonian")) {
                return  "http://images.uesp.net//thumb/6/6e/SR-race-F-Argonian.jpg/422px-SR-race-F-Argonian.jpg";
            } else if (race.equals("Bosmer")) {
                return  "http://images.uesp.net//thumb/b/b0/SR-race-F-Bosmer.jpg/431px-SR-race-F-Bosmer.jpg";
            } else if (race.equals("Breton")) {
                return  "http://images.uesp.net//thumb/b/b5/SR-race-F-Breton.jpg/419px-SR-race-F-Breton.jpg";
            } else if (race.equals("Dunmer")) {
                return  "http://images.uesp.net//thumb/1/17/SR-race-F-Dunmer.jpg/438px-SR-race-F-Dunmer.jpg";
            } else if (race.equals("Imperial")) {
                return  "http://images.uesp.net//thumb/2/2a/SR-race-F-Imperial.jpg/436px-SR-race-F-Imperial.jpg";
            } else if (race.equals("Khajiit")) {
                return  "http://images.uesp.net//thumb/c/ca/SR-race-F-Khajiit.jpg/423px-SR-race-F-Khajiit.jpg";
            } else if (race.equals("Nord")) {
                return  "http://images.uesp.net//thumb/4/4e/SR-race-F-Nord.jpg/424px-SR-race-F-Nord.jpg";
            } else if (race.equals("Orsimer")) {
                return  "http://images.uesp.net//thumb/5/54/SR-race-F-Orc.jpg/424px-SR-race-F-Orc.jpg";
            } else if (race.equals("Redguard")) {
                return  "http://images.uesp.net//thumb/8/84/SR-race-F-Redguard.jpg/424px-SR-race-F-Redguard.jpg";
            }
        }
        return  "";
    }
    
    public  void    checkSkillSet   () {
        switch (charClass) {
            case "Archer":
                this.setSkill1("Archery");
                this.setSkill2("Light_Armor");
                this.setSkill3("Lockpicking");
                this.setSkill4("Restoration");
                this.setSkill5("Speech");
                this.setSkill6("Smithing");
                break;
            case "Archmage":
                this.setSkill1("Alteration");
                this.setSkill2("Conjuration");
                this.setSkill3("Destruction");
                this.setSkill4("Enchanting");
                this.setSkill5("Illusion");
                this.setSkill6("Restoration");
                break;
            case "Archpriest":
                this.setSkill1("Alchemy");
                this.setSkill2("Alteration");
                this.setSkill3("Destruction");
                this.setSkill4("Enchanting");
                this.setSkill5("Illusion");
                this.setSkill6("Restoration");
                break;
            case "Barbarian":
                this.setSkill1("Archery");
                this.setSkill2("Destruction");
                this.setSkill3("Heavy_Armor");
                this.setSkill4("Enchanting");
                this.setSkill5("One_Handed");
                this.setSkill6("Two_Handed");
                break;
            case "Battlemage":
                this.setSkill1("Destruction");
                this.setSkill2("Conjuration");
                this.setSkill3("Enchanting");
                this.setSkill4("Heavy_Armor");
                this.setSkill5("One_Handed");
                this.setSkill6("Restoration");
            case "Conjurer":
                this.setSkill1("Alteration");
                this.setSkill2("Conjuration");
                this.setSkill3("Destruction");
                this.setSkill4("Illusion");
                this.setSkill5("Sneak");
                this.setSkill6("Speech");
            case "Paladin":
                this.setSkill1("Alchemy");
                this.setSkill2("Block");
                this.setSkill3("Enchanting");
                this.setSkill4("Heavy_Armor");
                this.setSkill5("One_Handed");
                this.setSkill6("Restoration");
            default:
                this.setSkill1("Alchemy");
                this.setSkill2("Archery");
                this.setSkill3("Enchanting");
                this.setSkill4("Light_Armor");
                this.setSkill5("Smithing");
                this.setSkill6("Sneak");
                break;
        }
    }

    public  String                  getAvatarName   () {
        return  avatarName;
    }
    
    public  String                  getCharClass    () {
        return  charClass;
    }
    
    public  String                  getGender       () {
        return  gender;
    }

    public  String                  getImage        () {
        return  image;
    }

    public  String                  getSkill1       () {
        return  skill1;
    }
    
    public  String                  getSkill2       () {
        return  skill2;
    }
    
    public  String                  getSkill3       () {
        return  skill3;
    }
    
    public  String                  getSkill4       () {
        return  skill4;
    }
    
    public  String                  getSkill5       () {
        return  skill5;
    }
    
    public  String                  getSkill6       () {
        return  skill6;
    }

    public  int                     getLevel        () {
        return  level;
    }

    public  int                     getMagicka      () {
        return  magicka;
    }

    public  int                     getHealth       () {
        return  health;
    }

    public  int                     getStamina      () {
        return  stamina;
    }

    public  String                  getRace         () {
        return  race;
    }
    
    public  String                  getStoneGuardian() {
        return  stoneGuardian;
    }

    public  List<DiaryEntry>        getDiary        () {
        return diary;
    }

    public  List<SkyrimLevelData>   getLevelData() {
        return  levelData;
    }

    public  void    setAvatarName   (String avatarName) {
        this.avatarName     = avatarName;
    }
    
    public  void    setCharClass    (String charClass) {
        this.charClass      = charClass;
    }
    
    public  void    setGender       (String gender) {
        this.gender         = gender;
    }

    public  void    setImage        (String image) {
        this.image          = image;
    }

    public  void    setSkill1       (String skill1) {
        this.skill1         = skill1;
    }
    
    public  void    setSkill2       (String skill2) {
        this.skill2         = skill2;
    }
    
    public  void    setSkill3       (String skill3) {
        this.skill3         = skill3;
    }
    
    public  void    setSkill4       (String skill4) {
        this.skill4         = skill4;
    }
    
    public  void    setSkill5       (String skill5) {
        this.skill5         = skill5;
    }
    
    public  void    setSkill6       (String skill6) {
        this.skill6         = skill6;
    }

    public  void    setLevel        (int level) {
        this.level          = level;
    }

    public  void    setMagicka      (int magicka) {
        this.magicka        = magicka;
    }

    public  void    setHealth       (int health) {
        this.health         = health;
    }

    public  void    setStamina      (int stamina) {
        this.stamina        = stamina;
    }

    public  void    setRace         (String race) {
        this.race           = race;
    }
    
    public  void    setStoneGuardian(String stoneGuardian) {
        this.stoneGuardian  = stoneGuardian;
    }

    public  void    setDiary        (List<DiaryEntry> diary) {
        this.diary          = diary;
    }

    public  void    setLevelData    (List<SkyrimLevelData> levelData) {
        this.levelData      = levelData;
    }
}