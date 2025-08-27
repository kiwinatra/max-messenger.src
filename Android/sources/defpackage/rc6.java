package defpackage;

import androidx.fragment.app.a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: rc6  reason: default package */
public abstract class rc6 {
    public static final qae a = new qae();

    public static Class b(ClassLoader classLoader, String str) {
        qae qae = a;
        qae qae2 = (qae) qae.get(classLoader);
        if (qae2 == null) {
            qae2 = new qae();
            qae.put(classLoader, qae2);
        }
        Class cls = (Class) qae2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        qae2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    public a a(ClassLoader classLoader, String str) {
        try {
            return (a) c(classLoader, str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
