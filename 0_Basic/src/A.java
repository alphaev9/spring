/**
 * Created by Administrator on 2017/5/12.
 */
public class A {
    private String s;
    private Integer n;
    private boolean flag;
    private B b;
    private Gender gender;

    public A(String s, Integer n, boolean flag, B b) {
        this.s = s;
        this.n = n;
        this.flag = flag;
        this.b = b;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
