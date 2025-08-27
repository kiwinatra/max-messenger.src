package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: bg5  reason: default package */
public abstract class bg5 {
    public static final cg5 a = cg5.b;

    public static void a(Class cls) {
        cg5 cg5 = a;
        if (cg5.a(6)) {
            cg5.getClass();
        }
    }

    public static void b(Class cls, String str, Object... objArr) {
        cg5 cg5 = a;
        if (cg5.a(6)) {
            String.format((Locale) null, str, objArr);
            cg5.getClass();
        }
    }

    public static void c(String str) {
        cg5 cg5 = a;
        if (cg5.a(6)) {
            cg5.getClass();
        }
    }

    public static void d(String str, String str2, Throwable th) {
        cg5 cg5 = a;
        if (cg5.a(6)) {
            cg5.getClass();
            Log.getStackTraceString(th);
        }
    }

    public static boolean e(int i) {
        return a.a(i);
    }

    public static void f(Class cls, Object obj, String str) {
        cg5 cg5 = a;
        if (cg5.a(2)) {
            cls.getSimpleName();
            String.format((Locale) null, str, new Object[]{obj});
            cg5.getClass();
        }
    }

    public static void g(Class cls, String str, Object obj, Object obj2) {
        cg5 cg5 = a;
        if (cg5.a(2)) {
            cls.getSimpleName();
            String.format((Locale) null, str, new Object[]{obj, obj2});
            cg5.getClass();
        }
    }

    public static void h(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (a.a(2)) {
            String.format((Locale) null, str, new Object[]{obj, obj2, obj3});
            if (a.a(2)) {
                cls.getSimpleName();
            }
        }
    }

    public static void i(String str, Long l, Object obj, Object obj2) {
        cg5 cg5 = a;
        if (cg5.a(2)) {
            String.format((Locale) null, str, new Object[]{l, obj, obj2});
            cg5.getClass();
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        cg5 cg5 = a;
        if (cg5.a(2)) {
            String.format((Locale) null, str2, objArr);
            cg5.getClass();
        }
    }

    public static void k(Class cls, Exception exc) {
        cg5 cg5 = a;
        if (cg5.a(5)) {
            cg5.getClass();
            Log.getStackTraceString(exc);
        }
    }

    public static void l(Class cls, String str, Object... objArr) {
        cg5 cg5 = a;
        if (cg5.a(5)) {
            String.format((Locale) null, str, objArr);
            cg5.getClass();
        }
    }

    public static void m(Exception exc) {
        cg5 cg5 = a;
        if (cg5.a(5)) {
            cg5.getClass();
            Log.getStackTraceString(exc);
        }
    }

    public static void n(Exception exc, String str, Object... objArr) {
        if (a.a(5)) {
            String.format((Locale) null, str, objArr);
            k(vu0.class, exc);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        cg5 cg5 = a;
        if (cg5.a(5)) {
            String.format((Locale) null, str2, objArr);
            cg5.getClass();
        }
    }

    public static void p(String str, String str2, Object... objArr) {
        cg5 cg5 = a;
        if (cg5.a(6)) {
            String.format((Locale) null, str2, objArr);
            cg5.getClass();
        }
    }
}
