package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

@Deprecated
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private int changeCount = 0;
    private ReferenceQueue queue = new ReferenceQueue();

    public static final class Entry implements Map.Entry {
        private final Object key;
        private final Object value;

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L_0x0040
                boolean r1 = r4 instanceof java.util.Map.Entry
                if (r1 == 0) goto L_0x0040
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r1 = r3.getKey()
                if (r1 != 0) goto L_0x0016
                java.lang.Object r1 = r4.getKey()
                if (r1 != 0) goto L_0x0040
                goto L_0x0024
            L_0x0016:
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r2 = r4.getKey()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0040
            L_0x0024:
                java.lang.Object r1 = r3.getValue()
                if (r1 != 0) goto L_0x0031
                java.lang.Object r3 = r4.getValue()
                if (r3 != 0) goto L_0x0040
                goto L_0x003f
            L_0x0031:
                java.lang.Object r3 = r3.getValue()
                java.lang.Object r4 = r4.getValue()
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0040
            L_0x003f:
                r0 = 1
            L_0x0040:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.WeakHashtable.Entry.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.key;
        }

        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = getKey() == null ? 0 : getKey().hashCode();
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        private Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    public static final class WeakKey extends WeakReference {
        private final Referenced referenced;

        /* access modifiers changed from: private */
        public Referenced getReferenced() {
            return this.referenced;
        }

        private WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced2) {
            super(obj, referenceQueue);
            this.referenced = referenced2;
        }
    }

    private void purge() {
        synchronized (this.queue) {
            while (true) {
                try {
                    WeakKey weakKey = (WeakKey) this.queue.poll();
                    if (weakKey != null) {
                        super.remove(weakKey.getReferenced());
                    }
                } finally {
                }
            }
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            try {
                WeakKey weakKey = (WeakKey) this.queue.poll();
                if (weakKey != null) {
                    super.remove(weakKey.getReferenced());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean containsKey(Object obj) {
        return super.containsKey(new Referenced(obj));
    }

    public Enumeration elements() {
        purge();
        return super.elements();
    }

    public Set entrySet() {
        purge();
        Set<Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : entrySet) {
            Object access$100 = ((Referenced) entry.getKey()).getValue();
            Object value = entry.getValue();
            if (access$100 != null) {
                hashSet.add(new Entry(access$100, value));
            }
        }
        return hashSet;
    }

    public Object get(Object obj) {
        return super.get(new Referenced(obj));
    }

    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    public Set keySet() {
        purge();
        Set<Referenced> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (Referenced access$100 : keySet) {
            Object access$1002 = access$100.getValue();
            if (access$1002 != null) {
                hashSet.add(access$1002);
            }
        }
        return hashSet;
    }

    public Enumeration keys() {
        purge();
        final Enumeration keys = super.keys();
        return new Enumeration() {
            public boolean hasMoreElements() {
                return keys.hasMoreElements();
            }

            public Object nextElement() {
                return ((Referenced) keys.nextElement()).getValue();
            }
        };
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed");
        } else if (obj2 != null) {
            int i = this.changeCount;
            int i2 = i + 1;
            this.changeCount = i2;
            if (i > 100) {
                purge();
                this.changeCount = 0;
            } else if (i2 % 10 == 0) {
                purgeOne();
            }
            return super.put(new Referenced(obj, this.queue), obj2);
        } else {
            throw new NullPointerException("Null values are not allowed");
        }
    }

    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void rehash() {
        purge();
        super.rehash();
    }

    public Object remove(Object obj) {
        int i = this.changeCount;
        int i2 = i + 1;
        this.changeCount = i2;
        if (i > 100) {
            purge();
            this.changeCount = 0;
        } else if (i2 % 10 == 0) {
            purgeOne();
        }
        return super.remove(new Referenced(obj));
    }

    public int size() {
        purge();
        return super.size();
    }

    public String toString() {
        purge();
        return super.toString();
    }

    public Collection values() {
        purge();
        return super.values();
    }

    public static final class Referenced {
        private final int hashCode;
        private final WeakReference reference;

        /* access modifiers changed from: private */
        public Object getValue() {
            return this.reference.get();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Referenced)) {
                return false;
            }
            Referenced referenced = (Referenced) obj;
            Object value = getValue();
            Object value2 = referenced.getValue();
            if (value != null) {
                return value.equals(value2);
            }
            boolean z = value2 == null;
            return z ? hashCode() == referenced.hashCode() : z;
        }

        public int hashCode() {
            return this.hashCode;
        }

        private Referenced(Object obj) {
            this.reference = new WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        private Referenced(Object obj, ReferenceQueue referenceQueue) {
            this.reference = new WeakKey(obj, referenceQueue, this);
            this.hashCode = obj.hashCode();
        }
    }
}
