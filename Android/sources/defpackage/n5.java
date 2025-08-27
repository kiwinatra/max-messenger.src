package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n5  reason: default package */
public abstract class n5 extends m5 {
    static {
        new AtomicReference(dac.o);
    }

    public static void T(Context context, v21 v21, long j, long j2, boolean z, d4g d4g, boolean z2, boolean z3) {
        ym ymVar = ym.v;
        if (!((rh3) ((qra) ym.e()).getAccessor().g(rh3.class)).e()) {
            hi7.b0(0, ymVar, ymVar.getString(qad.w1));
            return;
        }
        v21.getClass();
        Intent intent = new Intent(context, n5.class);
        intent.addFlags(872415232);
        if (j != 0) {
            intent.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
        }
        intent.putExtra("ru.ok.tamtam.extra.VIDEO_OUTGOING", z2);
        intent.putExtra("ru.ok.tamtam.extra.MUTED_OUTGOING", z3);
        if (z) {
            intent.putExtra("ru.ok.tamtam.extra.EMPTY_CALL_WITH_LINK", true);
        }
        if (j2 != 0) {
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j2);
        }
        if (d4g != null) {
            intent.putExtra("ru.ok.tamtam.extra.VIDEO_CONFERENCE", d4g);
        }
        context.startActivity(intent);
    }
}
