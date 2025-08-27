package defpackage;

/* renamed from: bc2  reason: default package */
public final /* synthetic */ class bc2 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec2 b;

    public /* synthetic */ bc2(ec2 ec2, int i) {
        this.a = i;
        this.b = ec2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, kc2] */
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                jc2 jc2 = (jc2) obj;
                ? obj2 = new Object();
                ec2 ec2 = this.b;
                obj2.a = ec2.a;
                obj2.b = ec2.b;
                obj2.c = ec2.c;
                ? obj3 = new Object();
                obj3.a = obj2;
                obj3.b = ec2.d;
                obj3.c = ec2.e;
                obj3.d = ec2.f;
                obj3.e = ec2.g;
                obj3.f = ec2.h;
                jc2.getClass();
                return new qa3(2, new ni(5, jc2, obj3));
            default:
                qq3 qq3 = (qq3) obj;
                ec2 ec22 = this.b;
                return new uc9(ec22.c, qq3.a, qq3.c, qq3.b, true, ec22.h, ec22.e);
        }
    }
}
