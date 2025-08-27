package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: o8f  reason: default package */
public final class o8f {
    public Object a;
    public Drawable b;
    public CharSequence c;
    public CharSequence d;
    public int e;
    public View f;
    public TabLayout g;
    public q8f h;
    public int i;

    public final void a(View view) {
        this.f = view;
        c();
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.c = charSequence;
        c();
    }

    public final void c() {
        q8f q8f = this.h;
        if (q8f != null) {
            q8f.e();
        }
    }
}
