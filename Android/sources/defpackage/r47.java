package defpackage;

/* renamed from: r47  reason: default package */
public final /* synthetic */ class r47 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ mq4 o;

    public /* synthetic */ r47(mq4 mq4, float f, long j, int i) {
        this.a = i;
        this.o = mq4;
        this.b = f;
        this.c = j;
    }

    public final void run() {
        mq4 mq4 = this.o;
        switch (this.a) {
            case 0:
                s47 s47 = (s47) mq4;
                if (!s47.w.get()) {
                    long nanoTime = System.nanoTime();
                    long j = s47.x;
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    float f = this.b;
                    if (i == 0 || Math.abs(nanoTime - j) > 1000000000) {
                        s47.x = nanoTime;
                        z68.c("t47", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f), Long.valueOf(this.c));
                    }
                    s47.v.d(new p47(f, false));
                    return;
                }
                return;
            default:
                k57 k57 = (k57) mq4;
                if (!k57.y.get()) {
                    long nanoTime2 = System.nanoTime();
                    long j2 = k57.z;
                    int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                    float f2 = this.b;
                    long j3 = this.c;
                    if (i2 == 0 || Math.abs(nanoTime2 - j2) > 1000000000) {
                        k57.z = nanoTime2;
                        z68.c("l57", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f2), Long.valueOf(j3));
                    }
                    k57.x.d(new j57(false, (String) null, f2, j3));
                    return;
                }
                return;
        }
    }
}
