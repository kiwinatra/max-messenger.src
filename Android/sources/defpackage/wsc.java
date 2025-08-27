package defpackage;

/* renamed from: wsc  reason: default package */
public final class wsc extends ij0 {
    public final /* synthetic */ int b;
    public final long c;

    public /* synthetic */ wsc(long j, int i) {
        this.b = i;
        this.c = j;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return i2a.j(new StringBuilder("ReadMarkEvent{chatId="), this.c, '}');
            default:
                return i2a.j(new StringBuilder("StickerDownloadCompleteEvent{stickerId="), this.c, '}');
        }
    }
}
