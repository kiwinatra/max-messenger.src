package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.Toolbar;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;

/* renamed from: nqd  reason: default package */
public final /* synthetic */ class nqd implements nsb, s9d, qk3, knd, p23, ice, vla, zi6, mq7, pk3, op7, eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nqd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(n9d n9d, w9d w9d) {
        q2d q2d = (q2d) n9d;
        ktd ktd = (ktd) this.b;
        ktd.getClass();
        Integer num = ((r2d) w9d).a;
        if (num != null) {
            ktd.B0.a.edit().putInt("estimatedPerformanceIndex", num.intValue()).apply();
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                j10 j10 = (j10) obj;
                u10 u10 = j10.v;
                if (u10 == null) {
                    u10 = u10.j;
                }
                t10 a2 = u10.a();
                a2.a = (s58) this.b;
                j10.v = a2.a();
                j10.i = d20.c;
                return;
            case 12:
                List list = (List) obj;
                ((mre) this.b).e();
                return;
            case 13:
                ure ure = (ure) this.b;
                ure.getClass();
                ure.h = ((tre) obj).o;
                return;
            case LangUtils.HASH_SEED /*17*/:
                q44 q44 = (q44) obj;
                aze aze = (aze) this.b;
                aze.getClass();
                long j = q44.b;
                aze.b.getClass();
                zye zye = new zye(j, mz4.r(q44.c, q44.a));
                aze.o.add(zye);
                long j2 = aze.Y;
                if (j2 == -9223372036854775807L || q44.b >= j2) {
                    aze.a(zye);
                    return;
                }
                return;
            case 18:
                ((qb7) this.b).a((q44) obj);
                return;
            case 25:
                z68.f("zff", "process: failed for text " + ((CharSequence) this.b), (Throwable) obj);
                return;
            case 27:
                ((iz8) this.b).b((aae) obj);
                return;
            default:
                ((hmf) this.b).onMenuItemClick((MenuItem) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 9:
                boe boe = (boe) obj;
                moe moe = ((ooe) this.b).b;
                moe.a.put(Long.valueOf(boe.a), boe);
                jbd.a(new p00(22, moe, boe), moe.i, (x6) null, new mqd(4), (lfd) null);
                return lbe.h(boe);
            case 10:
                return new bre(((fre) this.b).v, (String) null, (List) obj);
            case 11:
                wqe wqe = (wqe) obj;
                wqe.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM sticker_sets WHERE id IN (");
                long[] jArr = (long[]) this.b;
                int length = jArr == null ? 1 : jArr.length;
                n79.c(sb, length);
                sb.append(")");
                d7d a2 = d7d.a(length, sb.toString());
                if (jArr == null) {
                    a2.X(1);
                } else {
                    int i = 1;
                    for (long k : jArr) {
                        a2.k(i, k);
                        i++;
                    }
                }
                return new bi8(new ni(28, wqe, a2));
            default:
                return ((jha) obj).m(new ecf((gcf) this.b), IntCompanionObject.MAX_VALUE);
        }
    }

    public void b() {
        hse hse = (hse) this.b;
        hse.D0.setVisibility(8);
        if (hse.N0) {
            hse.O0 = true;
        }
    }

    public boolean f(ClickableSpan clickableSpan, int i, int i2, String str, sy7 sy7, MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                p23 onLinkLongClickListener = ((a6e) this.b).getOnLinkLongClickListener();
                return onLinkLongClickListener != null && onLinkLongClickListener.f(clickableSpan, i, i2, str, sy7, motionEvent);
            default:
                p23 onLinkLongClickListener2 = ((vff) this.b).getOnLinkLongClickListener();
                return onLinkLongClickListener2 != null && onLinkLongClickListener2.f(clickableSpan, i, i2, str, sy7, motionEvent);
        }
    }

    public void h(pbe pbe) {
        ((Function1) ((j09) this.b).e).invoke(new lme(pbe));
    }

    public jnd j(int i) {
        switch (this.a) {
            case 4:
                bnd bnd = (bnd) ((lz7) ((SettingMediaScreen) this.b).v.E(i));
                jnd g = bnd.g();
                if (bnd.k()) {
                    return g;
                }
                return null;
            case 5:
                xmd xmd = (xmd) ((lz7) ((SettingsPrivacyScreen) this.b).w.E(i));
                jnd g2 = xmd.g();
                if (xmd.k()) {
                    return g2;
                }
                return null;
            default:
                wmd wmd = (wmd) ((lz7) ((StickersSettingsScreen) this.b).v.E(i));
                if (wmd.g() != null) {
                    return wmd.g();
                }
                return null;
        }
    }

    public Object parse(sp7 sp7) {
        return SupportedCodecsApiRequest._get_okParser_$lambda$0((SupportedCodecsApiRequest) this.b, sp7);
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 20:
                p3f p3f = (p3f) this.b;
                p3f.o = do1;
                return "SettableFuture hashCode: " + p3f.hashCode();
            case 21:
                ((s3f) this.b).Y = do1;
                return "SurfaceOutputImpl close future complete";
            default:
                ((mhf) this.b).k.set(do1);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                uqd uqd = (uqd) obj;
                if (!cjf.d((Set) this.b, new nqd(1, uqd))) {
                    d48 d48 = uqd.a;
                    return !(d48 instanceof k00) && !d48.c.startsWith("content://");
                }
            case 1:
                return y64.a((Uri) obj, ((uqd) this.b).a.c());
            default:
                return ((xdb) obj).w == ((vk3) this.b).s();
        }
    }

    public iog z(View view, iog iog) {
        nr0 nr0;
        switch (this.a) {
            case 8:
                hne hne = (hne) this.b;
                if (hne.g) {
                    return iog;
                }
                hne.e = iog;
                WindowInsets f = iog.f();
                int i = 0;
                if (f != null) {
                    if (Build.VERSION.SDK_INT < 31 || (nr0 = hne.b.b) == null || !nr0.c) {
                        f = null;
                    }
                    if (f != null) {
                        RoundedCorner l = f.getRoundedCorner(3);
                        int b2 = l != null ? l.getRadius() : 0;
                        RoundedCorner B = f.getRoundedCorner(2);
                        if (B != null) {
                            i = B.getRadius();
                        }
                        i = Math.max(b2 / 2, i / 2);
                    }
                }
                hne.f = i;
                hne.c(iog);
                return hne.d(iog);
            default:
                Toolbar toolbar = (Toolbar) ((b33) this.b).c;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
                fog fog = iog.a;
                marginLayoutParams.topMargin = fog.f(7).b;
                toolbar.setLayoutParams(marginLayoutParams);
                iq.r(toolbar, fog.f(7).c);
                iq.t(toolbar, fog.f(7).a);
                return iog;
        }
    }
}
