package defpackage;

/* renamed from: hh2  reason: default package */
public final class hh2 extends j3h {
    public static final hh2 b = new j3h(8);

    public static pa4 n1(long j, Long l) {
        if (l == null) {
            return new pa4(wj6.i(j, ":chats/forward?messages_ids="));
        }
        return new pa4(":chats/forward?messages_ids=" + j + "&attach_id=" + l + "&is_forward_attach=true");
    }
}
