package defpackage;

import android.media.AudioRouting;

/* renamed from: lc4  reason: default package */
public final /* synthetic */ class lc4 implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ mc4 a;

    public /* synthetic */ lc4(mc4 mc4) {
        this.a = mc4;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        this.a.b(audioRouting);
    }
}
