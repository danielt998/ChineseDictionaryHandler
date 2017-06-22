package DictionaryHandler;

public class Word{
  public Word(){}
  public Word(String givenTrad, String givenSimp,String givenPinyin, String givenPinTones,
                                                                             String givenDef){
    trad=givenTrad;
    simp=givenSimp;
    pinyin=givenPinyin;
    pinTones=givenPinTones;
    def=givenDef;
  }
  private String trad,simp,pinyin,pinTones,def;
  private final int LARGE_PRIME_NUMBER=65729;

  public String getTraditionalChinese(){
    return trad;
  }
  public String getSimplifiedChinese(){
    return simp;
  }
  public String getPinyinNoTones(){
    return pinyin;
  }
  public String getPinyinWithTones(){
    return pinTones;
  }
  public String getDefinition(){
    return def;
  }
  public void setTraditionalChinese (String given){
    trad=given;
  }
  public void setSimplifiedChinese (String given){
    simp=given;
  }
  public void setPinyinNoTones (String given){
    pinyin=given;
  }
  public void setPinyinWithTones (String given){
    pinTones=given;
  }
  public void setDefinition (String given){
    def=given;
  }
  //not sure this makes any difference 
  @Override
  public int hashCode(){
    return simp.hashCode();
  }
}

