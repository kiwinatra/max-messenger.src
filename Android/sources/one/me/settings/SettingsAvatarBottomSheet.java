package one.me.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/SettingsAvatarBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "d0e", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSettingsAvatarBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsAvatarBottomSheet.kt\none/me/settings/SettingsAvatarBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,189:1\n420#2:190\n419#2:191\n419#2:192\n419#2:193\n419#2:194\n419#2:195\n419#2:196\n419#2:197\n419#2:198\n1#3:199\n24#4:200\n24#4:201\n24#4:202\n24#4:203\n*S KotlinDebug\n*F\n+ 1 SettingsAvatarBottomSheet.kt\none/me/settings/SettingsAvatarBottomSheet\n*L\n29#1:190\n30#1:191\n31#1:192\n32#1:193\n34#1:194\n30#1:195\n31#1:196\n32#1:197\n34#1:198\n85#1:200\n98#1:201\n118#1:202\n119#1:203\n*E\n"})
@SuppressLint({"ValidController"})
public final class SettingsAvatarBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] A0;
    public final is w0;
    public final is x0;
    public final is y0 = new is(ArrayList.class, new ArrayList(), "buttons");
    public final is z0 = new is(Boolean.class, Boolean.FALSE, "callback_sent");

    static {
        Class<SettingsAvatarBottomSheet> cls = SettingsAvatarBottomSheet.class;
        A0 = new KProperty[]{wj6.p(cls, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), wj6.p(cls, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), wj6.p(cls, "buttons", "getButtons()Ljava/util/ArrayList;", 0), wj6.p(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), rae.s(cls, "isCallbackSent", "isCallbackSent()Z", 0)};
    }

    public SettingsAvatarBottomSheet(Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        super(bundle);
        Class<ngf> cls = ngf.class;
        this.w0 = new is(cls, "title");
        this.x0 = new is(cls, (Object) null, "description");
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        KProperty[] kPropertyArr = A0;
        KProperty kProperty = kPropertyArr[0];
        CharSequence a = ((ngf) this.w0.a(this)).a(getContext());
        if (a != null) {
            KProperty kProperty2 = kPropertyArr[1];
            ngf ngf = (ngf) this.x0.a(this);
            CharSequence a2 = ngf != null ? ngf.a(layoutInflater.getContext()) : null;
            KProperty kProperty3 = kPropertyArr[2];
            return new e0e(this, a, a2, (ArrayList) this.y0.a(this), layoutInflater.getContext());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public SettingsAvatarBottomSheet() {
        super((Bundle) null);
        Class<ngf> cls = ngf.class;
        this.w0 = new is(cls, "title");
        this.x0 = new is(cls, (Object) null, "description");
    }
}
