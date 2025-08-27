package ru.ok.android.externcalls.sdk.feedback.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0001J\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001J\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001J7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018H\u0001J>\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018H\u0016J\u0011\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0001R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/FeedbackManagerImpl;", "Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "commandExecutor", "listenerManager", "(Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;)V", "addListener", "", "listener", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "getOwnCurrentFeedback", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "ownFeedbackSent", "key", "", "source", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "removeListener", "sendFeedback", "onError", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "setTimeout", "millis", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FeedbackManagerImpl implements FeedbackManager, FeedbackCommandsExecutor, FeedbackListenerManager {
    private final FeedbackCommandsExecutor commandExecutor;
    private final FeedbackListenerManager listenerManager;

    public FeedbackManagerImpl(FeedbackCommandsExecutor feedbackCommandsExecutor, FeedbackListenerManager feedbackListenerManager) {
        this.commandExecutor = feedbackCommandsExecutor;
        this.listenerManager = feedbackListenerManager;
    }

    public void addListener(FeedbackListener feedbackListener) {
        this.listenerManager.addListener(feedbackListener);
    }

    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.listenerManager.getOwnCurrentFeedback();
    }

    public void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource) {
        this.listenerManager.ownFeedbackSent(str, participantFeedbackSource);
    }

    public void removeListener(FeedbackListener feedbackListener) {
        this.listenerManager.removeListener(feedbackListener);
    }

    public void sendFeedback(String str, Function1<? super Throwable, Unit> function1, Function0<Unit> function0) {
        this.commandExecutor.sendFeedback(str, function1, function0);
    }

    public void setTimeout(long j) {
        this.listenerManager.setTimeout(j);
    }

    public void sendFeedback(String str, ParticipantFeedbackSource participantFeedbackSource, Function1<? super Throwable, Unit> function1, Function0<Unit> function0) {
        this.commandExecutor.sendFeedback(str, function1, function0);
        this.listenerManager.ownFeedbackSent(str, participantFeedbackSource);
    }
}
