package ru.ok.tamtam.calls;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/calls/CallDialogViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "k41", "call-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallDialogViewModel.kt\nru/ok/tamtam/calls/CallDialogViewModel\n+ 2 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n*L\n1#1,400:1\n77#2:401\n77#2:402\n77#2:403\n77#2:404\n*S KotlinDebug\n*F\n+ 1 CallDialogViewModel.kt\nru/ok/tamtam/calls/CallDialogViewModel\n*L\n280#1:401\n283#1:402\n291#1:403\n301#1:404\n*E\n"})
public final class CallDialogViewModel extends AndroidViewModel {
    public final r62 d;
    public final km3 e;
    public final yva f;
    public final aqg g;
    public final wq6 h;
    public final f41 i;
    public final xme j;
    public final xme k;
    public final xme l;
    public final xme m;
    public final xme n;
    public final xme o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallDialogViewModel(Application application, hdd hdd, r62 r62, km3 km3, gaf gaf, rl rlVar, sv0 sv0, jbf jbf, gcf gcf, yva yva, ic1 ic1) {
        super(application);
        String str;
        Sequence sequence;
        vk3 p;
        a32 G;
        boolean z = true;
        this.d = r62;
        this.e = km3;
        this.f = yva;
        this.g = new aqg(rlVar, ((kbf) jbf).a(), gcf);
        this.h = new wq6(rlVar, sv0, ic1);
        f41 f41 = (f41) hdd.b("CallDialogInput");
        this.i = f41;
        pje pje = f41.a;
        if (pje instanceof mje) {
            str = application.getString(qad.W0);
        } else {
            if (pje instanceof lje) {
                if (r62.i && (G = r62.G(((lje) pje).a)) != null) {
                    str = G.r();
                }
            } else if ((pje instanceof oje) && km3.e && (p = km3.p(((oje) pje).a, false)) != null) {
                str = p.f();
            }
            str = null;
        }
        xme a = f6e.a(str);
        this.j = a;
        new etc(a);
        pje pje2 = f41.a;
        boolean z2 = pje2 instanceof kje;
        Object obj = g41.a;
        if (!z2 && !(pje2 instanceof lje)) {
            boolean z3 = pje2 instanceof mje;
            obj = g41.b;
            if (z3) {
                if (((mje) pje2).a.v > 0) {
                    int i2 = pad.a;
                    obj = new Object();
                }
            } else if (!(pje2 instanceof oje)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        xme a2 = f6e.a(obj);
        this.k = a2;
        new etc(a2);
        pje pje3 = f41.a;
        if (pje3 instanceof kje) {
            sequence = SequencesKt.sequenceOf(new t8b(0));
        } else if (pje3 instanceof lje) {
            lje lje = (lje) pje3;
            int c = r62.G(lje.a).b.c();
            sequence = SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, lje.c ? RangesKt.coerceAtLeast(c - 1, 0) : c)), new h9(15));
        } else if (pje3 instanceof mje) {
            if (km3.e) {
                try {
                    sequence = SequencesKt.sequenceOf(m(km3.p(((mje) pje3).a.a.a, false)));
                } catch (Throwable th) {
                    z68.f("CallDialogViewModel", "failed to sync load contact for anon call", th);
                }
            }
            sequence = SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, RangesKt.coerceAtLeast(((mje) pje3).a.v, 1))), new h9(16));
        } else if (pje3 instanceof oje) {
            sequence = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xme a3 = f6e.a(sequence != null ? SequencesKt.toList(sequence) : null);
        this.l = a3;
        new etc(a3);
        int i3 = qad.a;
        int i4 = qad.a;
        f41 f412 = this.i;
        pje pje4 = f412.a;
        if (pje4 instanceof kje) {
            int i5 = qad.a;
        } else if (pje4 instanceof lje) {
            boolean z4 = ((lje) pje4).c;
            int i6 = qad.a;
        } else if (pje4 instanceof oje) {
            int i7 = qad.a;
        } else if (pje4 instanceof mje) {
            int i8 = qad.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xme a4 = f6e.a(Boolean.valueOf(!f412.b && q8.d(this.c, "android.permission.RECORD_AUDIO") == 0));
        this.m = a4;
        new etc(a4);
        xme a5 = f6e.a(Boolean.valueOf((!this.i.c || q8.d(this.c, "android.permission.CAMERA") != 0) ? false : z));
        this.n = a5;
        new etc(a5);
        xme a6 = f6e.a((Object) null);
        this.o = a6;
        new etc(a6);
        new etc(f6e.a((Object) null));
        ev0.v(b0h.C(this), ((osa) gaf).a(), (f14) null, new j41(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(ru.ok.tamtam.calls.CallDialogViewModel r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.l41
            if (r0 == 0) goto L_0x0016
            r0 = r8
            l41 r0 = (defpackage.l41) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            l41 r0 = new l41
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.util.List r7 = r0.b
            java.util.List r7 = (java.util.List) r7
            ru.ok.tamtam.calls.CallDialogViewModel r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0038 }
            r2 = r7
            r7 = r0
            goto L_0x00ad
        L_0x0038:
            r8 = move-exception
            goto L_0x00c1
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005e
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r8)
            f41 r8 = r7.i
            pje r8 = r8.a
            boolean r2 = r8 instanceof defpackage.lje
            if (r2 == 0) goto L_0x0061
            lje r8 = (defpackage.lje) r8
            r0.v = r4
            java.lang.Object r8 = r7.l(r8, r0)
            if (r8 != r1) goto L_0x005e
            goto L_0x00dc
        L_0x005e:
            r1 = r8
            goto L_0x00dc
        L_0x0061:
            boolean r2 = r8 instanceof defpackage.mje
            xme r4 = r7.l
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r2 = r4.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0076
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            u8b r4 = (defpackage.u8b) r4
            goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            boolean r4 = r4 instanceof defpackage.s8b
            if (r4 == 0) goto L_0x007d
            r1 = r2
            goto L_0x00dc
        L_0x007d:
            km3 r4 = r7.e     // Catch:{ all -> 0x00b9 }
            mje r8 = (defpackage.mje) r8     // Catch:{ all -> 0x00b9 }
            d4g r8 = r8.a     // Catch:{ all -> 0x00b9 }
            fo3 r8 = r8.a     // Catch:{ all -> 0x00b9 }
            long r5 = r8.a     // Catch:{ all -> 0x00b9 }
            r4.getClass()     // Catch:{ all -> 0x00bf }
            rj0 r8 = new rj0     // Catch:{ all -> 0x00bf }
            r8.<init>(r4, r5)     // Catch:{ all -> 0x00bf }
            mka r4 = new mka     // Catch:{ all -> 0x00bf }
            r5 = 1
            r4.<init>(r5, r8)     // Catch:{ all -> 0x00bf }
            lfd r8 = defpackage.xfd.b()     // Catch:{ all -> 0x00bf }
            fce r8 = r4.n(r8)     // Catch:{ all -> 0x00bf }
            r0.a = r7     // Catch:{ all -> 0x00b9 }
            r4 = r2
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00bc }
            r0.b = r4     // Catch:{ all -> 0x00bc }
            r0.v = r3     // Catch:{ all -> 0x00b9 }
            java.lang.Object r8 = defpackage.bs0.f(r8, r0)     // Catch:{ all -> 0x00b9 }
            if (r8 != r1) goto L_0x00ad
            goto L_0x00dc
        L_0x00ad:
            vk3 r8 = (defpackage.vk3) r8     // Catch:{ all -> 0x00b9 }
            s8b r7 = r7.m(r8)     // Catch:{ all -> 0x00b9 }
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)     // Catch:{ all -> 0x00b9 }
        L_0x00b7:
            r1 = r7
            goto L_0x00dc
        L_0x00b9:
            r8 = move-exception
        L_0x00ba:
            r7 = r2
            goto L_0x00c1
        L_0x00bc:
            r7 = move-exception
        L_0x00bd:
            r8 = r7
            goto L_0x00ba
        L_0x00bf:
            r7 = move-exception
            goto L_0x00bd
        L_0x00c1:
            java.lang.String r0 = "CallDialogViewModel"
            java.lang.String r1 = "fail to load participants for anon call"
            defpackage.z68.f(r0, r1, r8)
            goto L_0x00b7
        L_0x00c9:
            boolean r7 = r8 instanceof defpackage.oje
            if (r7 != 0) goto L_0x00d8
            boolean r7 = r8 instanceof defpackage.kje
            if (r7 == 0) goto L_0x00d2
            goto L_0x00d8
        L_0x00d2:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x00d8:
            java.lang.Object r1 = r4.getValue()
        L_0x00dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.calls.CallDialogViewModel.j(ru.ok.tamtam.calls.CallDialogViewModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(ru.ok.tamtam.calls.CallDialogViewModel r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.n41
            if (r0 == 0) goto L_0x0016
            r0 = r6
            n41 r0 = (defpackage.n41) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            n41 r0 = new n41
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            ru.ok.tamtam.calls.CallDialogViewModel r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005f
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            f41 r6 = r5.i
            pje r6 = r6.a
            boolean r2 = r6 instanceof defpackage.mje
            xme r4 = r5.j
            if (r2 == 0) goto L_0x0073
            mje r6 = (defpackage.mje) r6
            d4g r6 = r6.a
            java.lang.String r6 = r6.b
            if (r6 == 0) goto L_0x006e
            int r2 = r6.length()
            if (r2 != 0) goto L_0x0052
            goto L_0x006e
        L_0x0052:
            r0.a = r5
            r0.o = r3
            wq6 r2 = r5.h
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L_0x005f
            goto L_0x00c8
        L_0x005f:
            java.lang.String r6 = (java.lang.String) r6
            android.app.Application r5 = r5.c
            int r0 = defpackage.qad.V
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r1 = r5.getString(r0, r6)
            goto L_0x00c8
        L_0x006e:
            java.lang.Object r1 = r4.getValue()
            goto L_0x00c8
        L_0x0073:
            boolean r0 = r6 instanceof defpackage.lje
            r1 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r4.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0086
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c4
        L_0x0086:
            lje r6 = (defpackage.lje) r6
            long r2 = r6.a
            r62 r5 = r5.d
            a32 r5 = r5.G(r2)
            if (r5 == 0) goto L_0x00c8
            java.lang.String r5 = r5.r()
        L_0x0096:
            r1 = r5
            goto L_0x00c8
        L_0x0098:
            boolean r0 = r6 instanceof defpackage.oje
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r4.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00aa
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c4
        L_0x00aa:
            oje r6 = (defpackage.oje) r6
            long r2 = r6.a
            r6 = 0
            km3 r5 = r5.e
            vk3 r5 = r5.p(r2, r6)
            if (r5 == 0) goto L_0x00c8
            java.lang.String r5 = r5.f()
            goto L_0x0096
        L_0x00bc:
            kje r5 = defpackage.kje.a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00c9
        L_0x00c4:
            java.lang.Object r1 = r4.getValue()
        L_0x00c8:
            return r1
        L_0x00c9:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.calls.CallDialogViewModel.k(ru.ok.tamtam.calls.CallDialogViewModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.lje r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r9 instanceof defpackage.m41
            if (r1 == 0) goto L_0x0014
            r1 = r9
            m41 r1 = (defpackage.m41) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.o = r2
            goto L_0x0019
        L_0x0014:
            m41 r1 = new m41
            r1.<init>(r7, r9)
        L_0x0019:
            java.lang.Object r9 = r1.b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.o
            r4 = 0
            if (r3 == 0) goto L_0x0034
            if (r3 != r0) goto L_0x002c
            ru.ok.tamtam.calls.CallDialogViewModel r7 = r1.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0058
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r9)
            long r5 = r8.a
            r62 r9 = r7.d
            a32 r9 = r9.G(r5)
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x00a0
            m72 r8 = r9.b
            nl r8 = r8.T
            if (r8 == 0) goto L_0x00a0
            r1.a = r7
            r1.o = r0
            aqg r9 = r7.g
            java.lang.String r8 = r8.b
            java.lang.Object r9 = r9.i(r8, r1)
            if (r9 != r2) goto L_0x0058
            return r2
        L_0x0058:
            java.util.List r9 = (java.util.List) r9
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x006f
            xme r7 = r7.l
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x006e
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L_0x006e:
            return r7
        L_0x006f:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            kotlin.sequences.Sequence r8 = kotlin.collections.CollectionsKt.asSequence(r9)
            i41 r9 = new i41
            r0 = 0
            r9.<init>(r7, r0)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.filter(r8, r9)
            r6 r9 = new r6
            r0 = 4
            r9.<init>(r0, r7)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.mapIndexedNotNull(r8, r9)
            java.util.List r8 = kotlin.sequences.SequencesKt.toList(r8)
            xme r7 = r7.k
            g41 r9 = new g41
            r8.size()
            int r0 = defpackage.pad.a
            r9.<init>()
            r7.getClass()
            r7.m(r4, r9)
            goto L_0x00e6
        L_0x00a0:
            m72 r8 = r9.b
            java.util.Map r8 = r8.e
            java.util.Set r8 = r8.keySet()
            kotlin.sequences.Sequence r8 = kotlin.collections.CollectionsKt.asSequence(r8)
            i41 r9 = new i41
            r9.<init>(r7, r0)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.mapNotNull(r8, r9)
            h9 r9 = new h9
            r1 = 17
            r9.<init>(r1)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.filter(r8, r9)
            ui0 r9 = new ui0
            r9.<init>(r0)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.mapIndexedNotNull(r8, r9)
            km3 r9 = r7.e
            vk3 r9 = r9.r()
            if (r9 == 0) goto L_0x00d9
            long r1 = r9.r()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
        L_0x00d9:
            wk r9 = new wk
            r9.<init>(r0, r4, r7)
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.map(r8, r9)
            java.util.List r8 = kotlin.sequences.SequencesKt.toList(r7)
        L_0x00e6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.calls.CallDialogViewModel.l(lje, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final s8b m(vk3 vk3) {
        boolean z = vk3.w;
        Application application = this.c;
        return new s8b(0, vk3, true, z ? application.getString(qad.S) : application.getString(qad.R, new Object[]{vk3.f()}));
    }
}
