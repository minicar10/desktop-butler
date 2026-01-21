package com.butler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class FileWatcherTest {
    @Test
    public void testRegexCategorization() {
        // Validates the Regular Expression logic mentioned in the GUI section
        String pattern = "^CS\\d{3}_.*\\.pdf$";
        String fileName = "CS373_Homework1.pdf";
        assertTrue(Pattern.matches(pattern, fileName));
    }
}
