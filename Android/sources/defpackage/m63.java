package defpackage;

/* renamed from: m63  reason: default package */
public final class m63 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public m63(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m63)) {
            return false;
        }
        m63 m63 = (m63) obj;
        m63.getClass();
        return this.a == m63.a && this.b == m63.b && this.c == m63.c && this.d == m63.d;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + rae.h(0, rae.h(0, rae.h(0, rae.h(0, rae.h(0, rae.h(this.d, rae.h(this.c, rae.h(this.b, rae.h(0, rae.h(0, rae.h(0, rae.h(this.a, rae.h(0, Integer.hashCode(0) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonBackgroundChatBackgroundColors(additionalStep1=0, additionalStep2=0, additionalStep3=");
        sb.append(this.a);
        sb.append(", additionalStep4=0, additionalStep5=0, additionalStep6=0, backgroundStep1=");
        sb.append(this.b);
        sb.append(", backgroundStep2=");
        sb.append(this.c);
        sb.append(", patternColor=");
        return wj6.l(sb, this.d, ", patternStep1=0, patternStep2=0, patternStep3=0, patternStep4=0, patternStep5=0, patternStep6=0)");
    }
}
