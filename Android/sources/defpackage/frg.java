package defpackage;

import java.util.Random;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: frg  reason: default package */
public final class frg implements sk4 {
    public final /* synthetic */ int a;
    public final String b;

    public frg() {
        this.a = 1;
        this.b = "com.google.android.gms.org.conscrypt";
    }

    public static Object c(String str) {
        ClassLoader classLoader = frg.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get((Object) null);
    }

    public static frg d() {
        boolean z;
        synchronized (l5a.class) {
            z = l5a.a;
        }
        if (z || l5a.class.getClassLoader() == ClassLoader.getSystemClassLoader()) {
            try {
                synchronized (frg.class) {
                    f("JNI");
                    throw null;
                }
            } catch (Throwable unused) {
                e();
                throw null;
            }
        } else {
            e();
            throw null;
        }
    }

    public static frg e() {
        if (!w0g.b) {
            synchronized (frg.class) {
                f("JavaSafe");
                throw null;
            }
        }
        try {
            synchronized (frg.class) {
                f("JavaUnsafe");
                throw null;
            }
        } catch (Throwable unused) {
            synchronized (frg.class) {
                f("JavaSafe");
                throw null;
            }
        }
    }

    public static void f(String str) {
        try {
            new frg(str, 0);
            throw null;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return StringsKt__StringsJVMKt.startsWith$default(name, this.b + '.', false, 2, (Object) null);
    }

    public ofe b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual((Object) cls2.getSimpleName(), (Object) "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new re(cls2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return frg.class.getSimpleName() + ":" + this.b;
            case 2:
                return "TracerFeature::" + this.b;
            default:
                return super.toString();
        }
    }

    public frg(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = str;
                return;
            default:
                this.b = str;
                rae.w(c("net.jpountz.xxhash.XXHash32".concat(str)));
                rae.w(c("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory"));
                rae.w(c("net.jpountz.xxhash.XXHash64".concat(str)));
                rae.w(c("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory"));
                Random random = new Random();
                random.nextBytes(new byte[100]);
                random.nextInt();
                throw null;
        }
    }
}
