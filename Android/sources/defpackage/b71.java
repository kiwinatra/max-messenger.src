package defpackage;

import android.os.Bundle;
import kotlin.Unit;

/* renamed from: b71  reason: default package */
public final class b71 extends j3h {
    public static final b71 b = new j3h(8);

    public final void n1(Long l, String str, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(":call-history-info?is_link_call=true");
        b71 b71 = b;
        if (str != null) {
            b71.getClass();
            sb.append("&call_link=".concat(str));
        }
        if (charSequence != null) {
            b71.getClass();
            sb.append("&call_title=" + charSequence);
        }
        if (l != null) {
            b71.getClass();
            sb.append("&call_chat_id=" + l);
        }
        W0().b(sb.toString(), (Bundle) null);
    }

    public final void o1(long j, long j2) {
        String m = wj6.m(tr1.n(j, ":chats?id=", "&type=local&message_id="), j2, "&highlight_message=true");
        Unit unit = Unit.INSTANCE;
        W0().b(m, (Bundle) null);
    }
}
