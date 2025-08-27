package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: qrb  reason: default package */
public final class qrb extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                k2b k2b = (k2b) obj2;
                qrb qrb = new qrb((Object) (rrb) this.b, (Continuation) obj3, 0);
                qrb.c = (ImageView) obj;
                return qrb.invokeSuspend(Unit.INSTANCE);
            case 1:
                k2b k2b2 = (k2b) obj2;
                qrb qrb2 = new qrb((Object) (rrb) this.b, (Continuation) obj3, 1);
                qrb2.c = (AppCompatTextView) obj;
                return qrb2.invokeSuspend(Unit.INSTANCE);
            case 2:
                k2b k2b3 = (k2b) obj2;
                qrb qrb3 = new qrb((Object) (Context) this.b, (Continuation) obj3, 2);
                qrb3.c = (srb) obj;
                return qrb3.invokeSuspend(Unit.INSTANCE);
            case 3:
                k2b k2b4 = (k2b) obj2;
                qrb qrb4 = new qrb((Object) (urc) this.b, (Continuation) obj3, 3);
                qrb4.c = (RecyclerView) obj;
                return qrb4.invokeSuspend(Unit.INSTANCE);
            case 4:
                qrb qrb5 = new qrb(3, (Continuation) obj3, 4);
                qrb5.c = (guc) obj;
                qrb5.b = (k2b) obj2;
                return qrb5.invokeSuspend(Unit.INSTANCE);
            case 5:
                k2b k2b5 = (k2b) obj2;
                qrb qrb6 = new qrb((Object) (RecordControlsWidget) this.b, (Continuation) obj3, 5);
                qrb6.c = (ImageView) obj;
                return qrb6.invokeSuspend(Unit.INSTANCE);
            case 6:
                k2b k2b6 = (k2b) obj2;
                qrb qrb7 = new qrb((Object) (RecordControlsWidget) this.b, (Continuation) obj3, 6);
                qrb7.c = (TextView) obj;
                return qrb7.invokeSuspend(Unit.INSTANCE);
            case 7:
                k2b k2b7 = (k2b) obj2;
                qrb qrb8 = new qrb((Object) (View) this.b, (Continuation) obj3, 7);
                qrb8.c = (View) obj;
                return qrb8.invokeSuspend(Unit.INSTANCE);
            case 8:
                k2b k2b8 = (k2b) obj2;
                qrb qrb9 = new qrb((Object) (SearchMessageBottomWidget) this.b, (Continuation) obj3, 8);
                qrb9.c = (ConstraintLayout) obj;
                return qrb9.invokeSuspend(Unit.INSTANCE);
            case 9:
                qrb qrb10 = new qrb(3, (Continuation) obj3, 9);
                qrb10.c = (List) obj;
                qrb10.b = (wk6) obj2;
                return qrb10.invokeSuspend(Unit.INSTANCE);
            case 10:
                qrb qrb11 = new qrb(3, (Continuation) obj3, 10);
                qrb11.c = (cqd) obj;
                qrb11.b = (k2b) obj2;
                return qrb11.invokeSuspend(Unit.INSTANCE);
            case 11:
                k2b k2b9 = (k2b) obj2;
                qrb qrb12 = new qrb((Object) (ypd) this.b, (Continuation) obj3, 11);
                qrb12.c = (ConstraintLayout) obj;
                return qrb12.invokeSuspend(Unit.INSTANCE);
            case 12:
                LinearLayout linearLayout = (LinearLayout) obj;
                qrb qrb13 = new qrb((Object) (v7e) this.b, (Continuation) obj3, 12);
                qrb13.c = (k2b) obj2;
                return qrb13.invokeSuspend(Unit.INSTANCE);
            case 13:
                qrb qrb14 = new qrb(3, (Continuation) obj3, 13);
                qrb14.c = (AppCompatImageView) obj;
                qrb14.b = (k2b) obj2;
                return qrb14.invokeSuspend(Unit.INSTANCE);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) obj;
                k2b k2b10 = (k2b) obj2;
                return new qrb((vre) this.c, (Context) this.b, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                View view = (View) obj;
                qrb qrb15 = new qrb((Object) (SuggestionsWidget) this.b, (Continuation) obj3, 15);
                qrb15.c = (k2b) obj2;
                return qrb15.invokeSuspend(Unit.INSTANCE);
            case 16:
                k2b k2b11 = (k2b) obj2;
                qrb qrb16 = new qrb((Object) (View) this.b, (Continuation) obj3, 16);
                qrb16.c = (ImageView) obj;
                return qrb16.invokeSuspend(Unit.INSTANCE);
            case LangUtils.HASH_SEED:
                ds5 ds5 = (ds5) obj;
                qrb qrb17 = new qrb((Object) (UploadFileAttachWorker) this.b, (Continuation) obj3, 17);
                qrb17.c = (Throwable) obj2;
                return qrb17.invokeSuspend(Unit.INSTANCE);
            default:
                k2b k2b12 = (k2b) obj2;
                qrb qrb18 = new qrb((Object) (VideoMessageWidget) this.b, (Continuation) obj3, 18);
                qrb18.c = (TextView) obj;
                return qrb18.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3 = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i3) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ImageView imageView = (ImageView) this.c;
                rrb rrb = (rrb) this.b;
                Integer num = rrb.b;
                if (num != null) {
                    i = rrb.getCurrentTheme().i(num.intValue());
                } else {
                    i = rrb.getCurrentTheme().getIcon().f;
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.c;
                rrb rrb2 = (rrb) this.b;
                Integer num2 = rrb2.b;
                if (num2 != null) {
                    i2 = rrb2.getCurrentTheme().i(num2.intValue());
                } else {
                    i2 = rrb2.getCurrentTheme().getText().e;
                }
                appCompatTextView.setTextColor(i2);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                srb srb = (srb) this.c;
                srb.setBackground(new ColorDrawable(srb.getCurrentTheme().c().f));
                fu4.e(fu4.k.e((Context) this.b), srb);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                ((RecyclerView) this.c).setBackground(i8b.P(Integer.valueOf(fu4.k.e(((urc) this.b).a).f().c().f), (Integer) null, (Integer) null, new float[]{c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO}));
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                ((guc) this.c).U1.setColor(((k2b) this.b).h().k);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                ImageView imageView2 = (ImageView) this.c;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.b;
                js9 js9 = fu4.k;
                js9.f(imageView2).getIcon().getClass();
                iq.a0((Drawable) recordControlsWidget.L0.getValue(), -1);
                iq.a0(recordControlsWidget.v0(), js9.e(imageView2.getContext()).f().a().l().e.g);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                TextView textView = (TextView) this.c;
                js9 js92 = fu4.k;
                textView.setTextColor(js92.f(textView).getText().f);
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                iq.a0((InsetDrawable) ((RecordControlsWidget) this.b).M0.getValue(), js92.e(textView.getContext()).f().getIcon().i);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                View view = (View) this.c;
                js9 js93 = fu4.k;
                ((View) this.b).setBackgroundColor(js93.f(view).c().i);
                ((TextView) view.findViewById(zhc.oneme_settings_privacy_onboarding_content_title)).setTextColor(js93.e(view.getContext()).f().getText().e);
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                KProperty[] kPropertyArr2 = SearchMessageBottomWidget.y;
                SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.b;
                ((ConstraintLayout) this.c).setBackgroundColor(searchMessageBottomWidget.i0().a.a);
                searchMessageBottomWidget.d0().setTextColor(searchMessageBottomWidget.i0().b.b);
                searchMessageBottomWidget.e0().setBackgroundColor(searchMessageBottomWidget.i0().c.d);
                searchMessageBottomWidget.h0(searchMessageBottomWidget.f0(), searchMessageBottomWidget.w);
                searchMessageBottomWidget.h0(searchMessageBottomWidget.c0(), searchMessageBottomWidget.x);
                return Unit.INSTANCE;
            case 9:
                ResultKt.throwOnFailure(obj);
                return TuplesKt.to((List) this.c, (wk6) this.b);
            case 10:
                ResultKt.throwOnFailure(obj);
                ((cqd) this.c).setBackgroundColor(((k2b) this.b).c().k);
                return Unit.INSTANCE;
            case 11:
                ResultKt.throwOnFailure(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.c;
                ypd ypd = (ypd) this.b;
                ImageView imageView3 = ypd.D0;
                js9 js94 = fu4.k;
                js94.f(constraintLayout).getIcon().getClass();
                imageView3.setColorFilter(-16745729);
                ypd.E0.setTextColor(js94.e(constraintLayout.getContext()).f().getText().e);
                ypd.F0.setTextColor(js94.e(constraintLayout.getContext()).f().getText().f);
                return Unit.INSTANCE;
            case 12:
                ResultKt.throwOnFailure(obj);
                k2b k2b = (k2b) this.c;
                v7e v7e = (v7e) this.b;
                v7e.K0.setBackgroundColor(k2b.c().h);
                v7e.E0.setTextColor(k2b.getText().e);
                AppCompatEditText appCompatEditText = v7e.F0;
                appCompatEditText.setTextColor(k2b.getText().e);
                appCompatEditText.setHintTextColor(k2b.getText().h);
                AppCompatTextView appCompatTextView2 = v7e.G0;
                k2b.getText().getClass();
                appCompatTextView2.setTextColor(-16745729);
                v7e.M0.setTextColor(k2b.getText().f);
                return Unit.INSTANCE;
            case 13:
                ResultKt.throwOnFailure(obj);
                ((AppCompatImageView) this.c).setImageTintList(ColorStateList.valueOf(((k2b) this.b).getIcon().i));
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ResultKt.throwOnFailure(obj);
                vre vre = (vre) this.c;
                iq.a0(vre.D0, fu4.k.e((Context) this.b).f().c().a.g);
                wx1 wx1 = vre.J0;
                if (wx1 != null) {
                    if (vre.E0 != null) {
                        vre.E0 = vre.R();
                    }
                    mqe mqe = wx1.b;
                    vre.P(mqe.w);
                    vre.Q(mqe.x);
                }
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = (k2b) this.c;
                KProperty[] kPropertyArr3 = SuggestionsWidget.z0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                suggestionsWidget.p0().setTextColor(k2b2.getText().g);
                suggestionsWidget.o0().setBackgroundColor(k2b2.getIcon().g);
                KProperty[] kPropertyArr4 = SuggestionsWidget.z0;
                KProperty kProperty = kPropertyArr4[4];
                ((AppCompatImageView) suggestionsWidget.v0.getValue()).setImageTintList(ColorStateList.valueOf(k2b2.getIcon().f));
                KProperty kProperty2 = kPropertyArr4[5];
                ((AppCompatTextView) suggestionsWidget.w0.getValue()).setTextColor(k2b2.getText().e);
                return Unit.INSTANCE;
            case 16:
                ResultKt.throwOnFailure(obj);
                ImageView imageView4 = (ImageView) this.c;
                js9 js95 = fu4.k;
                View view2 = (View) this.b;
                js95.f(view2).getIcon().getClass();
                imageView4.setColorFilter(-1);
                imageView4.setBackgroundColor(js95.e(view2.getContext()).f().c().a.j);
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED:
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.c;
                if (th != null) {
                    UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) this.b;
                    uploadFileAttachWorker.e(th);
                    uploadFileAttachWorker.A0 = d08.a();
                }
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                TextView textView2 = (TextView) this.c;
                js9 js96 = fu4.k;
                js96.f(textView2).getText().getClass();
                textView2.setTextColor(-1);
                ((GradientDrawable) textView2.getBackground()).setColor(js96.e(textView2.getContext()).f().c().a.g);
                KProperty[] kPropertyArr5 = VideoMessageWidget.X;
                iq.a0((InsetDrawable) ((VideoMessageWidget) this.b).v.getValue(), js96.e(textView2.getContext()).f().e().a);
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qrb(vre vre, Context context, Continuation continuation) {
        super(3, continuation);
        this.a = 14;
        this.c = vre;
        this.b = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrb(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.b = obj;
    }
}
