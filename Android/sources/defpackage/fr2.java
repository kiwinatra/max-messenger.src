package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: fr2  reason: default package */
public final class fr2 extends xag {
    public static final /* synthetic */ KProperty[] H0;
    public final s85 A0 = new s85(0);
    public final AtomicLong B0 = new AtomicLong();
    public final wie C0 = o5a.U();
    public final wie D0 = o5a.U();
    public volatile String E0;
    public String F0 = "";
    public String G0 = "";
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final long[] b;
    public final zke c;
    public final bud o;
    public final Lazy v;
    public final Lazy v0;
    public final Lazy w;
    public final Lazy w0;
    public final Lazy x;
    public final xme x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final s85 z0 = new s85(0);

    static {
        Class<fr2> cls = fr2.class;
        H0 = new KProperty[]{rae.s(cls, "createChannelJob", "getCreateChannelJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "updateChannelJob", "getUpdateChannelJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public fr2(long[] jArr, zke zke) {
        wke wke = wke.a;
        bud c2 = wke.c();
        Lazy h = wke.getAccessor().h(rl.class);
        Lazy h2 = wke.getAccessor().h(gaf.class);
        Lazy h3 = wke.getAccessor().h(edb.class);
        Lazy h4 = wke.getAccessor().h(po5.class);
        Lazy h5 = wke.getAccessor().h(r62.class);
        Lazy k = wke.getAccessor().k(qc7.class);
        Lazy h6 = wke.getAccessor().h(sv0.class);
        Lazy h7 = wke.getAccessor().h(e0b.class);
        Lazy h8 = wke.getAccessor().h(Context.class);
        Lazy h9 = wke.getAccessor().h(p24.class);
        Lazy h10 = wke.getAccessor().h(uj5.class);
        this.b = jArr;
        this.c = zke;
        this.o = c2;
        this.v = h;
        this.w = h3;
        this.x = h2;
        this.y = h4;
        this.z = h5;
        this.X = k;
        this.Y = h6;
        this.Z = h7;
        this.v0 = h8;
        this.w0 = h9;
        xme a = f6e.a(new yq2((String) null, (String) null, (RectF) null));
        this.x0 = a;
        this.y0 = new etc(a);
        if (zke == zke.CHANNEL) {
            bs0.K(new ps5(new dtc(((p24) h9.getValue()).a), new ar2(this, h2, h10, (Continuation) null), 5), this.a);
        }
    }

    public static final void j(fr2 fr2, long j) {
        String str;
        xme xme = fr2.x0;
        String str2 = ((yq2) xme.getValue()).a;
        String str3 = ((yq2) xme.getValue()).b;
        if (str3 == null || (str = o5a.z(str3)) == null) {
            str = null;
        }
        if (str2 != null) {
            if (str != null) {
                ((r62) fr2.z.getValue()).j(j, str);
            }
            RectF rectF = ((yq2) xme.getValue()).c;
            ((jna) ((rl) fr2.v.getValue())).M(j, m5a.n(rectF), str2);
        }
    }

    public final void k(String str, RectF rectF, Rect rect) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(m5a.r(str, rect, wke.a.c()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m26exceptionOrNullimpl(obj) != null) {
            z68.c(fr2.class.getName(), "local crop failed. Crop will be applied after update from server", new Object[0]);
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        yq2 yq2 = new yq2(str, (String) obj, rectF);
        xme xme = this.x0;
        xme.getClass();
        xme.m((Object) null, yq2);
    }

    public final void l() {
        Object obj;
        if (!((edb) this.w.getValue()).b(edb.l)) {
            xag.h(this.z0, nq2.b);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            this.E0 = String.valueOf(System.currentTimeMillis());
            Uri fromFile = Uri.fromFile(((po5) this.y.getValue()).r(this.E0));
            String uri = fromFile.toString();
            int i = o5a.f;
            if (!uri.startsWith("content://")) {
                fromFile = ((po5) this.y.getValue()).f((Context) this.v0.getValue(), n79.V(fromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", fromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            obj = Result.m23constructorimpl(intent);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r1 = Result.m26exceptionOrNullimpl(obj);
        if (r1 != null) {
            m();
            z68.f(fr2.class.getName(), "capturePhoto: failed to capture photo", r1);
        }
        if (Result.m30isSuccessimpl(obj)) {
            xag.h(this.z0, new mq2((Intent) obj));
        }
    }

    public final void m() {
        this.E0 = null;
        e0b e0b = (e0b) this.Z.getValue();
        e0b.h(new igf(qad.n0));
        e0b.f(new o0b(cad.K));
        e0b.j();
    }

    public final void n() {
        this.E0 = null;
        e0b e0b = (e0b) this.Z.getValue();
        e0b.h(new igf(qad.p0));
        e0b.f(new o0b(cad.K));
        e0b.j();
    }
}
