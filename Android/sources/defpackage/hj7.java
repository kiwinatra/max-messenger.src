package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hj7  reason: default package */
public final class hj7 implements o5g {
    public long a;
    public long b;
    public long c;
    public Object o;
    public Serializable v;
    public Object w;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.fj7
            if (r0 == 0) goto L_0x0013
            r0 = r14
            fj7 r0 = (defpackage.fj7) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            fj7 r0 = new fj7
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            hj7 r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0089
        L_0x002c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.w
            java.lang.String r14 = (java.lang.String) r14
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0040
            goto L_0x0067
        L_0x0040:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0067
            w78 r5 = defpackage.w78.o
            long r6 = r13.a
            java.io.Serializable r8 = r13.v
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Fetch video. Internal fetcher, videoId:"
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = ", token:"
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r2.d(r5, r14, r6, r3)
        L_0x0067:
            java.lang.Object r14 = r13.o
            rl r14 = (defpackage.rl) r14
            jw9 r2 = new jw9
            long r6 = r13.a
            long r8 = r13.b
            long r10 = r13.c
            java.io.Serializable r5 = r13.v
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r5 = r2
            r5.<init>(r6, r8, r10, r12)
            r0.a = r13
            r0.o = r4
            jna r14 = (defpackage.jna) r14
            java.lang.Object r14 = r14.T(r2, r0)
            if (r14 != r1) goto L_0x0089
            return r1
        L_0x0089:
            k7g r14 = (defpackage.k7g) r14
            java.lang.Object r13 = r13.w
            java.lang.String r13 = (java.lang.String) r13
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x0094
            goto L_0x00ad
        L_0x0094:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x00ad
            w78 r1 = defpackage.w78.o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Fetch video. Internal fetcher, response:"
            r2.<init>(r4)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.d(r1, r13, r2, r3)
        L_0x00ad:
            java.util.List r13 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.Map r0 = r14.c
            java.lang.String r1 = "DASH"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x00c0
            r0 = r1
        L_0x00c0:
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x00d0
            ik5 r2 = new ik5
            p5g r4 = defpackage.p5g.DASH
            r2.<init>(r4, r0)
            r13.add(r2)
        L_0x00d0:
            java.util.Map r0 = r14.c
            java.lang.String r2 = "HLS"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r1 = r0
        L_0x00de:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00ee
            ik5 r0 = new ik5
            p5g r2 = defpackage.p5g.HLS
            r0.<init>(r2, r1)
            r13.add(r0)
        L_0x00ee:
            java.util.Map r14 = r14.c
            kotlin.sequences.Sequence r14 = kotlin.collections.MapsKt.asSequence(r14)
            wg7 r0 = new wg7
            r1 = 2
            r0.<init>(r1)
            kotlin.sequences.Sequence r14 = kotlin.sequences.SequencesKt.filter(r14, r0)
            ed7 r0 = new ed7
            r1 = 2
            r0.<init>(r1)
            kotlin.sequences.Sequence r14 = kotlin.sequences.SequencesKt.sortedWith(r14, r0)
            wg7 r0 = new wg7
            r1 = 3
            r0.<init>(r1)
            kotlin.sequences.Sequence r14 = kotlin.sequences.SequencesKt.map(r14, r0)
            java.util.List r14 = kotlin.sequences.SequencesKt.toList(r14)
            java.util.Collection r14 = (java.util.Collection) r14
            r13.addAll(r14)
            java.util.List r13 = kotlin.collections.CollectionsKt.build(r13)
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x0126
            goto L_0x012b
        L_0x0126:
            kk5 r3 = new kk5
            r3.<init>(r13)
        L_0x012b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj7.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void b(Object obj, String str) {
        if (((HashMap) this.o) == null) {
            this.o = new HashMap();
        }
        ((HashMap) this.o).put(str, obj);
    }

    public void c(Map map) {
        if (map != null && !map.isEmpty()) {
            if (((HashMap) this.o) == null) {
                this.o = new HashMap();
            }
            ((HashMap) this.o).putAll(map);
        }
    }

