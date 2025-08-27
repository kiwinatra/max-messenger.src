package defpackage;

/* renamed from: p22  reason: default package */
public abstract class p22 implements msb {
    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        b0h.i(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
