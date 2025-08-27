package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: a38  reason: default package */
public final class a38 implements dla {
    public final z3a a;
    public boolean b = false;

    public a38(j0h j0h, z3a z3a) {
        this.a = z3a;
    }

    public final void a(Object obj) {
        z3a z3a = this.a;
        z3a.getClass();
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) z3a.b;
        signInHubActivity.setResult(signInHubActivity.z, signInHubActivity.X);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
