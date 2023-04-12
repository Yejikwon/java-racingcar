package stringcalculator;

import java.util.HashSet;
import java.util.Set;

import static stringcalculator.Delimiter.*;

public class Delimiters {
    private static final int CUSTOM_DELIMITER_INDEX = 2;
    private final Set<String> delimiters = new HashSet<>();

    private Delimiters(String text) {
        initializeDelimiters();
        addCustomDelimiter(text);
    }

    public static Delimiters of(String text) {
        return new Delimiters(text);
    }

    private void addCustomDelimiter(String text) {
        if (containsCustomDelimiter(text)) {
            final String customDelimiter = String.valueOf(text.charAt(CUSTOM_DELIMITER_INDEX));
            delimiters.add(customDelimiter);
        }
    }

    public boolean containsDelimiters() {
        return !delimiters.isEmpty();
    }

    private void initializeDelimiters() {
        delimiters.add(COMMA.getValue());
        delimiters.add(COLON.getValue());
    }

    public Set<String> getDelimiters() {
        return new HashSet<>(delimiters);
    }
}