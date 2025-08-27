package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.media.ChatMediaTabWidget;
import ru.ok.messages.stickers.widgets.StickersView;

/* renamed from: gi0  reason: default package */
public final class gi0 extends xbg {
    public final /* synthetic */ int a;
    public final Object b;

    public gi0() {
        this.a = 5;
        this.b = new ArrayList(3);
    }

    public void a(int i) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((xbg) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 7:
                ((we8) this.b).f(false);
                return;
            default:
                return;
        }
    }

    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((xbg) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    public final void c(int i) {
        ph0 ph0;
        View[] viewArr;
        View[] viewArr2;
        switch (this.a) {
            case 0:
                hi0 hi0 = (hi0) this.b;
                zs3 zs3 = (zs3) ((ov) hi0.E0.o).f.get(i);
                rh0 J = y64.J(zs3.a);
                int ordinal = zs3.a.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2 || ordinal == 3) {
                            ph0 = ph0.MEDIUM;
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    ph0 = ph0.SMALL;
                } else {
                    ph0 = ph0.LARGE;
                }
                ph0 ph02 = ph0;
                oh0 oh0 = hi0.E0.j() == 1 ? oh0.BANNER : oh0.CAROUSEL;
                fi0 fi0 = hi0.D0;
                Integer d = ((z5a) fi0.c.getValue()).d();
                if (d != null) {
                    int intValue = d.intValue();
                    long B = ((a33) ((x23) fi0.a.getValue())).B();
                    int hashCode = oh0.hashCode() + ((ph02.hashCode() + (((J.hashCode() * 961) + intValue) * 31)) * 31);
                    int ordinal2 = J.ordinal();
                    long j = -1;
                    if (ordinal2 == 0) {
                        cz9 cz9 = fi0.e;
                        int a2 = cz9.a(hashCode);
                        if (a2 >= 0) {
                            j = cz9.c[a2];
                        }
                        if (j != B) {
                            cz9.d(hashCode, B);
                        } else {
                            return;
                        }
                    } else if (ordinal2 == 1) {
                        cz9 cz92 = fi0.d;
                        int a3 = cz92.a(hashCode);
                        if (a3 >= 0) {
                            j = cz92.c[a3];
                        }
                        if (j != B) {
                            cz92.d(hashCode, B);
                        } else {
                            return;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    fi0.b("showed", B, J, intValue, ph02, oh0);
                    return;
                }
                return;
            case 1:
                a61.L((a61) this.b, i);
                return;
            case 2:
                ChatMediaTabWidget chatMediaTabWidget = (ChatMediaTabWidget) this.b;
                z5a.g((z5a) chatMediaTabWidget.c.getValue(), ChatMediaTabWidget.c0(chatMediaTabWidget));
                return;
            case 3:
                KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
                aj2 r0 = ((ChatMediaViewerScreen) this.b).r0();
                r0.Y0.setValue(r0, aj2.b1[1], ev0.u(r0.a, ((osa) r0.z).a(), f14.b, new ii2(r0, i, (Continuation) null)));
                return;
            case 4:
                KProperty[] kPropertyArr2 = ChatsTabWidget.z0;
                if (((Number) ((ChatsTabWidget) this.b).f0().Z.a.getValue()).intValue() != i) {
                    String str = ((ChatsTabWidget) this.b).b;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.o, str, wj6.h(i, "ONEME-6453|chats_list_lf | tabs page selected, pos:"), (Throwable) null);
                    }
                    h8b h0 = ((ChatsTabWidget) this.b).h0();
                    ((z5a) ((ChatsTabWidget) this.b).Y.getValue()).f(jgd.CHATS_LIST_TAB, new h8b(h0.a, s5a.FOLDER_CHANGE, h0.c, h0.d));
                    ((ChatsTabWidget) this.b).g0(i);
                }
                w86 f0 = ((ChatsTabWidget) this.b).f0();
                Integer valueOf = Integer.valueOf(i);
                xme xme = f0.Y;
                xme.getClass();
                xme.m((Object) null, valueOf);
                return;
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((xbg) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
                e54 e54 = (e54) this.b;
                e9d e9d = (e9d) e54.y.get(i);
                int i2 = e54.z;
                if (i != i2) {
                    e9d e9d2 = (e9d) e54.y.get(i2);
                    if (e9d2 != null) {
                        Iterator it2 = e9d2.e().iterator();
                        while (it2.hasNext()) {
                            ((i9d) it2.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (e9d != null) {
                        Iterator it3 = e9d.e().iterator();
                        while (it3.hasNext()) {
                            ((i9d) it3.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    e54.z = i;
                    return;
                }
                return;
            case 7:
                ((we8) this.b).f(false);
                return;
            case 8:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                ar7 ar7 = (ar7) CollectionsKt.getOrNull((List) mediaKeyboardWidget.Z.b, i);
                if (ar7 != null) {
                    sr8 sr8 = (sr8) mediaKeyboardWidget.c.getValue();
                    sr8.getClass();
                    xag.h(sr8.v, new mr8(ar7));
                    ar7 ar72 = ar7.EMOJI;
                    ReadOnlyProperty readOnlyProperty = mediaKeyboardWidget.X;
                    ReadOnlyProperty readOnlyProperty2 = mediaKeyboardWidget.y;
                    ReadOnlyProperty readOnlyProperty3 = mediaKeyboardWidget.z;
                    if (ar7 == ar72) {
                        KProperty[] kPropertyArr3 = MediaKeyboardWidget.A0;
                        viewArr2 = new View[]{(View) readOnlyProperty3.getValue(mediaKeyboardWidget, kPropertyArr3[6])};
                        viewArr = new View[]{(View) readOnlyProperty2.getValue(mediaKeyboardWidget, kPropertyArr3[5]), (View) readOnlyProperty.getValue(mediaKeyboardWidget, kPropertyArr3[7])};
                    } else {
                        KProperty[] kPropertyArr4 = MediaKeyboardWidget.A0;
                        viewArr2 = new View[]{(View) readOnlyProperty2.getValue(mediaKeyboardWidget, kPropertyArr4[5]), (View) readOnlyProperty.getValue(mediaKeyboardWidget, kPropertyArr4[7])};
                        viewArr = new View[]{(View) readOnlyProperty3.getValue(mediaKeyboardWidget, kPropertyArr4[6])};
                    }
                    AnimatorSet animatorSet = mediaKeyboardWidget.z0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                    ofFloat.addUpdateListener(new bn(4, ofFloat, viewArr2));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
                    ofFloat2.addUpdateListener(new bn(4, ofFloat2, viewArr));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet2.addListener(new xh(animatorSet2, new zr8(viewArr2, 0), 1));
                    animatorSet2.addListener(new xh(animatorSet2, new zr8(viewArr, 1), 0));
                    animatorSet2.setDuration(200);
                    animatorSet2.start();
                    mediaKeyboardWidget.z0 = animatorSet2;
                }
                mediaKeyboardWidget.e0().post(new y86(26, (Object) mediaKeyboardWidget));
                return;
            case 9:
                e54 e542 = (e54) this.b;
                e9d e9d3 = (e9d) e542.y.get(i);
                int i3 = e542.z;
                if (i != i3) {
                    e9d e9d4 = (e9d) e542.y.get(i3);
                    if (e9d4 != null) {
                        Iterator it4 = e9d4.e().iterator();
                        while (it4.hasNext()) {
                            ((i9d) it4.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (e9d3 != null) {
                        Iterator it5 = e9d3.e().iterator();
                        while (it5.hasNext()) {
                            ((i9d) it5.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    e542.z = i;
                    return;
                }
                return;
            default:
                StickersView stickersView = (StickersView) this.b;
                if (!stickersView.y0) {
                    stickersView.y0 = true;
                    return;
                }
                nve nve = stickersView.a;
                if (nve != null) {
                    ((j4a) nve).e0();
                    ((j4a) stickersView.a).f0();
                }
                ose ose = (ose) stickersView.z0.get(i);
                stickersView.w0.a.l("app.stickers.tab.default", ose.a);
                int ordinal3 = ose.ordinal();
                d6a d6a = stickersView.x0;
                if (ordinal3 == 0) {
                    ((nd) d6a.b).e("STICKERS_BUTTON_TAP");
                    return;
                } else if (ordinal3 == 1) {
                    ((nd) d6a.b).e("GIFS_BUTTON_TAP");
                    return;
                } else if (ordinal3 != 2) {
                    int i4 = StickersView.A0;
                    Locale locale = Locale.ENGLISH;
                    z68.f("ru.ok.messages.stickers.widgets.StickersView", "Unknown input type " + ose, (Throwable) null);
                    return;
                } else {
                    ((nd) d6a.b).e("STICKER_SETS_BUTTON_TAP");
                    return;
                }
        }
    }

    public /* synthetic */ gi0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
