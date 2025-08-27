package com.android.billingclient.api;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

final class zzcd implements zzby {
    private final h4h zzb;
    private final Context zzc;
    private final zzcf zzd;

    public zzcd(Context context, h4h h4h) {
        this.zzd = new zzcf(context);
        this.zzb = h4h;
        this.zzc = context;
    }

    public final void zza(t3h t3h) {
        if (t3h != null) {
            try {
                m4h t = n4h.t();
                h4h h4h = this.zzb;
                if (h4h != null) {
                    t.h();
                    n4h.q((n4h) t.b, h4h);
                }
                t.h();
                n4h.r((n4h) t.b, t3h);
                this.zzd.zza((n4h) t.a());
            } catch (Throwable unused) {
                int i = oyg.a;
            }
        }
    }

    public final void zzb(w3h w3h) {
        if (w3h != null) {
            try {
                m4h t = n4h.t();
                h4h h4h = this.zzb;
                if (h4h != null) {
                    t.h();
                    n4h.q((n4h) t.b, h4h);
                }
                t.h();
                n4h.s((n4h) t.b, w3h);
                this.zzd.zza((n4h) t.a());
            } catch (Throwable unused) {
                int i = oyg.a;
            }
        }
    }

    public final void zzc(byte[] bArr) {
        try {
            zzg(b4h.n(bArr, xzg.a()));
        } catch (Throwable unused) {
            int i = oyg.a;
        }
    }

