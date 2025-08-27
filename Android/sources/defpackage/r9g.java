package defpackage;

import android.text.TextUtils;
import android.view.View;

/* renamed from: r9g  reason: default package */
public final class r9g extends t8f {
    public final /* synthetic */ int e;

    public r9g(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return aag.b(view);
            case 1:
                return cag.b(view);
            default:
                return Boolean.valueOf(aag.c(view));
        }
    }

    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                aag.h(view, (CharSequence) obj);
                return;
            case 1:
                cag.f(view, (CharSequence) obj);
                return;
            default:
                aag.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    public final boolean f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z = false;
                if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                    z = true;
                }
                return true ^ z;
        }
    }
}
