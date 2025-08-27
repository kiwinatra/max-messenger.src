package defpackage;

/* renamed from: nw7  reason: default package */
public final class nw7 extends ij0 {
    public final Long b;
    public final Long c;
    public final cs3 o;
    public final gv6 v;
    public final d4g w;
    public final Long x;
    public final String y;

    public nw7(long j, Long l, Long l2, cs3 cs3, gv6 gv6, d4g d4g, Long l3, String str) {
        super(j);
        this.b = l;
        this.c = l2;
        this.o = cs3;
        this.v = gv6;
        this.w = d4g;
        this.x = l3;
        this.y = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkInfoEvent{chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", contactSearchResult=");
        sb.append(this.o);
        sb.append(", groupChatInfo=");
        sb.append(this.v);
        sb.append(", videoConference=");
        sb.append(this.w);
        sb.append(", stickerSetId=");
        sb.append(this.x);
        sb.append(", startPayload='");
        return wj6.n(sb, this.y, "'}");
    }
}
