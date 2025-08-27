package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gl  reason: default package */
public abstract class gl {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(Class cls, HashMap hashMap, HashMap hashMap2) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge()) {
                if (method.isAnnotationPresent(oye.class)) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        Class cls2 = parameterTypes[0];
                        if (cls2.isInterface()) {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " which is an interface.  Subscription must be on a concrete class type.");
                        } else if ((1 & method.getModifiers()) != 0) {
                            Set set = (Set) hashMap2.get(cls2);
                            if (set == null) {
                                set = new HashSet();
                                hashMap2.put(cls2, set);
                            }
                            set.add(method);
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " but is not 'public'.");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Method ");
                        sb.append(method);
                        sb.append(" has @Subscribe annotation but requires ");
                        throw new IllegalArgumentException(wj6.l(sb, parameterTypes.length, " arguments.  Methods must require a single argument."));
                    }
                } else if (method.isAnnotationPresent(uvb.class)) {
                    Class[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length != 0) {
                        StringBuilder sb2 = new StringBuilder("Method ");
                        sb2.append(method);
                        sb2.append("has @Produce annotation but requires ");
                        throw new IllegalArgumentException(wj6.l(sb2, parameterTypes2.length, " arguments.  Methods must require zero arguments."));
                    } else if (method.getReturnType() != Void.class) {
                        Class<?> returnType = method.getReturnType();
                        if (returnType.isInterface()) {
                            throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " which is an interface.  Producers must return a concrete class type.");
                        } else if (returnType.equals(Void.TYPE)) {
                            throw new IllegalArgumentException("Method " + method + " has @Produce annotation but has no return type.");
                        } else if ((1 & method.getModifiers()) == 0) {
                            throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " but is not 'public'.");
                        } else if (!hashMap.containsKey(returnType)) {
                            hashMap.put(returnType, method);
                        } else {
                            throw new IllegalArgumentException("Producer for type " + returnType + " has already been registered.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + " has a return type of void.  Must declare a non-void type.");
                    }
                } else {
                    continue;
                }
            }
        }
        a.put(cls, hashMap);
        b.put(cls, hashMap2);
    }
}
