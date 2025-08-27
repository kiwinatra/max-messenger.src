package ru.ok.android.externcalls.sdk.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsThreadUtilsKt$executeOnIoThread$3<T> implements qk3 {
    final /* synthetic */ Runnable $onError;

    public CallsThreadUtilsKt$executeOnIoThread$3(Runnable runnable) {
        this.$onError = runnable;
    }

    public final void accept(Throwable th) {
        Runnable runnable = this.$onError;
        if (runnable != null) {
            runnable.run();
        }
    }
}
