package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: f7  reason: default package */
public final class f7 extends y0c {
    public f7(Context context) {
        super(new r1e(context, (AttributeSet) null));
    }

    public final void M(lz7 lz7) {
        ((r1e) this.a).setModelItem(((p7) lz7).b);
    }

    public final void O() {
        View view = this.a;
        ((r1e) view).setOnClickListener((View.OnClickListener) null);
        ((r1e) view).setOnSwitchCheckedListener((n1e) null);
    }
}
