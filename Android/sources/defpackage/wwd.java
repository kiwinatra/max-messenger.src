package defpackage;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;

/* renamed from: wwd  reason: default package */
public final /* synthetic */ class wwd implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomCommandExecutorImpl b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ wwd(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, Function1 function1, int i) {
        this.a = i;
        this.b = sessionRoomCommandExecutorImpl;
        this.c = function1;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$3(this.b, this.c, jSONObject);
                return;
            case 1:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}
