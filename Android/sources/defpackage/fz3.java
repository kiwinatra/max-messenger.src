package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;

/* renamed from: fz3  reason: default package */
public final /* synthetic */ class fz3 implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnswerCallParams b;

    public /* synthetic */ fz3(AnswerCallParams answerCallParams, int i) {
        this.a = i;
        this.b = answerCallParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        AnswerCallParams answerCallParams = this.b;
        switch (i) {
            case 0:
                answerCallParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                answerCallParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
