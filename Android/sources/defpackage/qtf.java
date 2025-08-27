package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qtf  reason: default package */
public final class qtf {
    public final /* synthetic */ int a;
    public final String b;
    public final int c;
    public final int d;
    public int e;
    public String f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public qtf(int i, int i2, int i3, byte b2) {
        this((int) IntCompanionObject.MIN_VALUE, i, i2, 0);
        this.a = i3;
        switch (i3) {
            case 1:
                this((int) IntCompanionObject.MIN_VALUE, i, i2, 1);
                return;
            default:
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                int i = this.e;
                int i2 = i == Integer.MIN_VALUE ? this.c : i + this.d;
                this.e = i2;
                String str = this.b;
                this.f = i2a.h(g63.f(11, str), i2, str);
                return;
            default:
                int i3 = this.e;
                this.e = i3 == Integer.MIN_VALUE ? this.c : i3 + this.d;
                this.f = this.b + this.e;
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (this.e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
            default:
                if (this.e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
        }
    }

    public qtf(int i, int i2, int i3, int i4) {
        String str;
        String str2;
        this.a = i4;
        switch (i4) {
            case 1:
                if (i != Integer.MIN_VALUE) {
                    str = i + "/";
                } else {
                    str = "";
                }
                this.b = str;
                this.c = i2;
                this.d = i3;
                this.e = IntCompanionObject.MIN_VALUE;
                this.f = "";
                return;
            default:
                if (i != Integer.MIN_VALUE) {
                    StringBuilder sb = new StringBuilder(12);
                    sb.append(i);
                    sb.append("/");
                    str2 = sb.toString();
                } else {
                    str2 = "";
                }
                this.b = str2;
                this.c = i2;
                this.d = i3;
                this.e = IntCompanionObject.MIN_VALUE;
                this.f = "";
                return;
        }
    }
}
