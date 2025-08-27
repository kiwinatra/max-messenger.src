package defpackage;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.ok.onechat.reactions.ReactionsViewModel;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ksc  reason: default package */
public final /* synthetic */ class ksc implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ReactionsViewModel b;
    public final /* synthetic */ Lazy c;

    public /* synthetic */ ksc(Lazy lazy, ReactionsViewModel reactionsViewModel) {
        this.c = lazy;
        this.b = reactionsViewModel;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new lsc(this.c, this.b);
            default:
                akd akd = (akd) this.b.e;
                akd.getClass();
                String z = akd.z(PmsKey.f30doubletapreaction, (String) null);
                String obj = z != null ? StringsKt.trim((CharSequence) z).toString() : null;
                if (obj == null || obj.length() == 0 || Intrinsics.areEqual((Object) obj.toLowerCase(Locale.ROOT), (Object) "null")) {
                    obj = null;
                }
                if (obj != null) {
                    return ((yd9) this.c.getValue()).b(obj);
                }
                return null;
        }
    }

    public /* synthetic */ ksc(ReactionsViewModel reactionsViewModel, Lazy lazy) {
        this.b = reactionsViewModel;
        this.c = lazy;
    }
}
