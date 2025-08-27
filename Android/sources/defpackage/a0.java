package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.Surface;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.apache.http.util.LangUtils;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.views.dialogs.FrgDlgConstructorSendConfirmation;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a0  reason: default package */
public final /* synthetic */ class a0 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v7, types: [h20, java.lang.Object] */
    public final void accept(Object obj) {
        f2a f2a;
        f2a f2a2;
        d8b d8b;
        View focusedChild;
        boolean z = true;
        boolean z2 = false;
        String str = null;
        switch (this.a) {
            case 0:
                iq.h((scf) this.b, (ProgressBar) ((View) obj).findViewById(lic.ll_stickers_progress__progress));
                return;
            case 1:
                h8g h8g = (h8g) obj;
                int i = CameraxCameraApiView.x;
                if (h8g instanceof c8g) {
                    c8g c8g = (c8g) h8g;
                    if (c8g.c == 0) {
                        z = false;
                    }
                    CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.b;
                    if (!z) {
                        z68.c(cameraxCameraApiView.getClass().getName(), "onVideoTaken", new Object[0]);
                        uu1 uu1 = cameraxCameraApiView.v;
                        if (uu1 != null) {
                            uu1.g(c8g.a.b.c);
                            return;
                        }
                        return;
                    }
                    z68.c(cameraxCameraApiView.getClass().getName(), "onCameraError", new Object[0]);
                    uu1 uu12 = cameraxCameraApiView.v;
                    if (uu12 != null) {
                        uu12.h(new Exception(c8g.d));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((l2a) obj).x.f(true, (dw0) this.b);
                return;
            case 3:
                u58 u58 = (u58) obj;
                u58.d = ((g1a) this.b).A0.c;
                u58.b = false;
                return;
            case 4:
                u58 u582 = (u58) obj;
                u582.b = ((Boolean) this.b).booleanValue();
                u582.a = true;
                return;
            case 5:
                ((u58) obj).e = (v58) this.b;
                return;
            case 6:
                FrgGifsLoader frgGifsLoader = ((a2a) this.b).c;
                List unmodifiableList = Collections.unmodifiableList(frgGifsLoader.C1);
                boolean z3 = frgGifsLoader.J1;
                c0 E = ((j4a) obj).x0.v.E(ose.GIFS);
                if (E instanceof wr6) {
                    ((wr6) E).b(unmodifiableList, z3);
                    return;
                }
                return;
            case 7:
                k0a k0a = (k0a) obj;
                k0a.v.a();
                ck3 ck3 = (ck3) this.b;
                long j = ck3.a;
                k0a.Z = j;
                vk3 p = k0a.w.p(j, false);
                if (p == null || (p.a.c.m & 32) != 0 || (cvg.A(k0a.z.c.a0()) && k0a.c.f.c() <= 0)) {
                    k0a.f0(ck3.a);
                    return;
                }
                FrgBase frgBase = k0a.b.w;
                if (frgBase.D0 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("ru.ok.tamtam.extra.CONSTRUCTOR_NAME", ck3.o);
                    FrgDlgConstructorSendConfirmation frgDlgConstructorSendConfirmation = new FrgDlgConstructorSendConfirmation();
                    frgDlgConstructorSendConfirmation.L2(bundle);
                    frgDlgConstructorSendConfirmation.d3(frgBase);
                    return;
                }
                return;
            case 8:
                ((n4a) obj).J(((SeekBar) this.b).getProgress());
                return;
            case 9:
                i1a i1a = ((k1a) obj).c;
                if (i1a != null) {
                    p1a p1a = i1a.c;
                    p1a.getClass();
                    f2a f2a3 = p1a.a;
                    if (f2a3 != null) {
                        s3a s3a = (s3a) f2a3;
                        Editable text = s3a.X.getText();
                        String charSequence = text == null ? null : text.toString();
                        CharSequence charSequence2 = (CharSequence) this.b;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        }
                        if (!cvg.c(charSequence, str)) {
                            s3a.X.setText(charSequence2);
                            if (charSequence2 != null) {
                                try {
                                    s3a.X.setSelection(charSequence2.length());
                                    return;
                                } catch (Exception unused) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                MessageComposeEditText messageComposeEditText = ((s3a) this.b).X;
                ((p1a) obj).getClass();
                qw6.KEYBOARD_TAP.e(messageComposeEditText);
                return;
            case 11:
                v1a v1a = (v1a) obj;
                v1a.w.add(ev0.v(v1a.v, (CoroutineContext) null, (f14) null, new u1a(v1a, (File) this.b, (Continuation) null), 3));
                return;
            case 12:
                f3a f3a = (f3a) obj;
                int checkedChipId = ((e4a) this.b).y.getCheckedChipId();
                v58 v58 = checkedChipId == lic.layout_send_location__duration_20m ? v58.c : checkedChipId == lic.layout_send_location__duration_1h ? v58.o : checkedChipId == lic.layout_send_location__duration_3h ? v58.v : checkedChipId == lic.layout_send_location__duration_24h ? v58.w : checkedChipId == lic.layout_send_location__duration_no_limit ? v58.x : v58.v;
                f3a.getClass();
                for (g1a g1a : (Set) f3a.a) {
                    g1a.getClass();
                    g1a.Y(new a0(5, v58));
                }
                return;
            case 13:
                a2a a2a = (a2a) obj;
                a2a.getClass();
                z68.c("a2a", "onGifClicked", new Object[0]);
                ? obj2 = new Object();
                xr6 xr6 = (xr6) this.b;
                obj2.a = xr6.a;
                ata ata = xr6.b;
                e eVar = (e) ata.b;
                obj2.b = eVar.a;
                obj2.c = eVar.b;
                obj2.d = eVar.c;
                obj2.f = ((e) ata.c).c;
                obj2.j = true;
                obj2.i = 3;
                obj2.m = 2;
                boe b2 = obj2.b();
                Parcelable.Creator<goe> creator = goe.CREATOR;
                ype W = a2a.W();
                ype ype = ype.SUGGEST;
                i1a i1a2 = a2a.v;
                if (W == ype) {
                    k0a k0a2 = i1a2.a;
                    i1a i1a3 = k0a2.z;
                    f2a f2a4 = i1a3.c.a;
                    if (f2a4 != null) {
                        Context context = (Context) ((s3a) f2a4).b;
                        if (context instanceof Activity) {
                            hd8.B((Activity) context);
                        }
                    }
                    i3a i3a = (i3a) i1a3.f.a;
                    if (i3a.c0() && (focusedChild = i3a.w0.getFocusedChild()) != null) {
                        hd8.C(focusedChild.getContext(), focusedChild);
                    }
                    f2a f2a5 = i1a3.d.a;
                    if (!(f2a5 == null || (d8b = ((u2a) f2a5).X) == null)) {
                        d8b.d();
                    }
                    z68.c("k0a", "sendSticker: stickerId = %d", Long.valueOf(b2.a));
                    i1a i1a4 = k0a2.z;
                    p1a p1a2 = i1a4.c;
                    String a0 = p1a2.a0();
                    String lowerCase = p1a2.a0().toLowerCase();
                    Pattern pattern = hhf.a;
                    List list = b2.z;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((String) it.next()).equalsIgnoreCase(lowerCase)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    yva yva = i1a4.b;
                    if ((yva.k.f(a0) || (yva.k.a(a0).isEmpty() && z2)) && (f2a2 = p1a2.a) != null) {
                        s3a s3a2 = (s3a) f2a2;
                        Editable text2 = s3a2.X.getText();
                        if (!cvg.c(text2 == null ? null : text2.toString(), (CharSequence) null)) {
                            s3a2.X.setText((CharSequence) null);
                        }
                    }
                    a2a a2a2 = i1a4.e;
                    if (a0.toString().equals((a2a2.U() ? ((j4a) a2a2.a).Z() : "").toString()) && !cvg.A(a0) && a0.trim().split("\\s").length == 1 && (f2a = p1a2.a) != null) {
                        s3a s3a3 = (s3a) f2a;
                        Editable text3 = s3a3.X.getText();
                        if (!cvg.c(text3 == null ? null : text3.toString(), (CharSequence) null)) {
                            s3a3.X.setText((CharSequence) null);
                        }
                    }
                    f2a f2a6 = a2a2.a;
                    if (f2a6 != null) {
                        ((j4a) f2a6).a0();
                    }
                    k0a2.o.getClass();
                    long j2 = k0a2.Z;
                    a32 a32 = k0a2.X;
                    if (a32 != null) {
                        long j3 = a32.a;
                    }
                    k0a2.v.getClass();
                    z68.c("p99", "sendToConstructor, constructorId = %d, paramsType = %s", Long.valueOf(j2), g63.q(6));
                    tr1.y(6);
                    return;
                }
                i1a2.c();
                throw null;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((a2a) obj).Z((String) this.b);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((lyc) this.b).J = (Uri) obj;
                return;
            case 16:
                oc0 oc0 = (oc0) obj;
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    int i2 = oc0.b - ((nb0) entry.getKey()).f;
                    if (((nb0) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int h = grf.h(i2);
                    q3f q3f = (q3f) entry.getValue();
                    q3f.getClass();
                    ev0.E(new wt0(q3f, h, -1, 5));
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                nc0 nc0 = (nc0) obj;
                u00 u00 = (u00) this.b;
                if (u00 != null) {
                    u00.j();
                    return;
                }
                return;
            case 18:
                ((do1) this.b).b((nc0) obj);
                return;
            case 19:
                nc0 nc02 = (nc0) obj;
                nr4 nr4 = (nr4) this.b;
                nr4.getClass();
                nc02.b.hashCode();
                Surface surface = (Surface) nr4.g;
                Surface surface2 = nc02.b;
                if (surface2 == surface) {
                    nr4.g = null;
                    ((do1) nr4.n).b((g65) nr4.f);
                    nr4.e();
                    return;
                }
                surface2.release();
                return;
            default:
                y6g y6g = (y6g) this.b;
                h8g h8g2 = (h8g) obj;
                if (h8g2 instanceof c8g) {
                    c8g c8g2 = (c8g) h8g2;
                    if (c8g2.c != 0) {
                        String name = y6g.getClass().getName();
                        Throwable th = c8g2.d;
                        z68.f(name, a81.m("onCameraError: ", th != null ? th.getLocalizedMessage() : null), c8g2.d);
                        sa3 sa3 = y6g.w0;
                        if (sa3 != null) {
                            Throwable th2 = c8g2.d;
                            if (th2 == null) {
                                Throwable th3 = c8g2.d;
                                if (th3 != null) {
                                    str = th3.getLocalizedMessage();
                                }
                                th2 = new RuntimeException(str);
                            }
                            sa3.R(new jb3(th2, false));
                            return;
                        }
                        return;
                    }
                    String name2 = y6g.getClass().getName();
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.o, name2, "onVideoTaken", (Throwable) null);
                    }
                    sa3 sa32 = y6g.w0;
                    if (sa32 != null) {
                        sa32.R(c8g2.b.a);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
