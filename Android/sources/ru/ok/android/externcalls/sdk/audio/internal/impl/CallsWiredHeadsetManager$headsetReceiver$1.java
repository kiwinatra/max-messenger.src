package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"ru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$headsetReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallsWiredHeadsetManager$headsetReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ CallsWiredHeadsetManager this$0;

    public CallsWiredHeadsetManager$headsetReceiver$1(CallsWiredHeadsetManager callsWiredHeadsetManager) {
        this.this$0 = callsWiredHeadsetManager;
    }

    public void onReceive(Context context, Intent intent) {
        this.this$0.onReceiveBroadcast(this, intent);
    }
}
