/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package IO.Github.TheyousTK.RolePlanner.TES.Skyrim;

import  java.io     .Serializable;

/**
 *  @version    0.0.0.A;
 *  @author     Theyous <Theyous @ TheyousTK.Github.IO>;
 */

public  class   SkyrimPerk    implements  Serializable {
    private static  final   long            serialVersionUID    = 0xCC0004L;
    private                 String          name;
    private                 int             levels;
    private                 int             activeLevels        = 0;
    private                 boolean         active              = false;

    public  String  getName         () {
        return  name;
    }

    public  int     getLevels       () {
        return  levels;
    }

    public  int     getActiveLevels () {
        return  activeLevels;
    }

    public  boolean isActive        () {
        return  active;
    }

    public  void    setName         (String name) {
        this.name = name;
    }

    public  void    setLevels       (int levels) {
        this.levels = levels;
    }

    public  void    setActiveLevels (int activeLevels) {
        this.activeLevels = activeLevels;
    }

    public  void    setActive       (boolean active) {
        this.active = active;
    }
}