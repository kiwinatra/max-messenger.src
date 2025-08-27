package defpackage;

/* renamed from: q22  reason: default package */
public final class q22 extends p22 {
    public final char a;

    public q22(char c) {
        this.a = c;
    }

    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c = this.a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
