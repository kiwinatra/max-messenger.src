package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: nd3  reason: default package */
public final class nd3 {
    public final int a;
    public final od3[] b;
    public long c;

    public nd3(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new od3[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new c9a(threadFactory);
        }
    }

    public final od3 a() {
        int i = this.a;
        if (i == 0) {
            return pd3.g;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.b[(int) (j % ((long) i))];
    }
}
