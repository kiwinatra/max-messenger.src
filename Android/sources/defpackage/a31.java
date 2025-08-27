package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;

/* renamed from: a31  reason: default package */
public final /* synthetic */ class a31 implements Function1 {
    public final /* synthetic */ nl a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c31 c;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Function1 v;

    public /* synthetic */ a31(nl nlVar, long j, c31 c31, ep1 ep1, f fVar) {
        this.a = nlVar;
        this.b = j;
        this.c = c31;
        this.o = ep1;
        this.v = fVar;
    }

    public final Object invoke(Object obj) {
        nl nlVar = this.a;
        AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj).setOpponentId(f9b.c(nlVar.a));
        String str = nlVar.c;
        if (str != null) {
            opponentId.setConversationParams(str);
        }
        return (AnswerCallParams) opponentId.setConversationId(nlVar.b).setMyId(f9b.c(this.b)).setEventListener((ConversationEventsListener) (dq1) this.c.b.getValue()).setOnPrepared((Function1<? super Conversation, Unit>) this.o).setOnError((Function1<? super Throwable, Unit>) this.v).build();
    }
}
