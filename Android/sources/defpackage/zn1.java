package defpackage;

/* renamed from: zn1  reason: default package */
public final class zn1 extends ij0 {
    public final long b;
    public final String c;

    public zn1(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackAnswerEvent{chatId=");
        sb.append(this.b);
        sb.append("text=");
        return g63.l(sb, this.c, '}');
    }
}
