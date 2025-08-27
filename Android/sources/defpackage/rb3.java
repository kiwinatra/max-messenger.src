package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CancellationException;

/* renamed from: rb3  reason: default package */
public final /* synthetic */ class rb3 implements zu7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rb3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        switch (this.a) {
            case 0:
                if (hu7 == hu7.ON_CREATE) {
                    OnBackInvokedDispatcher a2 = sb3.a.a((bc3) this.c);
                    fma fma = (fma) this.b;
                    fma.e = a2;
                    fma.e(fma.g);
                    return;
                }
                return;
            case 1:
                iu7 iu7 = ((lv7) jv7.getLifecycle()).d;
                iu7 iu72 = iu7.a;
                ou7 ou7 = (ou7) this.b;
                if (iu7 == iu72) {
                    ((pm7) this.c).b((CancellationException) null);
                    ou7.a();
                    return;
                }
                int compareTo = ((lv7) jv7.getLifecycle()).d.compareTo(ou7.b);
                yp4 yp4 = ou7.c;
                if (compareTo < 0) {
                    yp4.a = true;
                    return;
                } else if (yp4.a) {
                    if (!yp4.b) {
                        yp4.a = false;
                        yp4.a();
                        return;
                    }
                    throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                } else {
                    return;
                }
            default:
                hu7 hu72 = hu7.ON_DESTROY;
                r69 r69 = (r69) this.b;
                if (hu7 == hu72) {
                    r69.b((j79) this.c);
                    return;
                } else {
                    r69.getClass();
                    return;
                }
        }
    }
}
