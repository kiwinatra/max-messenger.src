package defpackage;

/* renamed from: wh5  reason: default package */
public final /* synthetic */ class wh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ wh5() {
        this.a = 3;
        this.b = 0;
    }

    public final void run() {
        long j = this.b;
        switch (this.a) {
            case 0:
                z68.c("ai5", "onNotifAdded: added sticker set %d to cache", Long.valueOf(j));
                return;
            case 1:
                z68.c("ai5", "loadFromMarker: success marker=d", Long.valueOf(j));
                return;
            case 2:
                z68.c("mi5", "assetsUpdate: queued on api, sync=%d", Long.valueOf(j));
                return;
            case 3:
                z68.c("qi5", "assetsUpdate: queued on api, sync=%d", Long.valueOf(j));
                return;
            case 4:
                z68.c("vi5", "loadFromMarker: success marker=d", Long.valueOf(j));
                return;
            case 5:
                z68.c("vi5", "onNotifAdded: added sticker %d to cache", Long.valueOf(j));
                return;
            case 6:
                z68.c("g1a", "Update track for message %d: track is empty", Long.valueOf(j));
                return;
            default:
                throw new IllegalArgumentException("no chat found by id #" + j);
        }
    }

    public /* synthetic */ wh5(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
