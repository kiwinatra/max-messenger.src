package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* renamed from: zy0  reason: default package */
public final /* synthetic */ class zy0 implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ zy0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                xn1 a2 = ((hz0) this.b).L1.a(jSONObject);
                if (a2 != null) {
                    ((rk3) this.c).accept(a2);
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 1:
                ox0 ox0 = (ox0) this.b;
                ox0.getClass();
                JSONObject optJSONObject = jSONObject.optJSONObject("rooms");
                fae o2 = optJSONObject != null ? ((jk3) ox0.c).o(optJSONObject) : null;
                if (o2 == null) {
                    ((Function1) this.c).invoke(new RuntimeException("Can't parse rooms from " + jSONObject));
                    return;
                }
                ((Function1) this.o).invoke(o2);
                return;
            case 2:
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$19((n9e) this.b, (ParticipantStatesManagerImpl) this.c, (Map) this.o, jSONObject);
                return;
            default:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$8((StereoRoomCommandExecutorImpl) this.b, (Function1) this.c, (Function3) this.o, jSONObject);
                return;
        }
    }
}
