import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword implements Valid{
    @Override
    public boolean valid(String password) {
        Pattern pattern = Pattern.compile("^(.{4,12})([^!@#$%^&*])$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
