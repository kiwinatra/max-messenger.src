package defpackage;

import androidx.fragment.app.a;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.suggests.SuggestsFragment;

/* renamed from: e1f  reason: default package */
public final /* synthetic */ class e1f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuggestsFragment b;

    public /* synthetic */ e1f(SuggestsFragment suggestsFragment, int i) {
        this.a = i;
        this.b = suggestsFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                SuggestsFragment suggestsFragment = this.b;
                a aVar = suggestsFragment.G0;
                return aVar != null ? aVar : suggestsFragment.E2();
            case 1:
                SuggestsFragment suggestsFragment2 = this.b;
                return new o83(suggestsFragment2.F2().getLong("SuggestsFragment:chat_id"), ryg.x(suggestsFragment2), 1);
            default:
                SuggestsFragment suggestsFragment3 = this.b;
                return new hr7(1, suggestsFragment3.E2().getWindow().getDecorView(), suggestsFragment3);
        }
    }
}
