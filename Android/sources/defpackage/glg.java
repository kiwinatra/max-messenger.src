package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;

/* renamed from: glg  reason: default package */
public final class glg implements xo7 {
    public final Lazy a;
    public final Set b;
    public final ru0 c;
    public tfg d;

    public glg(Lazy lazy) {
        this.a = lazy;
        EnumEntries<elg> enumEntries = elg.w;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10));
        for (elg elg : enumEntries) {
            arrayList.add(elg.a);
        }
        this.b = CollectionsKt.toSet(arrayList);
        this.c = o54.a(0, 7, (cu0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.flg
            if (r0 == 0) goto L_0x0013
            r0 = r13
            flg r0 = (defpackage.flg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            flg r0 = new flg
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 4
            if (r2 == 0) goto L_0x0044
            if (r2 == r6) goto L_0x0031
            if (r2 == r5) goto L_0x0031
            if (r2 == r4) goto L_0x0031
            if (r2 == r7) goto L_0x0031
            if (r2 != r3) goto L_0x003c
        L_0x0031:
            elg r10 = r0.b
            glg r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r10
            r10 = r11
            goto L_0x0152
        L_0x003c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r13)
            ece r13 = defpackage.elg.o
            r13.getClass()
            kotlin.enums.EnumEntries r13 = defpackage.elg.w
            java.util.Iterator r13 = r13.iterator()
        L_0x0052:
            boolean r2 = r13.hasNext()
            r8 = 0
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r13.next()
            r9 = r2
            elg r9 = (defpackage.elg) r9
            java.lang.String r9 = r9.a
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r9 == 0) goto L_0x0052
            goto L_0x006a
        L_0x0069:
            r2 = r8
        L_0x006a:
            r13 = r2
            elg r13 = (defpackage.elg) r13
            if (r13 != 0) goto L_0x0091
            java.lang.Class<glg> r12 = defpackage.glg.class
            java.lang.String r12 = r12.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown method with name = "
            r13.<init>(r0)
            r13.append(r11)
            java.lang.String r11 = " in JsDelegate: "
            r13.append(r11)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            defpackage.z68.f(r12, r10, r8)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0091:
            int r11 = r13.ordinal()
            ru0 r2 = r10.c
            if (r11 == 0) goto L_0x013a
            if (r11 == r6) goto L_0x0122
            if (r11 == r5) goto L_0x00f4
            if (r11 == r4) goto L_0x00c6
            if (r11 != r7) goto L_0x00c0
            r0.a = r10
            r0.b = r13
            r0.v = r3
            mo7 r11 = new mo7
            ece r3 = defpackage.elg.o
            java.lang.String r3 = "WebAppBackButtonPressed"
            r11.<init>(r3, r12)
            java.lang.Object r11 = r2.t(r11, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x00bd:
            if (r11 != r1) goto L_0x0152
            return r1
        L_0x00c0:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00c6:
            r0.a = r10
            r0.b = r13
            r0.v = r7
            yo7 r11 = defpackage.yo7.d
            r11.getClass()
            rjg r3 = defpackage.sjg.Companion
            aq7 r3 = r3.serializer()
            java.lang.Object r11 = r11.a(r3, r12)
            sjg r11 = (defpackage.sjg) r11
            blg r12 = new blg
            boolean r11 = r11.a
            r12.<init>(r11)
            java.lang.Object r11 = r2.t(r12, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x00f1:
            if (r11 != r1) goto L_0x0152
            return r1
        L_0x00f4:
            r0.a = r10
            r0.b = r13
            r0.v = r4
            yo7 r11 = defpackage.yo7.d
            r11.getClass()
            ojg r3 = defpackage.pjg.Companion
            aq7 r3 = r3.serializer()
            java.lang.Object r11 = r11.a(r3, r12)
            pjg r11 = (defpackage.pjg) r11
            clg r12 = new clg
            boolean r11 = r11.a
            r12.<init>(r11)
            java.lang.Object r11 = r2.t(r12, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x011f:
            if (r11 != r1) goto L_0x0152
            return r1
        L_0x0122:
            r0.a = r10
            r0.b = r13
            r0.v = r5
            alg r11 = defpackage.alg.a
            java.lang.Object r11 = r2.t(r11, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x0137:
            if (r11 != r1) goto L_0x0152
            return r1
        L_0x013a:
            r0.a = r10
            r0.b = r13
            r0.v = r6
            dlg r11 = defpackage.dlg.a
            java.lang.Object r11 = r2.t(r11, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x014f:
            if (r11 != r1) goto L_0x0152
            return r1
        L_0x0152:
            java.lang.String r1 = r13.a
            tfg r11 = r10.d
            if (r11 == 0) goto L_0x016e
            kotlin.Lazy r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            r0 = r10
            wfg r0 = (defpackage.wfg) r0
            r7 = 0
            r9 = 240(0xf0, float:3.36E-43)
            long r2 = r11.a
            java.lang.String r4 = r11.b
            r5 = 1
            r6 = 0
            r8 = 0
            defpackage.wfg.a(r0, r1, r2, r4, r5, r6, r7, r8, r9)
        L_0x016e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glg.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ru0 b() {
        return this.c;
    }

    public final Set c() {
        return this.b;
    }

    public final void d(tfg tfg) {
        this.d = tfg;
    }
}
