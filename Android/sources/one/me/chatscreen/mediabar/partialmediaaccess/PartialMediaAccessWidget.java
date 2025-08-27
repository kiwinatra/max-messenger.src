package one.me.chatscreen.mediabar.partialmediaaccess;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPartialMediaAccessWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialMediaAccessWidget.kt\none/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n24#2:89\n24#2:90\n24#2:100\n24#2:109\n157#3,8:91\n157#3,8:101\n163#3,2:110\n1#4:99\n*S KotlinDebug\n*F\n+ 1 PartialMediaAccessWidget.kt\none/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget\n*L\n35#1:89\n39#1:90\n50#1:100\n73#1:109\n39#1:91,8\n50#1:101,8\n73#1:110,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class PartialMediaAccessWidget extends Widget {
    public static final /* synthetic */ KProperty[] o;
    public final Lazy a;
    public final sn0 b;
    public final sn0 c;

    static {
        Class<PartialMediaAccessWidget> cls = PartialMediaAccessWidget.class;
        o = new KProperty[]{wj6.p(cls, "titleSubtitleContent", "getTitleSubtitleContent()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "content", "getContent()Landroid/widget/LinearLayout;", 0)};
    }

    public PartialMediaAccessWidget() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KProperty kProperty = o[1];
        return (LinearLayout) this.c.getValue();
    }

    public PartialMediaAccessWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = fdb.a.c();
        this.b = binding(new r8b(this, 0));
        this.c = binding(new r8b(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialMediaAccessWidget(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
