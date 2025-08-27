package defpackage;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g8a  reason: default package */
public final /* synthetic */ class g8a implements FunctionAdapter {
    public final /* synthetic */ x8a a;

    public g8a(x8a x8a) {
        this.a = x8a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g8a) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, x8a.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
