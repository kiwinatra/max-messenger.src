package ru.ok.android.externcalls.sdk.feature.roles;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "", "()V", "Companion", "EnabledForAll", "EnabledForRoles", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForAll;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FeatureRoles {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$Companion;", "", "()V", "createDisabledForAll", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final EnabledForRoles createDisabledForAll() {
            return new EnabledForRoles(SetsKt.emptySet());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForAll;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnabledForAll extends FeatureRoles {
        public static final EnabledForAll INSTANCE = new EnabledForAll();

        private EnabledForAll() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "", "Lxe1;", "roles", "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles$EnabledForRoles;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getRoles", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class EnabledForRoles extends FeatureRoles {
        private final Set<xe1> roles;

        public EnabledForRoles(Set<? extends xe1> set) {
            super((DefaultConstructorMarker) null);
            this.roles = set;
        }

        public static /* synthetic */ EnabledForRoles copy$default(EnabledForRoles enabledForRoles, Set<xe1> set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = enabledForRoles.roles;
            }
            return enabledForRoles.copy(set);
        }

        public final Set<xe1> component1() {
            return this.roles;
        }

        public final EnabledForRoles copy(Set<? extends xe1> set) {
            return new EnabledForRoles(set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EnabledForRoles) && Intrinsics.areEqual((Object) this.roles, (Object) ((EnabledForRoles) obj).roles);
        }

        public final Set<xe1> getRoles() {
            return this.roles;
        }

        public int hashCode() {
            return this.roles.hashCode();
        }

        public String toString() {
            Set<xe1> set = this.roles;
            return "EnabledForRoles(roles=" + set + ")";
        }
    }

    private FeatureRoles() {
    }

    public /* synthetic */ FeatureRoles(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
