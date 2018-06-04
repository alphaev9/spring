import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * PropertyEditorSupport提供了PropertyEditor接口的基本实现
 */
public class myDatePropertyEditor extends PropertyEditorSupport {
    private String format = "yyyy-MM-dd";

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("UtilDatePropertyEditor.saveAsText() -- text=" + text);

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date d = sdf.parse(text);
            this.setValue(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
