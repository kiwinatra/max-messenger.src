package defpackage;

/* renamed from: zxe  reason: default package */
public final class zxe extends mqf {
    public final byte O() {
        int W = W();
        String str = (String) this.c;
        if (W >= str.length() || W == -1) {
            return 10;
        }
        this.b = W;
        return m58.g(str.charAt(W));
    }

    public final int W() {
        int i;
        int i2 = this.b;
        if (i2 == -1) {
            return i2;
        }
        while (true) {
            String str = (String) this.c;
            if (i2 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i2);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                if (charAt != '/' || (i = i2 + 1) >= str.length()) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '*') {
                    int l = StringsKt__StringsKt.indexOf$default((CharSequence) str, "*/", i2 + 2, false, 4, (Object) null);
                    if (l != -1) {
                        i2 = l + 2;
                    } else {
                        this.b = str.length();
                        mqf.A(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String) null, 6);
                        throw null;
                    }
                } else if (charAt2 != '/') {
                    break;
                } else {
                    i2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, 10, i2 + 2, false, 4, (Object) null);
                    if (i2 == -1) {
                        i2 = str.length();
                    }
                }
            }
            i2++;
        }
        this.b = i2;
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = r3.charAt(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n() {
        /*
            r3 = this;
            int r0 = r3.W()
            java.lang.Object r3 = r3.c
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.length()
            r2 = 0
            if (r0 >= r1) goto L_0x0028
            r1 = -1
            if (r0 != r1) goto L_0x0013
            goto L_0x0028
        L_0x0013:
            char r3 = r3.charAt(r0)
            r0 = 44
            if (r3 == r0) goto L_0x0028
            r0 = 58
            if (r3 == r0) goto L_0x0028
            r0 = 93
            if (r3 == r0) goto L_0x0028
            r0 = 125(0x7d, float:1.75E-43)
            if (r3 == r0) goto L_0x0028
            r2 = 1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxe.n():boolean");
    }

    public final byte q() {
        int W = W();
        String str = (String) this.c;
        if (W >= str.length() || W == -1) {
            return 10;
        }
        this.b = W + 1;
        return m58.g(str.charAt(W));
    }

    public final void s(char c) {
        int W = W();
        String str = (String) this.c;
        if (W >= str.length() || W == -1) {
            this.b = -1;
            Z(c);
            throw null;
        }
        char charAt = str.charAt(W);
        this.b = W + 1;
        if (charAt != c) {
            Z(c);
            throw null;
        }
    }
}
