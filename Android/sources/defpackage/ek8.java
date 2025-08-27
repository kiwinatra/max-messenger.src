package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.Animation;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.messages.messages.widgets.MessageComposeEditText;

/* renamed from: ek8  reason: default package */
public final class ek8 extends fqc {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ek8(int i2, Object obj) {
        this.h = i2;
        this.i = obj;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) this.i;
                mediaBarPreviewLayout.setAnimation((Animation) null);
                mediaBarPreviewLayout.setVisibility(8);
                MessageComposeEditText messageComposeEditText = mediaBarPreviewLayout.O0;
                if (messageComposeEditText != null) {
                    hd8.C(messageComposeEditText.getContext(), messageComposeEditText);
                    return;
                }
                return;
            case 1:
                v2a v2a = (v2a) this.i;
                v2a.w.setAnimation((Animation) null);
                v2a.w.setVisibility(8);
                v2a.N(new k2a(7));
                return;
            default:
                smb smb = (smb) this.i;
                yr5 yr5 = smb.B0;
                if (yr5 != null) {
                    try {
                        ValueAnimator valueAnimator = yr5.y;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        f6e.v(smb.B0).removeView(smb.B0);
                    } catch (Exception unused) {
                    }
                }
                smb.B0 = null;
                return;
        }
    }
}
