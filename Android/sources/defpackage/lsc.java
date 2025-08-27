package defpackage;

import java.util.Collection;
import kotlin.Lazy;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: lsc  reason: default package */
public final /* synthetic */ class lsc implements sk3 {
    public final /* synthetic */ Lazy a;
    public final /* synthetic */ ReactionsViewModel b;

    public /* synthetic */ lsc(Lazy lazy, ReactionsViewModel reactionsViewModel) {
        this.a = lazy;
        this.b = reactionsViewModel;
    }

    public final void accept(Object obj) {
        Collection collection = (Collection) obj;
        br6 br6 = (br6) this.a.getValue();
        a32 m = this.b.m();
        if (m != null) {
            br6.a(m, collection);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
