package one.me.startconversation.chattitleicon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/startconversation/chattitleicon/ChatTitleIconScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lmd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "ids", "Lzke;", "createType", "([JLzke;)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatTitleIconScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatTitleIconScreen.kt\none/me/startconversation/chattitleicon/ChatTitleIconScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 7 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 8 BundleExt.kt\none/me/sdk/uikit/common/BundleExtKt\n+ 9 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 10 View.kt\nandroidx/core/view/ViewKt\n+ 11 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 12 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 13 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 14 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n*L\n1#1,472:1\n419#2:473\n420#2:474\n235#2,10:475\n410#2,8:494\n410#2,8:502\n1#3:485\n17#4,8:486\n1863#5,2:510\n135#6,3:512\n138#6,8:529\n33#7,14:515\n10#8,2:537\n24#9:539\n24#9:542\n24#9:544\n24#9:548\n24#9:549\n24#9:550\n24#9:551\n24#9:552\n24#9:555\n24#9:558\n24#9:561\n24#9:564\n24#9:568\n148#10,2:540\n148#10,2:545\n254#10:566\n23#11:543\n20#12:547\n20#13:553\n21#13:570\n186#14:554\n187#14:556\n186#14:557\n187#14:559\n186#14:560\n187#14:562\n186#14:563\n187#14:565\n186#14:567\n187#14:569\n*S KotlinDebug\n*F\n+ 1 ChatTitleIconScreen.kt\none/me/startconversation/chattitleicon/ChatTitleIconScreen\n*L\n79#1:473\n80#1:474\n91#1:475,10\n314#1:494,8\n328#1:502,8\n247#1:486,8\n459#1:510,2\n464#1:512,3\n464#1:529,8\n464#1:515,14\n94#1:537,2\n130#1:539\n146#1:542\n164#1:544\n190#1:548\n191#1:549\n214#1:550\n215#1:551\n216#1:552\n263#1:555\n269#1:558\n275#1:561\n281#1:564\n288#1:568\n130#1:540,2\n164#1:545,2\n286#1:566\n147#1:543\n170#1:547\n261#1:553\n261#1:570\n262#1:554\n262#1:556\n268#1:557\n268#1:559\n274#1:560\n274#1:562\n280#1:563\n280#1:565\n287#1:567\n287#1:569\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatTitleIconScreen extends Widget implements qg3, md0 {
    public static final /* synthetic */ KProperty[] x0;
    public final sn0 X;
    public final sn0 Y;
    public final sn0 Z;
    public final yh7 a;
    public final Lazy b;
    public final is c;
    public final is o;
    public final w28 v;
    public final sn0 v0;
    public final Lazy w;
    public final sn0 w0;
    public final Lazy x;
    public final Lazy y;
    public final sn0 z;

    static {
        Class<ChatTitleIconScreen> cls = ChatTitleIconScreen.class;
        x0 = new KProperty[]{wj6.p(cls, "ids", "getIds()[J", 0), wj6.p(cls, "createType", "getCreateType()Lone/me/startconversation/deeplink/StartConversationDeepLinkRoutes$CreateType;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "hint", "getHint()Landroid/widget/TextView;", 0), wj6.p(cls, "chatIcon", "getChatIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), wj6.p(cls, "chatTitle", "getChatTitle()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), wj6.p(cls, "chatDescription", "getChatDescription()Lone/me/sdk/uikit/common/views/DescriptionTextViewWithLimit;", 0), wj6.p(cls, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ChatTitleIconScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        this.b = LazyKt.lazy(new oq2(0));
        this.c = new is(long[].class, new long[0], "ids");
        this.o = new is(zke.class, "create_type");
        this.v = new w28(new rq2(this, 1), (Function0) null, 6);
        this.w = createViewModelLazy(fr2.class, new rn2(9, new s2(21, (Object) this, (Object) bundle)));
        wke wke = wke.a;
        this.x = wke.getAccessor().h(edb.class);
        this.y = wke.getAccessor().h(z5a.class);
        this.z = binding(new rq2(this, 2));
        this.X = binding(new rq2(this, 3));
        this.Y = binding(new rq2(this, 4));
        this.Z = binding(new rq2(this, 5));
        this.v0 = binding(new rq2(this, 6));
        this.w0 = binding(new rq2(this, 7));
    }

    public final void a(String str, RectF rectF, Rect rect) {
        h0().k(str, rectF, rect);
    }

    public final lm4 c0() {
        KProperty kProperty = x0[6];
        return (lm4) this.v0.getValue();
    }

    public final OneMeAvatarView d0() {
        KProperty kProperty = x0[4];
        return (OneMeAvatarView) this.Y.getValue();
    }

    public final h2b e0() {
        KProperty kProperty = x0[5];
        return (h2b) this.Z.getValue();
    }

    public final OneMeButton f0() {
        KProperty kProperty = x0[7];
        return (OneMeButton) this.w0.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == f1b.b) {
            ble ble = ble.b;
            ble.getClass();
            Unit unit = Unit.INSTANCE;
            ble.W0().b(":media-picker/select/photo", (Bundle) null);
        } else if (i == f1b.c) {
            h0().l();
        }
    }

    public final zke g0() {
        KProperty kProperty = x0[1];
        return (zke) this.o.a(this);
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final pgd getScreenDelegate() {
        return this.v;
    }

    public final fr2 h0() {
        return (fr2) this.w.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 666) {
            if (i == 777 && i2 == -1) {
                fr2 h0 = h0();
                xag.g(h0, ((osa) ((gaf) h0.x.getValue())).b(), (f14) null, new br2(h0, intent != null ? intent.getData() : null, (Continuation) null), 2);
            }
        } else if (i2 != -1) {
        } else {
            if (intent == null) {
                h0().n();
                return;
            }
            fr2 h02 = h0();
            xag.g(h02, ((osa) ((gaf) h02.x.getValue())).b(), (f14) null, new cr2(intent, h02, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        EditText editText = e0().a;
        if (editText != null) {
            editText.requestFocus();
            editText.post(new uo5(17, (Object) editText, (Object) editText));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        KProperty kProperty = x0[2];
        linearLayout.addView((h3b) this.z.getValue());
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext(), (AttributeSet) null);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        nestedScrollView.setFillViewport(true);
        pq2 pq2 = new pq2(this, 1);
        ConstraintLayout constraintLayout = new ConstraintLayout(nestedScrollView.getContext());
        constraintLayout.setId(f1b.d);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        pq2.invoke(constraintLayout);
        nestedScrollView.addView(constraintLayout);
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(nestedScrollView);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((edb) this.x.getValue()).b(strArr)) {
            h0().l();
        }
    }

    public final void onViewCreated(View view) {
        etc etc = h0().y0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new tq2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().z0, getViewLifecycleOwner().getLifecycle(), iu7), new uq2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(h0().A0, new wq2((Continuation) null, this), 5), getLifecycleScope());
    }

    public ChatTitleIconScreen(long[] jArr, zke zke) {
        this(o54.f(TuplesKt.to("ids", jArr), TuplesKt.to("create_type", zke)));
    }
}
