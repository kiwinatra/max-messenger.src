package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.views.EmptySearchView;
import org.apache.http.util.LangUtils;
import ru.ok.messages.gallery.view.MediaPermissionsView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: e7  reason: default package */
public final /* synthetic */ class e7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ e7(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final void onClick(View view) {
        Function0 function0 = this.b;
        switch (this.a) {
            case 0:
                function0.invoke();
                return;
            case 1:
                function0.invoke();
                return;
            case 2:
                function0.invoke();
                return;
            case 3:
                function0.invoke();
                return;
            case 4:
                function0.invoke();
                return;
            case 5:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 6:
                function0.invoke();
                return;
            case 7:
                function0.invoke();
                return;
            case 8:
                function0.invoke();
                return;
            case 9:
                int i = EmptySearchView.v;
                function0.invoke();
                return;
            case 10:
                function0.invoke();
                return;
            case 11:
                function0.invoke();
                return;
            case 12:
                function0.invoke();
                return;
            case 13:
                function0.invoke();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int i2 = MediaPermissionsView.c;
                function0.invoke();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                function0.invoke();
                return;
            case 16:
                function0.invoke();
                return;
            case LangUtils.HASH_SEED /*17*/:
                function0.invoke();
                return;
            case 18:
                function0.invoke();
                return;
            case 19:
                function0.invoke();
                return;
            case 20:
                function0.invoke();
                return;
            case 21:
                function0.invoke();
                return;
            case 22:
                function0.invoke();
                return;
            case 23:
                function0.invoke();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                function0.invoke();
                return;
            case 25:
                function0.invoke();
                return;
            case 26:
                function0.invoke();
                return;
            default:
                function0.invoke();
                return;
        }
    }
}
