package defpackage;

import java.util.Arrays;

/* renamed from: isb  reason: default package */
public final class isb {
    public final CharSequence a;
    public final String[] b;

    public isb(CharSequence charSequence, String[] strArr) {
        this.a = charSequence;
        this.b = strArr;
    }

    public static isb a() {
        return new isb("", new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isb)) {
            return false;
        }
        isb isb = (isb) obj;
        if (!this.a.equals(isb.a)) {
            return false;
        }
        return Arrays.equals(this.b, isb.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreProcessedText{text=");
        sb.append(vzg.y(this.a));
        sb.append(", tokens=");
        return tr1.k(sb, this.b.length, '}');
    }
}
