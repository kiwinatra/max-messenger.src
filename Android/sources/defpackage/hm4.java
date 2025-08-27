package defpackage;

import android.net.Uri;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* renamed from: hm4  reason: default package */
public final class hm4 implements wl {
    public final /* synthetic */ int a;
    public final xl b;
    public final ee5 c;
    public final Provider d;
    public volatile boolean e;
    public final Object f;
    public final Object g;

    public hm4(k47 k47, fx fxVar, tm tmVar, Provider provider) {
        this.a = 1;
        this.b = k47;
        this.c = fxVar;
        this.f = tmVar;
        this.d = provider;
        this.g = new ReentrantLock();
    }

    public final Object a(am amVar) {
        ReentrantLock reentrantLock;
        switch (this.a) {
            case 0:
                oid c2 = this.c.c();
                String str = c2.a.d;
                try {
                    if (this.e || str == null) {
                        synchronized (this.g) {
                            if (this.e || str == null) {
                                c(c2, str);
                            }
                        }
                    }
                    return ((k47) this.b).a(amVar, this.c.c().a);
                } catch (ApiInvocationException e2) {
                    if (amVar.getScopeAfter() != nm.a || !vzg.x(e2)) {
                        throw e2;
                    }
                    ee5 ee5 = this.c;
                    oid c3 = ee5.c();
                    c(c3, c3.a.d);
                    return ((k47) this.b).a(amVar, ee5.c().a);
                } catch (ApiScopeException unused) {
                    ee5 ee52 = this.c;
                    oid c4 = ee52.c();
                    c(c4, c4.a.d);
                    return ((k47) this.b).a(amVar, ee52.c().a);
                }
            default:
                oid c5 = this.c.c();
                String str2 = c5.a.d;
                try {
                    reentrantLock = (ReentrantLock) this.g;
                    reentrantLock.lock();
                    if (this.e || str2 == null) {
                        b(c5, str2);
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    return ((k47) this.b).a(amVar, this.c.c().a);
                } catch (ApiInvocationException e3) {
                    if (amVar.getScopeAfter() != nm.a || !vzg.x(e3)) {
                        throw e3;
                    }
                    ee5 ee53 = this.c;
                    oid c6 = ee53.c();
                    b(c6, c6.a.d);
                    return ((k47) this.b).a(amVar, ee53.c().a);
                } catch (ApiScopeException unused2) {
                    ee5 ee54 = this.c;
                    oid c7 = ee54.c();
                    b(c7, c7.a.d);
                    return ((k47) this.b).a(amVar, ee54.c().a);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    public void b(oid oid, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            if (!Intrinsics.areEqual((Object) str, (Object) this.c.c().a.d)) {
                if (this.e) {
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            }
            sm e2 = ((tm) this.f).e();
            oid d2 = oid.d(Uri.parse(e2.b));
            this.c.d(d2);
            d(d2, e2.a);
            Unit unit2 = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void c(oid oid, String str) {
        synchronized (this.g) {
            try {
                if (Objects.equals(str, this.c.c().a.d)) {
                    aqg aqg = new aqg((hm) new y80(((bmf) this.f).a(), (String) this.d.get()), (op7) g98.g);
                    g98 g98 = (g98) ((k47) this.b).a(aqg, oid.a);
                    this.c.d(oid.c(g98.b, g98.c));
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(oid oid, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            aqg aqg = new aqg((hm) new y80(str, (String) this.d.get()), (op7) g98.g);
            g98 g98 = (g98) ((k47) this.b).a(aqg, oid.a);
            this.c.d(oid.c(g98.b, g98.c));
            this.e = false;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public hm4(k47 k47, gm4 gm4, bmf bmf, Provider provider) {
        this.a = 0;
        this.g = new Object();
        this.e = false;
        this.b = k47;
        this.c = gm4;
        this.f = bmf;
        this.d = provider;
    }
}
