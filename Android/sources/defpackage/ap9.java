package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: ap9  reason: default package */
public final class ap9 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public ap9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.ap9 r4, long r5, java.lang.Long r7, java.lang.CharSequence r8, java.util.List r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r4.getClass()
            boolean r0 = r11 instanceof defpackage.zo9
            if (r0 == 0) goto L_0x0016
            r0 = r11
            zo9 r0 = (defpackage.zo9) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x001b
        L_0x0016:
            zo9 r0 = new zo9
            r0.<init>(r4, r11)
        L_0x001b:
            java.lang.Object r11 = r0.w
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            boolean r10 = r0.v
            long r5 = r0.o
            java.util.List r4 = r0.c
            r9 = r4
            java.util.List r9 = (java.util.List) r9
            java.lang.CharSequence r4 = r0.b
            r8 = r4
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            ap9 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
        L_0x003b:
            r6 = r5
            r5 = r11
            r11 = r10
            goto L_0x006b
        L_0x003f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Lazy r11 = r4.c
            java.lang.Object r11 = r11.getValue()
            ej9 r11 = (defpackage.ej9) r11
            r0.a = r4
            r2 = r8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.b = r2
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            r0.c = r2
            r0.o = r5
            r0.v = r10
            r0.y = r3
            java.lang.Object r11 = r11.a(r5, r7, r0)
            if (r11 != r1) goto L_0x003b
            goto L_0x009e
        L_0x006b:
            r0 = r5
            mc9 r0 = (defpackage.mc9) r0
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r8)
            java.lang.String r8 = r5.toString()
            kvd r1 = new kvd
            if (r9 != 0) goto L_0x0080
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            r10 = r5
            goto L_0x0081
        L_0x0080:
            r10 = r9
        L_0x0081:
            r9 = 1
            r5 = r1
            r5.<init>(r6, r8, r9, r10)
            r1.b = r0
            r5 = r11 ^ 1
            r1.e = r5
            mvd r5 = new mvd
            r5.<init>(r1)
            kotlin.Lazy r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            jqg r4 = (defpackage.jqg) r4
            r4.a(r5)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap9.a(ap9, long, java.lang.Long, java.lang.CharSequence, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(long j, CharSequence charSequence, Long l, boolean z, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) this.a.getValue())).b(), new yo9(this, j, charSequence, l, z, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }
}
