package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: zu3  reason: default package */
public final class zu3 extends ij0 {
    public final List b;

    public zu3(long j) {
        this.b = Collections.singletonList(Long.valueOf(j));
    }

    public final String toString() {
        return "ContactsUpdateEvent{idList=" + this.b + '}';
    }

    public zu3(Collection collection) {
        this.b = new ArrayList(collection);
    }

    public zu3(long j, Collection collection) {
        super(j);
        this.b = new ArrayList(collection);
    }
}
