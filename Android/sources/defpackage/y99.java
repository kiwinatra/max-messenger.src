package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: y99  reason: default package */
public final class y99 implements lw3 {
    public final Bundle a = new Bundle();

    public final lw3 a(int i) {
        this.a.putInt("parent_id", i);
        return this;
    }

    public final mw3 build() {
        return new MessageContextMenuBottomSheet(new Bundle(this.a));
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
}
