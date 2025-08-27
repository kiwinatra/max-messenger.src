package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: p11  reason: default package */
public final class p11 extends ConstraintLayout {
    public final tm1 E0;
    public o11 F0;

    public p11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new fj3(-1, -1));
        setBackgroundColor(l2b.d.i);
        setFocusable(true);
        setClickable(true);
        tm1 tm1 = new tm1(context, (AttributeSet) null);
        tm1.setId(kgc.call_user_full_avatar);
        tm1.setMode(pm1.b);
        this.E0 = tm1;
        new ViewStub(context).setId(kgc.call_recall);
        new ViewStub(context).setId(kgc.call_cancel);
        addView(tm1, -1, 0);
        pj3 h = ct.h(this);
        int id = tm1.getId();
        h.e(id, 7, 0, 7);
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        h.a(this);
    }

    public final void setAvatar(zd0 zd0) {
        this.E0.setAvatar(zd0);
    }

    public final void setClickListener(o11 o11) {
        this.F0 = o11;
    }

    public final void setName(CharSequence charSequence) {
        this.E0.setName(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.E0.setStatus(charSequence);
    }
}
