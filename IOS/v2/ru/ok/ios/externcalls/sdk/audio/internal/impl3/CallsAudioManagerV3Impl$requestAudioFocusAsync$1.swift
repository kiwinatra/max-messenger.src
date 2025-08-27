package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CallsAudioManagerV3Impl$requestAudioFocusAsync$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public CallsAudioManagerV3Impl$requestAudioFocusAsync$1(Object obj) {
        super(0, obj, CallsAudioManagerV3Impl.class, "requestAudioFocus", "requestAudioFocus()V", 0);
    }

    public final void invoke() {
        ((CallsAudioManagerV3Impl) this.receiver).requestAudioFocus();
    }
}
