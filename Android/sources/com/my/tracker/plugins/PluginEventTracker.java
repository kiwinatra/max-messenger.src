package com.my.tracker.plugins;

import com.my.tracker.obfuscated.e0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class PluginEventTracker {
    private static final Executor b = Executors.newSingleThreadExecutor();
    private final e0 a;

    private PluginEventTracker(e0 e0Var) {
        this.a = e0Var;
    }

    public static PluginEventTracker a(e0 e0Var) {
        return new PluginEventTracker(e0Var);
    }

    public static void onBackground(Runnable runnable) {
        b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.a.a(i, bArr, z, z2, runnable);
    }
}
