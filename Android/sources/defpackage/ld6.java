package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ld6  reason: default package */
public abstract class ld6 {
    public static final kd6 a = kd6.c;

    public static kd6 a(a aVar) {
        while (aVar != null) {
            if (aVar.a2()) {
                aVar.Q1();
            }
            aVar = aVar.G0;
        }
        return a;
    }

    public static void b(kd6 kd6, Violation violation) {
        a aVar = violation.a;
        String name = aVar.getClass().getName();
        jd6 jd6 = jd6.a;
        Set set = kd6.a;
        set.contains(jd6);
        if (set.contains(jd6.b)) {
            y86 y86 = new y86(name, violation);
            if (aVar.a2()) {
                Handler handler = aVar.Q1().w.x0;
                if (!Intrinsics.areEqual((Object) handler.getLooper(), (Object) Looper.myLooper())) {
                    handler.post(y86);
                    return;
                }
                throw violation;
            }
            throw violation;
        }
    }

    public static void c(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            violation.a.getClass();
        }
    }

    public static final void d(a aVar, String str) {
        Violation violation = new Violation(aVar, "Attempting to reuse fragment " + aVar + " with previous ID " + str);
        c(violation);
        kd6 a2 = a(aVar);
        if (a2.a.contains(jd6.c) && e(a2, aVar.getClass(), FragmentReuseViolation.class)) {
            b(a2, violation);
        }
    }

    public static boolean e(kd6 kd6, Class cls, Class cls2) {
        Set set = (Set) kd6.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual((Object) cls2.getSuperclass(), (Object) Violation.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
