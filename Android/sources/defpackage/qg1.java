package defpackage;

import android.media.MediaPlayer;

/* renamed from: qg1  reason: default package */
public final /* synthetic */ class qg1 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ tg1 b;

    public /* synthetic */ qg1(boolean z, tg1 tg1) {
        this.a = z;
        this.b = tg1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (!this.a) {
            this.b.c();
        }
    }
}