    public final void zzd(r4h r4h) {
        if (r4h != null) {
            try {
                m4h t = n4h.t();
                h4h h4h = this.zzb;
                if (h4h != null) {
                    t.h();
                    n4h.q((n4h) t.b, h4h);
                }
                t.h();
                n4h.n((n4h) t.b, r4h);
                this.zzd.zza((n4h) t.a());
            } catch (Throwable unused) {
                int i = oyg.a;
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(int r2, java.util.List r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            int r4 = com.android.billingclient.api.zzbx.zza     // Catch:{ all -> 0x003c }
            a4h r4 = defpackage.b4h.u()     // Catch:{ Exception -> 0x0035 }
            r4.h()     // Catch:{ Exception -> 0x0035 }
            p0h r0 = r4.b     // Catch:{ Exception -> 0x0035 }
            b4h r0 = (defpackage.b4h) r0     // Catch:{ Exception -> 0x0035 }
            defpackage.b4h.t(r0, r2)     // Catch:{ Exception -> 0x0035 }
            r4.h()     // Catch:{ Exception -> 0x0035 }
            p0h r2 = r4.b     // Catch:{ Exception -> 0x0035 }
            b4h r2 = (defpackage.b4h) r2     // Catch:{ Exception -> 0x0035 }
            defpackage.b4h.r(r2)     // Catch:{ Exception -> 0x0035 }
            r4.h()     // Catch:{ Exception -> 0x0035 }
            p0h r2 = r4.b     // Catch:{ Exception -> 0x0035 }
            b4h r2 = (defpackage.b4h) r2     // Catch:{ Exception -> 0x0035 }
            defpackage.b4h.q(r2, r5)     // Catch:{ Exception -> 0x0035 }
            r4.h()     // Catch:{ Exception -> 0x0035 }
            p0h r2 = r4.b     // Catch:{ Exception -> 0x0035 }
            b4h r2 = (defpackage.b4h) r2     // Catch:{ Exception -> 0x0035 }
            defpackage.b4h.s(r2, r3)     // Catch:{ Exception -> 0x0035 }
            p0h r2 = r4.a()     // Catch:{ Exception -> 0x0035 }
            b4h r2 = (defpackage.b4h) r2     // Catch:{ Exception -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            int r2 = defpackage.oyg.a     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0038:
            r1.zzg(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            int r1 = defpackage.oyg.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzcd.zze(int, java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = defpackage.oyg.a;
        r2 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00b7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(int r2, java.util.List r3, java.util.List r4, com.android.billingclient.api.BillingResult r5, boolean r6, boolean r7) {
        /*
            r1 = this;
            int r2 = com.android.billingclient.api.zzbx.zza     // Catch:{ all -> 0x00be }
            a4h r2 = defpackage.b4h.u()     // Catch:{ Exception -> 0x00b7 }
            r2.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r6 = r2.b     // Catch:{ Exception -> 0x00b7 }
            b4h r6 = (defpackage.b4h) r6     // Catch:{ Exception -> 0x00b7 }
            r0 = 4
            defpackage.b4h.t(r6, r0)     // Catch:{ Exception -> 0x00b7 }
            r2.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r6 = r2.b     // Catch:{ Exception -> 0x00b7 }
            b4h r6 = (defpackage.b4h) r6     // Catch:{ Exception -> 0x00b7 }
            defpackage.b4h.s(r6, r3)     // Catch:{ Exception -> 0x00b7 }
            r2.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r3 = r2.b     // Catch:{ Exception -> 0x00b7 }
            b4h r3 = (defpackage.b4h) r3     // Catch:{ Exception -> 0x00b7 }
            defpackage.b4h.r(r3)     // Catch:{ Exception -> 0x00b7 }
            r2.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r3 = r2.b     // Catch:{ Exception -> 0x00b7 }
            b4h r3 = (defpackage.b4h) r3     // Catch:{ Exception -> 0x00b7 }
            defpackage.b4h.q(r3, r7)     // Catch:{ Exception -> 0x00b7 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ Exception -> 0x00b7 }
        L_0x0033:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00b7 }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00b7 }
            com.android.billingclient.api.Purchase r4 = (com.android.billingclient.api.Purchase) r4     // Catch:{ Exception -> 0x00b7 }
            o4h r6 = defpackage.p4h.q()     // Catch:{ Exception -> 0x00b7 }
            java.util.List r7 = r4.getProducts()     // Catch:{ Exception -> 0x00b7 }
            r6.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r0 = r6.b     // Catch:{ Exception -> 0x00b7 }
            p4h r0 = (defpackage.p4h) r0     // Catch:{ Exception -> 0x00b7 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x00b7 }
            defpackage.p4h.n(r0, r7)     // Catch:{ Exception -> 0x00b7 }
            int r7 = r4.getPurchaseState()     // Catch:{ Exception -> 0x00b7 }
            r6.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r0 = r6.b     // Catch:{ Exception -> 0x00b7 }
            p4h r0 = (defpackage.p4h) r0     // Catch:{ Exception -> 0x00b7 }
            defpackage.p4h.o(r0, r7)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x00b7 }
            r6.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r7 = r6.b     // Catch:{ Exception -> 0x00b7 }
            p4h r7 = (defpackage.p4h) r7     // Catch:{ Exception -> 0x00b7 }
            defpackage.p4h.p(r7, r4)     // Catch:{ Exception -> 0x00b7 }
            r2.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r4 = r2.b     // Catch:{ Exception -> 0x00b7 }
            b4h r4 = (defpackage.b4h) r4     // Catch:{ Exception -> 0x00b7 }
            p0h r6 = r6.a()     // Catch:{ Exception -> 0x00b7 }
            p4h r6 = (defpackage.p4h) r6     // Catch:{ Exception -> 0x00b7 }
            defpackage.b4h.o(r4, r6)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x0033
        L_0x0080:
            x3h r3 = defpackage.y3h.r()     // Catch:{ Exception -> 0x00b7 }
            int r4 = r5.getResponseCode()     // Catch:{ Exception -> 0x00b7 }
            r3.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r6 = r3.b     // Catch:{ Exception -> 0x00b7 }
            y3h r6 = (defpackage.y3h) r6     // Catch:{ Exception -> 0x00b7 }
            defpackage.y3h.n(r6, r4)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r4 = r5.getDebugMessage()     // Catch:{ Exception -> 0x00b7 }
            r3.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r5 = r3.b     // Catch:{ Exception -> 0x00b7 }
            y3h r5 = (defpackage.y3h) r5     // Catch:{ Exception -> 0x00b7 }
            defpackage.y3h.o(r5, r4)     // Catch:{ Exception -> 0x00b7 }
            r2.h()     // Catch:{ Exception -> 0x00b7 }
            p0h r4 = r2.b     // Catch:{ Exception -> 0x00b7 }
            b4h r4 = (defpackage.b4h) r4     // Catch:{ Exception -> 0x00b7 }
            p0h r3 = r3.a()     // Catch:{ Exception -> 0x00b7 }
            y3h r3 = (defpackage.y3h) r3     // Catch:{ Exception -> 0x00b7 }
            defpackage.b4h.p(r4, r3)     // Catch:{ Exception -> 0x00b7 }
            p0h r2 = r2.a()     // Catch:{ Exception -> 0x00b7 }
            b4h r2 = (defpackage.b4h) r2     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00ba
        L_0x00b7:
            int r2 = defpackage.oyg.a     // Catch:{ all -> 0x00be }
            r2 = 0
        L_0x00ba:
            r1.zzg(r2)     // Catch:{ all -> 0x00be }
            return
        L_0x00be:
            int r1 = defpackage.oyg.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzcd.zzf(int, java.util.List, java.util.List, com.android.billingclient.api.BillingResult, boolean, boolean):void");
    }

    public final void zzg(b4h b4h) {
        int i;
        if (b4h != null) {
            try {
                if (this.zzb != null) {
                    try {
                        Context context = this.zzc;
                        String str = null;
                        ContentResolver contentResolver = context == null ? null : context.getContentResolver();
                        if (contentResolver != null) {
                            str = Settings.Secure.getString(contentResolver, "android_id");
                        }
                        if (str == null) {
                            i = 0;
                        } else {
                            int i2 = yyg.a;
                            i = xyg.a.a(str).a();
                        }
                        long j = ((long) (i % 100)) % 100;
                        if (j < 0) {
                            j += 100;
                        }
                        if (((long) ((int) j)) < 0) {
                            m4h t = n4h.t();
                            h4h h4h = this.zzb;
                            if (h4h != null) {
                                t.h();
                                n4h.q((n4h) t.b, h4h);
                            }
                            t.h();
                            n4h.o((n4h) t.b, b4h);
                            i4h o = j4h.o();
                            zzdi.zza(this.zzc);
                            o.h();
                            j4h.n((j4h) o.b);
                            t.h();
                            n4h.p((n4h) t.b, (j4h) o.a());
                            this.zzd.zza((n4h) t.a());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable unused2) {
                int i3 = oyg.a;
            }
        }
    }
}
