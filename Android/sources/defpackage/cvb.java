package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: cvb  reason: default package */
public final class cvb {
    public static final cvb f = new cvb();
    public final Object a = new Object();
    public go1 b;
    public final pk4 c = new pk4(4);
    public uv1 d;
    public final HashMap e = new HashMap();

    public static final tt1 a(cvb cvb, jv1 jv1) {
        cvb.getClass();
        Iterator it = jv1.a.iterator();
        while (it.hasNext()) {
            ((ku1) it.next()).getClass();
            ab0 ab0 = ku1.a;
            if (!Intrinsics.areEqual((Object) ab0, (Object) ab0)) {
                synchronized (be5.a) {
                    st1 st1 = (st1) be5.b.get(ab0);
                }
            }
        }
        return ut1.a;
    }

    public static final void b(cvb cvb, int i) {
        uv1 uv1 = cvb.d;
        if (uv1 != null) {
            vf2 vf2 = uv1.f;
            if (vf2 != null) {
                mqf mqf = (mqf) vf2.c;
                if (i != mqf.b) {
                    Iterator it = ((ArrayList) mqf.o).iterator();
                    while (it.hasNext()) {
                        ov1 ov1 = (ov1) it.next();
                        int i2 = mqf.b;
                        synchronized (ov1.b) {
                            boolean z = true;
                            ov1.c = i == 2 ? 2 : 1;
                            boolean z2 = i2 != 2 && i == 2;
                            if (i2 != 2 || i == 2) {
                                z = false;
                            }
                            if (z2 || z) {
                                ov1.b();
                            }
                        }
                    }
                }
                if (mqf.b == 2 && i != 2) {
                    ((ArrayList) mqf.w).clear();
                }
                mqf.b = i;
                return;
            }
            throw new IllegalStateException("CameraX not initialized yet.");
        }
    }

    public final lu7 c(jv7 jv7, jv1 jv1, vzf... vzfArr) {
        int i;
        Trace.beginSection(ld9.T("CX:bindToLifecycle"));
        try {
            uv1 uv1 = this.d;
            if (uv1 == null) {
                i = 0;
            } else {
                vf2 vf2 = uv1.f;
                if (vf2 != null) {
                    i = ((mqf) vf2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                b(this, 1);
                return d(jv7, jv1, (dcg) null, CollectionsKt.emptyList(), (vzf[]) Arrays.copyOf(vzfArr, vzfArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            Trace.endSection();
        }
    }

    public final lu7 d(jv7 jv7, jv1 jv1, dcg dcg, List list, vzf... vzfArr) {
        lu7 lu7;
        Collection unmodifiableCollection;
        boolean contains;
        jv7 jv72 = jv7;
        jv1 jv12 = jv1;
        vzf[] vzfArr2 = vzfArr;
        Trace.beginSection(ld9.T("CX:bindToLifecycle-internal"));
        try {
            ev0.g();
            su1 c2 = jv12.c(this.d.a.v());
            c2.m(true);
            p4d e2 = e(jv12);
            pk4 pk4 = this.c;
            ia0 s = rv1.s(e2, (p4d) null);
            synchronized (pk4.a) {
                lu7 = (lu7) ((HashMap) pk4.b).get(new hb0(jv72, s));
            }
            pk4 pk42 = this.c;
            synchronized (pk42.a) {
                unmodifiableCollection = Collections.unmodifiableCollection(((HashMap) pk42.b).values());
            }
            for (vzf vzf : ArraysKt.filterNotNull(vzfArr)) {
                Iterator it = unmodifiableCollection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        lu7 lu72 = (lu7) it.next();
                        synchronized (lu72.a) {
                            contains = ((ArrayList) lu72.c.v()).contains(vzf);
                        }
                        if (contains) {
                            if (!Intrinsics.areEqual((Object) lu72, (Object) lu7)) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{vzf}, 1)));
                            }
                        }
                    }
                }
                while (true) {
                }
            }
            if (lu7 == null) {
                pk4 pk43 = this.c;
                uv1 uv1 = this.d;
                vf2 vf2 = uv1.f;
                if (vf2 != null) {
                    mqf mqf = (mqf) vf2.c;
                    ox0 ox0 = uv1.g;
                    if (ox0 != null) {
                        xs1 xs1 = uv1.h;
                        if (xs1 != null) {
                            lu7 = pk43.v(jv72, new rv1(c2, (su1) null, e2, (p4d) null, mqf, ox0, xs1));
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            lu7 lu73 = lu7;
            if (vzfArr2.length != 0) {
                pk4 pk44 = this.c;
                Collection listOf = CollectionsKt.listOf(Arrays.copyOf(vzfArr2, vzfArr2.length));
                vf2 vf22 = this.d.f;
                if (vf22 != null) {
                    pk44.p(lu73, dcg, list, listOf, (mqf) vf22.c);
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Trace.endSection();
            return lu73;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final p4d e(jv1 jv1) {
        Object obj;
        Trace.beginSection(ld9.T("CX:getCameraInfo"));
        try {
            qu1 n = jv1.c(this.d.a.v()).n();
            tt1 a2 = a(this, jv1);
            ia0 ia0 = new ia0(n.e(), a2.a);
            synchronized (this.a) {
                obj = this.e.get(ia0);
                if (obj == null) {
                    obj = new p4d(n, a2);
                    this.e.put(ia0, obj);
                }
                Unit unit = Unit.INSTANCE;
            }
            p4d p4d = (p4d) obj;
            Trace.endSection();
            return p4d;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void f() {
        Trace.beginSection(ld9.T("CX:unbindAll"));
        try {
            ev0.g();
            b(this, 0);
            this.c.J();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }
}
