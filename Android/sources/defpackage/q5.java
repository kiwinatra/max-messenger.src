package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: q5  reason: default package */
public abstract class q5 extends m5 implements lpe, vde, ku8 {
    public static final /* synthetic */ int z0 = 0;

    public static void T(Activity activity, t5 t5Var) {
        z68.c("q5", "startChat: %s", t5Var.toString());
        if (activity != null) {
            Intent intent = new Intent(activity, q5.class);
            long j = t5Var.a;
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", t5Var.b);
            intent.putExtra("ru.ok.tamtam.extra.LOAD_MARK", t5Var.d);
            boolean z = false;
            intent.putExtra("ru.ok.tamtam.extra.OPENED_FROM_PUSH", false);
            intent.putExtra("ru.ok.tamtam.extra.OPEN_SEARCH_FIELD", false);
            intent.putExtra("ru.ok.tamtam.extra.HASH_TAG", t5Var.g);
            a32 G = ((qra) ym.e()).l().G(j);
            if (G != null) {
                boolean z2 = G.b0() && !G.E();
                boolean z3 = G.N() && G.c == null && G.W();
                if (z2 || z3) {
                    z = true;
                }
            }
            intent.putExtra("ru.ok.tamtam.extra.SHOW_CHANNEL_FORCE", z);
            if (!t5Var.e) {
                intent.setFlags(67108864);
            }
            if (t5Var.j) {
                intent.addFlags(268435456);
            }
            intent.putExtra("ru.ok.tamtam.extra.HIGHLIGHTED_MESSAGE_ID", t5Var.f);
            intent.putExtra("ru.ok.tamtam.extra.LOCATION_REQUEST", t5Var.h);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ACCESS_TOKEN", t5Var.c);
            intent.putExtra("ru.ok.tamtam.extra.START_PAYLOAD", t5Var.i);
            intent.putExtra("activity:chat:CHAT_MODE", t5Var.k.ordinal());
            activity.startActivityForResult(intent, 3);
        }
    }

    public static void U(Activity activity, long j) {
        W(activity, j, false, uk2.DEFAULT);
    }

    public static void W(Activity activity, long j, boolean z, uk2 uk2) {
        eaf.a().getClass();
        ((sjd) eaf.b()).g().P(j, new p5(activity, z, uk2));
    }
}
