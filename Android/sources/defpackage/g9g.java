package defpackage;

import android.content.Context;
import android.view.TextureView;

/* renamed from: g9g  reason: default package */
public final class g9g extends TextureView {
    public final /* synthetic */ h9g a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g9g(h9g h9g, Context context) {
        super(context);
        this.a = h9g;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f9g f9g = this.a.v;
        if (f9g != null) {
            f9g.onSurfaceTextureDestroyed(getSurfaceTexture());
        }
    }
}
