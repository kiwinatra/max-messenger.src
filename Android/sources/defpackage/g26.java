package defpackage;

import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import ru.ok.messages.views.widgets.ProfileTopPartView;

/* renamed from: g26  reason: default package */
public final class g26 extends qf5 {
    public static final /* synthetic */ KProperty[] X;
    public final w28 c = c(lic.appbar);
    public final w28 o = c(lic.collapsing_toolbar);
    public final w28 v = c(lic.frg_chat_folder_page__recyclerView);
    public final w28 w = c(lic.frg_chat_folder_page__submit);
    public b33 x;
    public t26 y;
    public final w28 z = new w28((qf5) this, (Function0) new u75(8, this));

    static {
        Class<g26> cls = g26.class;
        X = new KProperty[]{wj6.p(cls, "appBar", "getAppBar()Lcom/google/android/material/appbar/AppBarLayout;", 0), wj6.p(cls, "topView", "getTopView()Lru/ok/messages/views/widgets/ProfileTopPartView;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "submitButton", "getSubmitButton()Landroid/widget/Button;", 0), wj6.p(cls, "popupActionsButton", "getPopupActionsButton()Landroidx/appcompat/widget/AppCompatImageButton;", 0)};
    }

    public final void b() {
        this.x = null;
        this.y = null;
    }

    public final RecyclerView d() {
        return (RecyclerView) this.v.getValue(this, X[2]);
    }

    public final Button e() {
        return (Button) this.w.getValue(this, X[3]);
    }

    public final ProfileTopPartView f() {
        return (ProfileTopPartView) this.o.getValue(this, X[1]);
    }
}
