package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: d0f  reason: default package */
public final class d0f extends SuspendLambda implements Function2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ b33 Y;
    public final /* synthetic */ int Z = 10;
    public List a;
    public Ref.IntRef b;
    public int c;
    public int o;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ u1f y;
    public final /* synthetic */ String z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0f(u1f u1f, String str, int i, b33 b33, Continuation continuation) {
        super(2, continuation);
        this.y = u1f;
        this.z = str;
        this.X = i;
        this.Y = b33;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d0f d0f = new d0f(this.y, this.z, this.X, this.Y, continuation);
        d0f.x = obj;
        return d0f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6 A[Catch:{ all -> 0x0121, all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012b A[Catch:{ all -> 0x0121, all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = 1
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.w
            r4 = 2
            int r6 = r1.Z
            u1f r8 = r1.y
            b33 r9 = r1.Y
            int r10 = r1.X
            java.lang.String r11 = r1.z
            if (r0 == 0) goto L_0x0055
            if (r0 == r2) goto L_0x0039
            if (r0 != r4) goto L_0x0031
            int r3 = r1.c
            kotlin.jvm.internal.Ref$IntRef r4 = r1.b
            java.util.List r0 = r1.a
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r1.x
            d14 r0 = (defpackage.d14) r0
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x002e }
            r0 = r18
            goto L_0x01ac
        L_0x002e:
            r0 = move-exception
            goto L_0x01b8
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            int r0 = r1.v
            int r12 = r1.o
            int r13 = r1.c
            kotlin.jvm.internal.Ref$IntRef r14 = r1.b
            java.util.List r15 = r1.a
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r4 = r1.x
            d14 r4 = (defpackage.d14) r4
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x0052 }
            r5 = r4
            r4 = r0
            r0 = r18
            goto L_0x00d8
        L_0x0052:
            r0 = move-exception
            goto L_0x0136
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r0 = r1.x
            r4 = r0
            d14 r4 = (defpackage.d14) r4
            java.lang.String r0 = r8.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r11)
            if (r0 == 0) goto L_0x006e
            int r0 = r8.b
            if (r0 != r10) goto L_0x006e
            boolean r0 = r8.f
            if (r0 != 0) goto L_0x006e
            return r8
        L_0x006e:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            java.lang.Object r0 = r9.a
            l72 r0 = (defpackage.l72) r0
            l72 r12 = defpackage.l72.b
            if (r0 == r12) goto L_0x0087
            l72 r12 = defpackage.l72.o
            if (r0 != r12) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r12 = 0
            goto L_0x0088
        L_0x0087:
            r12 = r2
        L_0x0088:
            s75 r0 = new s75
            r0.<init>(r11, r10, r2, r9)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            int r13 = r8.e
            if (r12 != 0) goto L_0x00af
            java.lang.Object r16 = r0.getValue()
            r7 = r16
            g0f r7 = (defpackage.g0f) r7
            g0f r5 = defpackage.g0f.c
            if (r7 == r5) goto L_0x00af
            java.lang.Object r0 = r0.getValue()
            g0f r0 = (defpackage.g0f) r0
            g0f r5 = defpackage.g0f.o
            if (r0 != r5) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            r5 = r15
            goto L_0x0141
        L_0x00af:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0052 }
            r1.x = r4     // Catch:{ all -> 0x0052 }
            r1.a = r15     // Catch:{ all -> 0x0052 }
            r1.b = r14     // Catch:{ all -> 0x0052 }
            r1.c = r13     // Catch:{ all -> 0x0052 }
            r1.o = r12     // Catch:{ all -> 0x0052 }
            r1.v = r6     // Catch:{ all -> 0x0052 }
            r1.w = r2     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r9.b     // Catch:{ all -> 0x0052 }
            gaf r0 = (defpackage.gaf) r0     // Catch:{ all -> 0x0052 }
            osa r0 = (defpackage.osa) r0     // Catch:{ all -> 0x0052 }
            q04 r0 = r0.a()     // Catch:{ all -> 0x0052 }
            zze r5 = new zze     // Catch:{ all -> 0x0052 }
            r7 = 0
            r5.<init>(r9, r11, r10, r7)     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = defpackage.ev0.I(r0, r5, r1)     // Catch:{ all -> 0x0052 }
            if (r0 != r3) goto L_0x00d6
            return r3
        L_0x00d6:
            r5 = r4
            r4 = r6
        L_0x00d8:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0121 }
            int r7 = r0.size()     // Catch:{ all -> 0x0121 }
            r14.element = r7     // Catch:{ all -> 0x0121 }
            int r7 = r0.size()     // Catch:{ all -> 0x0121 }
            if (r7 <= r13) goto L_0x012b
            int r4 = r4 + r13
            int r7 = r0.size()     // Catch:{ all -> 0x0121 }
            int r4 = kotlin.ranges.RangesKt.coerceAtMost((int) r4, (int) r7)     // Catch:{ all -> 0x0121 }
            java.util.List r0 = r0.subList(r13, r4)     // Catch:{ all -> 0x0121 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0121 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0121 }
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)     // Catch:{ all -> 0x0121 }
            r4.<init>(r7)     // Catch:{ all -> 0x0121 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0102:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0121 }
            if (r7 == 0) goto L_0x0125
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0121 }
            tze r7 = (defpackage.tze) r7     // Catch:{ all -> 0x0121 }
            s1f r2 = new s1f     // Catch:{ all -> 0x0121 }
            r18 = r5
            r5 = 0
            r2.<init>(r7, r5)     // Catch:{ all -> 0x011d }
            r4.add(r2)     // Catch:{ all -> 0x011d }
            r5 = r18
            r2 = 1
            goto L_0x0102
        L_0x011d:
            r0 = move-exception
        L_0x011e:
            r4 = r18
            goto L_0x0136
        L_0x0121:
            r0 = move-exception
            r18 = r5
            goto L_0x011e
        L_0x0125:
            r18 = r5
            r15.addAll(r4)     // Catch:{ all -> 0x011d }
            goto L_0x012d
        L_0x012b:
            r18 = r5
        L_0x012d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x011d }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x011d }
            r4 = r18
            goto L_0x00ac
        L_0x0136:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m23constructorimpl(r0)
            goto L_0x00ac
        L_0x0141:
            if (r12 == 0) goto L_0x0183
            java.lang.Object r0 = r9.w
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0183
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0183
            java.lang.Object r0 = r9.w
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0164
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            tze r0 = (defpackage.tze) r0
            if (r0 == 0) goto L_0x0164
            sze r7 = r0.b
            goto L_0x0165
        L_0x0164:
            r7 = 0
        L_0x0165:
            sze r0 = defpackage.sze.a
            if (r7 == r0) goto L_0x0183
            r9.v = r11
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r9.y = r0
            java.util.List r0 = r8.d
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r5)
            int r1 = r14.element
            u1f r2 = new u1f
            r2.<init>(r11, r10, r1, r0)
            return r2
        L_0x0183:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x01b6 }
            r1.x = r4     // Catch:{ all -> 0x01b6 }
            r0 = r5
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01b6 }
            r1.a = r0     // Catch:{ all -> 0x01b6 }
            r1.b = r14     // Catch:{ all -> 0x01b6 }
            r1.c = r13     // Catch:{ all -> 0x01b6 }
            r2 = 2
            r1.w = r2     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r9.b     // Catch:{ all -> 0x01b6 }
            gaf r0 = (defpackage.gaf) r0     // Catch:{ all -> 0x01b6 }
            osa r0 = (defpackage.osa) r0     // Catch:{ all -> 0x01b6 }
            q04 r0 = r0.a()     // Catch:{ all -> 0x01b6 }
            b0f r2 = new b0f     // Catch:{ all -> 0x01b6 }
            r4 = 0
            r2.<init>(r9, r11, r10, r4)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = defpackage.ev0.I(r0, r2, r1)     // Catch:{ all -> 0x01b6 }
            if (r0 != r3) goto L_0x01aa
            return r3
        L_0x01aa:
            r3 = r13
            r4 = r14
        L_0x01ac:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x002e }
            goto L_0x01c2
        L_0x01b3:
            r3 = r13
            r4 = r14
            goto L_0x01b8
        L_0x01b6:
            r0 = move-exception
            goto L_0x01b3
        L_0x01b8:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x01c2:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.Result.m29isFailureimpl(r0)
            if (r2 == 0) goto L_0x01cd
            r0 = r1
        L_0x01cd:
            java.util.List r0 = (java.util.List) r0
            int r1 = r5.size()
            if (r1 < r6) goto L_0x01ec
            java.util.List r1 = r8.d
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r5)
            int r2 = r4.element
            int r0 = r0.size()
            int r0 = r0 + r2
            u1f r2 = new u1f
            r2.<init>(r11, r10, r0, r1)
            return r2
        L_0x01ec:
            int r1 = r4.element
            int r3 = r3 - r1
            r1 = 0
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast((int) r3, (int) r1)
            int r2 = r4.element
            int r3 = r0.size()
            int r3 = r3 + r2
            r4.element = r3
            int r2 = r5.size()     // Catch:{ all -> 0x023a }
            int r6 = r6 - r2
            int r2 = r0.size()     // Catch:{ all -> 0x023a }
            if (r2 <= r1) goto L_0x023f
            int r6 = r6 + r1
            int r2 = r0.size()     // Catch:{ all -> 0x023a }
            int r2 = kotlin.ranges.RangesKt.coerceAtMost((int) r6, (int) r2)     // Catch:{ all -> 0x023a }
            java.util.List r0 = r0.subList(r1, r2)     // Catch:{ all -> 0x023a }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x023a }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x023a }
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)     // Catch:{ all -> 0x023a }
            r1.<init>(r2)     // Catch:{ all -> 0x023a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x023a }
        L_0x0224:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x023a }
            if (r2 == 0) goto L_0x023c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x023a }
            tze r2 = (defpackage.tze) r2     // Catch:{ all -> 0x023a }
            s1f r3 = new s1f     // Catch:{ all -> 0x023a }
            r6 = 1
            r3.<init>(r2, r6)     // Catch:{ all -> 0x023a }
            r1.add(r3)     // Catch:{ all -> 0x023a }
            goto L_0x0224
        L_0x023a:
            r0 = move-exception
            goto L_0x0245
        L_0x023c:
            r5.addAll(r1)     // Catch:{ all -> 0x023a }
        L_0x023f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x023a }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x023a }
            goto L_0x024e
        L_0x0245:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m23constructorimpl(r0)
        L_0x024e:
            r9.v = r11
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r9.y = r0
            java.util.List r0 = r8.d
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r5)
            int r1 = r4.element
            u1f r2 = new u1f
            r2.<init>(r11, r10, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
