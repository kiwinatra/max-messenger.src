package defpackage;

import android.text.Editable;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rgf  reason: default package */
public final class rgf {
    public final TextView a;
    public final Editable b;

    public rgf(TextView textView, Editable editable) {
        this.a = textView;
        this.b = editable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgf)) {
            return false;
        }
        rgf rgf = (rgf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rgf.a) && Intrinsics.areEqual((Object) this.b, (Object) rgf.b);
    }

    public final int hashCode() {
        int i = 0;
        TextView textView = this.a;
        int hashCode = (textView != null ? textView.hashCode() : 0) * 31;
        Editable editable = this.b;
        if (editable != null) {
            i = editable.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TextViewAfterTextChangeEvent(view=" + this.a + ", editable=" + this.b + ")";
    }
}
