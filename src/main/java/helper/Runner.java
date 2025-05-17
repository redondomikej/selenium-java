/*
✅ Option 1: Use class name directly (recommended for clarity)
package helper;
import Utils.debug;

public class Runner {
    public static void main(String[] args) {
        debug.log("Hello world!");
    }
}
*/

//✅ Option 2: Use static import (for shorter calls)
package helper;

import static Utils.debug.log;

public class Runner {
    public static void main(String[] args) {
        log("Hello world!");
    }
}
