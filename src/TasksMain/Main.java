package TasksMain;
import java.io.IOException;

import static TasksMain.Document.*;

public class Main {
    public static void main(String[] args) {
        String string = "5467-hgf-9845-kju-1a2b";

        try {
            check(string);
        } catch (ExceptionABC e) {
            e.getStackTrace();
        }

        try {
            check555(string);
        } catch (Exception555 e) {
            e.getStackTrace();
        }

        try {
            check1a2b(string);
        } catch (Exception1a2b e) {
            e.getStackTrace();

        }
        }
    }

