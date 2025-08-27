package one.me.sdk.bottomsheet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0015\b\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lone/me/sdk/bottomsheet/ConfirmationBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "ng3", "pg3", "qg3", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nConfirmationBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmationBottomSheet.kt\none/me/sdk/bottomsheet/ConfirmationBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,243:1\n420#2:244\n419#2:245\n419#2:246\n419#2:247\n419#2:248\n1#3:249\n24#4:250\n24#4:259\n24#4:260\n24#4:261\n24#4:270\n24#4:271\n142#5,8:251\n142#5,8:262\n157#5,8:272\n*S KotlinDebug\n*F\n+ 1 ConfirmationBottomSheet.kt\none/me/sdk/bottomsheet/ConfirmationBottomSheet\n*L\n42#1:244\n43#1:245\n44#1:246\n45#1:247\n49#1:248\n104#1:250\n108#1:259\n109#1:260\n119#1:261\n123#1:270\n140#1:271\n104#1:251,8\n119#1:262,8\n140#1:272,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ConfirmationBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] D0;
    public final boolean A0;
    public final is B0;
    public final pgd C0;
    public final is w0;
    public final is x0;
    public final is y0;
    public final is z0;

    static {
        Class<ConfirmationBottomSheet> cls = ConfirmationBottomSheet.class;
        D0 = new KProperty[]{wj6.p(cls, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), wj6.p(cls, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), wj6.p(cls, "buttons", "getButtons()Ljava/util/ArrayList;", 0), wj6.p(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), rae.s(cls, "isCallbackSent", "isCallbackSent()Z", 0)};
    }

    @JvmOverloads
    public ConfirmationBottomSheet() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final pgd getScreenDelegate() {
        return this.C0;
    }

    public final void k0() {
        zx3 targetController = getTargetController();
        qg3 qg3 = targetController instanceof qg3 ? (qg3) targetController : null;
        if (qg3 != null) {
            qg3.A();
        }
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        KProperty[] kPropertyArr = D0;
        KProperty kProperty = kPropertyArr[0];
        CharSequence a = ((ngf) this.w0.a(this)).a(getContext());
        if (a != null) {
            KProperty kProperty2 = kPropertyArr[1];
            ngf ngf = (ngf) this.x0.a(this);
            CharSequence a2 = ngf != null ? ngf.a(layoutInflater.getContext()) : null;
            KProperty kProperty3 = kPropertyArr[2];
            return new rg3(this, a, a2, (ArrayList) this.y0.a(this), layoutInflater.getContext());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean o0() {
        return this.A0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfirmationBottomSheet(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    @JvmOverloads
    public ConfirmationBottomSheet(Bundle bundle) {
        super(bundle);
        pgd pgd;
        Object obj;
        Class<ngf> cls = ngf.class;
        this.w0 = new is(cls, "title");
        jgd jgd = null;
        this.x0 = new is(cls, (Object) null, "description");
        this.y0 = new is(ArrayList.class, new ArrayList(), "buttons");
        this.z0 = new is(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.A0 = getArgs().getBoolean("memorize_keyboard", true);
        this.B0 = new is(Boolean.class, Boolean.FALSE, "callback_sent");
        String string = getArgs().getString("stat_screen");
        if (string != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m23constructorimpl(jgd.valueOf(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            jgd jgd2 = !Result.m29isFailureimpl(obj) ? obj : jgd;
            if (jgd2 != null) {
                pgd = new w28(jgd2);
                this.C0 = pgd;
            }
        }
        pgd = super.getScreenDelegate();
        this.C0 = pgd;
    }
}
