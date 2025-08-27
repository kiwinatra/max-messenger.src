package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.u4d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends u4d> extends m5a {
    public static final qv0 o = new qv0(10);
    public final Object f = new Object();
    public final CountDownLatch g = new CountDownLatch(1);
    public final ArrayList h = new ArrayList();
    public final AtomicReference i = new AtomicReference();
    public u4d j;
    public Status k;
    public volatile boolean l;
    public boolean m;
    public boolean n = false;

    public BasePendingResult(mvg mvg) {
        new ws9(mvg != null ? mvg.a.w : Looper.getMainLooper(), 2);
        new WeakReference(mvg);
    }

    public final void T(obb obb) {
        synchronized (this.f) {
            try {
                if (W()) {
                    obb.a(this.k);
                } else {
                    this.h.add(obb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract u4d U(Status status);

    public final void V(Status status) {
        synchronized (this.f) {
            try {
                if (!W()) {
                    X(U(status));
                    this.m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean W() {
        return this.g.getCount() == 0;
    }

    public final void X(u4d u4d) {
        synchronized (this.f) {
            try {
                if (!this.m) {
                    W();
                    vzg.o("Results have already been set", !W());
                    vzg.o("Result has already been consumed", !this.l);
                    this.j = u4d;
                    this.k = u4d.a();
                    this.g.countDown();
                    ArrayList arrayList = this.h;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((obb) arrayList.get(i2)).a(this.k);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
