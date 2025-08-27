package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: mm7  reason: default package */
public final class mm7 extends wnb {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public mm7(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((y8c) next) != y8c.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y8c) it.next()).a);
        }
        try {
            this.c.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(wnb.class.getClassLoader(), new Class[]{this.f, this.g}, new lm7(arrayList2))});
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                lm7 lm7 = (lm7) invocationHandler;
                boolean z = lm7.a;
                if (!z && lm7.b == null) {
                    wnb.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return lm7.b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
