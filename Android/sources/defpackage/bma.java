package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: bma  reason: default package */
public final class bma implements OnBackAnimationCallback {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public bma(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.a = function1;
        this.b = function12;
        this.c = function0;
        this.d = function02;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new we0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new we0(backEvent));
    }
}
