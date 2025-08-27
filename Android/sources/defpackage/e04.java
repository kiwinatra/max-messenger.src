package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e04  reason: default package */
public final class e04 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ay2 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e04(ay2 ay2, long j, Continuation continuation) {
        super(2, continuation);
        this.c = ay2;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e04 e04 = new e04(this.c, this.o, continuation);
        e04.b = obj;
        return e04;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e04) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        r9 = (defpackage.ha9) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r9 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r9 = r9.a(defpackage.g20.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r9 == null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (((defpackage.rh3) ((kotlin.Lazy) r3.o).getValue()).e() != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r4 = r9.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r4 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r9 = r9.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r9 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r9.length() != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r4 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r4.length() != 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        r8.b = r1;
        r8.a = 4;
        r9 = defpackage.okf.c(1000, new defpackage.d04(r3, r4, (kotlin.coroutines.Continuation) null), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r9 != r0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        r9 = (android.net.Uri) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r9 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r9 = new defpackage.a04((defpackage.ngf) ((kotlin.Lazy) r3.v).getValue());
        r8.b = null;
        r8.a = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ca, code lost:
        if (r1.a(r9, r8) != r0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        r4 = (android.content.Context) r3.b;
        ((android.content.ClipboardManager) r4.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newUri(r4.getContentResolver(), "image/jpeg", r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        if (defpackage.b59.C() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        r9 = new defpackage.b04((defpackage.ngf) ((kotlin.Lazy) r3.w).getValue());
        r8.b = null;
        r8.a = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        if (r1.a(r9, r8) != r0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0109, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010c, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        r9 = new defpackage.a04((defpackage.ngf) ((kotlin.Lazy) r3.v).getValue());
        r8.b = null;
        r8.a = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        if (r1.a(r9, r8) != r0) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        r9 = new defpackage.a04((defpackage.ngf) ((kotlin.Lazy) r3.v).getValue());
        r8.b = null;
        r8.a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0143, code lost:
        if (r1.a(r9, r8) != r0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.a
            r2 = 0
            ay2 r3 = r8.c
            switch(r1) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0031;
                case 2: goto L_0x002c;
                case 3: goto L_0x0027;
                case 4: goto L_0x001e;
                case 5: goto L_0x0019;
                case 6: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0014:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x010a
        L_0x0019:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00cd
        L_0x001e:
            java.lang.Object r1 = r8.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00ae
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0128
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0146
        L_0x0031:
            java.lang.Object r1 = r8.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005b
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.b
            ds5 r9 = (defpackage.ds5) r9
            java.lang.Object r1 = r3.c
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            to9 r1 = (defpackage.to9) r1
            r8.b = r9
            r4 = 1
            r8.a = r4
            long r4 = r8.o
            java.lang.Object r1 = r1.a(r4, r8)
            if (r1 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x005b:
            ha9 r9 = (defpackage.ha9) r9
            if (r9 != 0) goto L_0x0062
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0062:
            g20 r4 = defpackage.g20.c
            l20 r9 = r9.a(r4)
            if (r9 == 0) goto L_0x012b
            java.lang.Object r4 = r3.o
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            rh3 r4 = (defpackage.rh3) r4
            boolean r4 = r4.e()
            if (r4 != 0) goto L_0x007c
            goto L_0x012b
        L_0x007c:
            x10 r4 = r9.b
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = r4.a()
            goto L_0x0086
        L_0x0085:
            r4 = r2
        L_0x0086:
            java.lang.String r9 = r9.r
            if (r9 == 0) goto L_0x0092
            int r5 = r9.length()
            if (r5 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r4 = r9
        L_0x0092:
            if (r4 == 0) goto L_0x010d
            int r9 = r4.length()
            if (r9 != 0) goto L_0x009b
            goto L_0x010d
        L_0x009b:
            r8.b = r1
            r9 = 4
            r8.a = r9
            d04 r9 = new d04
            r9.<init>(r3, r4, r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = defpackage.okf.c(r4, r9, r8)
            if (r9 != r0) goto L_0x00ae
            return r0
        L_0x00ae:
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 != 0) goto L_0x00d0
            a04 r9 = new a04
            java.lang.Object r3 = r3.v
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            ngf r3 = (defpackage.ngf) r3
            r9.<init>(r3)
            r8.b = r2
            r2 = 5
            r8.a = r2
            java.lang.Object r8 = r1.a(r9, r8)
            if (r8 != r0) goto L_0x00cd
            return r0
        L_0x00cd:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00d0:
            java.lang.Object r4 = r3.b
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r5 = "clipboard"
            java.lang.Object r5 = r4.getSystemService(r5)
            android.content.ClipboardManager r5 = (android.content.ClipboardManager) r5
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r6 = "image/jpeg"
            android.content.ClipData r9 = android.content.ClipData.newUri(r4, r6, r9)
            r5.setPrimaryClip(r9)
            boolean r9 = defpackage.b59.C()
            if (r9 == 0) goto L_0x010a
            b04 r9 = new b04
            java.lang.Object r3 = r3.w
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            ngf r3 = (defpackage.ngf) r3
            r9.<init>(r3)
            r8.b = r2
            r2 = 6
            r8.a = r2
            java.lang.Object r8 = r1.a(r9, r8)
            if (r8 != r0) goto L_0x010a
            return r0
        L_0x010a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x010d:
            a04 r9 = new a04
            java.lang.Object r3 = r3.v
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            ngf r3 = (defpackage.ngf) r3
            r9.<init>(r3)
            r8.b = r2
            r2 = 3
            r8.a = r2
            java.lang.Object r8 = r1.a(r9, r8)
            if (r8 != r0) goto L_0x0128
            return r0
        L_0x0128:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x012b:
            a04 r9 = new a04
            java.lang.Object r3 = r3.v
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            ngf r3 = (defpackage.ngf) r3
            r9.<init>(r3)
            r8.b = r2
            r2 = 2
            r8.a = r2
            java.lang.Object r8 = r1.a(r9, r8)
            if (r8 != r0) goto L_0x0146
            return r0
        L_0x0146:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e04.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
