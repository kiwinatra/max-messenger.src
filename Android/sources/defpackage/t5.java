package defpackage;

/* renamed from: t5  reason: default package */
public final class t5 {
    public final long a;
    public final long b;
    public final String c;
    public long d = 0;
    public boolean e = false;
    public long f = 0;
    public String g = null;
    public boolean h;
    public String i;
    public boolean j;
    public uk2 k = uk2.DEFAULT;

    public t5(long j2) {
        this.a = j2;
        this.b = 0;
        this.c = null;
    }

    public static t5 a(long j2) {
        return new t5(j2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActChatParams{chatId=");
        sb.append(this.a);
        sb.append(", chatMode=");
        sb.append(this.k.name());
        sb.append(", chatAccessToken=");
        sb.append(!cvg.A(this.c));
        sb.append(", openedFromPush=false, loadMark=");
        sb.append(this.d);
        sb.append(", keepBackStack=");
        sb.append(this.e);
        sb.append(", messageFromSearchId=0, messageFromSearchHighlights=null, highlightedMessageId=");
        sb.append(this.f);
        sb.append(", hashTagForSearch='");
        sb.append(this.g);
        sb.append("', locationRequest=");
        sb.append(this.h);
        sb.append(", startPayload='");
        sb.append(this.i);
        sb.append("', newTask=");
        return tr1.m(sb, this.j, ", openSearchField=false}");
    }
}
