package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import one.me.messages.list.loader.MessageModel;

/* renamed from: w43  reason: default package */
public final class w43 extends d99 {
    public final /* synthetic */ int R0;
    public final Function1 S0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w43(Context context, hq7 hq7, int i) {
        super(context, new v43(context));
        this.R0 = i;
        switch (i) {
            case 1:
                super(context, new b53(context));
                this.S0 = hq7;
                return;
            case 2:
                super(context, new ace(context));
                this.S0 = hq7;
                return;
            case 3:
                super(context, new bce(context));
                this.S0 = hq7;
                return;
            default:
                this.S0 = hq7;
                return;
        }
    }

    public final void W(MessageModel messageModel) {
        switch (this.R0) {
            case 0:
                o00 o00 = messageModel.X.d;
                o43 o43 = o00 instanceof o43 ? (o43) o00 : null;
                if (o43 != null) {
                    v43 v43 = (v43) this.G0;
                    v43.c(o43);
                    v43.setOnFinalImageSetCallback(new ep1(this, o43, messageModel, 2));
                    return;
                }
                return;
            case 1:
                o00 o002 = messageModel.X.d;
                o43 o432 = o002 instanceof o43 ? (o43) o002 : null;
                if (o432 != null) {
                    b53 b53 = (b53) this.G0;
                    b53.c(o432);
                    b53.setOnFinalImageSetCallback(new ep1(this, o432, messageModel, 3));
                    return;
                }
                return;
            case 2:
                o00 o003 = messageModel.X.d;
                ybe ybe = o003 instanceof ybe ? (ybe) o003 : null;
                if (ybe != null) {
                    View view = this.G0;
                    ((ace) view).b(ybe.c);
                    ((ace) view).w.setOnFinalImageSetCallback(new sz0((Object) this, (Object) ybe, (Object) messageModel, 11));
                    return;
                }
                return;
            default:
                o00 o004 = messageModel.X.d;
                ybe ybe2 = o004 instanceof ybe ? (ybe) o004 : null;
                if (ybe2 != null) {
                    bce bce = (bce) this.G0;
                    bce.b(ybe2.c);
                    bce.z0.setOnFinalImageSetCallback(new sz0((Object) this, (Object) ybe2, (Object) messageModel, 12));
                    return;
                }
                return;
        }
    }

    public final void Z(a93 a93) {
        switch (this.R0) {
            case 0:
                v43 v43 = (v43) this.G0;
                v43.setDateTextColor(a93.b.a);
                v43.w.f();
                return;
            case 1:
                b53 b53 = (b53) this.G0;
                b53.setDateTextColor(a93.b.a);
                b53.y0.f();
                return;
            case 2:
                ((ace) this.G0).setDateTextColor(a93.b.a);
                return;
            default:
                ((bce) this.G0).setDateTextColor(a93.b.a);
                return;
        }
    }
}
