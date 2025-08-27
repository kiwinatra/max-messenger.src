package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

/* renamed from: bta  reason: default package */
public final class bta extends ja4 {
    public static final /* synthetic */ KProperty[] f = {rae.s(bta.class, "router", "getRouter()Lone/me/sdk/arch/rootcontroller/RouterWrapper;", 0)};
    public static final m27 g = new m27(0);
    public final Lazy a;
    public boolean b = true;
    public final LinkedList c = new LinkedList();
    public final ata d = new ata(this);
    public bpa e;

    public bta(Lazy lazy) {
        this.a = lazy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ey3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.i9d d(defpackage.ab4 r3, boolean r4) {
        /*
            ya4 r0 = r3.f
            java.lang.Object r0 = r0.a()
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            r1 = 0
            i9d r0 = defpackage.iq.n(r0, r1, r1)
            java.lang.String r2 = r3.a
            r0.d(r2)
            if (r4 == 0) goto L_0x0044
            xa4 r4 = defpackage.xa4.c
            xa4 r3 = r3.e
            if (r3 == r4) goto L_0x0044
            kotlin.jvm.functions.Function0 r4 = r3.a
            java.lang.Object r4 = r4.invoke()
            boolean r2 = r4 instanceof defpackage.ey3
            if (r2 == 0) goto L_0x0027
            ey3 r4 = (defpackage.ey3) r4
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            m27 r2 = g
            if (r4 != 0) goto L_0x002d
            r4 = r2
        L_0x002d:
            r0.c(r4)
            kotlin.jvm.functions.Function0 r3 = r3.b
            java.lang.Object r3 = r3.invoke()
            boolean r4 = r3 instanceof defpackage.ey3
            if (r4 == 0) goto L_0x003d
            r1 = r3
            ey3 r1 = (defpackage.ey3) r1
        L_0x003d:
            if (r1 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            r0.a(r2)
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bta.d(ab4, boolean):i9d");
    }

    public final ArrayList a() {
        ArrayList e2 = e().x().e();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(e2, 10));
        Iterator it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(new zsa((i9d) it.next()));
        }
        return arrayList;
    }

    public final int b() {
        if (!this.b) {
            return e().x().a.a.size();
        }
        List list = this.c;
        if (list.isEmpty()) {
            list = e().x().e();
        }
        return list.size();
    }

    public final void c(ab4 ab4) {
        i9d d2 = d(ab4, !a().isEmpty());
        if (this.b) {
            this.c.add(d2);
            return;
        }
        e().x().R(d2);
        bpa bpa = this.e;
        if (bpa != null) {
            ((e24) ((Lazy) bpa.b).getValue()).getClass();
        }
    }

    public final l9d e() {
        return this.d.y(f[0]);
    }

    public final void f(Function0 function0) {
        this.b = true;
        function0.invoke();
        this.b = false;
        LinkedList linkedList = this.c;
        if (!linkedList.isEmpty()) {
            ArrayList e2 = e().x().e();
            ArrayList arrayList = new ArrayList();
            for (Object next : linkedList) {
                if (!((Widget) ((i9d) next).a).isDialog()) {
                    arrayList.add(next);
                }
            }
            List plus = CollectionsKt.plus(e2, arrayList);
            ArrayList e3 = e().K().e();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : linkedList) {
                if (((Widget) ((i9d) next2).a).isDialog()) {
                    arrayList2.add(next2);
                }
            }
            List plus2 = CollectionsKt.plus(e3, arrayList2);
            linkedList.clear();
            ey3 ey3 = null;
            e().K().P(plus2, (ey3) null);
            e9d x = e().x();
            i9d i9d = (i9d) CollectionsKt.lastOrNull(plus);
            if (i9d != null) {
                ey3 = i9d.b();
            }
            x.P(plus, ey3);
        }
    }
}
