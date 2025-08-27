package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;

/* renamed from: y21  reason: default package */
public final /* synthetic */ class y21 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ wje c;
    public final /* synthetic */ c31 o;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Object x;

    public /* synthetic */ y21(Object obj, long j, wje wje, c31 c31, ep1 ep1, f fVar, int i) {
        this.a = i;
        this.x = obj;
        this.b = j;
        this.c = wje;
        this.o = c31;
        this.v = ep1;
        this.w = fVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return (CreateConfParams) ((CreateConfParams.Builder) obj).setPayload(((JSONObject) this.x).toString()).setMyId(f9b.c(this.b)).setStartWithVideo(this.c.b).setEventListener((ConversationEventsListener) (dq1) this.o.b.getValue()).setOnPrepared((Function1<? super Conversation, Unit>) this.v).setOnError((Function1<? super Throwable, Unit>) this.w).build();
            default:
                return (JoinByLinkParams) ((JoinByLinkParams.Builder) obj).setLink((String) this.x).setMyId(f9b.c(this.b)).setStartWithVideo(this.c.b).setEventListener((ConversationEventsListener) (dq1) this.o.b.getValue()).setOnPrepared((Function1<? super Conversation, Unit>) this.v).setOnError((Function1<? super Throwable, Unit>) this.w).build();
        }
    }
}
