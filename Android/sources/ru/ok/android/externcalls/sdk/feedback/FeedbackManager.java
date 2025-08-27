package ru.ok.android.externcalls.sdk.feedback;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'JB\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "getOwnCurrentFeedback", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "removeListener", "sendFeedback", "key", "", "source", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "onError", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "setTimeout", "millis", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FeedbackManager {
    static /* synthetic */ void sendFeedback$default(FeedbackManager feedbackManager, String str, ParticipantFeedbackSource participantFeedbackSource, Function1 function1, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            feedbackManager.sendFeedback(str, participantFeedbackSource, function1, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFeedback");
    }

    void addListener(FeedbackListener feedbackListener);

    ParticipantFeedback getOwnCurrentFeedback();

    void removeListener(FeedbackListener feedbackListener);

    void sendFeedback(String str, ParticipantFeedbackSource participantFeedbackSource, Function1<? super Throwable, Unit> function1, Function0<Unit> function0);

    void setTimeout(long j);
}
