package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: yw3  reason: default package */
public final class yw3 implements lw3 {
    public final Bundle a = new Bundle();

    public final mw3 build() {
        return new ContextMenuBottomSheet(new Bundle(this.a));
    }

    public final lw3 c() {
        Rect rect = py6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.remove("highlight_radius");
        return this;
    }

    public final lw3 d() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public final lw3 e(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public final lw3 h(Collection collection) {
        this.a.putBundle("actions", kr7.f(collection));
        return this;
    }

    public final lw3 k(float f) {
        Rect rect = py6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public final lw3 m(Bundle bundle) {
        this.a.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    public final lw3 o(View view) {
        if (view.getId() != -1) {
            int id = view.getId();
            Bundle bundle = this.a;
            bundle.putInt("anchor_id", id);
            bundle.putSerializable("anchor_class", view.getClass());
            return this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final lw3 p() {
        dbe dbe = BaseBottomSheetWidget.v;
        KProperty[] kPropertyArr = ContextMenuBottomSheet.E0;
        BaseBottomSheetWidget.v.getClass();
        this.a.putBoolean(BaseBottomSheetWidget.x, true);
        return this;
    }
}
