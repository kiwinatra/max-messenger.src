package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements ql {
    public static final tj5[] H0 = new tj5[0];
    public volatile String A0;
    public bi3 B0;
    public boolean C0;
    public volatile h5h D0;
    public final AtomicInteger E0;
    public final Set F0;
    public final Account G0;
    public IInterface X;
    public final ArrayList Y;
    public m1h Z;
    public volatile String a;
    public a7d b;
    public final Context c;
    public final d7h o;
    public final syg v;
    public int v0;
    public final Object w;
    public final ykb w0;
    public final Object x;
    public final xga x0;
    public hxg y;
    public final int y0;
    public lj0 z;
    public final String z0;

    public a(Context context, Looper looper, int i, b33 b33, ft6 ft6, gt6 gt6) {
        synchronized (d7h.h) {
            try {
                if (d7h.i == null) {
                    d7h.i = new d7h(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        d7h d7h = d7h.i;
        Object obj = dt6.c;
        vzg.m(ft6);
        vzg.m(gt6);
        ykb ykb = new ykb(14, ft6);
        xga xga = new xga(14, gt6);
        this.a = null;
        this.w = new Object();
        this.x = new Object();
        this.Y = new ArrayList();
        this.v0 = 1;
        this.B0 = null;
        this.C0 = false;
        this.D0 = null;
        this.E0 = new AtomicInteger(0);
        vzg.n(context, "Context must not be null");
        this.c = context;
        vzg.n(looper, "Looper must not be null");
        vzg.n(d7h, "Supervisor must not be null");
        this.o = d7h;
        this.v = new syg(this, looper);
        this.y0 = i;
        this.w0 = ykb;
        this.x0 = xga;
        this.z0 = (String) b33.w;
        this.G0 = (Account) b33.a;
        Set<Scope> set = (Set) b33.c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.F0 = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.w) {
            try {
                if (aVar.v0 != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set a() {
        return j() ? this.F0 : Collections.emptySet();
    }

    public final void b(String str) {
        this.a = str;
        disconnect();
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.w) {
            int i = this.v0;
            z2 = true;
            if (i != 2) {
                if (i != 3) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public final void d() {
        if (!isConnected() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void disconnect() {
        this.E0.incrementAndGet();
        synchronized (this.Y) {
            try {
                int size = this.Y.size();
                for (int i = 0; i < size; i++) {
                    dxg dxg = (dxg) this.Y.get(i);
                    synchronized (dxg) {
                        dxg.a = null;
                    }
                }
                this.Y.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.x) {
            this.y = null;
        }
        v(1, (IInterface) null);
    }

    public final void e(lj0 lj0) {
        this.z = lj0;
        v(2, (IInterface) null);
    }

    public final void g(z3a z3a) {
        ((kvg) z3a.b).o.v0.post(new haf(15, (Object) z3a));
    }

    public final tj5[] h() {
        h5h h5h = this.D0;
        if (h5h == null) {
            return null;
        }
        return h5h.b;
    }

    public final String i() {
        return this.a;
    }

    public final boolean isConnected() {
        boolean z2;
        synchronized (this.w) {
            z2 = this.v0 == 4;
        }
        return z2;
    }

    public boolean j() {
        return false;
    }

    public final void k(u57 u57, Set set) {
        Set set2 = set;
        Bundle n = n();
        String str = this.A0;
        int i = et6.a;
        Scope[] scopeArr = nr6.x0;
        Bundle bundle = new Bundle();
        int i2 = this.y0;
        tj5[] tj5Arr = nr6.y0;
        nr6 nr6 = r3;
        nr6 nr62 = new nr6(6, i2, i, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, tj5Arr, tj5Arr, true, 0, false, str);
        nr6 nr63 = nr6;
        nr63.o = this.c.getPackageName();
        nr63.x = n;
        if (set2 != null) {
            nr63.w = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (j()) {
            Account account = this.G0;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            nr63.y = account;
            if (u57 != null) {
                nr63.v = u57.asBinder();
            }
        }
        nr63.z = H0;
        nr63.X = m();
        if (t()) {
            nr63.v0 = true;
        }
        try {
            synchronized (this.x) {
                hxg hxg = this.y;
                if (hxg != null) {
                    hxg.l(new l0h(this, this.E0.get()), nr63);
                }
            }
        } catch (DeadObjectException unused) {
            int i3 = this.E0.get();
            syg syg = this.v;
            syg.sendMessage(syg.obtainMessage(6, i3, 3));
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            int i4 = this.E0.get();
            w2h w2h = new w2h(this, 8, (IBinder) null, (Bundle) null);
            syg syg2 = this.v;
            syg2.sendMessage(syg2.obtainMessage(1, i4, -1, w2h));
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract IInterface l(IBinder iBinder);

    public tj5[] m() {
        return H0;
    }

    public Bundle n() {
        return new Bundle();
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.w) {
            try {
                if (this.v0 == 5) {
                    throw new DeadObjectException();
                } else if (isConnected()) {
                    iInterface = this.X;
                    vzg.n(iInterface, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String p();

    public abstract String q();

    public boolean r() {
        return f() >= 211700000;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public boolean t() {
        return this instanceof n0h;
    }

    public final void v(int i, IInterface iInterface) {
        a7d a7d;
        boolean z2 = false;
        boolean z3 = i == 4;
        if (iInterface != null) {
            z2 = true;
        }
        if (z3 == z2) {
            synchronized (this.w) {
                try {
                    this.v0 = i;
                    this.X = iInterface;
                    if (i == 1) {
                        m1h m1h = this.Z;
                        if (m1h != null) {
                            d7h d7h = this.o;
                            String str = this.b.a;
                            vzg.m(str);
                            this.b.getClass();
                            if (this.z0 == null) {
                                this.c.getClass();
                            }
                            d7h.a(str, m1h, this.b.b);
                            this.Z = null;
                        }
                    } else if (i == 2 || i == 3) {
                        m1h m1h2 = this.Z;
                        if (!(m1h2 == null || (a7d = this.b) == null)) {
                            String str2 = a7d.a;
                            d7h d7h2 = this.o;
                            vzg.m(str2);
                            this.b.getClass();
                            if (this.z0 == null) {
                                this.c.getClass();
                            }
                            d7h2.a(str2, m1h2, this.b.b);
                            this.E0.incrementAndGet();
                        }
                        m1h m1h3 = new m1h(this, this.E0.get());
                        this.Z = m1h3;
                        String q = q();
                        boolean r = r();
                        this.b = new a7d(q, r);
                        if (r) {
                            if (f() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
                            }
                        }
                        d7h d7h3 = this.o;
                        String str3 = this.b.a;
                        vzg.m(str3);
                        this.b.getClass();
                        String str4 = this.z0;
                        if (str4 == null) {
                            str4 = this.c.getClass().getName();
                        }
                        if (!d7h3.b(new g6h(str3, this.b.b), m1h3, str4)) {
                            String str5 = this.b.a;
                            int i2 = this.E0.get();
                            l3h l3h = new l3h(this, 16);
                            syg syg = this.v;
                            syg.sendMessage(syg.obtainMessage(7, i2, -1, l3h));
                        }
                    } else if (i == 4) {
                        vzg.m(iInterface);
                        System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
