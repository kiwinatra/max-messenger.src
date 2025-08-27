package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;

/* renamed from: gq9  reason: default package */
public final class gq9 {
    public final zp9 a;
    public final char[] b;
    public final fq9 c = new fq9(1024);
    public final Typeface d;

    public gq9(Typeface typeface, zp9 zp9) {
        int i;
        int i2;
        this.d = typeface;
        this.a = zp9;
        int a2 = zp9.a(6);
        if (a2 != 0) {
            int i3 = a2 + zp9.a;
            i = ((ByteBuffer) zp9.d).getInt(((ByteBuffer) zp9.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[(i * 2)];
        int a3 = zp9.a(6);
        if (a3 != 0) {
            int i4 = a3 + zp9.a;
            i2 = ((ByteBuffer) zp9.d).getInt(((ByteBuffer) zp9.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            juf juf = new juf(this, i5);
            yp9 c2 = juf.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.a) : 0, this.b, i5 * 2);
            bs0.m("invalid metadata codepoint length", juf.b() > 0);
            this.c.a(juf, 0, juf.b() - 1);
        }
    }
}
