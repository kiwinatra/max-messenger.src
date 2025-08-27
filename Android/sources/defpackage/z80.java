package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;
import kotlin.Lazy;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: z80  reason: default package */
public final class z80 extends AbstractAccountAuthenticator {
    public final Context a;
    public final u4 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public z80(Context context, u4 u4Var, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        super(context);
        this.a = context;
        this.b = u4Var;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (((w4) this.c.getValue()).a() != null) {
            this.b.getClass();
            bundle2.putInt("errorCode", 1029);
            bundle2.putString("errorMessage", this.a.getString(xlc.account_already_exists));
        }
        return bundle2;
    }

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        z68.c("z80", "getAccountRemovalAllowed", new Object[0]);
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        Lazy lazy = this.d;
        if (((doa) lazy.getValue()).e() && accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            boolean f = ((doa) lazy.getValue()).f();
            int i = wud.o;
            Duration.Companion companion = Duration.Companion;
            wud.c = DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS);
            ((jqg) this.e.getValue()).a(new wud(f));
        }
        return accountRemovalAllowed;
    }

    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        ((w4) this.c.getValue()).getClass();
        return new Bundle();
    }

    public final String getAuthTokenLabel(String str) {
        return null;
    }

    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return null;
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return null;
    }
}
