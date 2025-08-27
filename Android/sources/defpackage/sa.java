package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sa  reason: default package */
public final class sa extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                sa saVar = new sa(3, (Continuation) obj3, 0);
                saVar.c = (AppCompatEditText) obj;
                saVar.b = (k2b) obj2;
                return saVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                sa saVar2 = new sa((Object) (BaseBottomSheetWidget) this.c, (Continuation) obj3, 1);
                saVar2.b = (k2b) obj2;
                return saVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                sa saVar3 = new sa(3, (Continuation) obj3, 2);
                saVar3.c = (gr2) obj;
                saVar3.b = (lld) obj2;
                return saVar3.invokeSuspend(Unit.INSTANCE);
            case 3:
                sa saVar4 = new sa(3, (Continuation) obj3, 3);
                saVar4.c = (lm4) obj;
                saVar4.b = (k2b) obj2;
                return saVar4.invokeSuspend(Unit.INSTANCE);
            case 4:
                ds5 ds5 = (ds5) obj;
                sa saVar5 = new sa((Object) (ov2) this.b, (Continuation) obj3, 4, false);
                saVar5.c = (Throwable) obj2;
                return saVar5.invokeSuspend(Unit.INSTANCE);
            case 5:
                sa saVar6 = new sa(3, (Continuation) obj3, 5);
                saVar6.c = (ss2) obj;
                saVar6.b = (List) obj2;
                return saVar6.invokeSuspend(Unit.INSTANCE);
            case 6:
                k2b k2b = (k2b) obj2;
                sa saVar7 = new sa((Object) (ow3) this.b, (Continuation) obj3, 6, false);
                saVar7.c = (TextView) obj;
                return saVar7.invokeSuspend(Unit.INSTANCE);
            case 7:
                sa saVar8 = new sa(3, (Continuation) obj3, 7);
                saVar8.c = (c54) obj;
                saVar8.b = (k2b) obj2;
                return saVar8.invokeSuspend(Unit.INSTANCE);
            case 8:
                sa saVar9 = new sa(3, (Continuation) obj3, 8);
                saVar9.c = (azb) obj;
                saVar9.b = (List) obj2;
                return saVar9.invokeSuspend(Unit.INSTANCE);
            case 9:
                ViewGroup viewGroup = (ViewGroup) obj;
                k2b k2b2 = (k2b) obj2;
                return new sa((kbe) (q35) this.c, (Object) (Context) this.b, (Continuation) obj3, 9).invokeSuspend(Unit.INSTANCE);
            case 10:
                LinearLayout linearLayout = (LinearLayout) obj;
                sa saVar10 = new sa((Object) (up5) this.c, (Continuation) obj3, 10);
                saVar10.b = (k2b) obj2;
                return saVar10.invokeSuspend(Unit.INSTANCE);
            case 11:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                sa saVar11 = new sa((Object) (kz5) this.c, (Continuation) obj3, 11);
                saVar11.b = (k2b) obj2;
                return saVar11.invokeSuspend(Unit.INSTANCE);
            case 12:
                sa saVar12 = new sa(3, (Continuation) obj3, 12);
                saVar12.c = (ConstraintLayout) obj;
                saVar12.b = (k2b) obj2;
                return saVar12.invokeSuspend(Unit.INSTANCE);
            case 13:
                sa saVar13 = new sa(3, (Continuation) obj3, 13);
                saVar13.c = (occ) obj;
                saVar13.b = (k2b) obj2;
                return saVar13.invokeSuspend(Unit.INSTANCE);
            case Protos.Attaches.Attach.LOCATION:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                sa saVar14 = new sa((Object) (InviteByQrBottomSheet) this.c, (Continuation) obj3, 14);
                saVar14.b = (k2b) obj2;
                return saVar14.invokeSuspend(Unit.INSTANCE);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                sa saVar15 = new sa((Object) (xr7) this.c, (Continuation) obj3, 15);
                saVar15.b = (k2b) obj2;
                return saVar15.invokeSuspend(Unit.INSTANCE);
            case 16:
                sa saVar16 = new sa(3, (Continuation) obj3, 16);
                saVar16.c = (yt7) obj;
                saVar16.b = (k2b) obj2;
                return saVar16.invokeSuspend(Unit.INSTANCE);
            case LangUtils.HASH_SEED:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                sa saVar17 = new sa((Object) (GradientDrawable) this.c, (Continuation) obj3, 17);
                saVar17.b = (k2b) obj2;
                return saVar17.invokeSuspend(Unit.INSTANCE);
            case 18:
                View view = (View) obj;
                k2b k2b3 = (k2b) obj2;
                return new sa((kbe) (hg9) this.c, (Object) (View) this.b, (Continuation) obj3, 18).invokeSuspend(Unit.INSTANCE);
            case 19:
                sa saVar18 = new sa(3, (Continuation) obj3, 19);
                saVar18.c = (a32) obj;
                saVar18.b = (wj9) obj2;
                return saVar18.invokeSuspend(Unit.INSTANCE);
            case 20:
                k2b k2b4 = (k2b) obj2;
                sa saVar19 = new sa((Object) (MessagesListWidget) this.b, (Continuation) obj3, 20, false);
                saVar19.c = (EndlessRecyclerView2) obj;
                return saVar19.invokeSuspend(Unit.INSTANCE);
            case 21:
                sa saVar20 = new sa(3, (Continuation) obj3, 21);
                saVar20.c = (g7e) obj;
                saVar20.b = (k2b) obj2;
                return saVar20.invokeSuspend(Unit.INSTANCE);
            case 22:
                sa saVar21 = new sa(3, (Continuation) obj3, 22);
                saVar21.c = (fqd) obj;
                saVar21.b = (rnb) obj2;
                return saVar21.invokeSuspend(Unit.INSTANCE);
            case 23:
                k2b k2b5 = (k2b) obj2;
                sa saVar22 = new sa((Object) (Context) this.b, (Continuation) obj3, 23, false);
                saVar22.c = (OneMeEmptyView) obj;
                return saVar22.invokeSuspend(Unit.INSTANCE);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                sa saVar23 = new sa(3, (Continuation) obj3, 24);
                saVar23.c = (yza) obj;
                saVar23.b = (k2b) obj2;
                return saVar23.invokeSuspend(Unit.INSTANCE);
            case 25:
                sa saVar24 = new sa(3, (Continuation) obj3, 25);
                saVar24.c = (MiniPlayerView) obj;
                saVar24.b = (k2b) obj2;
                return saVar24.invokeSuspend(Unit.INSTANCE);
            case 26:
                sa saVar25 = new sa(3, (Continuation) obj3, 26);
                saVar25.c = (cxa) obj;
                saVar25.b = (k2b) obj2;
                return saVar25.invokeSuspend(Unit.INSTANCE);
            case 27:
                sa saVar26 = new sa(3, (Continuation) obj3, 27);
                saVar26.c = (svf) obj;
                saVar26.b = (k2b) obj2;
                return saVar26.invokeSuspend(Unit.INSTANCE);
            case 28:
                LinearLayout linearLayout4 = (LinearLayout) obj;
                sa saVar27 = new sa((Object) (ShapeDrawable) this.c, (Continuation) obj3, 28);
                saVar27.b = (k2b) obj2;
                return saVar27.invokeSuspend(Unit.INSTANCE);
            default:
                sa saVar28 = new sa(3, (Continuation) obj3, 29);
                saVar28.c = (ze1) obj;
                saVar28.b = (i9b) obj2;
                return saVar28.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        y8b y8b;
        int i2 = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i2) {
            case 0:
                ResultKt.throwOnFailure(obj);
                AppCompatEditText appCompatEditText = (AppCompatEditText) this.c;
                k2b k2b = (k2b) this.b;
                appCompatEditText.setTextColor(k2b.getText().e);
                appCompatEditText.setBackgroundColor(k2b.c().j);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = (k2b) this.b;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.c;
                k2b g0 = baseBottomSheetWidget.g0();
                if (g0 != null) {
                    k2b2 = g0;
                }
                baseBottomSheetWidget.f0().setBackground(new ColorDrawable(k2b2.c().f));
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                return TuplesKt.to((gr2) this.c, (lld) this.b);
            case 3:
                ResultKt.throwOnFailure(obj);
                ((lm4) this.c).onThemeChanged((k2b) this.b);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.c;
                if (!(th instanceof CancellationException)) {
                    z68.f(((ov2) this.b).H0, "observeChatsAndPresences fail", th);
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                return TuplesKt.to((ss2) this.c, (List) this.b);
            case 6:
                ResultKt.throwOnFailure(obj);
                TextView textView = (TextView) this.c;
                Integer num = ((ow3) this.b).c;
                js9 js9 = fu4.k;
                if (num != null) {
                    i = js9.f(textView).i(num.intValue());
                } else {
                    i = js9.f(textView).getText().e;
                }
                textView.setTextColor(i);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                c54 c54 = (c54) this.c;
                k2b k2b3 = (k2b) this.b;
                c54.b.setTextColor(k2b3.getText().e);
                EditText editText = c54.b;
                editText.setHintTextColor(k2b3.getText().h);
                editText.setBackground((Drawable) null);
                c54.c.setTextColor(k2b3.getText().f);
                c54.setBackgroundColor(k2b3.c().a.h);
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                return new wz4((azb) this.c, (List) this.b);
            case 9:
                ResultKt.throwOnFailure(obj);
                q35 q35 = (q35) this.c;
                iq.a0(q35.D0, fu4.k.e((Context) this.b).f().c().a.g);
                vx1 vx1 = q35.H0;
                if (vx1 != null) {
                    q35.P(vx1.c);
                }
                return Unit.INSTANCE;
            case 10:
                ResultKt.throwOnFailure(obj);
                k2b k2b4 = (k2b) this.b;
                up5 up5 = (up5) this.c;
                AppCompatEditText appCompatEditText2 = up5.D0;
                appCompatEditText2.setTextColor(k2b4.getText().e);
                appCompatEditText2.setHintTextColor(k2b4.getText().h);
                appCompatEditText2.setBackgroundColor(k2b4.c().f);
                Lazy lazy = up5.E0;
                if (lazy.isInitialized()) {
                    ((AppCompatTextView) lazy.getValue()).setTextColor(k2b4.getText().b);
                }
                return Unit.INSTANCE;
            case 11:
                ResultKt.throwOnFailure(obj);
                ((kz5) this.c).D0.onThemeChanged((k2b) this.b);
                return Unit.INSTANCE;
            case 12:
                ResultKt.throwOnFailure(obj);
                ((ConstraintLayout) this.c).setBackgroundColor(((k2b) this.b).c().i);
                return Unit.INSTANCE;
            case 13:
                ResultKt.throwOnFailure(obj);
                occ occ = (occ) this.c;
                occ.setBackgroundColor(fu4.k.f(occ).a().f().a.a);
                occ.onThemeChanged((k2b) this.b);
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION:
                ResultKt.throwOnFailure(obj);
                k2b k2b5 = (k2b) this.b;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.c;
                InviteByQrBottomSheet.q0(inviteByQrBottomSheet).setTextColor(k2b5.getText().e);
                InviteByQrBottomSheet.r0(inviteByQrBottomSheet).setTextColor(k2b5.getText().f);
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ResultKt.throwOnFailure(obj);
                k2b k2b6 = (k2b) this.b;
                xr7 xr7 = (xr7) this.c;
                AppCompatEditText appCompatEditText3 = xr7.D0;
                appCompatEditText3.setTextColor(k2b6.getText().e);
                appCompatEditText3.setHintTextColor(k2b6.getText().h);
                appCompatEditText3.setBackgroundColor(k2b6.c().f);
                Lazy lazy2 = xr7.E0;
                if (lazy2.isInitialized()) {
                    ((AppCompatTextView) lazy2.getValue()).setTextColor(k2b6.getText().b);
                }
                return Unit.INSTANCE;
            case 16:
                ResultKt.throwOnFailure(obj);
                ((yt7) this.c).c.setImageTintList(ColorStateList.valueOf(((k2b) this.b).getText().e));
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED:
                ResultKt.throwOnFailure(obj);
                ((k2b) this.b).c().getClass();
                iq.a0((GradientDrawable) this.c, -1728053248);
                return Unit.INSTANCE;
            case 18:
                ResultKt.throwOnFailure(obj);
                hg9 hg9 = (hg9) this.c;
                ig9 ig9 = hg9.F0;
                if (ig9 != null) {
                    boolean b2 = ct0.b(ig9.a & 2080374784);
                    hq2 a2 = fu4.k.f((View) this.b).a();
                    hg9.b(a2.a(b2));
                    hg9.k(a2.l());
                }
                return Unit.INSTANCE;
            case 19:
                ResultKt.throwOnFailure(obj);
                return TuplesKt.to((a32) this.c, (wj9) this.b);
            case 20:
                ResultKt.throwOnFailure(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
                nwe nwe = ((MessagesListWidget) this.b).C0;
                if (nwe != null) {
                    nwe.j();
                }
                endlessRecyclerView2.a0();
                return Unit.INSTANCE;
            case 21:
                ResultKt.throwOnFailure(obj);
                k2b k2b7 = (k2b) this.b;
                p3a p3a = new p3a(6);
                c7e c7e = (c7e) p3a.a;
                c7e.k = false;
                c7e.i = c44.DEFAULT_ASPECT_RATIO;
                p3a.x(k2b7.c().j);
                c7e.d = k2b7.c().i;
                p3a.w();
                p3a.z(MathKt.roundToInt(((float) 86) * vo4.c().getDisplayMetrics().density));
                ((g7e) this.c).a(p3a.q());
                return Unit.INSTANCE;
            case 22:
                ResultKt.throwOnFailure(obj);
                return new gqd((fqd) this.c, (rnb) this.b);
            case 23:
                ResultKt.throwOnFailure(obj);
                OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) this.c;
                fu4 e = fu4.k.e((Context) this.b);
                k2b L = oneMeEmptyView.getCurrentTheme();
                e.getClass();
                fu4.d(oneMeEmptyView, L);
                return Unit.INSTANCE;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ResultKt.throwOnFailure(obj);
                ((k2b) this.b).f().b.getClass();
                ((yza) this.c).c = 687865856;
                return Unit.INSTANCE;
            case 25:
                ResultKt.throwOnFailure(obj);
                int i3 = ((k2b) this.b).b().a.c;
                ((MiniPlayerView) this.c).setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, new ColorDrawable(-65536)));
                return Unit.INSTANCE;
            case 26:
                ResultKt.throwOnFailure(obj);
                int i4 = ((k2b) this.b).b().a.c;
                ((cxa) this.c).setBackground(new RippleDrawable(ColorStateList.valueOf(i4), (Drawable) null, new ColorDrawable(-65536)));
                return Unit.INSTANCE;
            case 27:
                ResultKt.throwOnFailure(obj);
                int i5 = ((k2b) this.b).b().a.c;
                ((svf) this.c).setBackground(new RippleDrawable(ColorStateList.valueOf(i5), (Drawable) null, new ColorDrawable(-65536)));
                return Unit.INSTANCE;
            case 28:
                ResultKt.throwOnFailure(obj);
                ((ShapeDrawable) this.c).getPaint().setColor(((k2b) this.b).h().j);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                ze1 ze1 = (ze1) this.c;
                i9b i9b = (i9b) this.b;
                int size = i9b.c.size();
                Map map = i9b.c;
                y8b y8b2 = i9b.a;
                if (size > 1) {
                    if (ze1 == null && (ze1 = i9b.d) == null) {
                        ze1 = i9b.e;
                    }
                    y8b = (y8b) map.get(ze1);
                    if (y8b == null) {
                        return y8b2;
                    }
                } else {
                    y8b = (y8b) CollectionsKt.firstOrNull(map.values());
                    if (y8b == null) {
                        return y8b2;
                    }
                    if (!y8b.a.k() && y8b2.a.b()) {
                        return y8b2;
                    }
                }
                return y8b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa(kbe kbe, Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = kbe;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa(Object obj, Continuation continuation, int i, boolean z) {
        super(3, continuation);
        this.a = i;
        this.b = obj;
    }
}
