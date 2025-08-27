package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.nano.Protos;

/* renamed from: l3a  reason: default package */
public final /* synthetic */ class l3a implements tk3 {
    public final /* synthetic */ int a;

    public /* synthetic */ l3a(int i) {
        this.a = i;
    }

    public final void accept(Object obj) {
        d8b d8b;
        View focusedChild;
        switch (this.a) {
            case 0:
                k0a k0a = ((p1a) obj).c.a;
                i1a i1a = k0a.z;
                if (i1a != null) {
                    p1a p1a = i1a.c;
                    f2a f2a = p1a.a;
                    if (f2a != null) {
                        Context context = (Context) ((s3a) f2a).b;
                        if (context instanceof Activity) {
                            hd8.B((Activity) context);
                        }
                    }
                    i3a i3a = (i3a) i1a.f.a;
                    if (i3a.c0() && (focusedChild = i3a.w0.getFocusedChild()) != null) {
                        hd8.C(focusedChild.getContext(), focusedChild);
                    }
                    f2a f2a2 = i1a.d.a;
                    if (!(f2a2 == null || (d8b = ((u2a) f2a2).X) == null)) {
                        d8b.d();
                    }
                    f2a f2a3 = k0a.a;
                    if (f2a3 != null) {
                        ((l2a) f2a3).x.f(true, (dw0) null);
                    }
                    h48 h48 = k0a.c;
                    if (cjf.B(h48.f.e())) {
                        k0a.W();
                        k0a.X(p1a.Y());
                        k0a.o.getClass();
                        long j = k0a.Z;
                        a32 a32 = k0a.X;
                        if (a32 != null) {
                            long j2 = a32.a;
                        }
                        k0a.v.getClass();
                        z68.c("p99", "sendToConstructor, constructorId = %d, paramsType = %s", Long.valueOf(j), g63.q(2));
                        tr1.y(2);
                        return;
                    }
                    k0a.a0(h48.f.q());
                    return;
                }
                return;
            case 1:
                ((p1a) obj).c.a.getClass();
                throw new NotImplementedError();
            case 2:
                ((p1a) obj).c.d.V(new zj0(18));
                return;
            case 3:
                p1a p1a2 = (p1a) obj;
                if (p1a2.U()) {
                    String format = String.format("%s%s", new Object[]{p1a2.Y(), "/"});
                    ((s3a) p1a2.a).X.setText(format);
                    s3a s3a = (s3a) p1a2.a;
                    int length = format.length();
                    s3a.getClass();
                    try {
                        s3a.X.setSelection(length);
                    } catch (Exception unused) {
                    }
                    p1a2.V(new zj0(20));
                    return;
                }
                return;
            case 4:
                p1a p1a3 = (p1a) obj;
                sff a2 = p1a3.o.a();
                a2.d = !p1a3.o.d;
                p1a3.o = new tff(a2);
                if (p1a3.U()) {
                    ((s3a) p1a3.a).Z(p1a3.o);
                    boolean z = p1a3.o.d;
                    Context context2 = (Context) ((s3a) p1a3.a).b;
                    if (z) {
                        hi7.b0(0, context2, context2.getString(qad.F0));
                        return;
                    } else {
                        hi7.b0(0, context2, context2.getString(qad.E0));
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                ((i3a) ((ok8) ((v1a) obj).b).w0).N(new k2a(22));
                return;
            case 6:
                ok8 ok8 = (ok8) ((v1a) obj).b;
                View focusedChild2 = ok8.getFocusedChild();
                if (focusedChild2 != null) {
                    hd8.C(focusedChild2.getContext(), focusedChild2);
                }
                ok8.t();
                int measuredWidth = ok8.getMeasuredWidth();
                int measuredHeight = ok8.getMeasuredHeight();
                Rect rect = rcg.a;
                rcg.d(rect, ok8.K0);
                ok8.S0.t(measuredWidth, measuredHeight, rect.top, true, true);
                return;
            case 7:
                v1a v1a = (v1a) obj;
                CopyOnWriteArrayList copyOnWriteArrayList = v1a.w;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((pm7) it.next()).b((CancellationException) null);
                }
                copyOnWriteArrayList.clear();
                ((ok8) v1a.b).w(true);
                return;
            case 8:
                ((n4a) obj).x();
                return;
            case 9:
                ((n4a) obj).T();
                return;
            case 10:
                ((n4a) obj).S();
                return;
            case 11:
                FrgGifsLoader frgGifsLoader = ((a2a) obj).c;
                if (frgGifsLoader.G1 != null && !cvg.A(frgGifsLoader.E1)) {
                    frgGifsLoader.G1.q("pos");
                    frgGifsLoader.G1.b("pos", frgGifsLoader.E1);
                    z68.c("ru.ok.messages.stickers.FrgGifsLoader", "loadNext: url: " + frgGifsLoader.G1, new Object[0]);
                    frgGifsLoader.k3(frgGifsLoader.G1);
                    return;
                }
                return;
            case 12:
                a2a a2a = (a2a) obj;
                if (a2a.U()) {
                    FrgGifsLoader frgGifsLoader2 = a2a.c;
                    if (Collections.unmodifiableList(frgGifsLoader2.C1).isEmpty() && cvg.A(((j4a) a2a.a).Z())) {
                        frgGifsLoader2.j3();
                    }
                    mre mre = a2a.o;
                    if (((List) ((lre) mre.i.get()).b).isEmpty() && cvg.A(((j4a) a2a.a).Z())) {
                        mre.b();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((a2a) obj).v.a.getClass();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                a2a a2a2 = (a2a) obj;
                if (a2a2.U()) {
                    CharSequence Z = ((j4a) a2a2.a).Z();
                    String charSequence = Z == null ? "" : Z.toString();
                    ose currentInputType = ((j4a) a2a2.a).x0.getCurrentInputType();
                    if (!charSequence.equals((String) a2a2.Z.get(currentInputType))) {
                        a2a2.Z(charSequence);
                    }
                    if (currentInputType == ose.GIFS || currentInputType == ose.STICKER_SETS) {
                        ((j4a) a2a2.a).w0.setShowSuggest(false);
                        return;
                    }
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                c2a c2a = (c2a) obj;
                boolean z2 = !c2a.v0;
                c2a.v0 = z2;
                ((m4a) c2a.a).c0(z2, ((m48) c2a.v).k());
                return;
            case 16:
                c2a c2a2 = (c2a) obj;
                c2a2.c.e("ACTION_LOCAL_MEDIA_TRIM_APPLY");
                m4a m4a = (m4a) c2a2.a;
                AppCompatImageButton appCompatImageButton = m4a.A0;
                ch chVar = m4a.x;
                chVar.g(appCompatImageButton);
                chVar.i(m4a.B0);
                iq.X((ViewGroup) ((View) m4a.c), false);
                long j3 = c2a2.x;
                FrgTrimVideo frgTrimVideo = c2a2.b;
                frgTrimVideo.getClass();
                new mka(1, new u52((Object) frgTrimVideo, (Object) c2a2.o, j3, 7)).n(xfd.a()).j(qe.a()).l(new ao1(3, new b2a(c2a2, 1), new q0a(13)));
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((c2a) obj).W();
                return;
            case 18:
                c2a c2a3 = (c2a) obj;
                int i = (c2a3.x > 0 ? 1 : (c2a3.x == 0 ? 0 : -1));
                long j4 = c2a3.w;
                if (i != 0 || c2a3.y != j4) {
                    c2a3.Y();
                    c2a3.x = 0;
                    c2a3.y = j4;
                    m4a m4a2 = (m4a) c2a3.a;
                    m4a2.w0.setStartPosition(0);
                    m4a2.w0.setEndPosition(c2a3.y);
                    m4a2.w0.setPointerPosition(c2a3.x);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    m4a2.Z.setText(j4b.t(timeUnit.toSeconds(c2a3.x)));
                    m4a2.v0.setText(j4b.t(timeUnit.toSeconds(c2a3.y)));
                    ((m48) c2a3.v).r(c2a3.x);
                    c2a3.a0();
                    return;
                }
                return;
            case 19:
                FrgTrimVideo frgTrimVideo2 = ((c2a) obj).b;
                frgTrimVideo2.h3();
                frgTrimVideo2.U2();
                return;
            case 20:
                c2a c2a4 = (c2a) obj;
                ((m48) c2a4.v).o();
                jbd.c(c2a4.Z);
                hja o = jha.o(30, 30, TimeUnit.MILLISECONDS, qe.a());
                or7 or7 = new or7(new b2a(c2a4, 0), m58.g, m58.e);
                o.a(or7);
                c2a4.Z = or7;
                return;
            case 21:
                j05 j05 = ((cfb) obj).b;
                ArrayList arrayList = j05.d;
                if (!arrayList.isEmpty()) {
                    pa paVar = (pa) a81.h(1, arrayList);
                    n05 n05 = j05.a;
                    paVar.a(n05);
                    arrayList.remove(paVar);
                    j05.e.add(paVar);
                    n05.invalidate();
                    j05.b();
                    return;
                }
                return;
            case 22:
                ((ActPhotoEditor) ((cfb) obj).c).T();
                return;
            case 23:
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) ((cfb) obj).c;
                if (((Boolean) actPhotoEditor.D0.getValue()).booleanValue()) {
                    actPhotoEditor.U((cl4) null);
                    return;
                } else {
                    ScheduledSendPickerDialogFragment.f3(actPhotoEditor.v(), "ru.ok.messages.photoeditor.ActPhotoEditor");
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ActPhotoEditor actPhotoEditor2 = (ActPhotoEditor) ((cfb) obj).c;
                actPhotoEditor2.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", qad.j7);
                bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.m7);
                bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.L2(bundle);
                confirmationDialog.Y2(actPhotoEditor2.v(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
                return;
            case 25:
                cfb cfb = (cfb) obj;
                j05 j052 = cfb.b;
                boolean z3 = !j052.a().o;
                ffb ffb = cfb.e;
                ffb.getClass();
                ffb ffb2 = new ffb(ffb.a, ffb.b, ffb.c, ffb.o, z3, ffb.w, ffb.x);
                cfb.e = ffb2;
                cfb.a.a(ffb2);
                j052.a.setDrawStickerEnabled(z3);
                cfb.d.a(j052, j052.a(), false);
                ActPhotoEditor actPhotoEditor3 = (ActPhotoEditor) cfb.c;
                if (z3) {
                    if (actPhotoEditor3.C0 == null) {
                        actPhotoEditor3.C0 = new d6a(9, (Object) ((qra) ((id3) actPhotoEditor3.x.b)).c());
                    }
                    ((nd) actPhotoEditor3.C0.b).e("DRAW_AS_STICKER_TAP");
                    return;
                }
                if (actPhotoEditor3.C0 == null) {
                    actPhotoEditor3.C0 = new d6a(9, (Object) ((qra) ((id3) actPhotoEditor3.x.b)).c());
                }
                ((nd) actPhotoEditor3.C0.b).e("DRAW_REGULAR_TAP");
                return;
            case 26:
                ((xc0) obj).d = Integer.valueOf(lyc.k0.d);
                return;
            default:
                Uri uri = (Uri) obj;
                return;
        }
    }
}
