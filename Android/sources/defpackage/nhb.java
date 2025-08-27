package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nhb  reason: default package */
public final class nhb extends SuspendLambda implements Function2 {
    public xme a;
    public int b;
    public final /* synthetic */ whb c;
    public final /* synthetic */ hkb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nhb(whb whb, hkb hkb, Continuation continuation) {
        super(2, continuation);
        this.c = whb;
        this.o = hkb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nhb(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nhb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: mgf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: mgf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: ggf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: mgf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: rhb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: rhb} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0107, code lost:
        if (kotlin.text.StringsKt.isBlank(r1) == false) goto L_0x010e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x021f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r0.b
            if (r6 == 0) goto L_0x0022
            if (r6 != r4) goto L_0x001a
            xme r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r19)
            r7 = r0
            r0 = r19
            goto L_0x0249
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r19)
            whb r6 = r0.c
            xme r7 = r6.w0
            r0.a = r7
            r0.b = r4
            hkb r0 = r0.o
            r0.getClass()
            u9 r6 = r6.b
            java.lang.Object r8 = r6.c
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0043
            boolean r8 = kotlin.text.StringsKt.isBlank(r8)
            if (r8 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r8 = r3
            goto L_0x0044
        L_0x0043:
            r8 = r4
        L_0x0044:
            r8 = r8 ^ r4
            java.lang.Object r9 = r6.o
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0050
            int r9 = r9.size()
            goto L_0x0051
        L_0x0050:
            r9 = r3
        L_0x0051:
            java.lang.Object r10 = r6.v
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x005c
            int r10 = r10.size()
            goto L_0x005d
        L_0x005c:
            r10 = r3
        L_0x005d:
            int r9 = r9 + r10
            java.lang.Object r10 = r6.w
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x0069
            int r10 = r10.size()
            goto L_0x006a
        L_0x0069:
            r10 = r3
        L_0x006a:
            int r9 = r9 + r10
            java.lang.Object r10 = r6.x
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x007a
            boolean r10 = kotlin.text.StringsKt.isBlank(r10)
            if (r10 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r10 = r3
            goto L_0x007b
        L_0x007a:
            r10 = r4
        L_0x007b:
            r10 = r10 ^ r4
            int r9 = r9 + r10
            if (r9 <= 0) goto L_0x0081
            r10 = r4
            goto L_0x0082
        L_0x0081:
            r10 = r3
        L_0x0082:
            int r11 = defpackage.qad.r9
            igf r13 = new igf
            r13.<init>(r11)
            r11 = 0
            if (r8 == 0) goto L_0x00a9
            if (r10 != 0) goto L_0x00a9
            java.lang.Object r0 = r6.c
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x009d
            mgf r1 = new mgf
            r1.<init>(r0)
            r14 = r1
            r1 = r11
            goto L_0x0226
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            kotlin.Lazy r0 = r0.c
            if (r10 == 0) goto L_0x018c
            if (r9 != r4) goto L_0x018c
            if (r8 != 0) goto L_0x018c
            java.lang.Object r8 = r6.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r10 = r6.v
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r12 = r6.w
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.List[] r2 = new java.util.List[r2]
            r2[r3] = r8
            r2[r4] = r10
            r2[r1] = r12
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.sequenceOf(r2)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filterNotNull(r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.flattenSequenceOfIterable(r1)
            java.lang.Object r1 = kotlin.sequences.SequencesKt.firstOrNull(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x010c
            java.lang.Object r0 = r0.getValue()
            ou8 r0 = (defpackage.ou8) r0
            java.lang.String r1 = r1.toString()
            wj0 r0 = (defpackage.wj0) r0
            sv3 r0 = r0.c(r1)
            if (r0 == 0) goto L_0x010c
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x00fa
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r1 = r11
            goto L_0x00fb
        L_0x00fa:
            r1 = r0
        L_0x00fb:
            java.lang.String r0 = r0.c
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r1.e
            if (r1 == 0) goto L_0x010a
            boolean r2 = kotlin.text.StringsKt.isBlank(r1)
            if (r2 != 0) goto L_0x010a
            goto L_0x010e
        L_0x010a:
            r1 = r11
            goto L_0x010e
        L_0x010c:
            r0 = r11
            goto L_0x010a
        L_0x010e:
            java.lang.Object r2 = r6.o
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x012f
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x012f
            int r0 = defpackage.ira.c
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            ggf r3 = new ggf
            java.util.List r2 = kotlin.collections.ArraysKt.toList((T[]) r2)
            r3.<init>(r2, r0, r4)
            goto L_0x0189
        L_0x012f:
            java.lang.Object r2 = r6.v
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0150
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0150
            int r0 = defpackage.ira.d
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            ggf r3 = new ggf
            java.util.List r2 = kotlin.collections.ArraysKt.toList((T[]) r2)
            r3.<init>(r2, r0, r4)
            goto L_0x0189
        L_0x0150:
            java.lang.Object r2 = r6.w
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0179
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0179
            if (r0 == 0) goto L_0x0165
            mgf r3 = new mgf
            r3.<init>(r0)
            goto L_0x0189
        L_0x0165:
            int r0 = defpackage.ira.b
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            ggf r3 = new ggf
            java.util.List r2 = kotlin.collections.ArraysKt.toList((T[]) r2)
            r3.<init>(r2, r0, r4)
            goto L_0x0189
        L_0x0179:
            java.lang.Object r0 = r6.x
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0187
            int r0 = defpackage.jra.Z
            igf r3 = new igf
            r3.<init>(r0)
            goto L_0x0189
        L_0x0187:
            mgf r3 = defpackage.ngf.a
        L_0x0189:
            r14 = r3
            goto L_0x0226
        L_0x018c:
            if (r10 == 0) goto L_0x0224
            java.lang.Object r8 = r6.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x019d
            int r8 = r8.size()
            if (r8 != r9) goto L_0x019d
            int r8 = defpackage.ira.c
            goto L_0x01ae
        L_0x019d:
            java.lang.Object r8 = r6.v
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x01ac
            int r8 = r8.size()
            if (r8 != r9) goto L_0x01ac
            int r8 = defpackage.ira.d
            goto L_0x01ae
        L_0x01ac:
            int r8 = defpackage.ira.b
        L_0x01ae:
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            ggf r12 = new ggf
            java.util.List r10 = kotlin.collections.ArraysKt.toList((T[]) r10)
            r12.<init>(r10, r8, r9)
            java.lang.Object r8 = r6.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r10 = r6.v
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r6 = r6.w
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.List[] r2 = new java.util.List[r2]
            r2[r3] = r8
            r2[r4] = r10
            r2[r1] = r6
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.sequenceOf(r2)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filterNotNull(r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.flattenSequenceOfIterable(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x01e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0221
            java.lang.Object r2 = r1.next()
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r3 = r0.getValue()
            ou8 r3 = (defpackage.ou8) r3
            java.lang.String r2 = r2.toString()
            wj0 r3 = (defpackage.wj0) r3
            sv3 r2 = r3.c(r2)
            if (r2 == 0) goto L_0x021c
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x020f
            boolean r3 = r2.b()
            if (r3 == 0) goto L_0x020e
            goto L_0x020f
        L_0x020e:
            r2 = r11
        L_0x020f:
            if (r2 == 0) goto L_0x021c
            java.lang.String r2 = r2.e
            if (r2 == 0) goto L_0x021c
            boolean r3 = kotlin.text.StringsKt.isBlank(r2)
            if (r3 != 0) goto L_0x021c
            goto L_0x021d
        L_0x021c:
            r2 = r11
        L_0x021d:
            if (r2 == 0) goto L_0x01e3
            r1 = r2
            goto L_0x0222
        L_0x0221:
            r1 = r11
        L_0x0222:
            r14 = r12
            goto L_0x0226
        L_0x0224:
            r1 = r11
            r14 = r1
        L_0x0226:
            if (r1 == 0) goto L_0x022e
            java.lang.String r0 = defpackage.o5a.z(r1)
            r15 = r0
            goto L_0x022f
        L_0x022e:
            r15 = r11
        L_0x022f:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            int r1 = r0.intValue()
            if (r1 <= r4) goto L_0x023c
            r16 = r0
            goto L_0x023e
        L_0x023c:
            r16 = r11
        L_0x023e:
            rhb r0 = new rhb
            r17 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            if (r0 != r5) goto L_0x0249
            return r5
        L_0x0249:
            r7.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
