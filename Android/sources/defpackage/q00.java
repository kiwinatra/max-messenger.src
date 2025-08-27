package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.messages.bots.ButtonsView;
import ru.ok.messages.calls.views.CallRendererView;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.mediabar.LocalPhotoView;
import ru.ok.messages.views.fragments.FrgProfilePhoto;
import ru.ok.onechat.reactions.ui.badge.ReactionsBadgeView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: q00  reason: default package */
public final class q00 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        View view;
        switch (this.a) {
            case 4:
                ((CallRendererView) this.b).w.b = 0;
                return true;
            case 6:
                gn1 gn1 = (gn1) this.b;
                dn1 dn1 = gn1.Z0;
                if (dn1 != null) {
                    dn1.m(gn1.e1);
                }
                return gn1.Z0 != null;
            case 7:
                WeakReference weakReference = ((q23) this.b).d;
                if (weakReference == null || (view = (View) weakReference.get()) == null) {
                    return false;
                }
                GestureDetector.OnDoubleTapListener onDoubleTapListener = view instanceof GestureDetector.OnDoubleTapListener ? (GestureDetector.OnDoubleTapListener) view : null;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return false;
            case 9:
                cs csVar = (cs) this.b;
                int i = csVar.b;
                if (i == 0) {
                    int i2 = i + 1;
                    csVar.b = i2;
                    kr4 kr4 = (kr4) csVar.c;
                    if (kr4 != null) {
                        kr4.t(i2);
                    }
                }
                return true;
            case 11:
                qr4 qr4 = (qr4) this.b;
                int i3 = qr4.c;
                if (i3 == 0) {
                    int i4 = i3 + 1;
                    qr4.c = i4;
                    pr4 pr4 = qr4.a;
                    if (pr4 != null) {
                        pr4.t(i4);
                    }
                }
                return true;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.b;
                gestureCropImageView.zoomImageToPosition(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
                return super.onDoubleTap(motionEvent);
            case 20:
                ((ReactionsBadgeView) this.b).getOnDoubleClickListener();
                return false;
            case 22:
                float x = motionEvent.getX();
                xrg xrg = (xrg) this.b;
                xrg.i = x;
                xrg.j = motionEvent.getY();
                xrg.k = 1;
                return true;
            case 23:
                ((ZoomableDraweeView) this.b).C0.a(motionEvent.getX(), motionEvent.getY());
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 7:
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                q23 q23 = (q23) this.b;
                q23.g = false;
                Spannable spannable = q23.e;
                if (spannable == null) {
                    return false;
                }
                WeakReference weakReference = q23.d;
                q23.f = q23.a(q23, weakReference != null ? (View) weakReference.get() : null, spannable, motionEvent);
                return q23.f != null;
            case 8:
                ((ia4) this.b).c = false;
                return true;
            case 12:
                return true;
            case 13:
                return true;
            case 16:
                dc9 dc9 = (dc9) this.b;
                Editable text = dc9.c.getText();
                if (text == null) {
                    return false;
                }
                ub9.a.onTouchEvent(dc9.c, text, motionEvent);
                return false;
            case LangUtils.HASH_SEED:
                return true;
            case 19:
                return true;
            case 20:
                return true;
            case 23:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 8:
                ((ia4) this.b).a.P((int) f, (int) f2);
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLongPress(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            int r1 = r10.a
            switch(r1) {
                case 5: goto L_0x00b3;
                case 6: goto L_0x0098;
                case 7: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            super.onLongPress(r11)
            return
        L_0x000b:
            q23 r0 = (defpackage.q23) r0
            java.lang.ref.WeakReference r10 = r0.d
            if (r10 == 0) goto L_0x0097
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L_0x001b
            goto L_0x0097
        L_0x001b:
            android.text.Spannable r1 = r0.e
            if (r1 != 0) goto L_0x0021
            goto L_0x0097
        L_0x0021:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0029
            goto L_0x0097
        L_0x0029:
            android.text.style.ClickableSpan r4 = defpackage.q23.a(r0, r10, r1, r11)
            boolean r10 = r4 instanceof android.text.style.URLSpan
            if (r10 == 0) goto L_0x003e
            sy7 r10 = defpackage.sy7.a
            r2 = r4
            android.text.style.URLSpan r2 = (android.text.style.URLSpan) r2
            java.lang.String r2 = r2.getURL()
            r0.c = r2
        L_0x003c:
            r8 = r10
            goto L_0x0078
        L_0x003e:
            boolean r10 = r4 instanceof defpackage.ky7
            if (r10 == 0) goto L_0x004c
            sy7 r10 = defpackage.sy7.w
            r2 = r4
            ky7 r2 = (defpackage.ky7) r2
            java.lang.String r2 = r2.b
            r0.c = r2
            goto L_0x003c
        L_0x004c:
            boolean r10 = r4 instanceof defpackage.xa9
            if (r10 == 0) goto L_0x0097
            r10 = r4
            xa9 r10 = (defpackage.xa9) r10
            ta9 r10 = r10.a
            sa9 r2 = r10.c
            sa9 r3 = defpackage.sa9.a
            if (r2 != r3) goto L_0x0097
            sy7 r2 = defpackage.sy7.v
            int r10 = r10.e
            r10 = r4
            xa9 r10 = (defpackage.xa9) r10     // Catch:{ all -> 0x0097 }
            ta9 r10 = r10.a     // Catch:{ all -> 0x0097 }
            int r10 = r10.d     // Catch:{ all -> 0x0097 }
            r3 = r4
            xa9 r3 = (defpackage.xa9) r3     // Catch:{ all -> 0x0097 }
            ta9 r3 = r3.a     // Catch:{ all -> 0x0097 }
            int r3 = r3.e     // Catch:{ all -> 0x0097 }
            java.lang.CharSequence r10 = r1.subSequence(r10, r3)     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0097 }
            r0.c = r10     // Catch:{ all -> 0x0097 }
            r8 = r2
        L_0x0078:
            r0.f = r4
            java.lang.String r7 = r0.c
            if (r7 != 0) goto L_0x007f
            goto L_0x0097
        L_0x007f:
            int r10 = r7.length()
            if (r10 != 0) goto L_0x0086
            goto L_0x0097
        L_0x0086:
            int r5 = r1.getSpanStart(r4)
            int r6 = r1.getSpanEnd(r4)
            p23 r3 = r0.a
            r9 = r11
            r3.f(r4, r5, r6, r7, r8, r9)
            r10 = 1
            r0.g = r10
        L_0x0097:
            return
        L_0x0098:
            gn1 r0 = (defpackage.gn1) r0
            dn1 r10 = r0.Z0
            if (r10 == 0) goto L_0x00b2
            ze1 r0 = r0.e1
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r11.getRawX()
            int r2 = (int) r2
            float r11 = r11.getRawY()
            int r11 = (int) r11
            r1.<init>(r2, r11)
            r10.k(r0, r1)
        L_0x00b2:
            return
        L_0x00b3:
            tm1 r0 = (defpackage.tm1) r0
            rm1 r10 = r0.b1
            if (r10 == 0) goto L_0x00d7
            ze1 r0 = r0.d1
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r11.getX()
            int r2 = (int) r2
            float r11 = r11.getY()
            int r11 = (int) r11
            r1.<init>(r2, r11)
            nh1 r10 = (defpackage.nh1) r10
            gga r11 = one.me.calls.ui.ui.call.CallScreen.J0
            one.me.calls.ui.ui.call.CallScreen r10 = r10.a
            jj1 r10 = r10.p0()
            r10.r(r0, r1)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q00.onLongPress(android.view.MotionEvent):void");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 8:
                ia4 ia4 = (ia4) this.b;
                ia4.c = true;
                ia4.a.scrollBy((int) f, (int) f2);
                return true;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((GestureCropImageView) this.b).postTranslate(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        r00 r00;
        Function0 function0;
        kr4 kr4;
        pr4 pr4;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                AttachPhotoView attachPhotoView = (AttachPhotoView) obj;
                if (!attachPhotoView.H0.f(attachPhotoView.getMeasuredWidth() / 2, attachPhotoView.getMeasuredHeight() / 2, motionEvent) && (r00 = attachPhotoView.G0) != null) {
                    ((FrgAttachPhoto) r00).t3(attachPhotoView.O0);
                }
                return true;
            case 4:
                int i = CallRendererView.y0;
                ((CallRendererView) obj).getClass();
                return true;
            case 5:
                tm1 tm1 = (tm1) obj;
                rm1 rm1 = tm1.b1;
                if (rm1 != null) {
                    gga gga = CallScreen.J0;
                    CallScreen callScreen = ((nh1) rm1).a;
                    if (callScreen.p0().j(callScreen.l0().g)) {
                        CallScreen.f0(callScreen);
                    }
                }
                return tm1.b1 != null;
            case 6:
                gn1 gn1 = (gn1) obj;
                dn1 dn1 = gn1.Z0;
                if (dn1 != null) {
                    dn1.o(gn1.e1);
                }
                return gn1.Z0 != null;
            case 7:
                q23 q23 = (q23) obj;
                WeakReference weakReference = q23.d;
                View view = weakReference != null ? (View) weakReference.get() : null;
                ClickableSpan clickableSpan = q23.f;
                if (clickableSpan == null || view == null) {
                    q23.g = false;
                    if (!(clickableSpan != null || view == null || (function0 = q23.h) == null)) {
                        if (function0 != null) {
                            function0.invoke();
                        }
                        WeakReference weakReference2 = q23.d;
                        if (weakReference2 != null) {
                            weakReference2.clear();
                        }
                        q23.d = null;
                    }
                } else {
                    if (!q23.g) {
                        clickableSpan.onClick(view);
                    }
                    WeakReference weakReference3 = q23.d;
                    if (weakReference3 != null) {
                        weakReference3.clear();
                    }
                    q23.d = null;
                    q23.f = null;
                    q23.e = null;
                    q23.c = null;
                    q23.g = false;
                }
                return true;
            case 9:
                cs csVar = (cs) obj;
                if (csVar.b == 0 && (kr4 = (kr4) csVar.c) != null) {
                    kr4.e();
                }
                return true;
            case 10:
                xga xga = (xga) ((nr4) obj).e;
                xga.getClass();
                KProperty[] kPropertyArr = VideoViewerWidget.X;
                j9g e0 = ((VideoViewerWidget) xga.b).e0();
                if (e0 != null) {
                    ((ChatMediaViewerScreen) e0).v0(true);
                }
                return super.onSingleTapConfirmed(motionEvent);
            case 11:
                qr4 qr4 = (qr4) obj;
                if (qr4.c == 0 && (pr4 = qr4.a) != null) {
                    pr4.e();
                }
                return true;
            case 12:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) obj;
                if (frgContactAvatar.I1) {
                    frgContactAvatar.I1 = false;
                } else if (frgContactAvatar.h3() != null) {
                    frgContactAvatar.h3().c();
                }
                return true;
            case 13:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) obj;
                if (frgProfilePhoto.h3() != null) {
                    frgProfilePhoto.h3().c();
                }
                return true;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int i2 = LocalPhotoView.G0;
                z68.a("ru.ok.messages.media.mediabar.LocalPhotoView", "onSingleTapConfirmed");
                c58 c58 = ((LocalPhotoView) obj).F0;
                if (c58 != null) {
                    c58.e();
                }
                return true;
            case LangUtils.HASH_SEED:
                ve9 ve9 = (ve9) obj;
                if (ve9.c != null && ve9.a() && fqc.k((double) (ve9.getMeasuredWidth() / 2), (double) (ve9.getMeasuredHeight() / 2), (double) motionEvent.getX(), (double) motionEvent.getY()) <= ((double) ve9.a) / 2.0d) {
                    ve9.y.a(ve9.b, ve9.c.q, ve9.x);
                }
                return true;
            case 18:
                x2a x2a = ((m0a) obj).z;
                if (x2a != null) {
                    x2a.N(new zj0(21));
                }
                return super.onSingleTapConfirmed(motionEvent);
            case 19:
                kfb kfb = ((lfb) obj).G0;
                if (kfb != null) {
                    kfb.l();
                }
                return true;
            case 20:
                return ((ReactionsBadgeView) obj).performClick();
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        iw0 iw0;
        cg7 cg7;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                ButtonsView buttonsView = (ButtonsView) obj;
                xv0 xv0 = buttonsView.A0;
                if (!(xv0 == null || (iw0 = buttonsView.z0) == null || xv0.y)) {
                    iw0.a(xv0, buttonsView.B0);
                }
                buttonsView.A0 = null;
                buttonsView.B0 = null;
                buttonsView.invalidate();
                return true;
            case 2:
                lw0 lw0 = (lw0) obj;
                jw0 jw0 = lw0.x0;
                xv0 xv02 = lw0.y0;
                dw0 dw0 = lw0.z0;
                if (!(jw0 == null || xv02 == null || dw0 == null || xv02.y)) {
                    dg7 dg7 = (dg7) jw0;
                    a94 a94 = dg7.x;
                    if (a94.b) {
                        a94.b = false;
                        zf7 zf7 = dg7.o;
                        if (!(zf7 == null || (cg7 = dg7.w) == null)) {
                            long j = dg7.c;
                            KProperty[] kPropertyArr = MessagesListWidget.R0;
                            en9 k0 = ((MessagesListWidget) ((td8) cg7).b).k0();
                            q04 b2 = ((osa) k0.w).b();
                            f14 f14 = f14.b;
                            il9 il9 = r5;
                            il9 il92 = new il9(xv02, k0, j, zf7, dw0, (Continuation) null);
                            k0.G(ev0.u(k0.a, b2, f14, il9));
                        }
                        Unit unit = Unit.INSTANCE;
                        dg7.postDelayed(new cf(14, (nm1) a94.c), a94.a);
                    }
                }
                lw0.y0 = null;
                lw0.z0 = null;
                lw0.invalidate();
                return true;
            case 3:
                MotionEvent motionEvent2 = motionEvent;
                q61 q61 = (q61) obj;
                if (q61.b.b.H(motionEvent.getX(), motionEvent.getY()) == null) {
                    q61.b.c.a();
                }
                return false;
            case 7:
                MotionEvent motionEvent3 = motionEvent;
                q23 q23 = (q23) obj;
                if (!q23.i) {
                    onSingleTapConfirmed(motionEvent);
                } else {
                    Runnable runnable = q23.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                return false;
            case 9:
                cs csVar = (cs) obj;
                int i = csVar.b;
                if (i > 0) {
                    int i2 = i + 1;
                    csVar.b = i2;
                    kr4 kr4 = (kr4) csVar.c;
                    if (kr4 != null) {
                        kr4.t(i2);
                    }
                }
                return true;
            case 11:
                qr4 qr4 = (qr4) obj;
                int i3 = qr4.c;
                if (i3 > 0) {
                    int i4 = i3 + 1;
                    qr4.c = i4;
                    pr4 pr4 = qr4.a;
                    if (pr4 != null) {
                        pr4.t(i4);
                    }
                }
                return true;
            case 16:
                dc9 dc9 = (dc9) obj;
                Editable text = dc9.c.getText();
                if (text != null) {
                    ub9.a.onTouchEvent(dc9.c, text, motionEvent);
                }
                return false;
            case 21:
                r1e r1e = (r1e) obj;
                if (!r1e.M0.isInitialized() || ((z1b) r1e.M0.getValue()).isEnabled()) {
                    return false;
                }
                n1e n1e = r1e.P0;
                if (n1e != null) {
                    n1e.s(r1e.getModelItem().getItemId());
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
