package ru.ok.android.externcalls.sdk.feedback.listener;

import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "", "onFeedbackAdded", "", "feedback", "", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "onFeedbackEnabledChanged", "isEnabled", "", "onFeedbackRemoved", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FeedbackListener {
    void onFeedbackAdded(List<ParticipantFeedback> list);

    void onFeedbackEnabledChanged(boolean z);

    void onFeedbackRemoved(List<ParticipantFeedback> list);
}
