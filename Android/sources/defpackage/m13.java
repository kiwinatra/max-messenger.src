package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m13  reason: default package */
public final class m13 {
    public static final m13 c = new m13();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, l13 l13, hu7 hu7, Class cls) {
        hu7 hu72 = (hu7) hashMap.get(l13);
        if (hu72 != null && hu7 != hu72) {
            Method method = l13.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + hu72 + ", new value " + hu7);
        } else if (hu72 == null) {
            hashMap.put(l13, hu7);
        }
    }

    public final k13 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            k13 k13 = (k13) hashMap2.get(superclass);
            if (k13 == null) {
                k13 = a(superclass, (Method[]) null);
            }
            hashMap.putAll(k13.b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            k13 k132 = (k13) hashMap2.get(cls2);
            if (k132 == null) {
                k132 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : k132.b.entrySet()) {
                b(hashMap, (l13) entry.getKey(), (hu7) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            mma mma = (mma) method.getAnnotation(mma.class);
            if (mma != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (jv7.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                hu7 value = mma.value();
                if (parameterTypes.length > 1) {
                    if (!hu7.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == hu7.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new l13(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        k13 k133 = new k13(hashMap);
        hashMap2.put(cls, k133);
        this.b.put(cls, Boolean.valueOf(z));
        return k133;
    }
}
