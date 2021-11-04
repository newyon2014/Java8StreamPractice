package StreamCodingSolution.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class StringArrayThatContainsPattern {
//       cmsSelector(["WordPress", "Joomla", "Drupal"], "w") ➞ ["WordPress"]
//       cmsSelector(["WordPress", "Joomla", "Drupal", "Magento"], "ru") ➞ ["Drupal"]
//       cmsSelector(["WordPress", "Joomla", "Drupal", "Magento"], "") ➞ ["Drupal", "Joomla", "Magento", "WordPress"]

    // returns the strings that contain the pattern in alphabetical order

    public static String[] cmsSelector(String[] cms, String re) {
        if (re == "")
            return Arrays.stream(cms)
                    .sorted(Comparator.naturalOrder())
                    .toArray(s -> new String[cms.length]);

        return Arrays.stream(cms)
                .filter(s -> s.toLowerCase().contains(re))
                .toArray(String[]::new);
    }

    public static String[] cmsSelector2(String[] cms, String re) {
        return re.isEmpty() ?
                Arrays.stream(cms)
                        .sorted((s1, s2) -> s1.compareToIgnoreCase(s2)) // --> Method refrence - String::compareToIgnoreCase
                        .toArray(String[]::new) :
                Arrays.stream(cms)
                        .sorted(Comparator.naturalOrder())
                        .filter(str -> str.toLowerCase().startsWith(re) || str.toLowerCase().contains(re))
                        .toArray(size -> new String[size]); // --> Method reference String[]::new
    }


}
