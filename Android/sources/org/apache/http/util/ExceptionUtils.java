package org.apache.http.util;

import java.lang.reflect.Method;

@Deprecated
public final class ExceptionUtils {
    private static final Method INIT_CAUSE_METHOD = getInitCauseMethod();

    private ExceptionUtils() {
    }

    private static Method getInitCauseMethod() {
        Class<Throwable> cls = Throwable.class;
        try {
            return cls.getMethod("initCause", new Class[]{cls});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void initCause(Throwable th, Throwable th2) {
        Method method = INIT_CAUSE_METHOD;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
    }
}
