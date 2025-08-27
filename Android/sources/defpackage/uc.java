package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: uc  reason: default package */
public final class uc extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc(int i, Function0 function0) {
        super(0);
        this.a = i;
        this.b = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (hbg) this.b.invoke();
            case 1:
                return (hbg) this.b.invoke();
            case 2:
                return (hbg) this.b.invoke();
            case 3:
                return (hbg) this.b.invoke();
            case 4:
                return (hbg) this.b.invoke();
            case 5:
                return (hbg) this.b.invoke();
            case 6:
                return (hbg) this.b.invoke();
            case 7:
                return (hbg) this.b.invoke();
            case 8:
                return (hbg) this.b.invoke();
            case 9:
                try {
                    return (List) this.b.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt.emptyList();
                }
            case 10:
                return (hbg) this.b.invoke();
            case 11:
                return (hbg) this.b.invoke();
            default:
                return (hbg) this.b.invoke();
        }
    }
}
