package defpackage;

import androidx.media3.common.PlaybackException;

/* renamed from: jp8  reason: default package */
public final /* synthetic */ class jp8 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ jp8(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    public final void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 0:
                sob.q0(this.b);
                return;
            case 1:
                sob.w0(this.b);
                return;
            case 2:
                sob.q0(this.b);
                return;
            default:
                sob.w0(this.b);
                return;
        }
    }
}
