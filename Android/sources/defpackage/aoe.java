package defpackage;

import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* renamed from: aoe  reason: default package */
public final /* synthetic */ class aoe implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomCommandExecutorImpl b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ aoe(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, Function1 function1, int i) {
        this.a = i;
        this.b = stereoRoomCommandExecutorImpl;
        this.c = function1;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$9(this.b, this.c, jSONObject);
                return;
            case 1:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$3(this.b, this.c, jSONObject);
                return;
            case 2:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}
