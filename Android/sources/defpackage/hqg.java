package defpackage;

import androidx.work.WorkRequest;
import java.util.Set;

/* renamed from: hqg  reason: default package */
public final class hqg {
    public final String a;
    public final String b;
    public final fb5 c;
    public final xpg d;
    public final Set e;
    public final long f;
    public final int g;

    public hqg(String str, String str2, fb5 fb5, xpg xpg, Set set, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = fb5;
        this.d = xpg;
        this.e = set;
        this.f = j;
        this.g = i;
    }

    public hqg(String str, fb5 fb5, WorkRequest workRequest) {
        this(workRequest.getId().toString(), str, fb5, workRequest.getWorkSpec(), workRequest.getTags(), System.currentTimeMillis(), 0);
    }
}
