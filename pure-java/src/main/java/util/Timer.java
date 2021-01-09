package util;

public class Timer {
    public static long checkNanoTime(CodeBlock codeBlock) {
        long startTime = System.nanoTime();
        codeBlock.doSomething();
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long checkMilliTime(CodeBlock codeBlock) {
        return checkNanoTime(codeBlock) / 1_000_000L;
    }
}
