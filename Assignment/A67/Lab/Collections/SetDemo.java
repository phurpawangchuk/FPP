package A67.Lab.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class SetDemo {
        public static void main(String[] args) {
            //Do not gurantee the ordering, Duplicate is removed
            Set<String> sets = new HashSet<>();
            sets.add("Phurpa");
            sets.add("Karma");
            sets.add("Sonam");
            sets.add("Dawa");
            sets.add("Pema");
            sets.add("Phurpa");

            System.out.println(sets);

            List<String> names = new ArrayList<>();
            names.add("Phurpa");
            names.add("Karma");
            names.add("Sonam");
            names.add("Dawa");
            names.add("Pema");
            names.add("Phurpa");

            Set<String> stringSet = new HashSet<>(names);
            System.out.println(stringSet);
        }
}
