package defpackage;

import java.util.Set;

/* renamed from: uxb  reason: default package */
public final class uxb extends wa4 {
    public static final uxb b;
    public static final ra4 c;
    public static final ra4 d;
    public static final ra4 e;
    public static final ra4 f;
    public static final ra4 g;
    public static final ra4 h;
    public static final ra4 i;
    public static final ra4 j;
    public static final ra4 k;

    /* JADX WARNING: type inference failed for: r6v0, types: [wa4, uxb] */
    static {
        ? wa4 = new wa4();
        b = wa4;
        c = wa4.a(wa4, ":profile/avatars", new String[]{"id", "type"}, (Set) null, (ma4) null, 14);
        d = wa4.a(wa4, ":profile", new String[]{"id", "type"}, (Set) null, (ma4) null, 14);
        e = wa4.a(wa4, ":profile/attaches", new String[]{"id"}, (Set) null, (ma4) null, 14);
        f = wa4.a(wa4, ":profile/members", new String[]{"id", "type"}, (Set) null, (ma4) null, 14);
        g = wa4.a(wa4, ":profile/invite", new String[]{"id"}, (Set) null, (ma4) null, 14);
        h = wa4.a(wa4, ":profile/pick-admin", new String[]{"id", "type"}, (Set) null, (ma4) null, 14);
        i = wa4.a(wa4, ":profile/add-admins", new String[]{"chat_id"}, (Set) null, (ma4) null, 14);
        j = wa4.a(wa4, ":profile/add-members", new String[]{"chat_id"}, (Set) null, (ma4) null, 14);
        k = wa4.a(wa4, ":profile/change-owner", new String[]{"chat_id"}, (Set) null, (ma4) null, 14);
    }
}
