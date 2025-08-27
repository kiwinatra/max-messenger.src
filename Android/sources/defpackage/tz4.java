package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tz4  reason: default package */
public final class tz4 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uz4 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;
    public final /* synthetic */ CharSequence w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ List y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tz4(uz4 uz4, long j, long j2, CharSequence charSequence, boolean z, List list, Continuation continuation) {
        super(2, continuation);
        this.c = uz4;
        this.o = j;
        this.v = j2;
        this.w = charSequence;
        this.x = z;
        this.y = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tz4 tz4 = new tz4(this.c, this.o, this.v, this.w, this.x, this.y, continuation);
        tz4.b = obj;
        return tz4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tz4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0100, code lost:
        if (r14 == false) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0020
            if (r2 != r4) goto L_0x0018
            java.lang.Object r1 = r0.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r18)
            r5 = r18
            goto L_0x004c
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.b
            d14 r2 = (defpackage.d14) r2
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "Edit message."
            defpackage.z68.i(r5, r6, r3)
            uz4 r5 = r0.c
            kotlin.Lazy r5 = r5.b
            java.lang.Object r5 = r5.getValue()
            to9 r5 = (defpackage.to9) r5
            long r6 = r0.o
            r0.b = r2
            r0.a = r4
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r1 = r2
        L_0x004c:
            ha9 r5 = (defpackage.ha9) r5
            if (r5 != 0) goto L_0x0053
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0053:
            uz4 r2 = r0.c
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            ar6 r2 = (defpackage.ar6) r2
            long r6 = r0.v
            java.lang.CharSequence r8 = r0.w
            java.util.List r13 = r2.b(r8, r6)
            java.lang.CharSequence r2 = r0.w
            java.lang.String r6 = ""
            if (r2 != 0) goto L_0x006c
            r2 = r6
        L_0x006c:
            java.lang.String r2 = r2.toString()
            uz4 r7 = r0.c
            r7.getClass()
            boolean r7 = r5.E()
            r8 = 0
            if (r7 == 0) goto L_0x0105
            c20 r7 = r5.k()
            if (r7 == 0) goto L_0x0085
            java.lang.String r7 = r7.b
            goto L_0x0086
        L_0x0085:
            r7 = r3
        L_0x0086:
            if (r7 == 0) goto L_0x0105
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0090
            goto L_0x0105
        L_0x0090:
            c20 r7 = r5.k()
            if (r7 == 0) goto L_0x0105
            java.lang.String r7 = r7.b
            if (r7 != 0) goto L_0x009c
            goto L_0x0105
        L_0x009c:
            java.lang.String r9 = "http://"
            java.lang.String r10 = kotlin.text.StringsKt__StringsKt.removePrefix((java.lang.String) r7, (java.lang.CharSequence) r9)
            java.lang.String r11 = "https://"
            java.lang.String r10 = kotlin.text.StringsKt__StringsKt.removePrefix((java.lang.String) r10, (java.lang.CharSequence) r11)
            r12 = r13
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            kotlin.sequences.Sequence r12 = kotlin.collections.CollectionsKt.asSequence(r12)
            of3 r14 = new of3
            r15 = 10
            r14.<init>(r15)
            kotlin.sequences.Sequence r12 = kotlin.sequences.SequencesKt.filter(r12, r14)
            of3 r14 = new of3
            r15 = 11
            r14.<init>(r15)
            kotlin.sequences.Sequence r12 = kotlin.sequences.SequencesKt.mapNotNull(r12, r14)
            boolean r14 = kotlin.text.StringsKt__StringsKt.contains((java.lang.CharSequence) r2, (java.lang.CharSequence) r10, true)
            if (r14 != 0) goto L_0x00d4
            boolean r14 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) r7, false, 2, (java.lang.Object) null)
            if (r14 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r14 = r8
            goto L_0x00d5
        L_0x00d4:
            r14 = r4
        L_0x00d5:
            java.util.Iterator r12 = r12.iterator()
        L_0x00d9:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0100
            java.lang.Object r15 = r12.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r16 = kotlin.text.StringsKt__StringsJVMKt.equals(r15, r7, true)
            if (r16 != 0) goto L_0x0103
            boolean r16 = kotlin.text.StringsKt__StringsJVMKt.equals(r15, r10, true)
            if (r16 != 0) goto L_0x0103
            java.lang.String r15 = kotlin.text.StringsKt__StringsKt.removePrefix((java.lang.String) r15, (java.lang.CharSequence) r9)
            java.lang.String r15 = kotlin.text.StringsKt__StringsKt.removePrefix((java.lang.String) r15, (java.lang.CharSequence) r11)
            boolean r15 = kotlin.text.StringsKt__StringsJVMKt.equals(r15, r10, true)
            if (r15 == 0) goto L_0x00d9
            goto L_0x0103
        L_0x0100:
            if (r14 != 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r4 = r8
        L_0x0104:
            r8 = r4
        L_0x0105:
            boolean r4 = r0.x
            if (r4 != 0) goto L_0x0161
            if (r8 == 0) goto L_0x010c
            goto L_0x0161
        L_0x010c:
            java.lang.CharSequence r2 = r0.w
            if (r2 == 0) goto L_0x0116
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0126
        L_0x0116:
            g20 r2 = defpackage.g20.c
            boolean r2 = r5.n(r2)
            if (r2 != 0) goto L_0x0126
            g20 r2 = defpackage.g20.o
            boolean r2 = r5.n(r2)
            if (r2 == 0) goto L_0x01c8
        L_0x0126:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Edit message. Text scenario"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            uz4 r1 = r0.c
            long r14 = r0.v
            long r10 = r0.o
            java.lang.CharSequence r0 = r0.w
            if (r0 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r6 = r0
        L_0x013f:
            r1.getClass()
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r6)
            java.lang.String r12 = r0.toString()
            qud r0 = new qud
            r9 = r0
            r9.<init>(r10, r12, r13, r14)
            rud r2 = new rud
            r2.<init>(r0)
            kotlin.Lazy r0 = r1.d
            java.lang.Object r0 = r0.getValue()
            jqg r0 = (defpackage.jqg) r0
            r0.a(r2)
            goto L_0x01c8
        L_0x0161:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.util.List r4 = r0.y
            boolean r6 = r0.x
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0172
            goto L_0x019f
        L_0x0172:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x019f
            w78 r8 = defpackage.w78.o
            if (r4 == 0) goto L_0x0185
            int r4 = r4.size()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            goto L_0x0186
        L_0x0185:
            r4 = r3
        L_0x0186:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Edit message. Attachments scenario, media size:"
            r9.<init>(r10)
            r9.append(r4)
            java.lang.String r4 = ", media changed:"
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            r7.d(r8, r1, r4, r3)
        L_0x019f:
            java.util.List r1 = r0.y
            if (r1 != 0) goto L_0x01a7
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x01a7:
            r11 = r1
            long r7 = r5.b
            long r9 = r0.v
            oud r1 = new oud
            r6 = r1
            r6.<init>(r7, r9, r11)
            r1.m = r2
            r1.n = r13
            pud r2 = new pud
            r2.<init>(r1)
            uz4 r0 = r0.c
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            jqg r0 = (defpackage.jqg) r0
            r0.a(r2)
        L_0x01c8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
