package defpackage;

/* renamed from: x8c  reason: default package */
public final class x8c implements f1g {
    public boolean a = false;
    public boolean b = false;
    public mk5 c;
    public final w8c d;

    public x8c(w8c w8c) {
        this.d = w8c;
    }

    public final f1g b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.c(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final f1g c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
