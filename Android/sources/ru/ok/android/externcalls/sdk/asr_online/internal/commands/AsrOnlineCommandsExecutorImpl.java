package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lkotlin/Function0;", "Lhz0;", "getCall", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "isEnabled", "", "enableAsrOnline", "(Z)V", "onMigratedToServerCallTopology", "()V", "Lkotlin/jvm/functions/Function0;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "isAsrOnlineEnabled", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AsrOnlineCommandsExecutorImpl implements AsrOnlineCommandsExecutor {
    private final Function0<hz0> getCall;
    private boolean isAsrOnlineEnabled;
    private final SignalingProvider signalingProvider;

    public AsrOnlineCommandsExecutorImpl(Function0<hz0> function0, SignalingProvider signalingProvider2) {
        this.getCall = function0;
        this.signalingProvider = signalingProvider2;
    }

    public void enableAsrOnline(boolean z) {
        this.isAsrOnlineEnabled = z;
        hz0 invoke = this.getCall.invoke();
        if (invoke != null) {
            if (invoke.r1.H(xnf.c)) {
                rp6 a = tf6.a((JSONObject) null, "request-asr");
                o9e signaling = this.signalingProvider.getSignaling();
                if (signaling != null) {
                    signaling.i(a);
                    return;
                }
                return;
            }
            hz0 invoke2 = this.getCall.invoke();
            if (invoke2 != null) {
                invoke2.r1.N(z);
            }
        }
    }

    public void onMigratedToServerCallTopology() {
        hz0 invoke;
        if (this.isAsrOnlineEnabled && (invoke = this.getCall.invoke()) != null) {
            invoke.r1.N(this.isAsrOnlineEnabled);
        }
    }
}
