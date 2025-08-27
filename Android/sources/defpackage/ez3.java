package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;

/* renamed from: ez3  reason: default package */
public final /* synthetic */ class ez3 implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ JoinCallParams b;

    public /* synthetic */ ez3(JoinCallParams joinCallParams, int i) {
        this.a = i;
        this.b = joinCallParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        JoinCallParams joinCallParams = this.b;
        switch (i) {
            case 0:
                joinCallParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                joinCallParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
