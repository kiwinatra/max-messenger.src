package defpackage;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;

/* renamed from: uwd  reason: default package */
public final /* synthetic */ class uwd implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomAdminCommandExecutorImpl b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ uwd(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, Function1 function1, int i) {
        this.a = i;
        this.b = sessionRoomAdminCommandExecutorImpl;
        this.c = function1;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                SessionRoomAdminCommandExecutorImpl.removeRooms$lambda$3(this.b, this.c, jSONObject);
                return;
            case 1:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$5(this.b, this.c, jSONObject);
                return;
            case 2:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$7(this.b, this.c, jSONObject);
                return;
            default:
                SessionRoomAdminCommandExecutorImpl.activateRooms$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}
