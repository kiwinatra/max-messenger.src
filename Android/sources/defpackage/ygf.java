package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* renamed from: ygf  reason: default package */
public final class ygf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ bhf c;

    public /* synthetic */ ygf(View view, bhf bhf, int i) {
        this.a = i;
        this.b = view;
        this.c = bhf;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                bhf bhf = this.c;
                bs0.K(new ps5(new zjb(bhf.c.a, bhf, 13), new zgf(bhf, (Continuation) null), 5), bhf.a(bhf));
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                bhf bhf = this.c;
                try {
                    Result.Companion companion = Result.Companion;
                    CancellationException cancellationException = new CancellationException("onDetach");
                    cancellationException.initCause((Throwable) null);
                    e14.c(bhf, cancellationException);
                    Result.m23constructorimpl(Unit.INSTANCE);
                    return;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m23constructorimpl(ResultKt.createFailure(th));
                    return;
                }
        }
    }
}
