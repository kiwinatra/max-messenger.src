package defpackage;

import android.content.Intent;
import kotlin.TuplesKt;
import org.apache.http.protocol.HTTP;

/* renamed from: id1  reason: default package */
public final class id1 extends j3h {
    public static final id1 b = new j3h(8);

    public final void n1(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        W0().b(":chats/share", o54.f(TuplesKt.to("ru.ok.tamtam.extra.DATA", intent), TuplesKt.to("ru.ok.tamtam.extra.SHARE_TITLE", str2), TuplesKt.to("tag", str3)));
    }

    public final pa4 o1(long j) {
        return new pa4(wj6.j(j, ":chats?id=", "&type=local"));
    }
}
