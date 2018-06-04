import org.springframework.core.convert.converter.Converter;

/**
 * Created by Administrator on 2017/5/12.
 */
public class C2BConvert implements Converter<C,B> {
    @Override
    public B convert(C c) {
        System.out.println("convert is working.....");
        B b = new B();
        b.setS(c.getN().toString());
        return b;
    }
}
