package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import one.me.sdk.arch.Widget;

/* renamed from: dng  reason: default package */
public final class dng extends xx3 {
    public boolean a;
    public final /* synthetic */ Widget b;

    public dng(Widget widget) {
        this.b = widget;
    }

    public final void d(zx3 zx3) {
        Widget widget = this.b;
        View requireView = widget.requireView();
        widget.onViewCreated(requireView);
        h88.f(requireView, widget.getInsetsConfig(), new ymg(widget, 1));
    }

    public final void j(zx3 zx3, View view) {
        boolean J = m5a.J(zx3);
        Widget widget = this.b;
        if (!J) {
            widget.onViewCreated(view);
            h88.f(view, widget.getInsetsConfig(), new ymg(widget, 1));
        }
        view.addOnAttachStateChangeListener(new p50(13, widget, this));
    }

    public final void k(zx3 zx3) {
        hng viewModelStore$arch_release;
        zx3 zx32 = zx3;
        Widget widget = zx32 instanceof Widget ? (Widget) zx32 : null;
        if (!(widget == null || (viewModelStore$arch_release = widget.getViewModelStore$arch_release()) == null)) {
            qz9 qz9 = viewModelStore$arch_release.a;
            Object[] objArr = qz9.c;
            long[] jArr = qz9.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                xag xag = (xag) objArr[(i << 3) + i3];
                                kv0.n(xag.a.a, (CancellationException) null);
                                xag.i();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            qz9.e();
            viewModelStore$arch_release.b.e();
        }
        if (zx32 instanceof qc6) {
            qc6 qc6 = (qc6) zx32;
        }
    }

    public final void l(zx3 zx3) {
        Widget widget = this.b;
        qz9 cleanActions$arch_release = widget.getCleanActions$arch_release();
        Object[] objArr = cleanActions$arch_release.c;
        long[] jArr = cleanActions$arch_release.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            rn0 rn0 = (rn0) ((n13) objArr[(i << 3) + i3]);
                            rn0.getClass();
                            sn0 sn0 = rn0.b;
                            sn0.v = new WeakReference(sn0.o);
                            sn0.o = null;
                            rn0.a = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (this.a) {
            widget.finalizeCleanActions(zx3);
        }
    }

    public final void n(zx3 zx3, View view) {
        view.addOnAttachStateChangeListener(new el(10, this.b));
    }
}
