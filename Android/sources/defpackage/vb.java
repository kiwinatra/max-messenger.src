package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: vb  reason: default package */
public final class vb implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object e(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ph7
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ph7 r0 = (defpackage.ph7) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            ph7 r0 = new ph7
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r4.c
            rh7 r6 = (defpackage.rh7) r6
            kotlin.text.Regex r6 = r6.A0
            java.lang.String r2 = ""
            java.lang.String r5 = r6.replace((java.lang.CharSequence) r5, (java.lang.String) r2)
            r0.b = r3
            java.lang.Object r4 = r4.b
            ds5 r4 = (defpackage.ds5) r4
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object f(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.co7
            if (r0 == 0) goto L_0x0013
            r0 = r10
            co7 r0 = (defpackage.co7) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            co7 r0 = new co7
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0050
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            ab2 r10 = (defpackage.ab2) r10
            long r4 = r10.a
            java.lang.Object r10 = r8.c
            do7 r10 = (defpackage.do7) r10
            long r6 = r10.o
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0050
            r0.b = r3
            java.lang.Object r8 = r8.b
            ds5 r8 = (defpackage.ds5) r8
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L_0x0050
            return r1
        L_0x0050:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object h(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hl8
            if (r0 == 0) goto L_0x0013
            r0 = r7
            hl8 r0 = (defpackage.hl8) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            hl8 r0 = new hl8
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0074
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.component1()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.component2()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r5.c
            il8 r2 = (defpackage.il8) r2
            boolean r4 = r2.l()
            if (r4 == 0) goto L_0x0059
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0059
            prd r6 = defpackage.prd.c
            goto L_0x0067
        L_0x0059:
            if (r7 != 0) goto L_0x0065
            boolean r6 = r2.l()
            if (r6 == 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            prd r6 = defpackage.prd.b
            goto L_0x0067
        L_0x0065:
            prd r6 = defpackage.prd.a
        L_0x0067:
            r0.b = r3
            java.lang.Object r5 = r5.b
            ds5 r5 = (defpackage.ds5) r5
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x0074
            return r1
        L_0x0074:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.h(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object i(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fu8
            if (r0 == 0) goto L_0x0013
            r0 = r9
            fu8 r0 = (defpackage.fu8) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            fu8 r0 = new fu8
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00dd
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            boolean r7 = r0.v
            ds5 r8 = r0.c
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00bc
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r9 = r8.component1()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.Object r8 = r8.component2()
            wk6 r8 = (defpackage.wk6) r8
            java.lang.Object r2 = r7.c
            gu8 r2 = (defpackage.gu8) r2
            java.lang.Object r7 = r7.b
            ds5 r7 = (defpackage.ds5) r7
            if (r9 == 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            om6 r9 = r2.o
            r9.getClass()
            em6 r5 = new em6
            r5.<init>(r8)
            s85 r9 = r9.o
            defpackage.xag.h(r9, r5)
            vk6 r8 = r8.a
            h3 r8 = r8.c()
            boolean r9 = r8 instanceof defpackage.lk6
            if (r9 == 0) goto L_0x0083
            lk6 r8 = (defpackage.lk6) r8
            int r8 = r8.a
            igf r9 = new igf
            r9.<init>(r8)
            goto L_0x00a1
        L_0x0083:
            boolean r9 = r8 instanceof defpackage.mk6
            if (r9 == 0) goto L_0x0091
            mk6 r8 = (defpackage.mk6) r8
            java.lang.String r8 = r8.a
            mgf r9 = new mgf
            r9.<init>(r8)
            goto L_0x00a1
        L_0x0091:
            ql6 r8 = r2.b
            boolean r8 = r8.y
            if (r8 == 0) goto L_0x009a
            int r8 = defpackage.tva.b
            goto L_0x009c
        L_0x009a:
            int r8 = defpackage.tva.a
        L_0x009c:
            igf r9 = new igf
            r9.<init>(r8)
        L_0x00a1:
            ov3 r8 = new ov3
            r8.<init>(r9)
            goto L_0x00d2
        L_0x00a7:
            if (r9 == 0) goto L_0x00cc
            opd r8 = r2.c
            r0.c = r7
            r0.v = r9
            r0.b = r5
            java.lang.Object r8 = r8.j(r0)
            if (r8 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L_0x00bc:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x00ca
            pv3 r7 = defpackage.pv3.a
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x00d2
        L_0x00ca:
            r9 = r7
            r7 = r8
        L_0x00cc:
            if (r9 != 0) goto L_0x00d1
            qv3 r8 = defpackage.qv3.a
            goto L_0x00d2
        L_0x00d1:
            r8 = r3
        L_0x00d2:
            r0.c = r3
            r0.b = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.i(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object j(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.q49
            if (r0 == 0) goto L_0x0013
            r0 = r7
            q49 r0 = (defpackage.q49) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            q49 r0 = new q49
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0072
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x0045:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r6.next()
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r4 = r5.c
            r49 r4 = (defpackage.r49) r4
            kotlin.Lazy r4 = r4.v0
            java.lang.Object r4 = r4.getValue()
            gh4 r4 = (defpackage.gh4) r4
            z29 r2 = r4.f(r2)
            r7.add(r2)
            goto L_0x0045
        L_0x0065:
            r0.b = r3
            java.lang.Object r5 = r5.b
            ds5 r5 = (defpackage.ds5) r5
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object k(Object obj, Continuation continuation) {
        kx7 kx7 = (kx7) obj;
        String str = ((en9) this.b).z0;
        String str2 = (String) this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "handleLink " + StringsKt.take(str2, 20) + "... result is " + kx7, (Throwable) null);
        }
        if (kx7 instanceof tw7) {
            s85 s85 = ((en9) this.b).t1;
            fk9 fk9 = fk9.b;
            tw7 tw7 = (tw7) kx7;
            long j = tw7.a;
            String str3 = tw7.d;
            String str4 = tw7.b;
            boolean z = tw7.c;
            fk9.getClass();
            String str5 = ":join?id=" + j + "&link=" + str3 + "&channel=" + z;
            if (str4 != null) {
                str5 = str5 + "&title=" + str4;
            }
            a81.r(str5, s85);
        } else if (kx7 instanceof uw7) {
            xag.h(((en9) this.b).q1, new o8e(new igf(qad.G3), cad.i1, (igf) null, 4));
        } else if (kx7 instanceof yw7) {
            xag.h(((en9) this.b).t1, new c4b((String) this.c));
        } else if (kx7 instanceof cx7) {
            a32 a32 = (a32) ((en9) this.b).k1.a.getValue();
            if (a32 == null || a32.a != ((cx7) kx7).a) {
                xag.h(((en9) this.b).t1, fk9.b.o1(((cx7) kx7).a));
            } else {
                xag.h(((en9) this.b).q1, new o8e(new igf(qad.I3), 0, (igf) null, 6));
            }
        } else if (kx7 instanceof dx7) {
            ((en9) this.b).z(((dx7) kx7).a);
        } else if (kx7 instanceof ex7) {
            a32 a322 = (a32) ((en9) this.b).k1.a.getValue();
            if (a322 == null || a322.a != ((ex7) kx7).a) {
                xag.h(((en9) this.b).t1, fk9.b.o1(((ex7) kx7).a));
            } else {
                xag.h(((en9) this.b).q1, new o8e(new igf(qad.J3), 0, (igf) null, 6));
            }
        } else if (kx7 instanceof hx7) {
            s85 s852 = ((en9) this.b).t1;
            fk9 fk92 = fk9.b;
            long j2 = ((hx7) kx7).a;
            fk92.getClass();
            a81.r(":stickers/set?set_id=" + j2, s852);
        } else if (kx7 instanceof gx7) {
            en9 en9 = (en9) this.b;
            en9.c.i(((gx7) kx7).a, true, false, false, new j35(24, (Object) en9, (Object) kx7));
        } else if (!Intrinsics.areEqual((Object) kx7, (Object) bx7.a)) {
            if (Intrinsics.areEqual((Object) kx7, (Object) ww7.a)) {
                xag.h(((en9) this.b).q1, new o8e(new igf(qad.E8), 0, (igf) null, 6));
            } else if (kx7 instanceof vw7) {
                xag.h(((en9) this.b).t1, new v5a(new bb4(((vw7) kx7).a)));
            } else if (Intrinsics.areEqual((Object) kx7, (Object) fx7.a)) {
                xag.h(((en9) this.b).q1, new o8e(new igf(ewa.M0), 0, (igf) null, 6));
            } else if (!(kx7 instanceof xw7)) {
                if (kx7 instanceof zw7) {
                    s85 s853 = ((en9) this.b).t1;
                    fk9 fk93 = fk9.b;
                    String str6 = ((zw7) kx7).a;
                    fk93.getClass();
                    a81.r(":chat-list?folder_id=" + str6, s853);
                } else if (kx7 instanceof jx7) {
                    xag.h(((en9) this.b).q1, new o8e(new igf(ewa.O), 0, new igf(ewa.N), 2));
                } else if (kx7 instanceof ax7) {
                    en9 en92 = (en9) this.b;
                    s85 s854 = en92.t1;
                    fk9 fk94 = fk9.b;
                    ax7 ax7 = (ax7) kx7;
                    long j3 = ax7.a;
                    Long boxLong = Boxing.boxLong(en92.b.a);
                    String str7 = ax7.b;
                    kfg kfg = kfg.URL;
                    fk94.getClass();
                    xag.h(s854, fk9.q1(j3, kfg, boxLong, str7));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        String a2 = kx7.a();
        if (a2 != null) {
            xag.h(((en9) this.b).t1, new ne5(a2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object l(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.q4a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            q4a r0 = (defpackage.q4a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            q4a r0 = new q4a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            w88 r5 = (defpackage.w88) r5
            java.lang.Object r5 = r4.c
            qjd r5 = (defpackage.qjd) r5
            long r5 = r5.s()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r0.b = r3
            java.lang.Object r4 = r4.b
            ds5 r4 = (defpackage.ds5) r4
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.l(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.thb
            if (r0 == 0) goto L_0x0013
            r0 = r6
            thb r0 = (defpackage.thb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            thb r0 = new thb
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r4.c
            whb r2 = (defpackage.whb) r2
            etc r2 = r2.z0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            shb r2 = (defpackage.shb) r2
            java.lang.String r2 = r2.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x005b
            r0.b = r3
            java.lang.Object r4 = r4.b
            ds5 r4 = (defpackage.ds5) r4
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x005b
            return r1
        L_0x005b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object n(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yhb
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yhb r0 = (defpackage.yhb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            yhb r0 = new yhb
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0062
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            ss2 r7 = (defpackage.ss2) r7
            java.lang.Object r2 = r5.c
            kib r2 = (defpackage.kib) r2
            r2.getClass()
            ss2 r4 = defpackage.ss2.c
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r7 != 0) goto L_0x0048
            r7 = 0
            goto L_0x0053
        L_0x0048:
            xme r7 = r2.c
            java.lang.Object r7 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            r7 = r7 ^ r3
        L_0x0053:
            if (r7 != 0) goto L_0x0062
            r0.b = r3
            java.lang.Object r5 = r5.b
            ds5 r5 = (defpackage.ds5) r5
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x0062
            return r1
        L_0x0062:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object o(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yjb
            if (r0 == 0) goto L_0x0013
            r0 = r6
            yjb r0 = (defpackage.yjb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            yjb r0 = new yjb
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            po3 r5 = (defpackage.po3) r5
            java.lang.Object r6 = r4.c
            akb r6 = (defpackage.akb) r6
            java.util.List r5 = defpackage.akb.j(r6, r5)
            r0.b = r3
            java.lang.Object r4 = r4.b
            ds5 r4 = (defpackage.ds5) r4
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x004b
            return r1
        L_0x004b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v26, types: [r3, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06f0  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x084e  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x085a  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x08d1  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x08dd  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x091a  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0926  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0988  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x09dd  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x09e9  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0a26  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0a66  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0a69  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0aa2  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0ab7  */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0b39  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0b4e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0b9a  */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0ba7  */
    /* JADX WARNING: Removed duplicated region for block: B:576:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:589:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:592:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:595:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r31, kotlin.coroutines.Continuation r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            java.lang.String r3 = "\""
            java.lang.String r4 = "Unknown connection state \""
            r5 = 3
            r6 = 0
            r8 = 2
            r9 = 1
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r12 = r0.a
            switch(r12) {
                case 0: goto L_0x0b7a;
                case 1: goto L_0x0b19;
                case 2: goto L_0x0a82;
                case 3: goto L_0x0a06;
                case 4: goto L_0x09bd;
                case 5: goto L_0x095c;
                case 6: goto L_0x08fa;
                case 7: goto L_0x08b1;
                case 8: goto L_0x082e;
                case 9: goto L_0x04c6;
                case 10: goto L_0x0448;
                case 11: goto L_0x03ec;
                case 12: goto L_0x0385;
                case 13: goto L_0x0357;
                case 14: goto L_0x030e;
                case 15: goto L_0x024a;
                case 16: goto L_0x0188;
                case 17: goto L_0x011f;
                case 18: goto L_0x0092;
                case 19: goto L_0x008d;
                case 20: goto L_0x0088;
                case 21: goto L_0x0083;
                case 22: goto L_0x007e;
                case 23: goto L_0x0079;
                case 24: goto L_0x0074;
                case 25: goto L_0x006f;
                case 26: goto L_0x006a;
                case 27: goto L_0x0065;
                case 28: goto L_0x0060;
                default: goto L_0x0017;
            }
        L_0x0017:
            boolean r3 = r2 instanceof defpackage.rkb
            if (r3 == 0) goto L_0x0028
            r3 = r2
            rkb r3 = (defpackage.rkb) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0028
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x002d
        L_0x0028:
            rkb r3 = new rkb
            r3.<init>(r0, r2)
        L_0x002d:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0043
            if (r5 != r9) goto L_0x003d
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x005d
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.c
            skb r2 = (defpackage.skb) r2
            java.util.ArrayList r1 = defpackage.skb.j(r2, r1)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x005f:
            return r4
        L_0x0060:
            java.lang.Object r0 = r30.o(r31, r32)
            return r0
        L_0x0065:
            java.lang.Object r0 = r30.n(r31, r32)
            return r0
        L_0x006a:
            java.lang.Object r0 = r30.m(r31, r32)
            return r0
        L_0x006f:
            java.lang.Object r0 = r30.l(r31, r32)
            return r0
        L_0x0074:
            java.lang.Object r0 = r30.k(r31, r32)
            return r0
        L_0x0079:
            java.lang.Object r0 = r30.j(r31, r32)
            return r0
        L_0x007e:
            java.lang.Object r0 = r30.i(r31, r32)
            return r0
        L_0x0083:
            java.lang.Object r0 = r30.h(r31, r32)
            return r0
        L_0x0088:
            java.lang.Object r0 = r30.f(r31, r32)
            return r0
        L_0x008d:
            java.lang.Object r0 = r30.e(r31, r32)
            return r0
        L_0x0092:
            boolean r3 = r2 instanceof defpackage.vd7
            if (r3 == 0) goto L_0x00a3
            r3 = r2
            vd7 r3 = (defpackage.vd7) r3
            int r4 = r3.b
            r7 = r4 & r11
            if (r7 == 0) goto L_0x00a3
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x00a8
        L_0x00a3:
            vd7 r3 = new vd7
            r3.<init>(r0, r2)
        L_0x00a8:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r7 = r3.b
            if (r7 == 0) goto L_0x00be
            if (r7 != r9) goto L_0x00b8
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x011c
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x00be:
            kotlin.ResultKt.throwOnFailure(r2)
            o85 r1 = (defpackage.o85) r1
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            wk6[] r2 = new defpackage.wk6[r5]
            java.lang.Object r5 = r0.c
            yd7 r5 = (defpackage.yd7) r5
            xme r7 = r5.w
            java.lang.Object r7 = r7.getValue()
            r2[r6] = r7
            xme r6 = r5.z
            java.lang.Object r6 = r6.getValue()
            r2[r9] = r6
            xme r5 = r5.y
            java.lang.Object r5 = r5.getValue()
            r2[r8] = r5
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00f4:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0109
            java.lang.Object r6 = r2.next()
            r7 = r6
            wk6 r7 = (defpackage.wk6) r7
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x00f4
            r5.add(r6)
            goto L_0x00f4
        L_0x0109:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r5, r1)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x011e:
            return r4
        L_0x011f:
            boolean r6 = r2 instanceof defpackage.r86
            if (r6 == 0) goto L_0x0130
            r6 = r2
            r86 r6 = (defpackage.r86) r6
            int r7 = r6.b
            r12 = r7 & r11
            if (r12 == 0) goto L_0x0130
            int r7 = r7 - r11
            r6.b = r7
            goto L_0x0135
        L_0x0130:
            r86 r6 = new r86
            r6.<init>(r0, r2)
        L_0x0135:
            java.lang.Object r2 = r6.a
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r11 = r6.b
            if (r11 == 0) goto L_0x014b
            if (r11 != r9) goto L_0x0145
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0185
        L_0x0145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x014b:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r0.c
            w86 r2 = (defpackage.w86) r2
            r2.getClass()
            if (r1 == 0) goto L_0x0176
            if (r1 == r9) goto L_0x0173
            if (r1 == r8) goto L_0x0170
            if (r1 != r5) goto L_0x0166
            gx6 r1 = defpackage.gx6.c
            goto L_0x0178
        L_0x0166:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = defpackage.a81.j(r1, r4, r3)
            r0.<init>(r1)
            throw r0
        L_0x0170:
            ix6 r1 = defpackage.ix6.c
            goto L_0x0178
        L_0x0173:
            hx6 r1 = defpackage.hx6.c
            goto L_0x0178
        L_0x0176:
            fx6 r1 = defpackage.fx6.c
        L_0x0178:
            r6.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r6)
            if (r0 != r7) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x0187:
            return r7
        L_0x0188:
            boolean r3 = r2 instanceof defpackage.jq4
            if (r3 == 0) goto L_0x0199
            r3 = r2
            jq4 r3 = (defpackage.jq4) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0199
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x019e
        L_0x0199:
            jq4 r3 = new jq4
            r3.<init>(r0, r2)
        L_0x019e:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x01b5
            if (r5 != r9) goto L_0x01af
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0247
        L_0x01af:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x01b5:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01c5:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01de
            java.lang.Object r5 = r1.next()
            r6 = r5
            iq4 r6 = (defpackage.iq4) r6
            int r7 = r6.b
            if (r7 <= 0) goto L_0x01c5
            int r6 = r6.c
            if (r6 <= 0) goto L_0x01c5
            r2.add(r5)
            goto L_0x01c5
        L_0x01de:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r1.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x01eb:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x023a
            java.lang.Object r5 = r2.next()
            iq4 r5 = (defpackage.iq4) r5
            java.lang.Object r6 = r0.c
            lq4 r6 = (defpackage.lq4) r6
            r6.getClass()
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r6 = r5.a
            r3 r7 = new r3
            r7.<init>()
            r7.c = r9
            int r10 = r5.b
            r7.a = r10
            int r5 = r5.c
            r7.b = r5
            a9g r5 = r6.getType()
            a9g r10 = defpackage.a9g.b
            if (r5 != r10) goto L_0x0219
            r5 = r8
            goto L_0x021a
        L_0x0219:
            r5 = r9
        L_0x021a:
            r7.c = r5
            int r5 = r7.a
            if (r5 <= 0) goto L_0x0232
            int r5 = r7.b
            if (r5 <= 0) goto L_0x0232
            y4g r5 = new y4g
            r5.<init>(r7)
            ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem r7 = new ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem
            r7.<init>(r6, r5)
            r1.add(r7)
            goto L_0x01eb
        L_0x0232:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "width and height must be positive"
            r0.<init>(r1)
            throw r0
        L_0x023a:
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0249:
            return r4
        L_0x024a:
            boolean r3 = r2 instanceof defpackage.wp3
            if (r3 == 0) goto L_0x025b
            r3 = r2
            wp3 r3 = (defpackage.wp3) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x025b
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0260
        L_0x025b:
            wp3 r3 = new wp3
            r3.<init>(r0, r2)
        L_0x0260:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0277
            if (r5 != r9) goto L_0x0271
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x030b
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0277:
            kotlin.ResultKt.throwOnFailure(r2)
            po3 r1 = (defpackage.po3) r1
            java.lang.Object r2 = r0.c
            yp3 r2 = (defpackage.yp3) r2
            eq3 r2 = r2.b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0292
            if (r2 != r9) goto L_0x028c
            goto L_0x02fe
        L_0x028c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0292:
            java.util.List r2 = r1.a
            if (r2 == 0) goto L_0x02f8
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02a1:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x02f6
            java.lang.Object r6 = r2.next()
            zo3 r6 = (defpackage.zo3) r6
            boolean r8 = r6.y0
            if (r8 == 0) goto L_0x02b3
            r7 = 0
            goto L_0x02f0
        L_0x02b3:
            zo3 r28 = new zo3
            r10 = r28
            r25 = 1
            int r11 = r6.x0
            r26 = r11
            long r11 = r6.a
            java.lang.CharSequence r13 = r6.b
            java.lang.CharSequence r14 = r6.c
            java.util.List r15 = r6.o
            java.lang.CharSequence r7 = r6.v
            r16 = r7
            java.lang.CharSequence r7 = r6.w
            r17 = r7
            android.net.Uri r7 = r6.x
            r18 = r7
            boolean r7 = r6.y
            r19 = r7
            boolean r7 = r6.z
            r20 = r7
            java.lang.CharSequence r7 = r6.X
            r21 = r7
            boolean r7 = r6.Y
            r22 = r7
            qdb r7 = r6.Z
            r23 = r7
            java.lang.Boolean r6 = r6.v0
            r24 = r6
            r27 = r8
            r10.<init>((long) r11, (java.lang.CharSequence) r13, (java.lang.CharSequence) r14, (java.util.List) r15, (java.lang.CharSequence) r16, (java.lang.CharSequence) r17, (android.net.Uri) r18, (boolean) r19, (boolean) r20, (java.lang.CharSequence) r21, (boolean) r22, (defpackage.qdb) r23, (java.lang.Boolean) r24, (boolean) r25, (int) r26, (boolean) r27)
            r7 = r28
        L_0x02f0:
            if (r7 == 0) goto L_0x02a1
            r5.add(r7)
            goto L_0x02a1
        L_0x02f6:
            r7 = r5
            goto L_0x02f9
        L_0x02f8:
            r7 = 0
        L_0x02f9:
            r2 = 6
            po3 r1 = defpackage.po3.a(r1, r7, r2)
        L_0x02fe:
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x030d:
            return r4
        L_0x030e:
            boolean r3 = r2 instanceof defpackage.hn3
            if (r3 == 0) goto L_0x031f
            r3 = r2
            hn3 r3 = (defpackage.hn3) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x031f
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0324
        L_0x031f:
            hn3 r3 = new hn3
            r3.<init>(r0, r2)
        L_0x0324:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x033a
            if (r5 != r9) goto L_0x0334
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0354
        L_0x0334:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x033a:
            kotlin.ResultKt.throwOnFailure(r2)
            vk3 r1 = (defpackage.vk3) r1
            java.lang.Object r2 = r0.c
            pn3 r2 = (defpackage.pn3) r2
            oz4 r1 = defpackage.pn3.o(r2, r1)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0354
            goto L_0x0356
        L_0x0354:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0356:
            return r4
        L_0x0357:
            java.lang.Object r1 = r0.b
            wf3 r1 = (defpackage.wf3) r1
            xme r2 = r1.A0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r2.setValue(r3)
            java.lang.Object r0 = r0.c
            j80 r0 = (defpackage.j80) r0
            java.util.List r2 = r0.o
            ytb r2 = defpackage.h88.N(r2)
            ef3 r3 = new ef3
            java.util.Map r0 = r0.c
            java.lang.String r4 = "REGISTER"
            java.lang.Object r0 = kotlin.collections.MapsKt.getValue(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            r3.<init>(r0, r2)
            s85 r0 = r1.w0
            defpackage.xag.h(r0, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0385:
            boolean r3 = r2 instanceof defpackage.bt2
            if (r3 == 0) goto L_0x0396
            r3 = r2
            bt2 r3 = (defpackage.bt2) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0396
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x039b
        L_0x0396:
            bt2 r3 = new bt2
            r3.<init>(r0, r2)
        L_0x039b:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x03b1
            if (r5 != r9) goto L_0x03ab
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x03e9
        L_0x03ab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x03b1:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x03bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03d9
            java.lang.Object r2 = r1.next()
            r5 = r2
            zx5 r5 = (defpackage.zx5) r5
            java.lang.String r5 = r5.a
            java.lang.Object r6 = r0.c
            ct2 r6 = (defpackage.ct2) r6
            java.lang.String r6 = r6.a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x03bc
            r7 = r2
            goto L_0x03da
        L_0x03d9:
            r7 = 0
        L_0x03da:
            if (r7 == 0) goto L_0x03e9
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r7, r3)
            if (r0 != r4) goto L_0x03e9
            goto L_0x03eb
        L_0x03e9:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x03eb:
            return r4
        L_0x03ec:
            boolean r3 = r2 instanceof defpackage.zp2
            if (r3 == 0) goto L_0x03fd
            r3 = r2
            zp2 r3 = (defpackage.zp2) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x03fd
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0402
        L_0x03fd:
            zp2 r3 = new zp2
            r3.<init>(r0, r2)
        L_0x0402:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0418
            if (r5 != r9) goto L_0x0412
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0445
        L_0x0412:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0418:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Object r2 = r0.b
            ds5 r2 = (defpackage.ds5) r2
            r5 = r1
            a32 r5 = (defpackage.a32) r5
            java.lang.Object r5 = r0.c
            dq2 r5 = (defpackage.dq2) r5
            kotlin.jvm.functions.Function0 r5 = r5.d
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0445
            java.lang.Object r0 = r0.c
            dq2 r0 = (defpackage.dq2) r0
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0445
            r3.b = r9
            java.lang.Object r0 = r2.a(r1, r3)
            if (r0 != r4) goto L_0x0445
            goto L_0x0447
        L_0x0445:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0447:
            return r4
        L_0x0448:
            boolean r6 = r2 instanceof defpackage.dp2
            if (r6 == 0) goto L_0x0459
            r6 = r2
            dp2 r6 = (defpackage.dp2) r6
            int r7 = r6.b
            r12 = r7 & r11
            if (r12 == 0) goto L_0x0459
            int r7 = r7 - r11
            r6.b = r7
            goto L_0x045e
        L_0x0459:
            dp2 r6 = new dp2
            r6.<init>(r0, r2)
        L_0x045e:
            java.lang.Object r2 = r6.a
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r11 = r6.b
            if (r11 == 0) goto L_0x0474
            if (r11 != r9) goto L_0x046e
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x04c3
        L_0x046e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0474:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            kotlin.reflect.KProperty[] r2 = defpackage.lp2.X0
            java.lang.Object r2 = r0.c
            lp2 r2 = (defpackage.lp2) r2
            r2.getClass()
            if (r1 == r9) goto L_0x04af
            if (r1 == r8) goto L_0x04a7
            if (r1 == r5) goto L_0x04a5
            java.lang.Class<lp2> r2 = defpackage.lp2.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r3 = 0
            defpackage.z68.f(r2, r1, r3)
        L_0x04a5:
            r2 = 0
            goto L_0x04b6
        L_0x04a7:
            int r1 = defpackage.qad.E1
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x04b6
        L_0x04af:
            int r1 = defpackage.qad.F1
            igf r2 = new igf
            r2.<init>(r1)
        L_0x04b6:
            r6.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r2, r6)
            if (r0 != r7) goto L_0x04c3
            goto L_0x04c5
        L_0x04c3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x04c5:
            return r7
        L_0x04c6:
            boolean r3 = r2 instanceof defpackage.am2
            if (r3 == 0) goto L_0x04d7
            r3 = r2
            am2 r3 = (defpackage.am2) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04d7
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x04dc
        L_0x04d7:
            am2 r3 = new am2
            r3.<init>(r0, r2)
        L_0x04dc:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r7 = 1
            if (r5 == 0) goto L_0x04f4
            if (r5 != r7) goto L_0x04ee
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x082b
        L_0x04ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x04f4:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Object r2 = r0.b
            ds5 r2 = (defpackage.ds5) r2
            a32 r1 = (defpackage.a32) r1
            java.lang.Object r0 = r0.c
            em2 r0 = (defpackage.em2) r0
            r0.getClass()
            m72 r5 = r1.b
            java.lang.String r5 = r5.I
            if (r5 == 0) goto L_0x0533
            boolean r8 = kotlin.text.StringsKt.isBlank(r5)
            if (r8 == 0) goto L_0x0511
            goto L_0x0533
        L_0x0511:
            kotlin.Lazy r8 = r0.l
            java.lang.Object r8 = r8.getValue()
            fz7 r8 = (defpackage.fz7) r8
            r8.getClass()
            android.net.Uri r9 = android.net.Uri.parse(r5)
            ty7 r10 = new ty7
            r10.<init>(r8, r6)
            ez7 r8 = r8.d(r9, r10)
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x052e
            goto L_0x0533
        L_0x052e:
            java.lang.String r5 = defpackage.hhf.c(r5)
            goto L_0x0534
        L_0x0533:
            r5 = 0
        L_0x0534:
            m72 r8 = r1.b
            long r10 = r8.a
            boolean r8 = r1.a()
            if (r8 != 0) goto L_0x0547
            boolean r8 = r1.b()
            if (r8 == 0) goto L_0x0545
            goto L_0x0547
        L_0x0545:
            r12 = r6
            goto L_0x0548
        L_0x0547:
            r12 = r7
        L_0x0548:
            r1.l0()
            java.lang.CharSequence r8 = r1.X
            if (r8 != 0) goto L_0x0553
            java.lang.String r8 = r1.r()
        L_0x0553:
            r15 = r8
            boolean r8 = r1.L()
            java.lang.String r14 = "not supported"
            if (r8 == 0) goto L_0x0568
            java.lang.CharSequence r8 = r1.q(r7)
            mgf r9 = new mgf
            r9.<init>(r8)
        L_0x0565:
            r17 = r9
            goto L_0x057f
        L_0x0568:
            boolean r8 = r1.K()
            if (r8 == 0) goto L_0x0578
            java.lang.CharSequence r8 = r1.q(r7)
            mgf r9 = new mgf
            r9.<init>(r8)
            goto L_0x0565
        L_0x0578:
            mgf r8 = new mgf
            r8.<init>(r14)
            r17 = r8
        L_0x057f:
            r1.m0()
            java.lang.CharSequence r8 = r1.v0
            if (r5 != 0) goto L_0x0588
            java.lang.String r5 = ""
        L_0x0588:
            mgf r13 = new mgf
            r13.<init>(r5)
            java.util.List r5 = r1.i()
            kl0 r9 = defpackage.kl0.b
            jl0 r6 = defpackage.jl0.a
            java.lang.String r6 = r1.h(r9, r6)
            boolean r9 = r1.Y()
            if (r9 != 0) goto L_0x05af
            vk3 r9 = r1.m()
            if (r9 == 0) goto L_0x05ac
            boolean r9 = r9.z()
            if (r9 != r7) goto L_0x05ac
            goto L_0x05af
        L_0x05ac:
            r20 = 0
            goto L_0x05b1
        L_0x05af:
            r20 = r7
        L_0x05b1:
            owb r9 = new owb
            r19 = 0
            r30 = r9
            r18 = r13
            r13 = r5
            r5 = r14
            r14 = r6
            r16 = r8
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r6 = r1.L()
            if (r6 == 0) goto L_0x06f0
            kotlin.Lazy r5 = r0.b
            java.lang.Object r5 = r5.getValue()
            gw0 r5 = (defpackage.gw0) r5
            kotlin.Lazy r6 = r0.i
            java.lang.Object r6 = r6.getValue()
            uj5 r6 = (defpackage.uj5) r6
            vj5 r6 = (defpackage.vj5) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.gce
            r9 = 0
            boolean r6 = r6.m(r8, r9)
            r5.getClass()
            java.util.List r8 = kotlin.collections.CollectionsKt.createListBuilder()
            boolean r9 = r1.Q()
            if (r9 == 0) goto L_0x0628
            if (r6 == 0) goto L_0x0628
            gqa r6 = new gqa
            int r11 = defpackage.jxa.l
            int r9 = defpackage.lxa.k
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            int r9 = defpackage.cad.c0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r15 = 158(0x9e, float:2.21E-43)
            r12 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r8.add(r6)
            gqa r6 = new gqa
            int r17 = defpackage.jxa.q1
            int r9 = defpackage.lxa.N
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)
            int r9 = defpackage.cad.m2
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)
            r21 = 158(0x9e, float:2.21E-43)
            r18 = 0
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            r8.add(r6)
        L_0x0628:
            kotlin.Lazy r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            x23 r5 = (defpackage.x23) r5
            boolean r5 = r1.X(r5)
            if (r5 == 0) goto L_0x063b
            gqa r5 = defpackage.gw0.b()
            goto L_0x063f
        L_0x063b:
            gqa r5 = defpackage.gw0.c()
        L_0x063f:
            boolean r6 = r1.T()
            r6 = r6 ^ r7
            gqa r5 = defpackage.gqa.a(r5, r6)
            r8.add(r5)
            boolean r5 = r1.N()
            if (r5 != 0) goto L_0x065a
            m72 r5 = r1.b
            k72 r5 = r5.c
            k72 r9 = defpackage.k72.c
            if (r5 != r9) goto L_0x065a
            goto L_0x066e
        L_0x065a:
            boolean r5 = r1.U()
            if (r5 != 0) goto L_0x066e
            boolean r5 = r1.M()
            if (r5 == 0) goto L_0x0667
            goto L_0x066e
        L_0x0667:
            gqa r5 = defpackage.gw0.d()
            r8.add(r5)
        L_0x066e:
            gqa r5 = defpackage.gw0.a()
            gqa r5 = defpackage.gqa.a(r5, r6)
            r8.add(r5)
            java.util.List r5 = kotlin.collections.CollectionsKt.build(r8)
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            ind r0 = (defpackage.ind) r0
            r0.getClass()
            java.util.List r6 = kotlin.collections.CollectionsKt.createListBuilder()
            r8 = 0
            r0.b(r6, r8, r1)
            yva r11 = r0.a()
            java.lang.String r12 = r1.l()
            r11.getClass()
            r15 = 0
            r18 = 1
            r14 = 1
            r16 = 1
            r17 = 0
            r13 = r7
            java.lang.CharSequence r8 = r11.a(r12, r13, r14, r15, r16, r17, r18)
            if (r8 == 0) goto L_0x06b9
            int r9 = r8.length()
            if (r9 != 0) goto L_0x06b1
            goto L_0x06b9
        L_0x06b1:
            g3c r9 = new g3c
            r9.<init>(r8)
            r6.add(r9)
        L_0x06b9:
            boolean r8 = r1.c0()
            m72 r9 = r1.b
            if (r8 == 0) goto L_0x06d1
            d3c r8 = new d3c
            java.util.Map r10 = r9.R
            int r10 = r10.size()
            r11 = 64
            r8.<init>(r10, r11)
            r6.add(r8)
        L_0x06d1:
            e3c r8 = new e3c
            r8.<init>()
            r6.add(r8)
            int r8 = r9.c()
            if (r8 == 0) goto L_0x06ea
            kotlin.Lazy r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            c3c r0 = (defpackage.c3c) r0
            r6.add(r0)
        L_0x06ea:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r6)
            goto L_0x07ec
        L_0x06f0:
            boolean r6 = r1.K()
            if (r6 == 0) goto L_0x07c8
            kotlin.Lazy r6 = r0.b
            java.lang.Object r6 = r6.getValue()
            gw0 r6 = (defpackage.gw0) r6
            r6.getClass()
            java.util.List r8 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.Lazy r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            x23 r6 = (defpackage.x23) r6
            boolean r6 = r1.X(r6)
            if (r6 == 0) goto L_0x0718
            gqa r6 = defpackage.gw0.b()
            goto L_0x071c
        L_0x0718:
            gqa r6 = defpackage.gw0.c()
        L_0x071c:
            boolean r9 = r1.T()
            r9 = r9 ^ r7
            gqa r6 = defpackage.gqa.a(r6, r9)
            r8.add(r6)
            gqa r6 = defpackage.gw0.d()
            r8.add(r6)
            gqa r6 = defpackage.gw0.a()
            gqa r6 = defpackage.gqa.a(r6, r9)
            r8.add(r6)
            java.util.List r6 = kotlin.collections.CollectionsKt.build(r8)
            java.lang.String r8 = r0.k
            defpackage.z68.p(r8, r5)
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            ind r0 = (defpackage.ind) r0
            r0.getClass()
            java.util.List r5 = kotlin.collections.CollectionsKt.createListBuilder()
            r8 = 0
            r0.b(r5, r8, r1)
            boolean r8 = r1.b0()
            m72 r9 = r1.b
            if (r8 == 0) goto L_0x076e
            boolean r8 = r9.e()
            if (r8 == 0) goto L_0x076e
            f3c r8 = new f3c
            java.lang.String r10 = r9.I
            r8.<init>(r10)
            r5.add(r8)
        L_0x076e:
            yva r11 = r0.a()
            java.lang.String r12 = r1.l()
            r11.getClass()
            r15 = 0
            r18 = 1
            r14 = 1
            r16 = 1
            r17 = 0
            r13 = r7
            java.lang.CharSequence r0 = r11.a(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0797
            int r8 = r0.length()
            if (r8 != 0) goto L_0x078f
            goto L_0x0797
        L_0x078f:
            g3c r8 = new g3c
            r8.<init>(r0)
            r5.add(r8)
        L_0x0797:
            e3c r0 = new e3c
            r0.<init>()
            r5.add(r0)
            boolean r0 = r1.c0()
            if (r0 == 0) goto L_0x07c2
            d3c r0 = new d3c
            java.util.Map r8 = r9.R
            int r8 = r8.size()
            r10 = 536870976(0x20000040, float:1.0842104E-19)
            r0.<init>(r8, r10)
            r5.add(r0)
            q3c r0 = new q3c
            int r8 = r9.c()
            r0.<init>(r8)
            r5.add(r0)
        L_0x07c2:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r5)
            r5 = r6
            goto L_0x07ec
        L_0x07c8:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            m72 r6 = r1.b
            l72 r6 = r6.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "unsupported chat type "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r0 = r0.k
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r6)
            defpackage.z68.o(r0, r6, r8)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x07ec:
            java.util.List r6 = kotlin.collections.CollectionsKt.createListBuilder()
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x0802
            a3c r8 = new a3c
            r8.<init>(r5)
            r6.add(r8)
        L_0x0802:
            boolean r1 = r1.T()
            if (r1 == 0) goto L_0x0812
            b3c r1 = new b3c
            int r5 = defpackage.lxa.g
            r1.<init>(r5)
            r6.add(r1)
        L_0x0812:
            java.util.Collection r0 = (java.util.Collection) r0
            r6.addAll(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r6)
            fwb r1 = new fwb
            r5 = r30
            r1.<init>(r5, r0)
            r3.b = r7
            java.lang.Object r0 = r2.a(r1, r3)
            if (r0 != r4) goto L_0x082b
            goto L_0x082d
        L_0x082b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x082d:
            return r4
        L_0x082e:
            boolean r3 = r2 instanceof defpackage.eh2
            if (r3 == 0) goto L_0x083f
            r3 = r2
            eh2 r3 = (defpackage.eh2) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x083f
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0844
        L_0x083f:
            eh2 r3 = new eh2
            r3.<init>(r0, r2)
        L_0x0844:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x085a
            if (r5 != r9) goto L_0x0854
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x08ae
        L_0x0854:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x085a:
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r1
            os8 r2 = (defpackage.os8) r2
            long r5 = r2.d
            java.lang.Object r7 = r0.c
            gh2 r7 = (defpackage.gh2) r7
            long r10 = r7.b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x08ae
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Set r2 = r2.c
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x087b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x088f
            java.lang.Object r6 = r2.next()
            b10 r6 = (defpackage.b10) r6
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            goto L_0x087b
        L_0x088f:
            java.util.HashSet r2 = kotlin.collections.CollectionsKt.toHashSet(r5)
            kotlin.Lazy r5 = r7.K0
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            boolean r2 = r2.containsAll(r5)
            if (r2 == 0) goto L_0x08ae
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x08ae
            goto L_0x08b0
        L_0x08ae:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x08b0:
            return r4
        L_0x08b1:
            boolean r3 = r2 instanceof defpackage.h82
            if (r3 == 0) goto L_0x08c2
            r3 = r2
            h82 r3 = (defpackage.h82) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x08c2
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x08c7
        L_0x08c2:
            h82 r3 = new h82
            r3.<init>(r0, r2)
        L_0x08c7:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x08dd
            if (r5 != r9) goto L_0x08d7
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x08f7
        L_0x08d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x08dd:
            kotlin.ResultKt.throwOnFailure(r2)
            a32 r1 = (defpackage.a32) r1
            java.lang.Object r2 = r0.c
            m82 r2 = (defpackage.m82) r2
            nz4 r1 = defpackage.m82.o(r2, r1)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x08f7
            goto L_0x08f9
        L_0x08f7:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x08f9:
            return r4
        L_0x08fa:
            boolean r3 = r2 instanceof defpackage.hj1
            if (r3 == 0) goto L_0x090b
            r3 = r2
            hj1 r3 = (defpackage.hj1) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x090b
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0910
        L_0x090b:
            hj1 r3 = new hj1
            r3.<init>(r0, r2)
        L_0x0910:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0926
            if (r5 != r9) goto L_0x0920
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0959
        L_0x0920:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0926:
            kotlin.ResultKt.throwOnFailure(r2)
            i9b r1 = (defpackage.i9b) r1
            java.lang.Object r2 = r0.c
            jj1 r2 = (defpackage.jj1) r2
            hl1 r2 = r2.x
            java.util.Map r1 = r1.c
            int r1 = r1.size()
            int r1 = r1 + r9
            android.content.Context r2 = r2.a
            android.content.res.Resources r2 = r2.getResources()
            int r5 = defpackage.bkc.call_users_info_count
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r1 = r2.getQuantityString(r5, r1, r6)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0959
            goto L_0x095b
        L_0x0959:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x095b:
            return r4
        L_0x095c:
            boolean r3 = r2 instanceof defpackage.fd1
            if (r3 == 0) goto L_0x096d
            r3 = r2
            fd1 r3 = (defpackage.fd1) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x096d
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0972
        L_0x096d:
            fd1 r3 = new fd1
            r3.<init>(r0, r2)
        L_0x0972:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0988
            if (r5 != r9) goto L_0x0982
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x09ba
        L_0x0982:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0988:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r2 = r0.c
            gd1 r2 = (defpackage.gd1) r2
            kotlin.Lazy r5 = r2.o
            java.lang.Object r5 = r5.getValue()
            hl1 r5 = (defpackage.hl1) r5
            ph1 r2 = r2.c
            jj1 r2 = (defpackage.jj1) r2
            etc r2 = r2.C0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            k91 r2 = (defpackage.k91) r2
            li1 r2 = r2.j
            java.lang.String r1 = r5.g(r1, r2)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x09ba
            goto L_0x09bc
        L_0x09ba:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x09bc:
            return r4
        L_0x09bd:
            boolean r3 = r2 instanceof defpackage.xq0
            if (r3 == 0) goto L_0x09ce
            r3 = r2
            xq0 r3 = (defpackage.xq0) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x09ce
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x09d3
        L_0x09ce:
            xq0 r3 = new xq0
            r3.<init>(r0, r2)
        L_0x09d3:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x09e9
            if (r5 != r9) goto L_0x09e3
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0a03
        L_0x09e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x09e9:
            kotlin.ResultKt.throwOnFailure(r2)
            vk3 r1 = (defpackage.vk3) r1
            java.lang.Object r2 = r0.c
            yq0 r2 = (defpackage.yq0) r2
            fwb r1 = r2.E(r1)
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0a03
            goto L_0x0a05
        L_0x0a03:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0a05:
            return r4
        L_0x0a06:
            boolean r3 = r2 instanceof defpackage.an0
            if (r3 == 0) goto L_0x0a17
            r3 = r2
            an0 r3 = (defpackage.an0) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0a17
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0a1c
        L_0x0a17:
            an0 r3 = new an0
            r3.<init>(r0, r2)
        L_0x0a1c:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0a3a
            if (r5 == r9) goto L_0x0a34
            if (r5 != r8) goto L_0x0a2e
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0a7f
        L_0x0a2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0a34:
            ds5 r0 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0a62
        L_0x0a3a:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.b
            ds5 r2 = (defpackage.ds5) r2
            if (r1 == 0) goto L_0x0a71
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0a4c
            goto L_0x0a71
        L_0x0a4c:
            r3.c = r2
            r3.b = r9
            java.lang.Object r0 = r0.c
            bn0 r0 = (defpackage.bn0) r0
            r5 = 0
            java.lang.Object r0 = defpackage.bn0.e(r0, r1, r5, r3)
            if (r0 != r4) goto L_0x0a5d
            goto L_0x0a81
        L_0x0a5d:
            r29 = r2
            r2 = r0
            r0 = r29
        L_0x0a62:
            kotlin.Pair r2 = (kotlin.Pair) r2
            if (r2 != 0) goto L_0x0a69
            r1 = 0
        L_0x0a67:
            r2 = 0
            goto L_0x0a74
        L_0x0a69:
            java.lang.Object r1 = r2.component2()
            java.util.List r1 = (java.util.List) r1
            r2 = r0
            goto L_0x0a72
        L_0x0a71:
            r1 = 0
        L_0x0a72:
            r0 = r2
            goto L_0x0a67
        L_0x0a74:
            r3.c = r2
            r3.b = r8
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0a7f
            goto L_0x0a81
        L_0x0a7f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0a81:
            return r4
        L_0x0a82:
            boolean r3 = r2 instanceof defpackage.kg0
            if (r3 == 0) goto L_0x0a93
            r3 = r2
            kg0 r3 = (defpackage.kg0) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0a93
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0a98
        L_0x0a93:
            kg0 r3 = new kg0
            r3.<init>(r0, r2)
        L_0x0a98:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0ab7
            if (r5 == r9) goto L_0x0ab0
            if (r5 != r8) goto L_0x0aaa
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0b16
        L_0x0aaa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0ab0:
            ds5 r0 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
        L_0x0ab5:
            r1 = 0
            goto L_0x0b0b
        L_0x0ab7:
            kotlin.ResultKt.throwOnFailure(r2)
            ms2 r1 = (defpackage.ms2) r1
            java.lang.Object r1 = r0.c
            ng0 r1 = (defpackage.ng0) r1
            qx2 r1 = r1.b
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            r3.c = r0
            r3.b = r9
            my2 r1 = (defpackage.my2) r1
            r62 r1 = r1.n()
            r1.getClass()
            java.util.EnumSet r2 = defpackage.r62.K
            t52 r5 = new t52
            r6 = 0
            r5.<init>(r1, r6, r6)
            java.util.ArrayList r1 = r1.H(r2, r6, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0ae3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0af5
            java.lang.Object r2 = r1.next()
            a32 r2 = (defpackage.a32) r2
            m72 r2 = r2.b
            int r2 = r2.m
            int r6 = r6 + r2
            goto L_0x0ae3
        L_0x0af5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "r62"
            java.lang.String r5 = "getAllNewMessagesCount: %d"
            defpackage.z68.c(r2, r5, r1)
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            if (r2 != r4) goto L_0x0ab5
            goto L_0x0b18
        L_0x0b0b:
            r3.c = r1
            r3.b = r8
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r4) goto L_0x0b16
            goto L_0x0b18
        L_0x0b16:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0b18:
            return r4
        L_0x0b19:
            boolean r3 = r2 instanceof defpackage.qr
            if (r3 == 0) goto L_0x0b2a
            r3 = r2
            qr r3 = (defpackage.qr) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0b2a
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0b2f
        L_0x0b2a:
            qr r3 = new qr
            r3.<init>(r0, r2)
        L_0x0b2f:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0b4e
            if (r5 == r9) goto L_0x0b47
            if (r5 != r8) goto L_0x0b41
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0b77
        L_0x0b41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0b47:
            ds5 r0 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
        L_0x0b4c:
            r1 = 0
            goto L_0x0b6c
        L_0x0b4e:
            kotlin.ResultKt.throwOnFailure(r2)
            uy4 r1 = (defpackage.uy4) r1
            kotlin.reflect.KProperty[] r1 = one.me.appearancesettings.AppearanceSettingsScreen.y
            java.lang.Object r1 = r0.c
            one.me.appearancesettings.AppearanceSettingsScreen r1 = (one.me.appearancesettings.AppearanceSettingsScreen) r1
            as r1 = r1.c0()
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            r3.c = r0
            r3.b = r9
            java.lang.Object r2 = r1.k(r3)
            if (r2 != r4) goto L_0x0b4c
            goto L_0x0b79
        L_0x0b6c:
            r3.c = r1
            r3.b = r8
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r4) goto L_0x0b77
            goto L_0x0b79
        L_0x0b77:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0b79:
            return r4
        L_0x0b7a:
            boolean r3 = r2 instanceof defpackage.ub
            if (r3 == 0) goto L_0x0b8b
            r3 = r2
            ub r3 = (defpackage.ub) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0b8b
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x0b90
        L_0x0b8b:
            ub r3 = new ub
            r3.<init>(r0, r2)
        L_0x0b90:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0ba7
            if (r5 != r9) goto L_0x0ba1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0c1e
        L_0x0ba1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0ba7:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.List r1 = (java.util.List) r1
            kotlin.reflect.KProperty[] r2 = defpackage.xb.X
            java.lang.Object r2 = r0.c
            xb r2 = (defpackage.xb) r2
            r2.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0bc0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0c11
            java.lang.Object r6 = r1.next()
            r7 = r6
            bb r7 = (defpackage.bb) r7
            kotlin.Lazy r8 = r2.o
            java.lang.Object r8 = r8.getValue()
            qx2 r8 = (defpackage.qx2) r8
            long r10 = r2.b
            my2 r8 = (defpackage.my2) r8
            etc r8 = r8.o(r10)
            ome r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            a32 r8 = (defpackage.a32) r8
            if (r8 == 0) goto L_0x0c0d
            java.util.ArrayList r8 = r8.k()
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0bf2
            goto L_0x0c0d
        L_0x0bf2:
            java.util.Iterator r8 = r8.iterator()
        L_0x0bf6:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0c0d
            java.lang.Object r10 = r8.next()
            vk3 r10 = (defpackage.vk3) r10
            long r10 = r10.r()
            long r12 = r7.a
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0bf6
            goto L_0x0bc0
        L_0x0c0d:
            r5.add(r6)
            goto L_0x0bc0
        L_0x0c11:
            r3.b = r9
            java.lang.Object r0 = r0.b
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r5, r3)
            if (r0 != r4) goto L_0x0c1e
            goto L_0x0c20
        L_0x0c1e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0c20:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