    public n78 d() {
        if (cvg.A((String) this.v) || cvg.A((String) this.w)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        HashMap hashMap = (HashMap) this.o;
        if (hashMap == null || hashMap.size() <= 10) {
            if (this.a == 0) {
                this.a = System.currentTimeMillis();
            }
            return new n78(this.a, this.b, this.c, (String) this.v, (String) this.w, (HashMap) this.o);
        }
        throw new IllegalArgumentException("params can't be greater than limit = 10");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.util.ArrayList r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            if (r2 > r3) goto L_0x0115
            int r4 = r20.size()
            if (r2 >= r4) goto L_0x0115
            int r4 = r20.size()
            if (r3 < r4) goto L_0x0018
            goto L_0x0115
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r3
        L_0x0023:
            r7 = 1
            if (r6 < r2) goto L_0x0103
            java.lang.Object r8 = r1.get(r6)
            tp1 r8 = (defpackage.tp1) r8
            int r9 = r5.size()
            if (r9 != 0) goto L_0x0037
            r5.add(r8)
            goto L_0x00c3
        L_0x0037:
            java.lang.Object r9 = defpackage.a81.h(r7, r5)
            tp1 r9 = (defpackage.tp1) r9
            a89 r11 = r8.c
            ha9 r11 = r11.a
            l10 r11 = r11.d()
            boolean r11 = r11.b()
            long r12 = r0.c
            a89 r14 = r8.c
            if (r11 == 0) goto L_0x0059
            ha9 r11 = r14.a
            long r10 = r11.w
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0059
            r10 = r7
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            a89 r11 = r9.c
            ha9 r11 = r11.a
            l10 r11 = r11.d()
            boolean r11 = r11.b()
            a89 r15 = r9.c
            if (r11 == 0) goto L_0x0078
            ha9 r11 = r15.a
            r17 = r8
            long r7 = r11.w
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            r8 = r17
            r7 = 1
            goto L_0x007d
        L_0x0078:
            r17 = r8
        L_0x007a:
            r8 = r17
            r7 = 0
        L_0x007d:
            vk3 r11 = r8.b
            if (r11 == 0) goto L_0x0092
            vk3 r12 = r9.b
            if (r12 == 0) goto L_0x0092
            long r17 = r11.r()
            long r11 = r12.r()
            int r11 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0092
            goto L_0x00a2
        L_0x0092:
            a32 r11 = r8.a
            if (r11 == 0) goto L_0x00c6
            a32 r9 = r9.a
            if (r9 == 0) goto L_0x00c6
            long r11 = r11.a
            long r1 = r9.a
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
        L_0x00a2:
            ha9 r1 = r14.a
            long r1 = r1.o
            ha9 r9 = r15.a
            long r11 = r9.o
            long r1 = r1 - r11
            long r11 = r0.a
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x00c6
            int r1 = r5.size()
            long r1 = (long) r1
            long r11 = r0.b
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c6
            if (r10 == r7) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            r1 = 0
            r5.add(r1, r8)
        L_0x00c3:
            r16 = 0
            goto L_0x00c8
        L_0x00c6:
            r16 = 1
        L_0x00c8:
            if (r16 != 0) goto L_0x00cc
            if (r6 != 0) goto L_0x00fb
        L_0x00cc:
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            tp1 r2 = (defpackage.tp1) r2
            r4.add(r1, r2)
            int r1 = r5.size()
            r7 = 1
            if (r1 <= r7) goto L_0x00ec
            java.util.ArrayList r1 = new java.util.ArrayList
            int r9 = r5.size()
            java.util.List r7 = r5.subList(r7, r9)
            r1.<init>(r7)
            r2.e = r1
        L_0x00ec:
            r5.clear()
            if (r6 != 0) goto L_0x00f8
            if (r16 == 0) goto L_0x00f8
            r1 = 0
            r4.add(r1, r8)
            goto L_0x00fb
        L_0x00f8:
            r5.add(r8)
        L_0x00fb:
            int r6 = r6 + -1
            r1 = r20
            r2 = r21
            goto L_0x0023
        L_0x0103:
            r1 = r7
            int r0 = r3 + 1
            r1 = r20
            r2 = r21
            java.util.List r0 = r1.subList(r2, r0)
            r0.clear()
            r1.addAll(r2, r4)
            return
        L_0x0115:
            java.lang.String r0 = "merge: wrong index: start: "
            java.lang.String r4 = " end: "
            java.lang.String r5 = " size: "
            java.lang.StringBuilder r0 = defpackage.a81.n(r0, r2, r4, r3, r5)
            int r1 = r20.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hj7"
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj7.e(java.util.ArrayList, int, int):void");
    }
}
