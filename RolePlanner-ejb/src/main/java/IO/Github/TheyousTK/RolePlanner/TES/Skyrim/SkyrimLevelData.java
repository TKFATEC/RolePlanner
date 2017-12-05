/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package IO.Github.TheyousTK.RolePlanner.TES.Skyrim;

import  java.io     .Serializable;

/**
 *  @version    0.0.0.A;
 *  @author     Theyous <Theyous @ TheyousTK.Github.IO>;
 */

public  class   SkyrimLevelData    implements  Serializable {
    private static  final   long    serialVersionUID    = 0xCC0002L;
    private                 int     level;
    private                 String  perk;
    private                 String  attribute;

    public  int     getLevel        () {
        return  level;
    }

    public  String  getPerk         () {
        return  perk;
    }

    public  String  getAttribute    () {
        return  attribute;
    }

    public  void    setLevel    (int level) {
        this.level      = level;
    }

    public  void    setPerk     (String perk) {
        this.perk       = perk;
    }

    public  void    setAttribute(String attribute) {
        this.attribute  = attribute;
    }
}
