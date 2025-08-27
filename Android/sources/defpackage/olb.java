package defpackage;

/* renamed from: olb  reason: default package */
public final class olb extends j3h {
    public static final olb b = new j3h(8);

    public static pa4 n1(long j, long j2, boolean z) {
        StringBuilder k = i2a.k(":chats?id=", j, "&type=", z ? "local" : "server");
        k.append("&message_id=");
        k.append(j2);
        return new pa4(k.toString());
    }
}
