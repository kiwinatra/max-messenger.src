package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Unit;

/* renamed from: yc4  reason: default package */
public final class yc4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;
    public final Object v;
    public final /* synthetic */ Object w;

    public yc4(zc4 zc4, dg dgVar, do0 do0, int i, int i2) {
        this.w = zc4;
        this.o = dgVar;
        this.v = do0;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        y33 y33;
        zc4 zc4 = (zc4) this.w;
        int i3 = 2;
        dg dgVar = (dg) this.o;
        if (i2 == 1) {
            dgVar.p();
            dgVar.l();
            y33 = ((do0) this.v).y();
        } else if (i2 != 2) {
            return false;
        } else {
            try {
                y33 = ((ynb) zc4.a).c(dgVar.p(), dgVar.l(), (Bitmap.Config) zc4.c);
                i3 = -1;
            } catch (RuntimeException e) {
                zc4.getClass();
                bg5.k(zc4.class, e);
                return false;
            } catch (Throwable th) {
                y33.U((y33) null);
                throw th;
            }
        }
        boolean b2 = b(i, y33, i2);
        y33.U(y33);
        return (b2 || i3 == -1) ? b2 : a(i, i3);
    }

    public boolean b(int i, y33 y33, int i2) {
        if (!y33.m0(y33) || y33 == null || !((pv0) ((zc4) this.w).b).h((Bitmap) y33.e0(), i)) {
            return false;
        }
        ((zc4) this.w).getClass();
        bg5.f(zc4.class, Integer.valueOf(i), "Frame %d ready.");
        synchronized (((SparseArray) ((zc4) this.w).v)) {
            ((do0) this.v).u(i, y33);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    public final void run() {
        SparseArray sparseArray;
        mm8 mm8;
        switch (this.a) {
            case 0:
                try {
                    if (((do0) this.v).o(this.b)) {
                        ((zc4) this.w).getClass();
                        bg5.f(zc4.class, Integer.valueOf(this.b), "Frame %d is cached already.");
                        zc4 zc4 = (zc4) this.w;
                        sparseArray = (SparseArray) zc4.v;
                        synchronized (sparseArray) {
                            ((SparseArray) zc4.v).remove(this.c);
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        if (a(this.b, 1)) {
                            ((zc4) this.w).getClass();
                            bg5.f(zc4.class, Integer.valueOf(this.b), "Prepared frame %d.");
                        } else {
                            ((zc4) this.w).getClass();
                            bg5.b(zc4.class, "Could not prepare frame %d.", Integer.valueOf(this.b));
                        }
                        zc4 zc42 = (zc4) this.w;
                        sparseArray = (SparseArray) zc42.v;
                        synchronized (sparseArray) {
                            ((SparseArray) zc42.v).remove(this.c);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    zc4 zc43 = (zc4) this.w;
                    synchronized (((SparseArray) zc43.v)) {
                        ((SparseArray) zc43.v).remove(this.c);
                        Unit unit3 = Unit.INSTANCE;
                        throw th;
                    }
                }
            default:
                um8 um8 = (um8) this.o;
                IBinder binder = ((vm8) um8).a.getBinder();
                er7 er7 = (er7) this.w;
                ((sy8) er7.b).v.remove(binder);
                sy8 sy8 = (sy8) er7.b;
                Iterator it = sy8.o.iterator();
                while (true) {
                    mm8 = null;
                    if (it.hasNext()) {
                        mm8 mm82 = (mm8) it.next();
                        if (mm82.c == this.b) {
                            if (TextUtils.isEmpty((String) this.v) || this.c <= 0) {
                                mm8 = new mm8((sy8) er7.b, mm82.a, mm82.b, mm82.c, (vm8) um8);
                            }
                            it.remove();
                        }
                    }
                }
                if (mm8 == null) {
                    mm8 = new mm8((sy8) er7.b, (String) this.v, this.c, this.b, (vm8) um8);
                }
                sy8.v.put(binder, mm8);
                try {
                    binder.linkToDeath(mm8, 0);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }

    public yc4(int i, int i2, er7 er7, vm8 vm8, Bundle bundle, String str) {
        this.w = er7;
        this.o = vm8;
        this.b = i;
        this.v = str;
        this.c = i2;
    }
}
