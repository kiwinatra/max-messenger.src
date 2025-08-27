package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: ri1  reason: default package */
public final /* synthetic */ class ri1 implements Function0 {
    public final /* synthetic */ jj1 a;
    public final /* synthetic */ aj8 b;
    public final /* synthetic */ aj8 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ ri1(jj1 jj1, aj8 aj8, aj8 aj82, boolean z) {
        this.a = jj1;
        this.b = aj8;
        this.c = aj82;
        this.o = z;
    }

    public final Object invoke() {
        aj8.a.getClass();
        boolean r = nfd.r(this.b);
        boolean r2 = nfd.r(this.c);
        jj1 jj1 = this.a;
        ap1 ap1 = jj1.c;
        ((o01) ap1.b).e(r);
        if (r) {
            ((sz9) ap1.p.getValue()).d(Boolean.FALSE);
        }
        ap1.d(r2);
        ap1 ap12 = jj1.c;
        ap12.getClass();
        cv1 cv1 = this.o ? cv1.a : cv1.b;
        CameraManager a2 = ap12.e.a();
        if (a2 != null) {
            a2.switchCamera(new dv1(cv1));
        }
        return Unit.INSTANCE;
    }
}
