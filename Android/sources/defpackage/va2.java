package defpackage;

import java.util.List;

/* renamed from: va2  reason: default package */
public final class va2 extends ibf {
    public List c;
    public b32 o;
    public fo3 v;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    c2 = 1;
                    break;
                }
                break;
            case 94623771:
                if (str.equals("chats")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = b32.a(pf9);
                return;
            case 1:
                this.v = fo3.e(pf9);
                return;
            case 2:
                this.c = a00.d(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        dbe.w.getClass();
        Integer valueOf = Integer.valueOf(kv0.o(this.c));
        b32 b32 = this.o;
        fo3 fo3 = this.v;
        return "{chats=" + valueOf + ", chat=" + b32 + ", contact=" + fo3 + "}";
    }
}
