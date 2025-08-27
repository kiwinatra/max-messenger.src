package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qdd  reason: default package */
public abstract class qdd {
    public static final List a;
    public static final List b;

    static {
        Class<hdd> cls = hdd.class;
        a = CollectionsKt.listOf(Application.class, cls);
        b = CollectionsKt.listOf(cls);
    }

    public static final Constructor a(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            List list2 = ArraysKt.toList((T[]) constructor.getParameterTypes());
            if (Intrinsics.areEqual((Object) list, (Object) list2)) {
                return constructor;
            }
            if (list.size() != list2.size() || !list2.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final yag b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (yag) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
