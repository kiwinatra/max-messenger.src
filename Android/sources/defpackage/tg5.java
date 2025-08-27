package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;

/* renamed from: tg5  reason: default package */
public final class tg5 extends kbe {
    public Function1 D0;
    public Function1 E0;

    public final void N(lz7 lz7, Object obj) {
        rg5 rg5 = (rg5) lz7;
        qg5 qg5 = obj instanceof qg5 ? (qg5) obj : null;
        if (qg5 != null) {
            BitSet bitSet = (BitSet) qg5.a;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z) {
                ol3 ol3 = (ol3) view;
                long j = rg5.a;
                Uri uri = rg5.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                ol3.Y(j, rg5.y, uri.toString());
            }
            if (bitSet.get(2)) {
                ((ol3) view).setName(rg5.v);
            }
            if (bitSet.get(3)) {
                ((ol3) view).setMessage(rg5.w);
            }
            if (bitSet.get(4)) {
                ol3 ol32 = (ol3) view;
                boolean z2 = rg5.x;
                CharSequence charSequence = rg5.w;
                if (z2) {
                    ct.G(ol32, 300, new sg5(this, rg5, 2));
                    ol32.setMessage(charSequence);
                    ol32.X();
                    return;
                }
                ct.G(ol32, 300, new sg5(this, rg5, 3));
                if (charSequence != null) {
                    ol32.Z(charSequence, new j35(6, (Object) this, (Object) rg5));
                    ol32.setMessage((CharSequence) null);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final void O() {
        this.D0 = null;
        this.E0 = null;
    }

    /* renamed from: P */
    public final void M(rg5 rg5) {
        ol3 ol3 = (ol3) this.a;
        ol3.setId((int) (rg5.a >> 32));
        if (rg5.x) {
            ol3.setMessage(rg5.w);
        } else {
            ol3.setMessage((CharSequence) null);
        }
        ol3.setName(rg5.v);
        Uri uri = rg5.b;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        ol3.Y(rg5.a, rg5.y, uri.toString());
    }
}
