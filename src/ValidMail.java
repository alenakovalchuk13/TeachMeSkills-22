import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMail implements Valid{
    @Override
    public boolean valid(String mail) {
        Pattern pattern = Pattern.compile("/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+$/");
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
}
