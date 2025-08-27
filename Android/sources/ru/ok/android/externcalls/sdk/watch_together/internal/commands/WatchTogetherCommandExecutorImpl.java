package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010%\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010'J=\u0010(\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b(\u0010'J=\u0010)\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b)\u0010'JP\u0010-\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,JE\u0010.\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b.\u0010/JM\u00104\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lmc1;", "mediaOptionsDelegate", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "", "onError", "Lo9e;", "getSignalingOrPassExceptionToOnError", "(Lkotlin/jvm/functions/Function1;)Lo9e;", "", "method", "Lorg/json/JSONObject;", "errorResponse", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;)V", "value", "Lau9;", "parseMovieType", "(Ljava/lang/String;)Lau9;", "Lvt9;", "movieId", "Liu9;", "volume", "Lzt9;", "meta", "", "moveToAdminOnHangup", "onSuccess", "play-yj_a6ag", "(Lvt9;FLzt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "play", "stop", "(Lvt9;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lvt9;FZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "setVolume", "setMuted", "(Lvt9;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lvt9;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lkotlin/jvm/functions/Function0;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WatchTogetherCommandExecutorImpl implements WatchTogetherCommandsExecutor {
    private final Function0<mc1> mediaOptionsDelegate;
    private final SignalingProvider signalingProvider;

    public WatchTogetherCommandExecutorImpl(SignalingProvider signalingProvider2, Function0<? extends mc1> function0) {
        this.signalingProvider = signalingProvider2;
        this.mediaOptionsDelegate = function0;
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

    private final void parseErrorResponse(String str, JSONObject jSONObject, Function1<? super Throwable, Unit> function1) {
        String optString = jSONObject.optString("error");
        WatchTogetherError watchTogetherError = Intrinsics.areEqual((Object) optString, (Object) "movie-limit-exceeded") ? WatchTogetherError.LIMIT_EXCEEDED : Intrinsics.areEqual((Object) optString, (Object) "movie-not-found") ? WatchTogetherError.LIMIT_EXCEEDED : WatchTogetherError.UNKNOWN_ERROR;
        if (function1 != null) {
            function1.invoke(new WatchTogetherException(watchTogetherError, "Error response for " + str + " command " + jSONObject, (Throwable) null, 4, (DefaultConstructorMarker) null));
        }
    }

    private final au9 parseMovieType(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "MOVIE")) {
            return au9.a;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "STREAM")) {
            return au9.b;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void pause$lambda$4(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void pause$lambda$5(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("pause", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$0(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$1(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("play", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void resume$lambda$6(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void resume$lambda$7(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("resume", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void setMuted$lambda$10(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void setMuted$lambda$11(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("setMute", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void setPosition$lambda$12(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void setPosition$lambda$13(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("setPosition", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$8(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$9(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("setVolume", jSONObject, function1);
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$2(Function0 function0, JSONObject jSONObject) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$3(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, Function1 function1, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("stop", jSONObject, function1);
    }

    public void pause(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            long j = vt9.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j);
            jSONObject.put("pause", true);
            signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(24, function0), new weg(this, function1, 1));
        }
    }

    /* renamed from: play-yj_a6ag  reason: not valid java name */
    public void m1617playyj_a6ag(vt9 vt9, float f, zt9 zt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        mc1 invoke = this.mediaOptionsDelegate.invoke();
        if (invoke != null && mc1.d(new mo1(12, invoke.i))) {
            o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
            if (signalingOrPassExceptionToOnError != null) {
                long j = vt9.a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("command", (Object) "add-movie");
                jSONObject.put("movieId", j);
                jSONObject.put("gain", (double) f);
                jSONObject.put("moveToAdminOnHangup", z);
                signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(26, function0), new weg(this, function1, 4));
            }
        } else if (function1 != null) {
            function1.invoke(new WatchTogetherException(WatchTogetherError.PLAY_NOT_ALLOWED, "Play not allowed due to media option", (Throwable) null, 4, (DefaultConstructorMarker) null));
        }
    }

    public void resume(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            long j = vt9.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j);
            jSONObject.put("pause", false);
            signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(22, function0), new weg(this, function1, 2));
        }
    }

    public void setMuted(vt9 vt9, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            long j = vt9.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j);
            jSONObject.put("mute", z);
            signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(27, function0), new weg(this, function1, 5));
        }
    }

    public void setPosition(vt9 vt9, long j, TimeUnit timeUnit, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            long j2 = vt9.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j2);
            jSONObject.put("offset", timeUnit.toSeconds(j));
            signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(25, function0), new weg(this, function1, 3));
        }
    }

    /* renamed from: setVolume-F2PwOSs  reason: not valid java name */
    public void m1618setVolumeF2PwOSs(vt9 vt9, float f, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            long j = vt9.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j);
            jSONObject.put("gain", (double) f);
            jSONObject.put("mute", z);
            signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(23, function0), new weg(this, function1, 0));
        }
    }

    public void stop(vt9 vt9, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        o9e signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(function1);
        if (signalingOrPassExceptionToOnError != null) {
            long j = vt9.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "remove-movie");
            jSONObject.put("movieId", j);
            signalingOrPassExceptionToOnError.d(new rp6(jSONObject), false, new jt(28, function0), new weg(this, function1, 6));
        }
    }
}
