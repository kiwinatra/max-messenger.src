package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;

/* renamed from: hhg  reason: default package */
public final class hhg implements xo7 {
    public final Lazy a;
    public final Set b;
    public final ru0 c;
    public tfg d;

    public hhg(Lazy lazy) {
        this.a = lazy;
        EnumEntries<fhg> enumEntries = fhg.w;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10));
        for (fhg fhg : enumEntries) {
            arrayList.add(fhg.a);
        }
        this.b = CollectionsKt.toSet(arrayList);
        this.c = o54.a(0, 7, (cu0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ghg
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ghg r0 = (defpackage.ghg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            ghg r0 = new ghg
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0028
            if (r2 != r3) goto L_0x0033
        L_0x0028:
            fhg r10 = r0.b
            hhg r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r10
            r10 = r11
            goto L_0x00f4
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r13)
            dbe r13 = defpackage.fhg.o
            r13.getClass()
            kotlin.enums.EnumEntries r13 = defpackage.fhg.w
            java.util.Iterator r13 = r13.iterator()
        L_0x0049:
            boolean r2 = r13.hasNext()
            r5 = 0
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r13.next()
            r6 = r2
            fhg r6 = (defpackage.fhg) r6
            java.lang.String r6 = r6.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r11)
            if (r6 == 0) goto L_0x0049
            goto L_0x0061
        L_0x0060:
            r2 = r5
        L_0x0061:
            r13 = r2
            fhg r13 = (defpackage.fhg) r13
            if (r13 != 0) goto L_0x0088
            java.lang.Class<hhg> r12 = defpackage.hhg.class
            java.lang.String r12 = r12.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown method with name = "
            r13.<init>(r0)
            r13.append(r11)
            java.lang.String r11 = " in JsDelegate: "
            r13.append(r11)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            defpackage.z68.f(r12, r10, r5)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0088:
            int r11 = r13.ordinal()
            ru0 r2 = r10.c
            if (r11 == 0) goto L_0x00c6
            if (r11 != r4) goto L_0x00c0
            r0.a = r10
            r0.b = r13
            r0.v = r3
            yo7 r11 = defpackage.yo7.d
            r11.getClass()
            ohg r3 = defpackage.phg.Companion
            aq7 r3 = r3.serializer()
            java.lang.Object r11 = r11.a(r3, r12)
            phg r11 = (defpackage.phg) r11
            chg r12 = new chg
            java.lang.String r11 = r11.a
            r12.<init>(r11)
            java.lang.Object r11 = r2.t(r12, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x00bd:
            if (r11 != r1) goto L_0x00f4
            return r1
        L_0x00c0:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00c6:
            r0.a = r10
            r0.b = r13
            r0.v = r4
            yo7 r11 = defpackage.yo7.d
            r11.getClass()
            lhg r3 = defpackage.mhg.Companion
            aq7 r3 = r3.serializer()
            java.lang.Object r11 = r11.a(r3, r12)
            mhg r11 = (defpackage.mhg) r11
            dhg r12 = new dhg
            java.lang.String r11 = r11.a
            r12.<init>(r11)
            java.lang.Object r11 = r2.t(r12, r0)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x00f1:
            if (r11 != r1) goto L_0x00f4
            return r1
        L_0x00f4:
            java.lang.String r1 = r13.a
            tfg r11 = r10.d
            if (r11 == 0) goto L_0x0110
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
        L_0x0110:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhg.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
