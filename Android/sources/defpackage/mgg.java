package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: mgg  reason: default package */
public final class mgg implements xo7 {
    public final yo7 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final ws e;
    public final ru0 f;
    public tfg g;

    public mgg(yo7 yo7, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = yo7;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        EnumEntries<fgg> enumEntries = fgg.o;
        ws wsVar = new ws(0);
        for (fgg fgg : enumEntries) {
            fgg.getClass();
            wsVar.add("WebAppDownloadFile");
        }
        this.e = wsVar;
        this.f = o54.a(0, 7, (cu0) null);
    }

    public final Object a(String str, String str2, Continuation continuation) {
        Object obj;
        fgg.a.getClass();
        Iterator it = fgg.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ((fgg) obj).getClass();
            if (Intrinsics.areEqual((Object) "WebAppDownloadFile", (Object) str)) {
                break;
            }
        }
        fgg fgg = (fgg) obj;
        if (fgg == null) {
            z68.f(mgg.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, (Throwable) null);
            return Unit.INSTANCE;
        }
        akd akd = (akd) ((bud) this.d.getValue());
        akd.getClass();
        if (!akd.m(PmsKey.f53jsdownloaddelegate, false)) {
            return Unit.INSTANCE;
        }
        if (ggg.$EnumSwitchMapping$0[fgg.ordinal()] == 1) {
            Object e2 = e(str2, continuation);
            return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ru0 b() {
        return this.f;
    }

    public final Set c() {
        return this.e;
    }

    public final void d(tfg tfg) {
        this.g = tfg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.hgg
            if (r0 == 0) goto L_0x0013
            r0 = r11
            hgg r0 = (defpackage.hgg) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            hgg r0 = new hgg
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0056
            if (r2 == r6) goto L_0x004c
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c4
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            pgg r9 = r0.b
            mgg r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00b0
        L_0x0044:
            pgg r9 = r0.b
            mgg r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x009c
        L_0x004c:
            bgg r9 = r0.c
            pgg r10 = r0.b
            mgg r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0086
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r11)
            yo7 r11 = defpackage.yo7.d
            r11.getClass()
            ogg r2 = defpackage.pgg.Companion
            aq7 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            pgg r10 = (defpackage.pgg) r10
            bgg r11 = new bgg
            java.lang.String r2 = r10.b
            java.lang.String r8 = r10.c
            r11.<init>(r2, r8)
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.w = r6
            ru0 r2 = r9.f
            java.lang.Object r2 = r2.t(r11, r0)
            if (r2 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r2 = r9
            r9 = r11
        L_0x0086:
            jgg r11 = new jgg
            r11.<init>(r2, r10, r7)
            r0.a = r2
            r0.b = r10
            r0.c = r7
            r0.w = r5
            java.lang.Object r11 = r9.e(r11, r0)
            if (r11 != r1) goto L_0x009a
            return r1
        L_0x009a:
            r9 = r10
            r10 = r2
        L_0x009c:
            lo7 r11 = (defpackage.lo7) r11
            kgg r2 = new kgg
            r2.<init>(r10, r9, r7)
            r0.a = r10
            r0.b = r9
            r0.w = r4
            java.lang.Object r11 = r11.c(r2, r0)
            if (r11 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            lo7 r11 = (defpackage.lo7) r11
            lgg r2 = new lgg
            r2.<init>(r10, r9, r7)
            r0.a = r7
            r0.b = r7
            r0.w = r3
            java.lang.Object r9 = r11.d(r2, r0)
            if (r9 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgg.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
