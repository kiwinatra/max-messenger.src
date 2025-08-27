package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: l71  reason: default package */
public final /* synthetic */ class l71 implements Function0 {
    public final /* synthetic */ mz6 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ l71(mz6 mz6, boolean z) {
        this.a = mz6;
        this.b = z;
    }

    public final Object invoke() {
        b71 b71 = b71.b;
        long j = ((kz6) this.a).a;
        ta4 W0 = b71.W0();
        StringBuilder n = tr1.n(j, ":call-user?opponent_id=", "&video_enabled=");
        n.append(this.b);
        n.append("&microphone_enabled=true");
        W0.b(n.toString(), (Bundle) null);
        return Unit.INSTANCE;
    }
}
