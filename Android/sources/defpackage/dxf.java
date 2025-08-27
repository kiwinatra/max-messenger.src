package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;

/* renamed from: dxf  reason: default package */
public final /* synthetic */ class dxf implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jxf b;

    public /* synthetic */ dxf(jxf jxf, int i) {
        this.a = i;
        this.b = jxf;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                this.b.b((bxf) obj);
                return;
            case 5:
                bxf bxf = (bxf) obj;
                jxf jxf = this.b;
                jxf.getClass();
                if (bxf.a()) {
                    kxf kxf = bxf.a;
                    xyf xyf = kxf.c;
                    xyf.getClass();
                    if (xyf != xyf.AUDIO && !kxf.c.a()) {
                        jxf.b(bxf);
                        return;
                    } else {
                        jxf.d(kxf);
                        return;
                    }
                } else {
                    return;
                }
            default:
                jxf jxf2 = this.b;
                mq4 mq4 = (mq4) obj;
                synchronized (jxf2) {
                    jxf2.i.a(mq4);
                }
                return;
        }
    }

    public Object apply(Object obj) {
        fbf fbf;
        int i;
        String str = null;
        jxf jxf = this.b;
        switch (this.a) {
            case 0:
                bxf bxf = (bxf) obj;
                jxf.getClass();
                z68.c("jxf", "prepareUploadFiles: started for upload=%s", bxf);
                if (!cvg.A(bxf.b)) {
                    return lbe.h(bxf);
                }
                sv3 c = ((wj0) ((ou8) jxf.g.g.getValue())).c(bxf.a.a);
                if (c == null) {
                    return lbe.g(new RuntimeException("failed to prepare upload files"));
                }
                long j = c.b;
                if (j == 0) {
                    return lbe.g(new RuntimeException("content is zero length"));
                }
                String str2 = c.e;
                if (cvg.A(str2)) {
                    z68.c("jxf", "prepareUploadFiles: need copy for upload=%s", bxf);
                    mka mka = new mka(1, new fkd(jxf, bxf, c, 4));
                    lfd lfd = jxf.f;
                    return mka.n(lfd).j(lfd);
                }
                axf b2 = bxf.b();
                b2.c = c.c;
                b2.b = str2;
                b2.f = j;
                return lbe.h(new bxf(b2));
            case 1:
                bxf bxf2 = (bxf) obj;
                jxf.getClass();
                lfd b3 = xfd.b();
                xyf xyf = bxf2.a.c;
                xyf.getClass();
                boolean z = xyf == xyf.PHOTO;
                lfd lfd2 = jxf.f;
                return (z || xyf.a()) ? new mka(2, new fxf(jxf, bxf2, 1)).n(b3).j(lfd2) : xyf.b() ? new mka(2, new fxf(jxf, bxf2, 0)).n(b3).j(lfd2) : lbe.h(bxf2);
            case 3:
                bxf bxf3 = (bxf) obj;
                jxf.getClass();
                if (!cvg.A(bxf3.d)) {
                    z68.c("jxf", "requestUrlSingle: already have upload url" + bxf3, new Object[0]);
                    return lbe.h(bxf3);
                }
                z68.c("jxf", "requestUrlSingle: request upload url" + bxf3, new Object[0]);
                xyf xyf2 = bxf3.a.c;
                switch (xyf2.ordinal()) {
                    case 1:
                        fbf = new jw9(false);
                        break;
                    case 2:
                    case 6:
                        fbf = new jw9(Boolean.FALSE);
                        break;
                    case 3:
                        fbf = new jw9(Boolean.TRUE);
                        break;
                    case 4:
                        fbf = new np2();
                        break;
                    case 5:
                        fbf = new jw9(true);
                        break;
                    case 7:
                        fbf = new jw9((x3b) null, 14);
                        break;
                    default:
                        throw new RuntimeException("tamRequestFromUploadType, can't request url for unknown media type= " + xyf2);
                }
                wbe i2 = ((jna) jxf.e).U(fbf, jxf.f).i(new gxf(bxf3, 1));
                gcf gcf = jxf.c;
                gcf.getClass();
                return i2.k(new ecf(gcf, 1, 0));
            case 4:
                bxf bxf4 = (bxf) obj;
                jxf.getClass();
                z68.c("jxf", "uploadFileObservable: upload=%s", bxf4);
                xyf xyf3 = bxf4.a.c;
                xyf3.getClass();
                if (xyf3 == xyf.FILE || bxf4.a.c.b()) {
                    str = bxf4.c;
                }
                String str3 = str;
                switch (xyf3.ordinal()) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        i = 1;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 7:
                        i = 5;
                        break;
                    default:
                        throw new RuntimeException("unknown http type for upload type " + xyf3);
                }
                icf icf = jxf.b;
                icf.getClass();
                Lazy lazy = icf.a;
                String str4 = bxf4.b;
                String str5 = bxf4.d;
                lfd lfd3 = jxf.f;
                mha mha = new mha(new yia(new l57(lazy, i, str4, str3, str5, lfd3).x(lfd3), new fkd(jxf, xyf3, bxf4, 5), 3).j(new pbb(24, jxf, bxf4)), new cr0((Object) new AtomicLong(), (Object) TimeUnit.MILLISECONDS, 500, (Object) new hxf(0), 5), 1);
                ((a33) jxf.d).getClass();
                return new yia(new yia(mha, new ac2(5, TimeUnit.DAYS.toMillis(7), bxf4.i), 4), new nqd(23, jxf.c), 6);
            case 6:
                kxf kxf = (kxf) obj;
                nh8 d = jxf.a.d(kxf);
                xff xff = new xff(28);
                gga gga = m58.f;
                dj6 dj6 = m58.e;
                return new qi8(new si8(new si8(new si8(d, xff, gga, dj6), gga, new xff(29), dj6), gga, gga, new exf(kxf, 0)));
            case 7:
                bxf bxf5 = (bxf) obj;
                jxf.getClass();
                return bxf5.a() ? jha.q(bxf5) : new iia(new oa3(4, new tbe(new wbe(new tbe(new wbe(new wbe(lbe.h(bxf5).n(jxf.f), new dxf(jxf, 0), 0), new dxf(jxf, 1), 0), new dxf(jxf, 2), 3), new dxf(jxf, 3), 0), new dxf(jxf, 2), 3), new dxf(jxf, 4)), new dxf(jxf, 5), m58.f, m58.e);
            default:
                return jxf.e((kxf) obj);
        }
    }
}
