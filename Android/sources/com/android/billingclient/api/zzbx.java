package com.android.billingclient.api;

import java.util.List;

public final /* synthetic */ class zzbx {
    public static final /* synthetic */ int zza = 0;

    static {
        yxg yxg = zzby.zza;
    }

    public static z3h zza(String str) {
        yxg yxg = zzby.zza;
        Object obj = z3h.BROADCAST_ACTION_UNSPECIFIED;
        Object obj2 = yxg.get(str);
        if (obj2 != null) {
            obj = obj2;
        }
        return (z3h) obj;
    }

    public static t3h zzb(int i, int i2, BillingResult billingResult) {
        try {
            s3h r = t3h.r();
            x3h r2 = y3h.r();
            int responseCode = billingResult.getResponseCode();
            r2.h();
            y3h.n((y3h) r2.b, responseCode);
            String debugMessage = billingResult.getDebugMessage();
            r2.h();
            y3h.o((y3h) r2.b, debugMessage);
            r2.h();
            y3h.q((y3h) r2.b, i);
            r.h();
            t3h.o((t3h) r.b, (y3h) r2.a());
            r.h();
            t3h.q((t3h) r.b, i2);
            return (t3h) r.a();
        } catch (Exception unused) {
            int i3 = oyg.a;
            return null;
        }
    }

    public static t3h zzc(int i, int i2, BillingResult billingResult, String str) {
        try {
            x3h r = y3h.r();
            int responseCode = billingResult.getResponseCode();
            r.h();
            y3h.n((y3h) r.b, responseCode);
            String debugMessage = billingResult.getDebugMessage();
            r.h();
            y3h.o((y3h) r.b, debugMessage);
            r.h();
            y3h.q((y3h) r.b, i);
            if (str != null) {
                r.h();
                y3h.p((y3h) r.b, str);
            }
            s3h r2 = t3h.r();
            r2.h();
            t3h.o((t3h) r2.b, (y3h) r.a());
            r2.h();
            t3h.q((t3h) r2.b, i2);
            return (t3h) r2.a();
        } catch (Exception unused) {
            int i3 = oyg.a;
            return null;
        }
    }

    public static w3h zzd(int i) {
        try {
            v3h p = w3h.p();
            p.h();
            w3h.o((w3h) p.b, i);
            return (w3h) p.a();
        } catch (Exception unused) {
            int i2 = oyg.a;
            return null;
        }
    }

    public static b4h zze(int i, List list) {
        try {
            a4h u = b4h.u();
            u.h();
            b4h.t((b4h) u.b, 3);
            u.h();
            b4h.s((b4h) u.b, list);
            return (b4h) u.a();
        } catch (Exception unused) {
            int i2 = oyg.a;
            return null;
        }
    }
}
