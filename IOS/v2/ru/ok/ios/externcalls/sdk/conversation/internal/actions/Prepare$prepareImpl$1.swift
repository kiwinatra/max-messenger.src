package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "<anonymous parameter 0>", "", "error", "", "accept", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Prepare$prepareImpl$1<T1, T2> implements rm0 {
    final /* synthetic */ Prepare this$0;

    public Prepare$prepareImpl$1(Prepare prepare) {
        this.this$0 = prepare;
    }

    public final void accept(Prepare.PrepareResult prepareResult, Throwable th) {
        this.this$0.preparedStat.onConversationPrepared();
        if (th != null) {
            this.this$0.log.logException(Prepare.TAG, "Conversation prepare failed", th);
        } else {
            this.this$0.log.log(Prepare.TAG, "Conversation prepared");
        }
    }
}
