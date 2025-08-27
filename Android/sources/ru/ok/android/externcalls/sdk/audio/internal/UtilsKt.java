package ru.ok.android.externcalls.sdk.audio.internal;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"checkIsOnMainThread", "", "calls-audiomanager_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UtilsKt {
    public static final void checkIsOnMainThread() {
        if (!Intrinsics.areEqual((Object) Thread.currentThread(), (Object) Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Not on main thread!");
        }
    }
}
