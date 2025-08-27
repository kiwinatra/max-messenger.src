package ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function1;", "", "", "onError", "Lo9e;", "getSignalingOrPassExceptionToOnError", "(Lkotlin/jvm/functions/Function1;)Lo9e;", "", "url", "Lkotlin/Function0;", "onSuccess", "start", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stop", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class UrlSharingCommandsExecutorImpl implements UrlSharingCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public UrlSharingCommandsExecutorImpl(SignalingProvider signalingProvider2) {
        this.signalingProvider = signalingProvider2;
    }

    private final o9e getSignalingOrPassExceptionToOnError(Function1<? super Throwable, Unit> function1) {
        o9e signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (function1 != null) {
            function1.invoke(new ConversationNotPreparedException());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$1(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Start url sharing error " + jSONObject));
        }
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$3(Function1 function1, JSONObject jSONObject) {
        if (function1 != null) {
            function1.invoke(new RuntimeException("Stop url sharing error " + jSONObject));
        }
    }

    public void start(String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "start-url-sharing");
            jSONObject.put("sharedUrl", (Object) str);
            signalingOrPassExceptionToOnError.j(jSONObject, new jt(20, function0), new kt(8, function1));
        }
    }

    public void stop(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "stop-url-sharing");
            signalingOrPassExceptionToOnError.j(jSONObject, new jt(21, function0), new kt(9, function1));
        }
    }
}
