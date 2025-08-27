package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "", "sendFeedback", "", "key", "", "onError", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FeedbackCommandsExecutor {
    void sendFeedback(String str, Function1<? super Throwable, Unit> function1, Function0<Unit> function0);
}
