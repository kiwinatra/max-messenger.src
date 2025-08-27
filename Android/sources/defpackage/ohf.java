package defpackage;

import kotlin.jvm.functions.Function2;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

/* renamed from: ohf  reason: default package */
public final /* synthetic */ class ohf implements VideoRendererInterface.FrameSizeListener {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ ohf(Function2 function2) {
        this.a = function2;
    }

    public final void onFrame(int i, int i2) {
        TextureViewRenderer.setFrameSizeListener$lambda$2(this.a, i, i2);
    }
}
