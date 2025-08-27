package ru.ok.android.externcalls.sdk.api.session;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/api/session/InMemorySessionStore;", "Lpm;", "Lom;", "sessionInfo", "<init>", "(Lom;)V", "Lom;", "getSessionInfo", "()Lom;", "setSessionInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class InMemorySessionStore implements pm {
    private om sessionInfo;

    public InMemorySessionStore() {
        this((om) null, 1, (DefaultConstructorMarker) null);
    }

    public om getSessionInfo() {
        return this.sessionInfo;
    }

    public void setSessionInfo(om omVar) {
        this.sessionInfo = omVar;
    }

    public InMemorySessionStore(om omVar) {
        this.sessionInfo = omVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMemorySessionStore(om omVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : omVar);
    }
}
