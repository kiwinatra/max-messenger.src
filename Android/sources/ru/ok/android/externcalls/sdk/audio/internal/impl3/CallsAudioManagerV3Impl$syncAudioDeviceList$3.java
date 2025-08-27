package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsAudioManagerV3Impl$syncAudioDeviceList$3 extends Lambda implements Function1<CallsAudioDeviceInfo, CharSequence> {
    public static final CallsAudioManagerV3Impl$syncAudioDeviceList$3 INSTANCE = new CallsAudioManagerV3Impl$syncAudioDeviceList$3();

    public CallsAudioManagerV3Impl$syncAudioDeviceList$3() {
        super(1);
    }

    public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return callsAudioDeviceInfo.toString();
    }
}
