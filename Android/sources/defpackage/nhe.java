package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: nhe  reason: default package */
public final class nhe implements Iterator {
    public int a = 2;
    public String b;
    public final CharSequence c;
    public final p22 o;
    public final boolean v;
    public int w = 0;
    public int x;
    public final /* synthetic */ d6a y;

    public nhe(d6a d6a, cs csVar, CharSequence charSequence) {
        this.y = d6a;
        this.o = (p22) csVar.c;
        this.v = false;
        this.x = csVar.b;
        this.c = charSequence;
    }

    public final boolean hasNext() {
        String str;
        CharSequence charSequence;
        int i;
        int i2 = this.a;
        if (i2 != 4) {
            int y2 = tr1.y(i2);
            if (y2 == 0) {
                return true;
            }
            if (y2 == 2) {
                return false;
            }
            this.a = 4;
            int i3 = this.w;
            while (true) {
                int i4 = this.w;
                if (i4 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                charSequence = this.c;
                int a2 = ((p22) this.y.b).a(charSequence, i4);
                if (a2 == -1) {
                    a2 = charSequence.length();
                    this.w = -1;
                } else {
                    this.w = a2 + 1;
                }
                int i5 = this.w;
                if (i5 == i3) {
                    int i6 = i5 + 1;
                    this.w = i6;
                    if (i6 > charSequence.length()) {
                        this.w = -1;
                    }
                } else {
                    while (true) {
                        p22 p22 = this.o;
                        if (i3 < a2 && p22.b(charSequence.charAt(i3))) {
                            i3++;
                        }
                    }
                    while (i > i3 && p22.b(charSequence.charAt(i - 1))) {
                        a2 = i - 1;
                    }
                    if (!this.v || i3 != i) {
                        int i7 = this.x;
                    } else {
                        i3 = this.w;
                    }
                }
            }
            int i72 = this.x;
            if (i72 == 1) {
                i = charSequence.length();
                this.w = -1;
                while (i > i3 && p22.b(charSequence.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.x = i72 - 1;
            }
            str = charSequence.subSequence(i3, i).toString();
            this.b = str;
            if (this.a == 3) {
                return false;
            }
            this.a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            String str = this.b;
            this.b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
