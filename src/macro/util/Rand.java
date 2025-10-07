package macro.util;

import java.util.List;
import java.util.Random;

public final class Rand {
    private static final Random R = new Random();
    private Rand() {}
    public static <T> T pick(List<T> list) {
        if (list.isEmpty()) throw new IllegalStateException("No valid options for this diet");
        return list.get(R.nextInt(list.size()));
    }
}
