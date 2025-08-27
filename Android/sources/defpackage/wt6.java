package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;

/* renamed from: wt6  reason: default package */
public final class wt6 implements bfe {
    public final Context a;
    public final n6e b;
    public final dtc c;
    public final jx3 d;
    public final String e;
    public final Lazy f;
    public swg g;
    public int h = 6;
    public s7h i;

    public wt6(Context context, gaf gaf) {
        this.a = context;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.b = b2;
        this.c = new dtc(b2);
        this.d = e14.a(((osa) gaf).c().t0());
        String name = wt6.class.getName();
        this.e = name;
        Lazy lazy = LazyKt.lazy(new u75(22, this));
        this.f = lazy;
        if (q8.K(context, (vt6) lazy.getValue(), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", 2) == null) {
            z68.h(name, new Error("SMS Retriever registration failed"), (String) null, new Object[0]);
            Unit unit = Unit.INSTANCE;
        }
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.wt6 r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            java.lang.String r0 = "[0-9]{"
            boolean r1 = r11 instanceof defpackage.tt6
            if (r1 == 0) goto L_0x0018
            r1 = r11
            tt6 r1 = (defpackage.tt6) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.w = r2
            goto L_0x001d
        L_0x0018:
            tt6 r1 = new tt6
            r1.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r1.o
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.w
            java.lang.String r4 = ", message="
            java.lang.String r5 = "sms code matching failed: codeLength="
            r6 = 1
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0045
            if (r3 != r6) goto L_0x003d
            java.lang.Object r9 = r1.c
            java.lang.String r10 = r1.b
            wt6 r0 = r1.a
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r9
            r9 = r0
            goto L_0x00bf
        L_0x003d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch:{ all -> 0x0070 }
            int r11 = r9.h     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r3.<init>(r0)     // Catch:{ all -> 0x0070 }
            r3.append(r11)     // Catch:{ all -> 0x0070 }
            java.lang.String r11 = "}"
            r3.append(r11)     // Catch:{ all -> 0x0070 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0070 }
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch:{ all -> 0x0070 }
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch:{ all -> 0x0070 }
            boolean r0 = r11.find()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r11 = r11.group(r8)     // Catch:{ all -> 0x0070 }
            goto L_0x0073
        L_0x0070:
            r11 = move-exception
            goto L_0x0078
        L_0x0072:
            r11 = r7
        L_0x0073:
            java.lang.Object r11 = kotlin.Result.m23constructorimpl(r11)     // Catch:{ all -> 0x0070 }
            goto L_0x0082
        L_0x0078:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.m23constructorimpl(r11)
        L_0x0082:
            boolean r0 = kotlin.Result.m30isSuccessimpl(r11)
            if (r0 == 0) goto L_0x00bf
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00ae
            i14 r0 = new i14
            int r1 = r9.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r2 = r9.e
            defpackage.z68.h(r2, r0, r7, r1)
            goto L_0x00bf
        L_0x00ae:
            n6e r3 = r9.b
            r1.a = r9
            r1.b = r10
            r1.c = r11
            r1.w = r6
            java.lang.Object r0 = r3.a(r0, r1)
            if (r0 != r2) goto L_0x00bf
            goto L_0x00e7
        L_0x00bf:
            java.lang.Throwable r11 = kotlin.Result.m26exceptionOrNullimpl(r11)
            if (r11 == 0) goto L_0x00e5
            java.lang.String r0 = r9.e
            i14 r1 = new i14
            int r9 = r9.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r9)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9, r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            defpackage.z68.h(r0, r1, r7, r9)
        L_0x00e5:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x00e7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt6.a(wt6, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [swg, ct6] */
    /* JADX WARNING: type inference failed for: r2v6, types: [js9, java.lang.Object] */
    public final void b() {
        s7h c2;
        if (this.i != null) {
            z68.c(this.e, "task not null! skip start retriever", new Object[0]);
            return;
        }
        s7h s7h = null;
        if (this.g == null) {
            ? obj = new Object();
            this.g = new ct6(this.a, swg.v0, (GoogleSignInOptions) null, (js9) obj);
        }
        swg swg = this.g;
        if (!(swg == null || (c2 = swg.c(1, new zvg())) == null)) {
            uq uqVar = new uq(4, new rx2(25, this));
            k40 k40 = xdf.a;
            c2.d(k40, uqVar);
            c2.i(new st6(this));
            c2.c(k40, new st6(this));
            c2.a(k40, new st6(this));
            s7h = c2;
        }
        this.i = s7h;
    }
}
