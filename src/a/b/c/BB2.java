package a.b.c;

/**
 * Created with IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 5/6/13
 * Time: 2:48 PM
 */
public class BB2 {
    private String num2;
    public static int ZOO = 1000;
    private double lang;
    private MyType1.InnerType1 inner;
    private String inner2;
    private B1 constr;
    private String[] str_array;
    private String str;

    public static Number foo(int arg){
      return arg;
  }
  public static Number getRand() {
        return 33;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getNum2() {
        return num2;
    }


    public void setLang(double lang) {
        this.lang = lang;
    }

    public double getLang() {
        return lang;
    }

    public void setInner(MyType1.InnerType1 inner) {
        this.inner = inner;
    }

    public MyType1.InnerType1 getInner() {
        return inner;
    }

    public void setInner2(String inner2) {
        this.inner2 = inner2;
    }

    public String getInner2() {
        return inner2;
    }

    public void setConstr(B1 constr) {
        this.constr = constr;
    }

    public B1 getConstr() {
        return constr;
    }

    public void setStr__array(String[] str_array) {
        this.str_array = str_array;
    }

    public String[] getStr__array() {
        return str_array;
    }

    public void setMmm(String str) {
        this.str = str;
    }

    public String getMmm() {
        return str;
    }
}
