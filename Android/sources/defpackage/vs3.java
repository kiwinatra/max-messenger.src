package defpackage;

import java.io.Serializable;

/* renamed from: vs3  reason: default package */
public final class vs3 extends ibf implements Serializable {
    public int c;
    public String o;

    public vs3(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        int i;
        str.getClass();
        if (str.equals("verifyResult")) {
            String g0 = ryg.g0(pf9);
            if (g0 != null) {
                if (g0.equals("GOOD")) {
                    i = 1;
                } else if (g0.equals("BAD")) {
                    i = 2;
                } else if (g0.equals("UNDEFINED")) {
                    i = 3;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.ContactVerifyCmd.VerifyResult.".concat(g0));
                }
                this.c = i;
                return;
            }
            throw new NullPointerException("Name is null");
        } else if (!str.equals("name")) {
            pf9.A();
        } else {
            this.o = ryg.g0(pf9);
        }
    }

    public final String toString() {
        int i = this.c;
        String str = this.o;
        StringBuilder sb = new StringBuilder("{verifyResult=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNDEFINED" : "BAD" : "GOOD");
        sb.append(", name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
