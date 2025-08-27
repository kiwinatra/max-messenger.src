package defpackage;

import kotlin.jvm.internal.Ref;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: da3  reason: default package */
public final class da3 implements ds5 {
    public final /* synthetic */ ds5 a;
    public final /* synthetic */ Ref.BooleanRef b;
    public final /* synthetic */ ComplaintBottomSheet c;

    public da3(Ref.BooleanRef booleanRef, ds5 ds5, ComplaintBottomSheet complaintBottomSheet) {
        this.b = booleanRef;
        this.c = complaintBottomSheet;
        this.a = ds5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            boolean r4 = r2 instanceof defpackage.ca3
            if (r4 == 0) goto L_0x001a
            r4 = r2
            ca3 r4 = (defpackage.ca3) r4
            int r5 = r4.b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.b = r5
            goto L_0x001f
        L_0x001a:
            ca3 r4 = new ca3
            r4.<init>(r0, r2)
        L_0x001f:
            java.lang.Object r2 = r4.a
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.b
            r7 = 1
            if (r6 == 0) goto L_0x0039
            if (r6 != r7) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00e8
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.jvm.internal.Ref$BooleanRef r2 = r0.b
            boolean r6 = r2.element
            if (r6 != 0) goto L_0x00dd
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            r8 = r6
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x00dd
            kotlin.reflect.KProperty[] r8 = one.me.complaintbottomsheet.ComplaintBottomSheet.v
            one.me.complaintbottomsheet.ComplaintBottomSheet r8 = r0.c
            r8.getClass()
            kotlin.reflect.KProperty[] r9 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            int r9 = defpackage.gta.c
            igf r10 = new igf
            r10.<init>(r9)
            r9 = 0
            r11 = 6
            ng3 r10 = defpackage.b0h.a(r10, r9, r11)
            int r11 = defpackage.gta.a
            igf r12 = new igf
            r12.<init>(r11)
            r10.f(r12)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0075:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0089
            java.lang.Object r11 = r6.next()
            pg3 r11 = (defpackage.pg3) r11
            pg3[] r11 = new defpackage.pg3[]{r11}
            r10.a(r11)
            goto L_0x0075
        L_0x0089:
            kotlin.Lazy r6 = r8.c
            java.lang.Object r6 = r6.getValue()
            pg3 r6 = (defpackage.pg3) r6
            pg3[] r6 = new defpackage.pg3[]{r6}
            r10.a(r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r12 = r10.e()
            fa3 r6 = new fa3
            r6.<init>(r3, r8)
            r12.addLifecycleListener(r6)
            r12.setTargetController(r8)
            r6 = r8
        L_0x00a8:
            zx3 r10 = r6.getParentController()
            if (r10 == 0) goto L_0x00b3
            zx3 r6 = r6.getParentController()
            goto L_0x00a8
        L_0x00b3:
            boolean r10 = r6 instanceof defpackage.l9d
            if (r10 == 0) goto L_0x00ba
            l9d r6 = (defpackage.l9d) r6
            goto L_0x00bb
        L_0x00ba:
            r6 = r9
        L_0x00bb:
            if (r6 == 0) goto L_0x00c1
            e9d r9 = r6.K()
        L_0x00c1:
            r12.p0(r8)
            if (r9 == 0) goto L_0x00db
            i9d r6 = new i9d
            r14 = 0
            r17 = -1
            r13 = 0
            r15 = 0
            r16 = 0
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r8 = "BottomSheetWidget"
            defpackage.a81.t(r3, r6, r7, r8)
            r9.G(r6)
        L_0x00db:
            r2.element = r7
        L_0x00dd:
            r4.b = r7
            ds5 r0 = r0.a
            java.lang.Object r0 = r0.a(r1, r4)
            if (r0 != r5) goto L_0x00e8
            return r5
        L_0x00e8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da3.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
