package defpackage;

import java.util.Set;
import kotlin.collections.SetsKt;

/* renamed from: kt7  reason: default package */
public final class kt7 extends wa4 {
    public static final kt7 b;
    public static final ra4 c;
    public static final ra4 d;
    public static final ra4 e;
    public static final ra4 f;

    /* JADX WARNING: type inference failed for: r6v0, types: [wa4, kt7] */
    static {
        ? wa4 = new wa4();
        b = wa4;
        c = wa4.a(wa4, ":contact-multi-picker", new String[]{"type"}, (Set) null, (ma4) null, 14);
        d = wa4.a(wa4, ":location/show", new String[]{"lat", "lon"}, (Set) null, (ma4) null, 14);
        e = wa4.a(wa4, ":location/pick", new String[]{"request_code"}, (Set) null, (ma4) null, 14);
        f = wa4.a(wa4, ":attach/fullscreen", new String[]{"attachment_id"}, SetsKt.setOf("message"), (ma4) null, 12);
    }
}
