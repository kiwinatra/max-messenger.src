package defpackage;

/* renamed from: xh5  reason: default package */
public final /* synthetic */ class xh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xh5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    public final void run() {
        boolean z = this.c;
        long j = this.b;
        switch (this.a) {
            case 0:
                z68.c("ai5", "markAsFavorite: complete for setId=%d favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
                return;
            default:
                z68.c("vi5", "markAsFavorite: complete for stickerId=%d favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
                return;
        }
    }
}
