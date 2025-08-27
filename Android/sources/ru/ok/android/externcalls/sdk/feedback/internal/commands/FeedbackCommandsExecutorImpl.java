package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feedback.exceptions.FeedbackException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "signalingProvider", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "sendFeedback", "", "key", "", "onError", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FeedbackCommandsExecutorImpl implements FeedbackCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public FeedbackCommandsExecutorImpl(SignalingProvider signalingProvider2) {
        this.signalingProvider = signalingProvider2;
    }

    /* access modifiers changed from: private */
    public static final void sendFeedback$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void sendFeedback$lambda$1(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new FeedbackException(jSONObject.toString(), (Throwable) null, 2, (DefaultConstructorMarker) null));
        }
    }

    public void sendFeedback(String str, Function1<? super Throwable, Unit> function1, Function0<Unit> function0) {
        o9e o9e = SignalingProviderKt.get(this.signalingProvider, function1);
        if (o9e != null) {
            try {
                rp6 a = tf6.a((JSONObject) null, "feedback");
                a.a.put("key", (Object) str);
                o9e.d(a, false, new jt(4, function0), new kt(4, function1));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
