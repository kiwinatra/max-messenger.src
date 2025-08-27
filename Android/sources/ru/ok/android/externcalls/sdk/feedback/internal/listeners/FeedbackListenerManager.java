package ru.ok.android.externcalls.sdk.feedback.internal.listeners;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "getOwnCurrentFeedback", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "ownFeedbackSent", "key", "", "source", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "removeListener", "setTimeout", "millis", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FeedbackListenerManager {
    void addListener(FeedbackListener feedbackListener);

    ParticipantFeedback getOwnCurrentFeedback();

    void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource);

    void removeListener(FeedbackListener feedbackListener);

    void setTimeout(long j);
}
