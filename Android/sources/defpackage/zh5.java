package defpackage;

/* renamed from: zh5  reason: default package */
public final /* synthetic */ class zh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ zh5(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        int i = this.c;
        long j = this.b;
        switch (this.a) {
            case 0:
                z68.c("ai5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j), Integer.valueOf(i));
                return;
            default:
                z68.c("vi5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j), Integer.valueOf(i));
                return;
        }
    }
}
