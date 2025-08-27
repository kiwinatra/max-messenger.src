package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* renamed from: uq  reason: default package */
public final /* synthetic */ class uq implements vma, hd6, qk3, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uq(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                this.b.invoke((w62) obj);
                return;
            case 5:
                m20 m20 = (m20) obj;
                zf7 zf7 = m20.b;
                if (zf7 != null) {
                    yf7 yf7 = new yf7();
                    yf7.a = zf7.a;
                    yf7.b = zf7.b;
                    this.b.invoke(yf7);
                    m20.b = new zf7(yf7);
                    return;
                }
                return;
            default:
                this.b.invoke((j10) obj);
                return;
        }
    }

    public zz7 apply(Object obj) {
        return (zz7) this.b.invoke(obj);
    }

    public void b(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                d41 d41 = (d41) bundle.getParcelable("CallDialogFragment:result:key");
                if (d41 != null) {
                    this.b.invoke(d41);
                    return;
                }
                return;
            case 3:
                bw3 bw3 = (bw3) bundle.getParcelable("ContextActionsDialog:result:key");
                if (bw3 != null) {
                    this.b.invoke(bw3);
                    return;
                }
                return;
            default:
                xed xed = (xed) bundle.getParcelable(str);
                if (xed != null) {
                    this.b.invoke(xed);
                    return;
                }
                return;
        }
    }
}
