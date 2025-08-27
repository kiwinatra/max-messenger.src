package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nr7  reason: default package */
public final class nr7 {
    public static final nr7 f = new nr7((ze1) null, (SpannableStringBuilder) null, false, false, p0g.o);
    public final ze1 a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final p0g e;

    public nr7(ze1 ze1, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, p0g p0g) {
        this.a = ze1;
        this.b = spannableStringBuilder;
        this.c = z;
        this.d = z2;
        this.e = p0g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr7)) {
            return false;
        }
        nr7 nr7 = (nr7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nr7.a) && Intrinsics.areEqual((Object) this.b, (Object) nr7.b) && this.c == nr7.c && this.d == nr7.d && this.e == nr7.e;
    }

    public final int hashCode() {
        int i = 0;
        ze1 ze1 = this.a;
        int hashCode = (ze1 == null ? 0 : ze1.hashCode()) * 31;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.e.hashCode() + g63.e(g63.e((hashCode + i) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "LabelSpeakerState(participantId=" + this.a + ", title=" + this.b + ", isPinned=" + this.c + ", isTalking=" + this.d + ", action=" + this.e + ")";
    }
}
