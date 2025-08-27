package defpackage;

import android.content.Intent;
import android.util.Base64;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: x91  reason: default package */
public final /* synthetic */ class x91 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ x91(y91 y91, y11 y11, boolean z) {
        this.a = 0;
        this.c = y91;
        this.o = y11;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Intent intent = (Intent) obj;
                ((y91) this.c).getClass();
                intent.setAction("action-accept-call");
                y11 y11 = (y11) this.o;
                CharSequence charSequence = y11.b;
                String str = null;
                if (charSequence == null) {
                    charSequence = null;
                }
                intent.putExtra("incoming_param_name", charSequence);
                String str2 = y11.c;
                if (str2 != null) {
                    str = Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0);
                }
                intent.putExtra("incoming_param_avatar", str);
                Long l = y11.a;
                intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0);
                intent.putExtra("incoming_param_is_video", this.b);
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).getClass();
                return rk1.N(this.b, (rk1) this.c, (List) this.o);
            default:
                ((Boolean) obj).getClass();
                return tl1.M(this.b, (tl1) this.c, (smf) this.o);
        }
    }

    public /* synthetic */ x91(boolean z, ConstraintLayout constraintLayout, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = constraintLayout;
        this.o = obj;
    }
}
