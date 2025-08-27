package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* renamed from: nhf  reason: default package */
public final /* synthetic */ class nhf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextureViewRenderer b;

    public /* synthetic */ nhf(TextureViewRenderer textureViewRenderer, int i) {
        this.a = i;
        this.b = textureViewRenderer;
    }

    public final void run() {
        int i = this.a;
        TextureViewRenderer textureViewRenderer = this.b;
        switch (i) {
            case 0:
                TextureViewRenderer.notifyTextureSizeChanged$lambda$9(textureViewRenderer);
                return;
            case 1:
                TextureViewRenderer.postponedFrameSafeguard$lambda$0(textureViewRenderer);
                return;
            default:
                TextureViewRenderer.deliverPostponedFrameRunnable$lambda$1(textureViewRenderer);
                return;
        }
    }
}
