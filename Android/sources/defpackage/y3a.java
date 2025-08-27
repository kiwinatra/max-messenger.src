package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.PickerChatsTabWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.FloatingVideoView;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;
import ru.ok.messages.views.widgets.profiledescription.ProfileDescriptionView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y3a  reason: default package */
public final /* synthetic */ class y3a implements vla, u2f, nsb, hqa, RTCStatsCollectorCallback, zi6, qk3, x66, xr5, vu, knd, ay0, eo1, lbd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(fqa fqa) {
        ((View.OnClickListener) this.b).onClick(fqa);
    }

    public void accept(Object obj) {
        String str;
        Object obj2 = this.b;
        switch (this.a) {
            case 7:
                ((g7a) obj2).d = (if0) obj;
                return;
            case 8:
                ((zc4) obj2).getClass();
                z68.f("zc4", "onError", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                rgf rgf = (rgf) obj;
                yy yyVar = (yy) obj2;
                ProfileDescriptionView profileDescriptionView = (ProfileDescriptionView) yyVar.c;
                String currentDescription = profileDescriptionView.getCurrentDescription();
                Context context = profileDescriptionView.getContext();
                Lazy lazy = scf.b0;
                int i = j4b.k0(context).N;
                int length = currentDescription.length();
                int i2 = yyVar.b;
                if (length >= i2) {
                    i = j4b.k0(profileDescriptionView.getContext()).z;
                    str = "0";
                } else {
                    int i3 = i2 - length;
                    str = i3 <= Math.min(yyVar.a, i2) ? String.valueOf(i3) : null;
                }
                if (TextUtils.isEmpty(str)) {
                    profileDescriptionView.a.setVisibility(8);
                    return;
                }
                profileDescriptionView.a.setText(str);
                profileDescriptionView.a.setTextColor(i);
                profileDescriptionView.a.setVisibility(0);
                return;
            case 16:
                n09 n09 = (n09) obj2;
                n09.getClass();
                z68.f("n09", "capturePhoto: Can't capturePhoto", (Throwable) obj);
                hi7.a0(qad.n0, ((FrgBaseProfile) n09.y).O1());
                return;
            case 20:
                v7b v7b = (v7b) obj;
                RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) obj2;
                rangeSeekBarView.E0.append(((Long) v7b.a).longValue(), (Bitmap) v7b.b);
                rangeSeekBarView.invalidate();
                return;
            default:
                jmd jmd = (jmd) obj;
                jkd jkd = (jkd) obj2;
                jkd.getClass();
                boolean z = jmd.c;
                CharSequence charSequence = jmd.b;
                if (z) {
                    ikd b2 = jkd.b();
                    if (b2 != null) {
                        b2.A0(charSequence.toString());
                        return;
                    }
                    return;
                }
                String charSequence2 = charSequence.toString();
                if (!TextUtils.equals(charSequence2, jkd.w)) {
                    jkd.w = charSequence2;
                    ikd b3 = jkd.b();
                    if (b3 != null) {
                        b3.Y0(charSequence2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public zz7 m1627apply(Object obj) {
        Void voidR = (Void) obj;
        return ((eub) this.b).d.o();
    }

    public void b(long j, long j2, long j3) {
        kt4 kt4 = ((r7c) this.b).e;
        if (kt4 != null) {
            ((dt4) kt4).b((j == -1 || j == 0) ? -1.0f : (((float) j2) * 100.0f) / ((float) j), j, j2);
        }
    }

    public Widget c(String str, b bVar) {
        Object obj = this.b;
        switch (this.a) {
            case 9:
                KProperty[] kPropertyArr = PickerChatsTabWidget.Z;
                PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) obj;
                pickerChatsTabWidget.getClass();
                KProperty kProperty = PickerChatsTabWidget.Z[0];
                PickerChatsListWidget pickerChatsListWidget = new PickerChatsListWidget(str, ((egd) pickerChatsTabWidget.a.a(pickerChatsTabWidget)).a, (DefaultConstructorMarker) null);
                pickerChatsListWidget.x = bVar;
                if (pickerChatsListWidget.isAttached()) {
                    pickerChatsListWidget.e0().setRecycledViewPool(bVar);
                }
                return pickerChatsListWidget;
            default:
                KProperty[] kPropertyArr2 = PickerChatsTabWidget2.Z;
                PickerChatsTabWidget2 pickerChatsTabWidget2 = (PickerChatsTabWidget2) obj;
                pickerChatsTabWidget2.getClass();
                KProperty kProperty2 = PickerChatsTabWidget2.Z[0];
                PickerChatsListWidget2 pickerChatsListWidget2 = new PickerChatsListWidget2(str, ((egd) pickerChatsTabWidget2.a.a(pickerChatsTabWidget2)).a, false, 4, (DefaultConstructorMarker) null);
                pickerChatsListWidget2.x = bVar;
                if (pickerChatsListWidget2.isAttached()) {
                    pickerChatsListWidget2.f0().setRecycledViewPool(bVar);
                }
                return pickerChatsListWidget2;
        }
    }

    public void d(kne kne) {
        eu1 eu1;
        kub kub = (kub) this.b;
        kub.getClass();
        if ((kne instanceof wrg) && (eu1 = kub.y) != null) {
            wrg wrg = (wrg) kne;
            if (eu1.i() && eu1.s) {
                ev0.g();
                yrg yrg = (yrg) eu1.u.d();
                if (yrg != null) {
                    float c = yrg.c();
                    float f = wrg.o;
                    eu1.p(Math.min(Math.max(c * (f > 1.0f ? i2a.f(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), yrg.b()), yrg.a()));
                }
            }
        }
    }

    public void e(Parcelable parcelable, int i, int i2) {
        ((SpannableString) this.b).setSpan(parcelable, i, i2, 17);
    }

    public Object get() {
        e4a e4a = (e4a) this.b;
        e4a.getClass();
        StringBuilder sb = new StringBuilder("    ");
        int i = qad.H8;
        Context context = (Context) e4a.b;
        sb.append(context.getString(i));
        SpannableString spannableString = new SpannableString(sb.toString());
        Drawable b2 = ew3.b(context, nad.n0);
        if (b2 != null) {
            b2.setBounds(0, 0, b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
            b2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            spannableString.setSpan(new ImageSpan(b2), 0, 3, 17);
        }
        return spannableString;
    }

    public jnd j(int i) {
        int i2 = ((tzb) ((lz7) ((ProfileChangeLinkScreen) this.b).w.E(i))).i();
        if ((536870911 & i2) == 2048) {
            return null;
        }
        return tf6.U(i2) ? jnd.a : tf6.W(i2) ? jnd.b : tf6.V(i2) ? jnd.c : jnd.o;
    }

    public void l() {
        smb smb = (smb) this.b;
        FloatingVideoView floatingVideoView = smb.A0;
        if (floatingVideoView != null) {
            floatingVideoView.setVisibility(0);
        }
        smb.a(true);
    }

    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((one) this.b).a(new nne(rTCStatsReport));
    }

    public Object r(do1 do1) {
        jr1 jr1 = (jr1) this.b;
        jr1.c = do1;
        return "RequestCompleteListener[" + jr1 + "]";
    }

    public boolean test(Object obj) {
        int id = ((StatusBarNotification) obj).getId();
        ((jwa) ((pwa) this.b).d.getValue()).getClass();
        return id == 1 || Math.abs(id) > 1000;
    }

    public iog z(View view, iog iog) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                b4a b4a = (b4a) obj;
                b4a.getClass();
                if (!(1 == hd8.K((Context) b4a.b))) {
                    b4a.j0(0);
                } else {
                    gq4 e = iog.a.e();
                    if (e == null) {
                        b4a.j0(0);
                    } else {
                        DisplayCutout displayCutout = e.a;
                        if (fq4.b(displayCutout).isEmpty()) {
                            b4a.j0(0);
                        } else {
                            ViewGroup viewGroup = (ViewGroup) ((View) b4a.c);
                            View[] viewArr = {b4a.P0, b4a.Q0};
                            List<Rect> b2 = fq4.b(displayCutout);
                            if (!b2.isEmpty()) {
                                ArrayList arrayList = new ArrayList(2);
                                for (int i = 0; i < 2; i++) {
                                    View view2 = viewArr[i];
                                    Rect rect = new Rect();
                                    view2.getDrawingRect(rect);
                                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                                    arrayList.add(rect);
                                }
                                Iterable iterable = b2;
                                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                    Iterator it = iterable.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Rect rect2 = (Rect) it.next();
                                            if (!arrayList.isEmpty()) {
                                                Iterator it2 = arrayList.iterator();
                                                while (it2.hasNext()) {
                                                    if (rect2.intersect((Rect) it2.next())) {
                                                        b4a.j0(fq4.f(displayCutout));
                                                    }
                                                }
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return iog;
            default:
                m4a m4a = (m4a) obj;
                iq.s(m4a.x0, iog.b());
                ViewGroup viewGroup2 = m4a.x0;
                int c = iog.c();
                if (viewGroup2.getPaddingRight() != c) {
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), c, viewGroup2.getPaddingBottom());
                }
                iq.q(m4a.x0, iog.a());
                return iog;
        }
    }

    public /* synthetic */ y3a(cy3 cy3, d0d d0d) {
        this.a = 22;
        this.b = cy3;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return new if0(new BitmapDrawable((Resources) this.b, (Bitmap) obj));
            case 21:
                kuc kuc = (kuc) obj;
                kuc.getClass();
                return new qa3(2, new ni(23, kuc, (luc) this.b));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return (nh8) this.b;
            default:
                Cursor cursor = (Cursor) obj;
                nbd nbd = (nbd) this.b;
                nbd.getClass();
                while (cursor.moveToNext()) {
                    int i = cursor.getInt(0);
                    nbd.V((long) i, t78.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
        }
    }
}
