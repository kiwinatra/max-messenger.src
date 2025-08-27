package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tge  reason: default package */
public abstract class tge {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    public tge(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(qge qge) {
        if (qge.i) {
            rae.a(qge.a, qge.c.I2(), this.a);
            qge.i = false;
        }
    }

    public abstract void b(List list, boolean z);

    public final void c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((qge) it.next()).k);
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((pge) list2.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((qge) list.get(i2));
        }
        List list3 = CollectionsKt.toList(list);
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            qge qge = (qge) list3.get(i3);
            if (qge.k.isEmpty()) {
                qge.b();
            }
        }
    }

    public final void d(int i, int i2, e eVar) {
        synchronized (this.b) {
            try {
                qge f = f(eVar.c);
                if (f == null) {
                    a aVar = eVar.c;
                    f = aVar.w0 ? g(aVar) : null;
                }
                if (f != null) {
                    f.d(i, i2);
                    return;
                }
                qge qge = new qge(i, i2, eVar);
                this.b.add(qge);
                qge.d.add(new oge(this, qge, 0));
                qge.d.add(new oge(this, qge, 1));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x00d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014a A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0151 A[Catch:{ all -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r10.e
            if (r1 == 0) goto L_0x0006
            return
        L_0x0006:
            android.view.ViewGroup r1 = r10.a
            boolean r1 = r1.isAttachedToWindow()
            r2 = 0
            if (r1 != 0) goto L_0x0015
            r10.h()
            r10.d = r2
            return
        L_0x0015:
            java.util.ArrayList r1 = r10.b
            monitor-enter(r1)
            java.util.ArrayList r3 = r10.b     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0048 }
            r4 = 2
            if (r3 == 0) goto L_0x005f
            java.util.ArrayList r0 = r10.c     // Catch:{ all -> 0x0048 }
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r2 = r10.c     // Catch:{ all -> 0x0048 }
            r2.clear()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0048 }
        L_0x0030:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x016a
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0048 }
            qge r2 = (defpackage.qge) r2     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "FragmentManager"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x004b
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0048:
            r10 = move-exception
            goto L_0x016e
        L_0x004b:
            android.view.ViewGroup r3 = r10.a     // Catch:{ all -> 0x0048 }
            boolean r5 = r2.e     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r2.a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0055:
            boolean r3 = r2.f     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0030
            java.util.ArrayList r3 = r10.c     // Catch:{ all -> 0x0048 }
            r3.add(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0030
        L_0x005f:
            java.util.ArrayList r3 = r10.c     // Catch:{ all -> 0x0048 }
            java.util.List r3 = kotlin.collections.CollectionsKt.toMutableList(r3)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r5 = r10.c     // Catch:{ all -> 0x0048 }
            r5.clear()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0048 }
        L_0x006e:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0048 }
            qge r5 = (defpackage.qge) r5     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "FragmentManager"
            boolean r6 = android.util.Log.isLoggable(r6, r4)     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0085
            java.util.Objects.toString(r5)     // Catch:{ all -> 0x0048 }
        L_0x0085:
            android.view.ViewGroup r6 = r10.a     // Catch:{ all -> 0x0048 }
            androidx.fragment.app.a r7 = r5.c     // Catch:{ all -> 0x0048 }
            boolean r7 = r7.w0     // Catch:{ all -> 0x0048 }
            boolean r8 = r5.e     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0090
            goto L_0x0097
        L_0x0090:
            if (r7 == 0) goto L_0x0094
            r5.g = r0     // Catch:{ all -> 0x0048 }
        L_0x0094:
            r5.a(r6)     // Catch:{ all -> 0x0048 }
        L_0x0097:
            boolean r6 = r5.f     // Catch:{ all -> 0x0048 }
            if (r6 != 0) goto L_0x006e
            java.util.ArrayList r6 = r10.c     // Catch:{ all -> 0x0048 }
            r6.add(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x006e
        L_0x00a1:
            r10.k()     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r3 = r10.b     // Catch:{ all -> 0x0048 }
            java.util.List r3 = kotlin.collections.CollectionsKt.toMutableList(r3)     // Catch:{ all -> 0x0048 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x00b2
            monitor-exit(r1)
            return
        L_0x00b2:
            java.util.ArrayList r4 = r10.b     // Catch:{ all -> 0x0048 }
            r4.clear()     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r4 = r10.c     // Catch:{ all -> 0x0048 }
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x0048 }
            r4.addAll(r5)     // Catch:{ all -> 0x0048 }
            boolean r4 = r10.d     // Catch:{ all -> 0x0048 }
            r10.b(r3, r4)     // Catch:{ all -> 0x0048 }
            kotlin.jvm.internal.Ref$BooleanRef r4 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            r4.element = r0     // Catch:{ all -> 0x0048 }
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x0048 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0048 }
            r6 = r0
        L_0x00d3:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x011a
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0048 }
            qge r7 = (defpackage.qge) r7     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r8 = r7.k     // Catch:{ all -> 0x0048 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0048 }
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x010f
            java.util.ArrayList r8 = r7.k     // Catch:{ all -> 0x0048 }
            boolean r9 = r8 instanceof java.util.Collection     // Catch:{ all -> 0x0048 }
            if (r9 == 0) goto L_0x00f5
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r9 == 0) goto L_0x00f5
            goto L_0x010d
        L_0x00f5:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0048 }
        L_0x00f9:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0048 }
            if (r9 == 0) goto L_0x010d
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0048 }
            pge r9 = (defpackage.pge) r9     // Catch:{ all -> 0x0048 }
            r9.getClass()     // Catch:{ all -> 0x0048 }
            boolean r9 = r9 instanceof defpackage.li4     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x00f9
            goto L_0x010f
        L_0x010d:
            r8 = r0
            goto L_0x0110
        L_0x010f:
            r8 = r2
        L_0x0110:
            r4.element = r8     // Catch:{ all -> 0x0048 }
            androidx.fragment.app.a r7 = r7.c     // Catch:{ all -> 0x0048 }
            boolean r7 = r7.w0     // Catch:{ all -> 0x0048 }
            if (r7 != 0) goto L_0x00d3
            r6 = r2
            goto L_0x00d3
        L_0x011a:
            boolean r5 = r4.element     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0145
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r7.<init>()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0048 }
        L_0x012a:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x013c
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0048 }
            qge r8 = (defpackage.qge) r8     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r8 = r8.k     // Catch:{ all -> 0x0048 }
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r7, r8)     // Catch:{ all -> 0x0048 }
            goto L_0x012a
        L_0x013c:
            boolean r5 = r7.isEmpty()     // Catch:{ all -> 0x0048 }
            r5 = r5 ^ r0
            if (r5 == 0) goto L_0x0145
            r5 = r0
            goto L_0x0146
        L_0x0145:
            r5 = r2
        L_0x0146:
            r4.element = r5     // Catch:{ all -> 0x0048 }
            if (r6 != 0) goto L_0x0151
            r10.j(r3)     // Catch:{ all -> 0x0048 }
            r10.c(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0168
        L_0x0151:
            if (r5 == 0) goto L_0x0168
            r10.j(r3)     // Catch:{ all -> 0x0048 }
            int r4 = r3.size()     // Catch:{ all -> 0x0048 }
            r5 = r2
        L_0x015b:
            if (r5 >= r4) goto L_0x0168
            java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x0048 }
            qge r6 = (defpackage.qge) r6     // Catch:{ all -> 0x0048 }
            r10.a(r6)     // Catch:{ all -> 0x0048 }
            int r5 = r5 + r0
            goto L_0x015b
        L_0x0168:
            r10.d = r2     // Catch:{ all -> 0x0048 }
        L_0x016a:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)
            return
        L_0x016e:
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tge.e():void");
    }

    public final qge f(a aVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qge qge = (qge) obj;
            if (Intrinsics.areEqual((Object) qge.c, (Object) aVar) && !qge.e) {
                break;
            }
        }
        return (qge) obj;
    }

    public final qge g(a aVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qge qge = (qge) obj;
            if (Intrinsics.areEqual((Object) qge.c, (Object) aVar) && !qge.e) {
                break;
            }
        }
        return (qge) obj;
    }

    public final void h() {
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                k();
                j(this.b);
                for (qge qge : CollectionsKt.toMutableList(this.c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(qge);
                    }
                    qge.a(this.a);
                }
                for (qge qge2 : CollectionsKt.toMutableList(this.b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(qge2);
                    }
                    qge2.a(this.a);
                }
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        }
    }

    public final void i() {
        Object obj;
        synchronized (this.b) {
            try {
                k();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    qge qge = (qge) obj;
                    View view = qge.c.S0;
                    char c2 = 4;
                    if (view.getAlpha() != c44.DEFAULT_ASPECT_RATIO || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c2 = 2;
                        } else if (visibility != 4) {
                            if (visibility == 8) {
                                c2 = 3;
                            } else {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                        }
                    }
                    if (qge.a == 2 && c2 != 2) {
                        break;
                    }
                }
                qge qge2 = (qge) obj;
                this.e = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qge qge = (qge) list.get(i);
            if (!qge.h) {
                qge.h = true;
                int i2 = qge.b;
                e eVar = qge.l;
                if (i2 == 2) {
                    a aVar = eVar.c;
                    View findFocus = aVar.S0.findFocus();
                    if (findFocus != null) {
                        aVar.L1().k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            findFocus.toString();
                            aVar.toString();
                        }
                    }
                    View I2 = qge.c.I2();
                    if (I2.getParent() == null) {
                        eVar.b();
                        I2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                    }
                    if (I2.getAlpha() == c44.DEFAULT_ASPECT_RATIO && I2.getVisibility() == 0) {
                        I2.setVisibility(4);
                    }
                    kc6 kc6 = aVar.V0;
                    I2.setAlpha(kc6 == null ? 1.0f : kc6.j);
                } else if (i2 == 3) {
                    a aVar2 = eVar.c;
                    View I22 = aVar2.I2();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(I22.findFocus());
                        I22.toString();
                        aVar2.toString();
                    }
                    I22.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((qge) it.next()).k);
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pge pge = (pge) list2.get(i3);
            if (!pge.a) {
                pge.d(this.a);
            }
            pge.a = true;
        }
    }

    public final void k() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            qge qge = (qge) it.next();
            int i = 2;
            if (qge.b == 2) {
                int visibility = qge.c.I2().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i = 3;
                        } else {
                            throw new IllegalArgumentException(wj6.h(visibility, "Unknown visibility "));
                        }
                    }
                }
                qge.d(i, 1);
            }
        }
    }
}
