package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: lb  reason: default package */
public final class lb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final jx3 f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final xme h = f6e.a(CollectionsKt.emptyList());
    public final xme i;
    public final etc j;
    public final n6e k;
    public final dtc l;

    public lb(gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = e14.a(((osa) gaf).b());
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.i = a2;
        this.j = new etc(a2);
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.k = b2;
        this.l = new dtc(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.lb r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.jb
            if (r0 == 0) goto L_0x0016
            r0 = r6
            jb r0 = (defpackage.jb) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            jb r0 = new jb
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.b
            lb r1 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x006e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            lb r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Lazy r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            eu3 r6 = (defpackage.eu3) r6
            r0.a = r5
            r0.v = r4
            km3 r6 = r6.a
            java.util.List r6 = r6.s()
            if (r6 != r1) goto L_0x0059
            goto L_0x0091
        L_0x0059:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            xme r4 = r5.h
            r0.a = r5
            r0.b = r6
            r0.v = r3
            r4.setValue(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            if (r2 != r1) goto L_0x006c
            goto L_0x0091
        L_0x006c:
            r1 = r5
            r5 = r6
        L_0x006e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)
            h9 r6 = new h9
            r2 = 7
            r6.<init>(r2)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.filterNot(r5, r6)
            f14 r6 = defpackage.f14.a
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            jx3 r0 = defpackage.e14.a(r6)
            ib r2 = new ib
            r2.<init>((defpackage.jx3) r0, (kotlin.coroutines.CoroutineContext) r6, (defpackage.lb) r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r5, r2)
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb.a(lb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final bb b(vk3 vk3) {
        String uri;
        Uri parse;
        String u = vk3.u(((qjd) ((x23) this.c.getValue())).p(), kl0.c);
        ngf igf = vk3.x() ? new igf(qad.J) : new mgf(((rtb) this.d.getValue()).d(vk3, true));
        long r = vk3.r();
        String f2 = vk3.f();
        if (f2 != null) {
            if (u == null || (parse = Uri.parse(u)) == null || (uri = parse.toString()) == null) {
                uri = Uri.EMPTY.toString();
            }
            return new bb(r, f2, igf, uri, vk3.q(), vk3.z());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
