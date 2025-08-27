package defpackage;

/* renamed from: s1g  reason: default package */
public abstract class s1g extends r1g {
    public lab[] a = null;
    public String b;
    public int c = 0;
    public final int d;

    public s1g() {
    }

    public lab[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(lab[] labArr) {
        if (!b59.g(this.a, labArr)) {
            this.a = b59.r(labArr);
            return;
        }
        lab[] labArr2 = this.a;
        for (int i = 0; i < labArr.length; i++) {
            labArr2[i].a = labArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = labArr[i].b;
                if (i2 >= fArr.length) {
                    break;
                }
                labArr2[i].b[i2] = fArr[i2];
                i2++;
            }
        }
    }

    public s1g(s1g s1g) {
        this.b = s1g.b;
        this.d = s1g.d;
        this.a = b59.r(s1g.a);
    }
}
