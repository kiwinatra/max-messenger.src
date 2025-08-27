package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: m40  reason: default package */
public final class m40 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final Handler b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m40(int i, Handler handler, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = handler;
    }

    public final void onAudioFocusChange(int i) {
        switch (this.a) {
            case 0:
                this.b.post(new l40(this, i, 0));
                return;
            default:
                this.b.post(new l40(this, i, 1));
                return;
        }
    }
}
