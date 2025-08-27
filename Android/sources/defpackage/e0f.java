package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: e0f  reason: default package */
public final class e0f extends SuspendLambda implements Function2 {
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
    public final /* synthetic */ v1f y;
    public final /* synthetic */ String z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0f(v1f v1f, String str, int i, b33 b33, Continuation continuation) {
        super(2, continuation);
        this.y = v1f;
        this.z = str;
        this.X = i;
        this.Y = b33;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e0f e0f = new e0f(this.y, this.z, this.X, this.Y, continuation);
        e0f.x = obj;
        return e0f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5 A[Catch:{ all -> 0x0120, all -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012a A[Catch:{ all -> 0x0120, all -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = 2
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.w
            int r5 = r1.Z
            v1f r7 = r1.y
            r8 = 1
            b33 r9 = r1.Y
            int r10 = r1.X
            java.lang.String r11 = r1.z
            if (r0 == 0) goto L_0x0054
            if (r0 == r8) goto L_0x0039
            if (r0 != r2) goto L_0x0031
            int r2 = r1.c
            kotlin.jvm.internal.Ref$IntRef r3 = r1.b
            java.util.List r0 = r1.a
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r1.x
            d14 r0 = (defpackage.d14) r0
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x002e }
            r0 = r18
            goto L_0x01aa
        L_0x002e:
            r0 = move-exception
            goto L_0x01b5
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
            java.lang.Object r6 = r1.x
            d14 r6 = (defpackage.d14) r6
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x0051 }
            r2 = r0
            r0 = r18
            goto L_0x00d7
        L_0x0051:
            r0 = move-exception
            goto L_0x0135
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r0 = r1.x
            r6 = r0
            d14 r6 = (defpackage.d14) r6
            java.lang.String r0 = r7.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r11)
            if (r0 == 0) goto L_0x006d
            int r0 = r7.b
            if (r0 != r10) goto L_0x006d
            boolean r0 = r7.f
            if (r0 != 0) goto L_0x006d
            return r7
        L_0x006d:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            java.lang.Object r0 = r9.a
            l72 r0 = (defpackage.l72) r0
            l72 r12 = defpackage.l72.b
            if (r0 == r12) goto L_0x0086
            l72 r12 = defpackage.l72.o
            if (r0 != r12) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r12 = 0
            goto L_0x0087
        L_0x0086:
            r12 = r8
        L_0x0087:
            s75 r0 = new s75
            r0.<init>(r11, r10, r2, r9)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            int r13 = r7.e
            if (r12 != 0) goto L_0x00af
            java.lang.Object r16 = r0.getValue()
            r2 = r16
            g0f r2 = (defpackage.g0f) r2
            g0f r4 = defpackage.g0f.c
            if (r2 == r4) goto L_0x00af
            java.lang.Object r0 = r0.getValue()
            g0f r0 = (defpackage.g0f) r0
            g0f r2 = defpackage.g0f.o
            if (r0 != r2) goto L_0x00ab
            goto L_0x00af
        L_0x00ab:
            r2 = r13
            r4 = r15
            goto L_0x0140
        L_0x00af:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0051 }
            r1.x = r6     // Catch:{ all -> 0x0051 }
            r1.a = r15     // Catch:{ all -> 0x0051 }
            r1.b = r14     // Catch:{ all -> 0x0051 }
            r1.c = r13     // Catch:{ all -> 0x0051 }
            r1.o = r12     // Catch:{ all -> 0x0051 }
            r1.v = r5     // Catch:{ all -> 0x0051 }
            r1.w = r8     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r9.b     // Catch:{ all -> 0x0051 }
            gaf r0 = (defpackage.gaf) r0     // Catch:{ all -> 0x0051 }
            osa r0 = (defpackage.osa) r0     // Catch:{ all -> 0x0051 }
            q04 r0 = r0.a()     // Catch:{ all -> 0x0051 }
            a0f r2 = new a0f     // Catch:{ all -> 0x0051 }
            r4 = 0
            r2.<init>(r9, r11, r10, r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = defpackage.ev0.I(r0, r2, r1)     // Catch:{ all -> 0x0051 }
            if (r0 != r3) goto L_0x00d6
            return r3
        L_0x00d6:
            r2 = r5
        L_0x00d7:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0120 }
            int r4 = r0.size()     // Catch:{ all -> 0x0120 }
            r14.element = r4     // Catch:{ all -> 0x0120 }
            int r4 = r0.size()     // Catch:{ all -> 0x0120 }
            if (r4 <= r13) goto L_0x012a
            int r2 = r2 + r13
            int r4 = r0.size()     // Catch:{ all -> 0x0120 }
            int r2 = kotlin.ranges.RangesKt.coerceAtMost((int) r2, (int) r4)     // Catch:{ all -> 0x0120 }
            java.util.List r0 = r0.subList(r13, r2)     // Catch:{ all -> 0x0120 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0120 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0120 }
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)     // Catch:{ all -> 0x0120 }
            r2.<init>(r4)     // Catch:{ all -> 0x0120 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0120 }
        L_0x0101:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0120 }
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0120 }
            tze r4 = (defpackage.tze) r4     // Catch:{ all -> 0x0120 }
            t1f r8 = new t1f     // Catch:{ all -> 0x0120 }
            r18 = r6
            r6 = 0
            r8.<init>(r4, r6)     // Catch:{ all -> 0x011c }
            r2.add(r8)     // Catch:{ all -> 0x011c }
            r6 = r18
            r8 = 1
            goto L_0x0101
        L_0x011c:
            r0 = move-exception
            r6 = r18
            goto L_0x0135
        L_0x0120:
            r0 = move-exception
            r18 = r6
            goto L_0x0135
        L_0x0124:
            r18 = r6
            r15.addAll(r2)     // Catch:{ all -> 0x011c }
            goto L_0x012c
        L_0x012a:
            r18 = r6
        L_0x012c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x011c }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x011c }
            r6 = r18
            goto L_0x00ab
        L_0x0135:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m23constructorimpl(r0)
            goto L_0x00ab
        L_0x0140:
            if (r12 == 0) goto L_0x0182
            java.lang.Object r0 = r9.w
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0182
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r8 = 1
            r0 = r0 ^ r8
            if (r0 != r8) goto L_0x0182
            java.lang.Object r0 = r9.w
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            tze r0 = (defpackage.tze) r0
            if (r0 == 0) goto L_0x0163
            sze r0 = r0.b
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            sze r8 = defpackage.sze.a
            if (r0 == r8) goto L_0x0182
            r9.v = r11
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r9.y = r0
            java.util.List r0 = r7.d
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r4)
            int r1 = r14.element
            v1f r2 = new v1f
            r2.<init>(r11, r10, r1, r0)
            return r2
        L_0x0182:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x01b3 }
            r1.x = r6     // Catch:{ all -> 0x01b3 }
            r0 = r4
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01b3 }
            r1.a = r0     // Catch:{ all -> 0x01b3 }
            r1.b = r14     // Catch:{ all -> 0x01b3 }
            r1.c = r2     // Catch:{ all -> 0x01b3 }
            r6 = 2
            r1.w = r6     // Catch:{ all -> 0x01b3 }
            java.lang.Object r0 = r9.b     // Catch:{ all -> 0x01b3 }
            gaf r0 = (defpackage.gaf) r0     // Catch:{ all -> 0x01b3 }
            osa r0 = (defpackage.osa) r0     // Catch:{ all -> 0x01b3 }
            q04 r0 = r0.a()     // Catch:{ all -> 0x01b3 }
            c0f r6 = new c0f     // Catch:{ all -> 0x01b3 }
            r8 = 0
            r6.<init>(r9, r11, r10, r8)     // Catch:{ all -> 0x01b3 }
            java.lang.Object r0 = defpackage.ev0.I(r0, r6, r1)     // Catch:{ all -> 0x01b3 }
            if (r0 != r3) goto L_0x01a9
            return r3
        L_0x01a9:
            r3 = r14
        L_0x01aa:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x002e }
            goto L_0x01bf
        L_0x01b1:
            r3 = r14
            goto L_0x01b5
        L_0x01b3:
            r0 = move-exception
            goto L_0x01b1
        L_0x01b5:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x01bf:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            boolean r6 = kotlin.Result.m29isFailureimpl(r0)
            if (r6 == 0) goto L_0x01ca
            r0 = r1
        L_0x01ca:
            java.util.List r0 = (java.util.List) r0
            int r1 = r4.size()
            if (r1 < r5) goto L_0x01e9
            java.util.List r1 = r7.d
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r4)
            int r2 = r3.element
            int r0 = r0.size()
            int r0 = r0 + r2
            v1f r2 = new v1f
            r2.<init>(r11, r10, r0, r1)
            return r2
        L_0x01e9:
            int r1 = r3.element
            int r2 = r2 - r1
            r1 = 0
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast((int) r2, (int) r1)
            int r2 = r3.element
            int r6 = r0.size()
            int r6 = r6 + r2
            r3.element = r6
            int r2 = r4.size()     // Catch:{ all -> 0x0237 }
            int r5 = r5 - r2
            int r2 = r0.size()     // Catch:{ all -> 0x0237 }
            if (r2 <= r1) goto L_0x023c
            int r5 = r5 + r1
            int r2 = r0.size()     // Catch:{ all -> 0x0237 }
            int r2 = kotlin.ranges.RangesKt.coerceAtMost((int) r5, (int) r2)     // Catch:{ all -> 0x0237 }
            java.util.List r0 = r0.subList(r1, r2)     // Catch:{ all -> 0x0237 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0237 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0237 }
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)     // Catch:{ all -> 0x0237 }
            r1.<init>(r2)     // Catch:{ all -> 0x0237 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0237 }
        L_0x0221:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0237 }
            if (r2 == 0) goto L_0x0239
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0237 }
            tze r2 = (defpackage.tze) r2     // Catch:{ all -> 0x0237 }
            t1f r5 = new t1f     // Catch:{ all -> 0x0237 }
            r6 = 1
            r5.<init>(r2, r6)     // Catch:{ all -> 0x0237 }
            r1.add(r5)     // Catch:{ all -> 0x0237 }
            goto L_0x0221
        L_0x0237:
            r0 = move-exception
            goto L_0x0242
        L_0x0239:
            r4.addAll(r1)     // Catch:{ all -> 0x0237 }
        L_0x023c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0237 }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x024b
        L_0x0242:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m23constructorimpl(r0)
        L_0x024b:
            r9.v = r11
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r9.y = r0
            java.util.List r0 = r7.d
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r4)
            int r1 = r3.element
            v1f r2 = new v1f
            r2.<init>(r11, r10, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
