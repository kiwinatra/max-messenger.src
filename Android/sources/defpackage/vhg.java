package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vhg  reason: default package */
public final class vhg implements xo7 {
    public final yo7 a;
    public final Lazy b;
    public final Lazy c;
    public final Set d;
    public final ru0 e;
    public tfg f;

    public vhg(yo7 yo7, Lazy lazy, Lazy lazy2) {
        this.a = yo7;
        this.b = lazy;
        this.c = lazy2;
        EnumEntries<rhg> enumEntries = rhg.o;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10));
        for (rhg rhg : enumEntries) {
            rhg.getClass();
            arrayList.add("WebAppRequestPhone");
        }
        this.d = CollectionsKt.toSet(arrayList);
        this.e = o54.a(0, 7, (cu0) null);
    }

    public final Object a(String str, String str2, Continuation continuation) {
        if (!this.d.contains(str)) {
            String name = vhg.class.getName();
            z68.f(name, "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return Unit.INSTANCE;
        }
        rhg rhg = rhg.b;
        if (!Intrinsics.areEqual((Object) str, (Object) "WebAppRequestPhone")) {
            return Unit.INSTANCE;
        }
        Object e2 = e(str2, continuation);
        return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
    }

    public final ru0 b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final void d(tfg tfg) {
        ((d93) this.c.getValue()).c = tfg;
        this.f = tfg;
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [lo7, java.lang.Object, i3d] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.shg
            if (r0 == 0) goto L_0x0013
            r0 = r9
            shg r0 = (defpackage.shg) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            shg r0 = new shg
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a3
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            yhg r7 = r0.b
            vhg r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008f
        L_0x0041:
            i3d r7 = r0.c
            yhg r8 = r0.b
            vhg r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0077
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r9)
            yo7 r9 = defpackage.yo7.d
            r9.getClass()
            xhg r2 = defpackage.yhg.Companion
            aq7 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            yhg r8 = (defpackage.yhg) r8
            i3d r9 = new i3d
            r9.<init>()
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.w = r5
            ru0 r2 = r7.e
            java.lang.Object r2 = r2.t(r9, r0)
            if (r2 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r7
            r7 = r9
        L_0x0077:
            rhg r9 = defpackage.rhg.b
            thg r9 = new thg
            r9.<init>(r2, r8, r6)
            r0.a = r2
            r0.b = r8
            r0.c = r6
            r0.w = r4
            java.lang.Object r9 = r7.c(r9, r0)
            if (r9 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r7 = r8
            r8 = r2
        L_0x008f:
            lo7 r9 = (defpackage.lo7) r9
            uhg r2 = new uhg
            r2.<init>(r8, r7, r6)
            r0.a = r6
            r0.b = r6
            r0.w = r3
            java.lang.Object r7 = r9.d(r2, r0)
            if (r7 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhg.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
