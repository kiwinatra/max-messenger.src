package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* renamed from: bz3  reason: default package */
public final /* synthetic */ class bz3 implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartCallParams b;

    public /* synthetic */ bz3(StartCallParams startCallParams, int i) {
        this.a = i;
        this.b = startCallParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        StartCallParams startCallParams = this.b;
        switch (i) {
            case 0:
                startCallParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                startCallParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
