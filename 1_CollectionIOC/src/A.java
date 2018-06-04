import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/12.
 */
public class A {
    private List<B> bList;
    private Map<String,Object> map;
    private Set<B> bSet;

    public List<B> getbList() {
        return bList;
    }

    public void setbList(List<B> bList) {
        this.bList = bList;
    }

    public Set<B> getbSet() {
        return bSet;
    }

    public void setbSet(Set<B> bSet) {
        this.bSet = bSet;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
