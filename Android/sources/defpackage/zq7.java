package defpackage;

import android.os.Bundle;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: zq7  reason: default package */
public final class zq7 {
    public final /* synthetic */ KeyboardStickersWidget a;
    public final /* synthetic */ Bundle b;

    public zq7(KeyboardStickersWidget keyboardStickersWidget, Bundle bundle) {
        this.a = keyboardStickersWidget;
        this.b = bundle;
    }

    public final void a(gpe gpe) {
        xag.h(((sr8) this.a.b.getValue()).v, nr8.a);
        nq7 nq7 = nq7.b;
        long j = gpe.a;
        long j2 = this.b.getLong("arg_key_chat_id");
        ta4 W0 = nq7.W0();
        StringBuilder n = tr1.n(j, ":stickers/preview?sticker_id=", "&chat_id=");
        n.append(j2);
        W0.b(n.toString(), (Bundle) null);
    }
}
