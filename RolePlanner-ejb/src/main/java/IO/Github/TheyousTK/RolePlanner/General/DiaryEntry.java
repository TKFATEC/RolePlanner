/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package IO  .Github .TheyousTK      .RolePlanner.General;

import  java.io     .Serializable;

/**
 *  @version    0.0.0.A;
 *  @author     Theyous <Theyous @ TheyousTK.Github.IO>;
 */

public  class   DiaryEntry    implements  Serializable {
    private static  final   long    serialVersionUID    = 0xCC0001L;
    private                 int     chapterNumber;
    private                 String  chapterName;
    private                 String  chapterValue;

    public  int     getChapterNumber() {
        return  chapterNumber;
    }

    public  String  getChapterName  () {
        return  chapterName;
    }

    public  String  getChapterValue () {
        return  chapterValue;
    }

    public  void    setChapterNumber(int chapterNumber) {
        this.chapterNumber  = chapterNumber;
    }

    public  void    setChapterName  (String chapterName) {
        this.chapterName    = chapterName;
    }

    public  void    setChapterValue (String chapterValue) {
        this.chapterValue   = chapterValue;
    }
}