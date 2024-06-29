package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time complexity O()
 * Space complexity O()
 * Author: Sergey.
 */
public class Test {

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("DSF_ONBOARDING_DC1", "DSF_ONBOARDING_DC2");
        List<String> mappedStrs = new ArrayList<>();
        for (String str : strs) {
            String mappedStr = MyEnum.map(str);
            mappedStrs.add(mappedStr);
        }
        System.out.println(mappedStrs); // Output: [ONBOARDING_CLIENT, ONBOARDING_CR]
    }
}

enum MyEnum {
    DSF_ONBOARDING_DC1("ONBOARDING_CLIENT"),
    DSF_ONBOARDING_DC2("ONBOARDING_CR");

    private final String value;

    MyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static String map(String input) {
        for (MyEnum e : MyEnum.values()) {
            if (e.name().equals(input)) {
                return e.getValue();
            }
        }
        return null;
    }
}



