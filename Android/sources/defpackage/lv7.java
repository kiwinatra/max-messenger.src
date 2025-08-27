package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lv7  reason: default package */
public final class lv7 extends ju7 {
    public final boolean b = true;
    public hh5 c = new hh5();
    public iu7 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final xme j;

    public lv7(jv7 jv7) {
        this.a = new AtomicReference((Object) null);
        iu7 iu7 = iu7.b;
        this.d = iu7;
        this.i = new ArrayList();
        this.e = new WeakReference(jv7);
        this.j = f6e.a(iu7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: zu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: pg4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: qyc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: zu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: zu7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: pg4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: pg4} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, kv7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.fv7 r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.i
            r1 = 1
            r2 = 2
            r3 = 0
            java.lang.String r4 = "addObserver"
            r12.d(r4)
            iu7 r4 = r12.d
            iu7 r5 = defpackage.iu7.a
            if (r4 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            iu7 r5 = defpackage.iu7.b
        L_0x0013:
            kv7 r4 = new kv7
            r4.<init>()
            java.util.HashMap r6 = defpackage.nv7.a
            boolean r6 = r13 instanceof defpackage.zu7
            boolean r7 = r13 instanceof defpackage.ng4
            r8 = 0
            if (r6 == 0) goto L_0x002f
            if (r7 == 0) goto L_0x002f
            pg4 r6 = new pg4
            r7 = r13
            ng4 r7 = (defpackage.ng4) r7
            r9 = r13
            zu7 r9 = (defpackage.zu7) r9
            r6.<init>(r3, r7, r9)
            goto L_0x0088
        L_0x002f:
            if (r7 == 0) goto L_0x003a
            pg4 r6 = new pg4
            r7 = r13
            ng4 r7 = (defpackage.ng4) r7
            r6.<init>(r3, r7, r8)
            goto L_0x0088
        L_0x003a:
            if (r6 == 0) goto L_0x0040
            r6 = r13
            zu7 r6 = (defpackage.zu7) r6
            goto L_0x0088
        L_0x0040:
            java.lang.Class r6 = r13.getClass()
            int r7 = defpackage.nv7.c(r6)
            if (r7 != r2) goto L_0x0083
            java.util.HashMap r7 = defpackage.nv7.b
            java.lang.Object r6 = r7.get(r6)
            java.util.List r6 = (java.util.List) r6
            int r7 = r6.size()
            if (r7 != r1) goto L_0x0067
            java.lang.Object r6 = r6.get(r3)
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6
            defpackage.nv7.a(r6, r13)
            xbe r6 = new xbe
            r6.<init>()
            goto L_0x0088
        L_0x0067:
            int r7 = r6.size()
            np6[] r9 = new defpackage.np6[r7]
            r10 = r3
        L_0x006e:
            if (r10 >= r7) goto L_0x007d
            java.lang.Object r11 = r6.get(r10)
            java.lang.reflect.Constructor r11 = (java.lang.reflect.Constructor) r11
            defpackage.nv7.a(r11, r13)
            r9[r10] = r8
            int r10 = r10 + r1
            goto L_0x006e
        L_0x007d:
            qyc r6 = new qyc
            r6.<init>(r2, r9)
            goto L_0x0088
        L_0x0083:
            pg4 r6 = new pg4
            r6.<init>(r13)
        L_0x0088:
            r4.b = r6
            r4.a = r5
            hh5 r5 = r12.c
            java.lang.Object r5 = r5.d(r13, r4)
            kv7 r5 = (defpackage.kv7) r5
            if (r5 == 0) goto L_0x0097
            return
        L_0x0097:
            java.lang.ref.WeakReference r5 = r12.e
            java.lang.Object r5 = r5.get()
            jv7 r5 = (defpackage.jv7) r5
            if (r5 != 0) goto L_0x00a2
            return
        L_0x00a2:
            int r6 = r12.f
            if (r6 != 0) goto L_0x00aa
            boolean r6 = r12.g
            if (r6 == 0) goto L_0x00ab
        L_0x00aa:
            r3 = r1
        L_0x00ab:
            iu7 r6 = r12.c(r13)
            int r7 = r12.f
            int r7 = r7 + r1
            r12.f = r7
        L_0x00b4:
            iu7 r7 = r4.a
            int r6 = r7.compareTo(r6)
            if (r6 >= 0) goto L_0x0113
            hh5 r6 = r12.c
            java.util.HashMap r6 = r6.v
            boolean r6 = r6.containsKey(r13)
            if (r6 == 0) goto L_0x0113
            iu7 r6 = r4.a
            r0.add(r6)
            fu7 r6 = defpackage.hu7.Companion
            iu7 r7 = r4.a
            r6.getClass()
            int[] r6 = defpackage.eu7.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r6 = r6[r7]
            if (r6 == r1) goto L_0x00e9
            if (r6 == r2) goto L_0x00e6
            r7 = 5
            if (r6 == r7) goto L_0x00e3
            r6 = r8
            goto L_0x00eb
        L_0x00e3:
            hu7 r6 = defpackage.hu7.ON_CREATE
            goto L_0x00eb
        L_0x00e6:
            hu7 r6 = defpackage.hu7.ON_RESUME
            goto L_0x00eb
        L_0x00e9:
            hu7 r6 = defpackage.hu7.ON_START
        L_0x00eb:
            if (r6 == 0) goto L_0x00fd
            r4.a(r5, r6)
            int r6 = r0.size()
            int r6 = r6 - r1
            r0.remove(r6)
            iu7 r6 = r12.c(r13)
            goto L_0x00b4
        L_0x00fd:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "no event up from "
            r13.<init>(r0)
            iu7 r0 = r4.a
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0113:
            if (r3 != 0) goto L_0x0118
            r12.g()
        L_0x0118:
            int r13 = r12.f
            int r13 = r13 + -1
            r12.f = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv7.a(fv7):void");
    }

    public final void b(fv7 fv7) {
        d("removeObserver");
        this.c.e(fv7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: iu7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.iu7 c(defpackage.fv7 r5) {
        /*
            r4 = this;
            hh5 r0 = r4.c
            java.util.HashMap r0 = r0.v
            boolean r1 = r0.containsKey(r5)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r5 = r0.get(r5)
            ubd r5 = (defpackage.ubd) r5
            ubd r5 = r5.o
            goto L_0x0015
        L_0x0014:
            r5 = r2
        L_0x0015:
            if (r5 == 0) goto L_0x0020
            java.lang.Object r5 = r5.b
            kv7 r5 = (defpackage.kv7) r5
            if (r5 == 0) goto L_0x0020
            iu7 r5 = r5.a
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            java.util.ArrayList r0 = r4.i
            boolean r1 = r0.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = defpackage.a81.h(r3, r0)
            r2 = r0
            iu7 r2 = (defpackage.iu7) r2
        L_0x0032:
            iu7 r4 = r4.d
            if (r5 == 0) goto L_0x003d
            int r0 = r5.compareTo(r4)
            if (r0 >= 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r5 = r4
        L_0x003e:
            if (r2 == 0) goto L_0x0047
            int r4 = r2.compareTo(r5)
            if (r4 >= 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = r5
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv7.c(fv7):iu7");
    }

    public final void d(String str) {
        if (this.b && !gs.U().o.U()) {
            throw new IllegalStateException(wj6.k("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(hu7 hu7) {
        d("handleLifecycleEvent");
        f(hu7.a());
    }

    public final void f(iu7 iu7) {
        iu7 iu72 = this.d;
        if (iu72 != iu7) {
            iu7 iu73 = iu7.b;
            iu7 iu74 = iu7.a;
            if (iu72 == iu73 && iu7 == iu74) {
                throw new IllegalStateException(("State must be at least CREATED to move to " + iu7 + ", but was " + this.d + " in component " + this.e.get()).toString());
            }
            this.d = iu7;
            if (this.g || this.f != 0) {
                this.h = true;
                return;
            }
            this.g = true;
            g();
            this.g = false;
            if (this.d == iu74) {
                this.c = new hh5();
            }
        }
    }

    public final void g() {
        jv7 jv7 = (jv7) this.e.get();
        if (jv7 != null) {
            while (true) {
                hh5 hh5 = this.c;
                if (hh5.o != 0) {
                    Object obj = hh5.a.b;
                    iu7 iu7 = ((kv7) obj).a;
                    iu7 iu72 = ((kv7) hh5.b.b).a;
                    if (iu7 == iu72 && this.d == iu72) {
                        break;
                    }
                    this.h = false;
                    if (this.d.compareTo(((kv7) obj).a) < 0) {
                        hh5 hh52 = this.c;
                        tbd tbd = new tbd(hh52.b, hh52.a, 1);
                        hh52.c.put(tbd, Boolean.FALSE);
                        while (tbd.hasNext() && !this.h) {
                            Map.Entry entry = (Map.Entry) tbd.next();
                            fv7 fv7 = (fv7) entry.getKey();
                            kv7 kv7 = (kv7) entry.getValue();
                            while (kv7.a.compareTo(this.d) > 0 && !this.h && this.c.v.containsKey(fv7)) {
                                fu7 fu7 = hu7.Companion;
                                iu7 iu73 = kv7.a;
                                fu7.getClass();
                                hu7 a = fu7.a(iu73);
                                if (a != null) {
                                    this.i.add(a.a());
                                    kv7.a(jv7, a);
                                    ArrayList arrayList = this.i;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + kv7.a);
                                }
                            }
                        }
                    }
                    ubd ubd = this.c.b;
                    if (!this.h && ubd != null && this.d.compareTo(((kv7) ubd.b).a) > 0) {
                        hh5 hh53 = this.c;
                        hh53.getClass();
                        vbd vbd = new vbd(hh53);
                        hh53.c.put(vbd, Boolean.FALSE);
                        while (vbd.hasNext() && !this.h) {
                            Map.Entry entry2 = (Map.Entry) vbd.next();
                            fv7 fv72 = (fv7) entry2.getKey();
                            kv7 kv72 = (kv7) entry2.getValue();
                            while (kv72.a.compareTo(this.d) < 0 && !this.h && this.c.v.containsKey(fv72)) {
                                this.i.add(kv72.a);
                                fu7 fu72 = hu7.Companion;
                                iu7 iu74 = kv72.a;
                                fu72.getClass();
                                int i2 = eu7.$EnumSwitchMapping$0[iu74.ordinal()];
                                hu7 hu7 = i2 != 1 ? i2 != 2 ? i2 != 5 ? null : hu7.ON_CREATE : hu7.ON_RESUME : hu7.ON_START;
                                if (hu7 != null) {
                                    kv72.a(jv7, hu7);
                                    ArrayList arrayList2 = this.i;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + kv72.a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.h = false;
            this.j.setValue(this.d);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
