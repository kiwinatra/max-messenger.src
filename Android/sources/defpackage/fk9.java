package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: fk9  reason: default package */
public final class fk9 extends j3h {
    public static final fk9 b = new j3h(8);

    public static pa4 n1(List list, boolean z) {
        String p = CollectionsKt___CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        return new pa4(":chats/forward?messages_ids=" + p + "&show_ext_sharing=" + z);
    }

    public static pa4 p1(long j, long j2, String str, sr4 sr4) {
        int ordinal = sr4.ordinal();
        StringBuilder n = tr1.n(j, ":dialogs/share-media?msg_id=", "&attach_id=");
        n.append(j2);
        n.append("&local_attach_id=");
        n.append(str);
        n.append("&cause_ordinal=");
        n.append(ordinal);
        return new pa4(n.toString());
    }

    public static pa4 q1(long j, kfg kfg, Long l, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(":webapp:root?bot_id=" + j + "&entry_point=" + kfg.a);
        if (l != null) {
            sb.append("&chat_id=" + l);
        }
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new pa4(sb.toString());
    }

    public final pa4 o1(long j) {
        return new pa4(wj6.j(j, ":chats?id=", "&type=local"));
    }
}
