package defpackage;

/* renamed from: xre  reason: default package */
public final class xre extends ol0 {
    public final boe j;
    public final u2f k;
    public final u2f l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xre(defpackage.boe r16, defpackage.w1a r17, defpackage.w1a r18) {
        /*
            r15 = this;
            r13 = r15
            r14 = r16
            boolean r0 = r14.w0
            r12 = r0 ^ 1
            r7 = 0
            r9 = 0
            r10 = 0
            r3 = 0
            r5 = 0
            r11 = 0
            r1 = -1
            r2 = -1
            r0 = r15
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r12)
            r0 = r17
            r13.k = r0
            r0 = r18
            r13.l = r0
            r13.j = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xre.<init>(boe, w1a, w1a):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xre.class == obj.getClass() && super.equals(obj) && this.j.equals(((xre) obj).j);
    }

    public final int f() {
        return 3;
    }

    public final int getHeight() {
        return this.j.c;
    }

    public final int getWidth() {
        return this.j.b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.File} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri h() {
        /*
            r2 = this;
            u2f r0 = r2.k
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0017
            u2f r2 = r2.l
            java.lang.Object r2 = r2.get()
            r0 = r2
            java.io.File r0 = (java.io.File) r0
        L_0x0017:
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xre.h():android.net.Uri");
    }

    public final int hashCode() {
        int hashCode = xre.class.hashCode();
        int hashCode2 = this.j.hashCode();
        return tr1.y(3) + ((hashCode2 + ((hashCode + (super.hashCode() * 31)) * 31)) * 31);
    }
}
