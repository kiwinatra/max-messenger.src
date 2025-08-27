package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c5e  reason: default package */
public final class c5e extends SuspendLambda implements Function2 {
    public xme a;
    public int b;
    public final /* synthetic */ e5e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c5e(e5e e5e, Continuation continuation) {
        super(2, continuation);
        this.c = e5e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c5e(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c5e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        if (kotlin.text.StringsKt.isBlank(r0) == false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0234 A[EDGE_INSN: B:134:0x0234->B:119:0x0234 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r12.b
            if (r5 == 0) goto L_0x001d
            if (r5 != r3) goto L_0x0015
            xme r12 = r12.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0260
        L_0x0015:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r13)
            e5e r13 = r12.c
            xme r5 = r13.g
            r12.a = r5
            r12.b = r3
            o5e r12 = r13.b
            r12.getClass()
            r6 = 0
            u9 r13 = r13.a
            if (r13 != 0) goto L_0x0041
            b5e r12 = new b5e
            int r13 = defpackage.qad.r9
            igf r0 = new igf
            r0.<init>(r13)
            r12.<init>(r0, r6, r6, r6)
            r13 = r12
            goto L_0x025c
        L_0x0041:
            java.lang.Object r7 = r13.c
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0050
            boolean r7 = kotlin.text.StringsKt.isBlank(r7)
            if (r7 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r7 = r2
            goto L_0x0051
        L_0x0050:
            r7 = r3
        L_0x0051:
            r7 = r7 ^ r3
            java.lang.Object r8 = r13.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x005d
            int r8 = r8.size()
            goto L_0x005e
        L_0x005d:
            r8 = r2
        L_0x005e:
            java.lang.Object r9 = r13.v
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0069
            int r9 = r9.size()
            goto L_0x006a
        L_0x0069:
            r9 = r2
        L_0x006a:
            int r8 = r8 + r9
            java.lang.Object r9 = r13.w
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0076
            int r9 = r9.size()
            goto L_0x0077
        L_0x0076:
            r9 = r2
        L_0x0077:
            int r8 = r8 + r9
            java.lang.Object r9 = r13.x
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0087
            boolean r9 = kotlin.text.StringsKt.isBlank(r9)
            if (r9 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r9 = r2
            goto L_0x0088
        L_0x0087:
            r9 = r3
        L_0x0088:
            r9 = r9 ^ r3
            int r8 = r8 + r9
            if (r8 <= 0) goto L_0x008e
            r9 = r3
            goto L_0x008f
        L_0x008e:
            r9 = r2
        L_0x008f:
            int r10 = defpackage.qad.r9
            igf r11 = new igf
            r11.<init>(r10)
            if (r7 == 0) goto L_0x00b8
            if (r9 != 0) goto L_0x00b8
            n5e r12 = new n5e
            java.lang.Object r13 = r13.c
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x00ac
            mgf r0 = new mgf
            r0.<init>(r13)
            r12.<init>(r0, r6)
            goto L_0x023f
        L_0x00ac:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Required value was null."
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00b8:
            kotlin.Lazy r12 = r12.a
            if (r9 == 0) goto L_0x019f
            if (r8 != r3) goto L_0x019f
            if (r7 != 0) goto L_0x019f
            java.lang.Object r7 = r13.o
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r9 = r13.v
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r10 = r13.w
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r7
            r1[r3] = r9
            r1[r0] = r10
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequenceOf(r1)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.filterNotNull(r0)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.flattenSequenceOfIterable(r0)
            java.lang.Object r0 = kotlin.sequences.SequencesKt.firstOrNull(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x011b
            java.lang.Object r12 = r12.getValue()
            ou8 r12 = (defpackage.ou8) r12
            java.lang.String r0 = r0.toString()
            wj0 r12 = (defpackage.wj0) r12
            sv3 r12 = r12.c(r0)
            if (r12 == 0) goto L_0x011b
            boolean r0 = r12.a()
            if (r0 != 0) goto L_0x0109
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r0 = r6
            goto L_0x010a
        L_0x0109:
            r0 = r12
        L_0x010a:
            java.lang.String r12 = r12.c
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = r0.e
            if (r0 == 0) goto L_0x0119
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 != 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            r0 = r6
            goto L_0x011d
        L_0x011b:
            r12 = r6
            goto L_0x0119
        L_0x011d:
            java.lang.Object r1 = r13.o
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x013e
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x013e
            int r12 = defpackage.ira.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            ggf r1 = new ggf
            java.util.List r13 = kotlin.collections.ArraysKt.toList((T[]) r13)
            r1.<init>(r13, r12, r3)
            goto L_0x0198
        L_0x013e:
            java.lang.Object r1 = r13.v
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x015f
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x015f
            int r12 = defpackage.ira.d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            ggf r1 = new ggf
            java.util.List r13 = kotlin.collections.ArraysKt.toList((T[]) r13)
            r1.<init>(r13, r12, r3)
            goto L_0x0198
        L_0x015f:
            java.lang.Object r1 = r13.w
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0188
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x0188
            if (r12 == 0) goto L_0x0174
            mgf r1 = new mgf
            r1.<init>(r12)
            goto L_0x0198
        L_0x0174:
            int r12 = defpackage.ira.b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            ggf r1 = new ggf
            java.util.List r13 = kotlin.collections.ArraysKt.toList((T[]) r13)
            r1.<init>(r13, r12, r3)
            goto L_0x0198
        L_0x0188:
            java.lang.Object r12 = r13.x
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0196
            int r12 = defpackage.jra.Z
            igf r1 = new igf
            r1.<init>(r12)
            goto L_0x0198
        L_0x0196:
            mgf r1 = defpackage.ngf.a
        L_0x0198:
            n5e r12 = new n5e
            r12.<init>(r1, r0)
            goto L_0x023f
        L_0x019f:
            if (r9 == 0) goto L_0x023a
            java.lang.Object r7 = r13.o
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x01b0
            int r7 = r7.size()
            if (r7 != r8) goto L_0x01b0
            int r7 = defpackage.ira.c
            goto L_0x01c1
        L_0x01b0:
            java.lang.Object r7 = r13.v
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x01bf
            int r7 = r7.size()
            if (r7 != r8) goto L_0x01bf
            int r7 = defpackage.ira.d
            goto L_0x01c1
        L_0x01bf:
            int r7 = defpackage.ira.b
        L_0x01c1:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            ggf r10 = new ggf
            java.util.List r9 = kotlin.collections.ArraysKt.toList((T[]) r9)
            r10.<init>(r9, r7, r8)
            java.lang.Object r7 = r13.o
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r9 = r13.v
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r13 = r13.w
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r7
            r1[r3] = r9
            r1[r0] = r13
            kotlin.sequences.Sequence r13 = kotlin.sequences.SequencesKt.sequenceOf(r1)
            kotlin.sequences.Sequence r13 = kotlin.sequences.SequencesKt.filterNotNull(r13)
            kotlin.sequences.Sequence r13 = kotlin.sequences.SequencesKt.flattenSequenceOfIterable(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x01f6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r13.next()
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r1 = r12.getValue()
            ou8 r1 = (defpackage.ou8) r1
            java.lang.String r0 = r0.toString()
            wj0 r1 = (defpackage.wj0) r1
            sv3 r0 = r1.c(r0)
            if (r0 == 0) goto L_0x022f
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0222
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0221
            goto L_0x0222
        L_0x0221:
            r0 = r6
        L_0x0222:
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = r0.e
            if (r0 == 0) goto L_0x022f
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 != 0) goto L_0x022f
            goto L_0x0230
        L_0x022f:
            r0 = r6
        L_0x0230:
            if (r0 == 0) goto L_0x01f6
            goto L_0x0234
        L_0x0233:
            r0 = r6
        L_0x0234:
            n5e r12 = new n5e
            r12.<init>(r10, r0)
            goto L_0x023f
        L_0x023a:
            n5e r12 = new n5e
            r12.<init>(r6, r6)
        L_0x023f:
            java.lang.String r13 = r12.b
            if (r13 == 0) goto L_0x0248
            java.lang.String r13 = defpackage.o5a.z(r13)
            goto L_0x0249
        L_0x0248:
            r13 = r6
        L_0x0249:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            int r1 = r0.intValue()
            if (r1 <= r3) goto L_0x0254
            r6 = r0
        L_0x0254:
            b5e r0 = new b5e
            ngf r12 = r12.a
            r0.<init>(r11, r12, r13, r6)
            r13 = r0
        L_0x025c:
            if (r13 != r4) goto L_0x025f
            return r4
        L_0x025f:
            r12 = r5
        L_0x0260:
            r12.setValue(r13)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
