package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: w30  reason: default package */
public final class w30 extends AudioDeviceCallback {
    public final /* synthetic */ y30 a;

    public w30(y30 y30) {
        this.a = y30;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        y30 y30 = this.a;
        y30.a(u30.b((Context) y30.b, (i30) y30.j, (g40) y30.i));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        y30 y30 = this.a;
        if (v0g.m(audioDeviceInfoArr, (g40) y30.i)) {
            y30.i = null;
        }
        y30.a(u30.b((Context) y30.b, (i30) y30.j, (g40) y30.i));
    }
}
