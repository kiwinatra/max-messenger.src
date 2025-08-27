package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.media.AudioDeviceCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioDeviceCallback;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsBluethoothDeviceScanner$callback$2 extends Lambda implements Function0<AudioDeviceCallback> {
    final /* synthetic */ CallsBluethoothDeviceScanner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsBluethoothDeviceScanner$callback$2(CallsBluethoothDeviceScanner callsBluethoothDeviceScanner) {
        super(0);
        this.this$0 = callsBluethoothDeviceScanner;
    }

    public final AudioDeviceCallback invoke() {
        return this.this$0.createCallback();
    }
}
