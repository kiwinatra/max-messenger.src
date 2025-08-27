package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ru9  reason: default package */
public final class ru9 {
    public final long a;
    public final long b;
    public final ea6 c;
    public final ea6 d;

    public ru9(long j, long j2, ea6 ea6, ea6 ea62) {
        this.a = j;
        this.b = j2;
        this.c = ea6;
        this.d = ea62;
    }

    public static ru9 a(Context context, long j, String str) {
        ea6 ea6;
        long j2;
        ea6 ea62;
        String str2;
        long j3 = j;
        ou9 ou9 = new ou9(16, gze.d0);
        qu9 qu9 = new qu9();
        wd4 wd4 = new wd4(context);
        Map emptyMap = Collections.emptyMap();
        Uri parse = Uri.parse(str);
        n79.p(parse, "The uri must be set.");
        try {
            long G = wd4.G(new q74(parse, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null));
            n79.n(G != 0);
            String str3 = "The uri must be set.";
            hf4 hf4 = r5;
            hf4 hf42 = new hf4(wd4, 0, G);
            n79.m("The MP4 file is invalid", ou9.n(hf4));
            ou9.U(qu9);
            yl4 yl4 = new yl4(16, false);
            hf4 hf43 = hf4;
            while (!qu9.c) {
                int g = ou9.g(hf43, yl4);
                if (g == 1) {
                    wd4.close();
                    Map emptyMap2 = Collections.emptyMap();
                    Uri parse2 = Uri.parse(str);
                    long j4 = yl4.b;
                    str2 = str3;
                    n79.p(parse2, str2);
                    long G2 = wd4.G(new q74(parse2, 0, 1, (byte[]) null, emptyMap2, j4, -1, (String) null, 0, (Object) null));
                    if (G2 != -1) {
                        G2 += yl4.b;
                    }
                    hf43 = new hf4(wd4, yl4.b, G2);
                } else {
                    str2 = str3;
                    if (g != -1) {
                        continue;
                    } else if (!qu9.c) {
                        throw new IllegalStateException("The MP4 file is invalid");
                    }
                }
                str3 = str2;
            }
            long j5 = ou9.H0;
            int i = qu9.a;
            HashMap hashMap = (HashMap) qu9.o;
            if (i != -1) {
                pu9 pu9 = (pu9) hashMap.get(2);
                pu9.getClass();
                ea6 ea63 = pu9.a;
                ea63.getClass();
                n79.n(j5 != -9223372036854775807L);
                long j6 = ou9.i(qu9.a, j5).a.a;
                if (j3 != -9223372036854775807L) {
                    qnd i2 = ou9.i(qu9.a, j3);
                    long j7 = i2.a.a;
                    if (j3 != j7) {
                        j7 = i2.b.a;
                        if (j3 > j7) {
                            j2 = Long.MIN_VALUE;
                            ea6 = ea63;
                        }
                    }
                    ea6 = ea63;
                    j2 = j7;
                } else {
                    ea6 = ea63;
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
                ea6 = null;
            }
            if (qu9.b != -1) {
                pu9 pu92 = (pu9) hashMap.get(1);
                pu92.getClass();
                ea6 ea64 = pu92.a;
                ea64.getClass();
                ea62 = ea64;
            } else {
                ea62 = null;
            }
            ru9 ru9 = new ru9(j5, j2, ea6, ea62);
            b0h.l(wd4);
            return ru9;
        } catch (Throwable th) {
            b0h.l(wd4);
            throw th;
        }
    }
}
