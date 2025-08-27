package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsAudioManagerV3Impl$changeStateAsync$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CallsAudioManager.State $state;
    final /* synthetic */ CallsAudioManagerV3Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsAudioManagerV3Impl$changeStateAsync$1(CallsAudioManagerV3Impl callsAudioManagerV3Impl, CallsAudioManager.State state) {
        super(0);
        this.this$0 = callsAudioManagerV3Impl;
        this.$state = state;
    }

    public final void invoke() {
        this.this$0.changeState(this.$state);
    }
}
