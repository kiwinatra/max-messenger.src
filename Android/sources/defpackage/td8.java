package defpackage;

import android.content.ClipDescription;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputContentInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.messages.media.audio.AudioRecordView;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: td8  reason: default package */
public final /* synthetic */ class td8 implements co8, do8, vp8, u2f, gz8, pk3, ez8, qk3, kg7, p23, zi6, f0b, cg7, ia7, zj3, vla {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ td8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public int a(Object obj) {
        switch (this.a) {
            case 2:
                try {
                    return ((nn8) obj).c((ca6) this.b) ? 1 : 0;
                } catch (MediaCodecUtil$DecoderQueryException unused) {
                    return -1;
                }
            default:
                on8 on8 = (on8) obj;
                on8.getClass();
                ea6 ea6 = (ea6) this.b;
                String str = ea6.n;
                String str2 = on8.b;
                return (!(str2.equals(str) || str2.equals(fo8.b(ea6))) || !on8.c(ea6, false)) ? 0 : 1;
        }
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [e20, java.lang.Object] */
    public void accept(Object obj) {
        LiveVideoPlaceHolderView liveVideoPlaceHolderView;
        Object obj2 = this.b;
        switch (this.a) {
            case 8:
                ((ypb) obj).j((Surface) obj2);
                return;
            case 11:
                ((p89) obj2).L(((Integer) obj).intValue());
                return;
            case 13:
                j10 j10 = (j10) obj;
                u10 u10 = j10.v;
                if (u10 == null) {
                    u10 = u10.j;
                }
                t10 a2 = u10.a();
                a2.i = (v10) obj2;
                j10.v = a2.a();
                return;
            case Protos.Attaches.Attach.LOCATION:
                m20 m20 = (m20) obj;
                long m = ((ltb) ((fa9) obj2).c).a.m();
                for (int i = 0; i < m20.b(); i++) {
                    kr7.P(m20, m20.d(i).q, new c10(m, 0));
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                sd3 sd3 = (sd3) obj2;
                sd3.getClass();
                z68.f("sd3", "notifyFailedForward", (Throwable) obj);
                jb9 jb9 = (jb9) sd3.e;
                if (jb9 != null) {
                    jb9.I0();
                    return;
                }
                return;
            case 16:
                Long l = (Long) obj;
                fe9 fe9 = (fe9) obj2;
                if (fe9.F0 != null && (liveVideoPlaceHolderView = fe9.z) != null && liveVideoPlaceHolderView.getVisibility() == 0) {
                    if (!ld8.y0(((qra) ym.e()).y(), fe9.F0)) {
                        fe9.z.setVisibility(8);
                        return;
                    } else {
                        fe9.z.M();
                        return;
                    }
                } else {
                    return;
                }
            case 23:
                j10 j102 = (j10) obj;
                int ordinal = ((l20) obj2).a.ordinal();
                if (ordinal == 2) {
                    x10 x10 = j102.b;
                    if (x10 == null) {
                        x10 = x10.Z;
                    }
                    w10 b2 = x10.b();
                    b2.g = null;
                    j102.b = new x10(b2);
                    return;
                } else if (ordinal == 3) {
                    h20 a3 = j102.c().a();
                    a3.a = 0;
                    a3.h = null;
                    j102.d = new k20(a3);
                    return;
                } else if (ordinal == 5) {
                    f20 f20 = j102.f;
                    if (f20 == null) {
                        f20 = f20.o;
                    }
                    ? obj3 = new Object();
                    long j = f20.a;
                    obj3.d = f20.b;
                    obj3.b = f20.c;
                    obj3.c = f20.d;
                    obj3.f = f20.e;
                    obj3.g = f20.f;
                    obj3.i = f20.g;
                    obj3.h = f20.h;
                    obj3.e = f20.i;
                    obj3.j = f20.j;
                    obj3.k = f20.k;
                    obj3.l = f20.l;
                    obj3.m = f20.m;
                    obj3.n = f20.n;
                    obj3.a = 0;
                    j102.f = obj3.a();
                    return;
                } else if (ordinal == 9) {
                    r10 a4 = j102.b().a();
                    a4.a = 0;
                    a4.d = null;
                    j102.r = new s10(a4);
                    return;
                } else {
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                k0a k0a = (k0a) obj2;
                k0a.z.d();
                k0a.c.f.j = (CharSequence) obj;
                return;
            case 25:
                i3a i3a = (i3a) ((k1a) obj2).a;
                ((Boolean) obj).getClass();
                if (i3a.z.isActive() && i3a.c0()) {
                    throw null;
                }
                return;
            case 26:
                ((m48) ((ju8) obj2)).r(((Long) obj).longValue());
                return;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                s3a s3a = (s3a) obj2;
                s60 s60 = s3a.v;
                s60.g.getClass();
                if (!s60.D) {
                    s60.D = n54.e(s60.b, n54.f);
                }
                if (!s60.D) {
                    if (motionEvent.getAction() == 0) {
                        for (p1a p1a : (Set) s3a.a) {
                            n99 n99 = p1a.c.a.b;
                            n99.getClass();
                            n54.K(n99.w, n54.f, qad.y6, 160, false);
                        }
                        return;
                    }
                    return;
                } else if (s60.m != r60.o) {
                    int action = motionEvent.getAction();
                    r60 r60 = r60.a;
                    if (action == 2 && s60.m == r60) {
                        s60.b();
                        AudioRecordView audioRecordView = s60.o;
                        float rawX = motionEvent.getRawX();
                        float width = (float) audioRecordView.P0.getWidth();
                        View view = audioRecordView.N0;
                        float width2 = (width - ((float) view.getWidth())) / 2.0f;
                        if (!audioRecordView.Q0) {
                            if (rawX < 0.5f * width) {
                                x60 x60 = audioRecordView.F0;
                                if (x60 != null) {
                                    s60 s602 = (s60) x60;
                                    if (s602.m == r60) {
                                        s602.c();
                                        s602.d.e("ACTION_AUDIO_RECORD_CONTINUOUS_CANCEL");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            float f = width * 0.8f;
                            if (rawX < f) {
                                float f2 = rawX / f;
                                view.setAlpha((float) Math.pow((double) f2, 2.0d));
                                view.setX(width2 * f2);
                                return;
                            }
                            view.setAlpha(1.0f);
                            view.setX(width2);
                            return;
                        } else if (rawX > 0.5f * width) {
                            x60 x602 = audioRecordView.F0;
                            if (x602 != null) {
                                s60 s603 = (s60) x602;
                                if (s603.m == r60) {
                                    s603.c();
                                    s603.d.e("ACTION_AUDIO_RECORD_CONTINUOUS_CANCEL");
                                    return;
                                }
                                return;
                            }
                            return;
                        } else {
                            float f3 = width * 0.19999999f;
                            if (rawX > f3) {
                                float f4 = f3 / rawX;
                                view.setAlpha((float) Math.pow((double) f4, 2.0d));
                                view.setX(width2 / f4);
                                return;
                            }
                            view.setAlpha(1.0f);
                            view.setX(width2);
                            return;
                        }
                    } else {
                        int action2 = motionEvent.getAction();
                        int i2 = s60.a;
                        if (action2 == 1) {
                            PointF pointF = s60.C;
                            if ((pointF == null || fqc.k((double) pointF.x, (double) pointF.y, (double) motionEvent.getX(), (double) motionEvent.getY()) >= ((double) i2)) && s60.m != r60) {
                                s60.b();
                                return;
                            }
                            s60.b();
                            r60 r602 = s60.m;
                            nd ndVar = s60.d;
                            if (r602 == r60) {
                                s60.v();
                                ndVar.h(s60.x, "ACTION_AUDIO_RECORD_CONTINUOUS_SEND");
                                s60.q();
                                return;
                            } else if (r602 == r60.c && motionEvent.getEventTime() - motionEvent.getDownTime() < 200) {
                                s60.b();
                                s60.m = r60.b;
                                s60.t();
                                ndVar.e("ACTION_AUDIO_RECORD_REGULAR_START");
                                return;
                            } else {
                                return;
                            }
                        } else if (motionEvent.getAction() == 0) {
                            s60.C = new PointF(motionEvent.getX(), motionEvent.getY());
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            hja p = jha.p(200, timeUnit);
                            lfd a5 = xfd.a();
                            Objects.requireNonNull(timeUnit, "unit is null");
                            Objects.requireNonNull(a5, "scheduler is null");
                            rka y = new uka(p, timeUnit, a5, 1).s(qe.a()).y(1);
                            or7 or7 = new or7(new p60(s60, 6), m58.g, m58.e);
                            y.a(or7);
                            s60.z = or7;
                            return;
                        } else if (motionEvent.getAction() == 2) {
                            PointF pointF2 = s60.C;
                            if (pointF2 == null || fqc.k((double) pointF2.x, (double) pointF2.y, (double) motionEvent.getX(), (double) motionEvent.getY()) > ((double) i2)) {
                                s60.b();
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    s60.b();
                    return;
                }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [sf9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [i20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [ur1, java.lang.Object] */
    public Object apply(Object obj) {
        ur1 ur1;
        switch (this.a) {
            case 18:
                xf9 xf9 = (xf9) obj;
                ? obj2 = new Object();
                qf9 qf9 = (qf9) this.b;
                xc9 xc9 = qf9.a;
                i20 i20 = null;
                if (xc9 == null) {
                    ur1 = null;
                } else {
                    ? obj3 = new Object();
                    obj3.b = xc9.b;
                    obj3.a = xc9.a;
                    obj3.c = xc9.c;
                    ur1 = obj3;
                }
                obj2.a = ur1;
                obj2.c = qf9.c;
                obj2.b = qf9.b;
                obj2.d = qf9.d;
                p4g p4g = qf9.e;
                if (p4g != null) {
                    ? obj4 = new Object();
                    obj4.c = p4g.c;
                    obj4.b = p4g.b;
                    obj4.a = p4g.a;
                    obj4.d = p4g.d;
                    i20 = obj4;
                }
                obj2.e = i20;
                xf9.getClass();
                return new qa3(2, new ni(15, xf9, obj2));
            default:
                xf9 xf92 = (xf9) obj;
                xc9 xc92 = (xc9) this.b;
                long j = xc92.a;
                xf92.getClass();
                return new qa3(2, new vf9(xf92, j, xc92.b, xc92.c));
        }
    }

    public boolean b(rt6 rt6, int i, Bundle bundle) {
        MessageComposeEditText messageComposeEditText = (MessageComposeEditText) this.b;
        if (messageComposeEditText.v0 == null) {
            return false;
        }
        if ((i & 1) != 0) {
            try {
                ((vs6) rt6.b).v();
            } catch (Exception unused) {
                z68.c("ru.ok.messages.messages.widgets.MessageComposeEditText", "Can't requestPermission for uri from google keyboard", new Object[0]);
                return false;
            }
        }
        ClipDescription description = ((InputContentInfo) ((vs6) rt6.b).b).getDescription();
        String mimeType = description.getMimeTypeCount() > 0 ? description.getMimeType(0) : null;
        boolean A = cvg.A(mimeType);
        nd ndVar = messageComposeEditText.y0;
        if (!A) {
            ndVar.f("ACTION_SEND_MEDIA_FROM_GOOGLE_KEYBOARD", mimeType);
        } else {
            ndVar.e("ACTION_SEND_MEDIA_FROM_GOOGLE_KEYBOARD");
        }
        vs6 vs6 = (vs6) rt6.b;
        String uri = ((InputContentInfo) vs6.b).getContentUri().toString();
        ClipDescription description2 = ((InputContentInfo) vs6.b).getDescription();
        o9a o9a = sq9.b;
        if (!description2.hasMimeType("image/png") || uri.contains("clipboard") || uri.contains("images/media")) {
            s3a s3a = (s3a) ((grg) messageComposeEditText.v0).b;
            s3a.getClass();
            Uri contentUri = ((InputContentInfo) vs6.b).getContentUri();
            for (p1a p1a : (Set) s3a.a) {
                k0a k0a = p1a.c.a;
                k0a.W();
                List X = k0a.X(k0a.z.c.Y());
                Collections.singletonList(new cbe(1, contentUri.toString()));
                k0a.o.getClass();
                kk3 kk3 = new kk3(3);
                kk3.c = X;
                k0a.c0(new kk3(kk3));
            }
        } else {
            s3a s3a2 = (s3a) ((grg) messageComposeEditText.v0).b;
            s3a2.getClass();
            Uri contentUri2 = ((InputContentInfo) vs6.b).getContentUri();
            for (p1a p1a2 : (Set) s3a2.a) {
                k0a k0a2 = p1a2.c.a;
                k0a2.W();
                List X2 = k0a2.X(k0a2.z.c.Y());
                Collections.singletonList(new cbe(10, contentUri2.toString()));
                k0a2.o.getClass();
                kk3 kk32 = new kk3(3);
                kk32.c = X2;
                k0a2.c0(new kk3(kk32));
            }
            ndVar.e("ACTION_SEND_STICKER_FROM_GOOGLE_KEYBOARD");
        }
        return true;
    }

    public void c(np8 np8) {
        switch (this.a) {
            case 4:
                if (np8.isConnected() && np8.j.isEmpty()) {
                    qwd qwd = np8.n.c;
                    long j = qwd.c;
                    qwd qwd2 = (qwd) this.b;
                    if (j < qwd2.c && kne.e(qwd2, qwd)) {
                        np8.n = np8.n.j(qwd2);
                        return;
                    }
                    return;
                }
                return;
            default:
                i67 i67 = np8.w;
                qo8 qo8 = np8.a;
                if (i67 != null) {
                    i8b.o("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    qo8.release();
                    return;
                }
                gi3 gi3 = (gi3) this.b;
                np8.w = gi3.c;
                np8.q = gi3.e;
                pob pob = gi3.f;
                np8.r = pob;
                pob pob2 = gi3.g;
                np8.s = pob2;
                pob I0 = np8.I0(pob, pob2);
                np8.t = I0;
                tb7 tb7 = gi3.k;
                np8.o = tb7;
                np8.p = e63.a(tb7, np8.q, I0);
                np8.n = gi3.j;
                try {
                    gi3.c.asBinder().linkToDeath(np8.g, 0);
                    oxd oxd = np8.e;
                    np8.k = new oxd(oxd.a.a(), gi3.a, gi3.b, oxd.a.getPackageName(), gi3.c, gi3.h);
                    qo8.E0();
                    return;
                } catch (RemoteException unused) {
                    qo8.release();
                    return;
                }
        }
    }

    public void d(ck3 ck3) {
        l2a l2a = (l2a) this.b;
        l2a.v0 = true;
        l2a.N(new a0(7, ck3));
    }

    public void e(ypb ypb, cx8 cx8) {
        ((pk3) this.b).accept(ypb);
    }

    public boolean f(ClickableSpan clickableSpan, int i, int i2, String str, sy7 sy7, MotionEvent motionEvent) {
        p23 p23 = ((lf9) this.b).o;
        if (p23 != null) {
            return p23.f(clickableSpan, i, i2, str, sy7, motionEvent);
        }
        return false;
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        Object obj = this.b;
        switch (this.a) {
            case 7:
                return yx8.k(cx8, (k0d) ((tb7) obj));
            default:
                ya7 ya7 = ya7.b;
                if (!yx8.i()) {
                    ((ez8) obj).e(yx8.s, cx8);
                    hz8.N0(cx8, i, new swd(0));
                }
                return ya7.b;
        }
    }

    public Object get() {
        mu8 mu8 = (mu8) this.b;
        mu8.getClass();
        return mu8.q(nu8.o, new z50(true, false, true), (jv7) null);
    }

    public void i(ja7 ja7) {
        vp9 vp9 = (vp9) this.b;
        synchronized (vp9.a) {
            vp9.c++;
        }
        vp9.d(ja7);
    }

    public void l(g0b g0b) {
        g0b g0b2 = g0b.v;
        ra3 ra3 = (ra3) this.b;
        if (g0b == g0b2) {
            ((sa3) ra3).R(Boolean.TRUE);
            return;
        }
        ((sa3) ra3).R(Boolean.FALSE);
    }

    public iog z(View view, iog iog) {
        e3a e3a = (e3a) this.b;
        iq.s(e3a.w, iog.b());
        ViewGroup viewGroup = e3a.w;
        int c = iog.c();
        if (viewGroup.getPaddingRight() != c) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), c, viewGroup.getPaddingBottom());
        }
        return iog;
    }
}
