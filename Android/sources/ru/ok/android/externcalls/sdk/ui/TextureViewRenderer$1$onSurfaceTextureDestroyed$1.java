package ru.ok.android.externcalls.sdk.ui;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class TextureViewRenderer$1$onSurfaceTextureDestroyed$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CountDownLatch $completionLatch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextureViewRenderer$1$onSurfaceTextureDestroyed$1(CountDownLatch countDownLatch) {
        super(0);
        this.$completionLatch = countDownLatch;
    }

    public final void invoke() {
        this.$completionLatch.countDown();
    }
}
