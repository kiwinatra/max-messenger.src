package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    public void release() {
        Runnable runnable;
        int decrementAndGet = this.refCount.decrementAndGet();
        if (decrementAndGet < 0) {
            Logging.d("RefCountDelegate", "release() called on an object with refcount < 1");
        }
        if (decrementAndGet == 0 && (runnable = this.releaseCallback) != null) {
            runnable.run();
        }
    }

    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            Logging.d("RefCountDelegate", "retain() called on an object with refcount < 1");
        }
    }

    public boolean safeRetain() {
        int i = this.refCount.get();
        while (i != 0) {
            if (this.refCount.weakCompareAndSet(i, i + 1)) {
                return true;
            }
            i = this.refCount.get();
        }
        return false;
    }
}
