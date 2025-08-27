package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: w5e  reason: default package */
public final class w5e extends yce {
    public static final w5e b = new yce();

    public final xa4 c() {
        xa4 xa4 = xa4.c;
        return xa4.c;
    }

    public final ya4 d(Bundle bundle) {
        long L = o54.L("msg_id", bundle);
        long L2 = o54.L("attach_id", bundle);
        String N = o54.N("local_attach_id", bundle);
        int K = o54.K("cause_ordinal", bundle);
        String string = bundle.getString("snack_bot_margin");
        return new v5e(L, L2, N, K, string != null ? Integer.valueOf(Integer.parseInt(string)) : null, o54.E("force_dark", bundle));
    }

    public final void e(xce xce) {
        wa4.a(xce, ":dialogs/share-media", new String[]{"msg_id", "attach_id", "local_attach_id", "cause_ordinal"}, (Set) null, (ma4) null, 14);
    }
}
