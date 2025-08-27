package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* renamed from: z21  reason: default package */
public final /* synthetic */ class z21 implements Function1 {
    public final /* synthetic */ fl1 a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ wje o;
    public final /* synthetic */ c31 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Function1 x;

    public /* synthetic */ z21(fl1 fl1, JSONObject jSONObject, long j, wje wje, c31 c31, ep1 ep1, f fVar) {
        this.a = fl1;
        this.b = jSONObject;
        this.c = j;
        this.o = wje;
        this.v = c31;
        this.w = ep1;
        this.x = fVar;
    }

    public final Object invoke(Object obj) {
        return (StartCallParams) ((StartCallParams.Builder) obj).setOpponentId(f9b.c(this.a.r)).setPayload(this.b.toString()).setWatchTogetherEnabledForAll(false).setMyId(f9b.c(this.c)).setStartWithVideo(this.o.b).setEventListener((ConversationEventsListener) (dq1) this.v.b.getValue()).setOnPrepared((Function1<? super Conversation, Unit>) this.w).setOnError((Function1<? super Throwable, Unit>) this.x).build();
    }
}
