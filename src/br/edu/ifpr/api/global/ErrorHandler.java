package br.edu.ifpr.api.global;

public final class ErrorHandler {
    public static boolean NULLPARAM = false;

    public static void warn(String message, String errType) {
        if(GlobalFlags.VERBOSE) System.err.println("WARN: " + message + "\nvia " + getCallerMethodName());
        setFlag(errType);
    }

    private static void setFlag(String flagName) {
        switch( flagName ) {
            case "nullparam" -> NULLPARAM = true;

            default -> throw new Error("Unreachable [" + flagName + ']');
        }
    }

    // https://stackoverflow.com/questions/4065518/java-how-to-get-the-caller-function-name
    private static String getCallerMethodName()
    {
        return StackWalker.
            getInstance().
            walk(stream -> stream.skip(1).findFirst().get()).
            getMethodName();
    }
}