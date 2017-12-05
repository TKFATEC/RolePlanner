/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package IO  .Github .TheyousTK      .RolePlanner.TES.Skyrim;

import  java.io     .Serializable;
import  java.util   .ArrayList;
import  java.util   .List;

/**
 *  @version    0.0.0.A;
 *  @author     Theyous <Theyous @ TheyousTK.Github.IO>;
 */

public  class   SkyrimSkillTree    implements  Serializable {
    private static  final   long                serialVersionUID    = 0xCC0003L;
    private                 List<SkyrimPerk>    perks               = new ArrayList<> ();
    
    public  SkyrimSkillTree () {
        
    }

    public  List<SkyrimPerk>    getPerks    () {
        return  perks;
    }

    public  void                setPerks    (List<SkyrimPerk> perks) {
        this.perks  = perks;
    }
}