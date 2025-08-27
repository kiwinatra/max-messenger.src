package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import kotlin.text.StringsKt;

/* renamed from: v35  reason: default package */
public final class v35 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ v35(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        kuf[] kufArr;
        Object value;
        xme xme;
        Object value2;
        Object[] objArr;
        int i;
        switch (this.a) {
            case 0:
                if (!TextUtils.isEmpty(editable) && !this.b) {
                    this.b = true;
                    String obj = editable.toString();
                    if (!TextUtils.isEmpty(obj)) {
                        for (CharSequence charSequence : ((u25) this.c).a(obj)) {
                            int indexOf = obj.indexOf(charSequence.toString());
                            if (indexOf >= 0 && ((kufArr = (kuf[]) editable.getSpans(indexOf, charSequence.length() + indexOf, kuf.class)) == null || kufArr.length <= 0)) {
                                editable.replace(indexOf, charSequence.length() + indexOf, charSequence);
                            }
                        }
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                dc9 dc9 = (dc9) this.c;
                xme xme2 = dc9.J0;
                do {
                    value = xme2.getValue();
                    ((Number) value).intValue();
                } while (!xme2.b(value, Integer.valueOf(dc9.c.getSelectionEnd())));
                do {
                    xme = dc9.H0;
                    value2 = xme.getValue();
                    CharSequence charSequence2 = (CharSequence) value2;
                    objArr = null;
                } while (!xme.b(value2, editable != null ? editable.subSequence(0, editable.length()) : null));
                js9 js9 = fu4.k;
                if (editable == null || StringsKt.isBlank(editable)) {
                    dc9.j(js9.e(dc9.getContext()).f());
                } else if (!this.b) {
                    dc9.j(js9.e(dc9.getContext()).f());
                }
                if (editable != null) {
                    try {
                        objArr = editable.getSpans(0, editable.length(), ze.class);
                    } catch (Throwable unused) {
                    }
                    if (objArr == null) {
                        objArr = new ze[0];
                    }
                    for (ze zeVar : (ze[]) objArr) {
                        ((dl) zeVar).y.start();
                    }
                    return;
                }
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b = !(charSequence == null || StringsKt.isBlank(charSequence));
                return;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }
}
