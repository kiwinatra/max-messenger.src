package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: v18  reason: default package */
public final /* synthetic */ class v18 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LiveLocationWorker b;

    public /* synthetic */ v18(LiveLocationWorker liveLocationWorker, int i) {
        this.a = i;
        this.b = liveLocationWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(this.b.getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1));
            case 1:
                return (m18) ((sjd) this.b.getTamComponent()).getAccessor().g(m18.class);
            default:
                return ((sjd) this.b.getTamComponent()).p();
        }
    }
}
