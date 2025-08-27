package defpackage;

import android.util.TypedValue;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: bhf  reason: default package */
public final class bhf implements d14 {
    public final /* synthetic */ jx3 a = e14.b();
    public final TextView b;
    public final bvf c;
    public final float o;

    public bhf(TextView textView, bvf bvf) {
        this.b = textView;
        this.c = bvf;
        this.o = textView.getTextSize();
        if (!textView.isAttachedToWindow()) {
            try {
                Result.Companion companion = Result.Companion;
                CancellationException cancellationException = new CancellationException("onDetach");
                cancellationException.initCause((Throwable) null);
                e14.c(this, cancellationException);
                Result.m23constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m23constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            textView.addOnAttachStateChangeListener(new ygf(textView, this, 1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: bhf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: bhf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: bhf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.d14 a(defpackage.bhf r2) {
        /*
            r2.getClass()
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0010 }
            android.widget.TextView r0 = r2.b     // Catch:{ all -> 0x0010 }
            vu7 r0 = defpackage.sag.b(r0)     // Catch:{ all -> 0x0010 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0010 }
            goto L_0x001b
        L_0x0010:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x001b:
            boolean r1 = kotlin.Result.m29isFailureimpl(r0)
            if (r1 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r0
        L_0x0023:
            d14 r2 = (defpackage.d14) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhf.a(bhf):d14");
    }

    public final CoroutineContext U() {
        return this.a.a;
    }

    public final void b() {
        bvf bvf = this.c;
        float floatValue = ((Number) bvf.a.getValue()).floatValue();
        TextView textView = this.b;
        textView.getContext();
        textView.setTextSize(0, TypedValue.applyDimension(2, floatValue, vo4.c().getDisplayMetrics()) + this.o);
        if (textView.isAttachedToWindow()) {
            bs0.K(new ps5(new zjb(bvf.a, this, 13), new zgf(this, (Continuation) null), 5), a(this));
        } else {
            textView.addOnAttachStateChangeListener(new ygf(textView, this, 0));
        }
    }
}
