package defpackage;

import androidx.work.OverwritingInputMerger;
import androidx.work.WorkRequest;

/* renamed from: v3b  reason: default package */
public final class v3b extends WorkRequest.Builder {
    public v3b(Class cls) {
        super(cls);
        getWorkSpec$work_runtime_release().d = OverwritingInputMerger.class.getName();
    }

    public final WorkRequest buildInternal$work_runtime_release() {
        if (!getBackoffCriteriaSet$work_runtime_release() || !getWorkSpec$work_runtime_release().j.c) {
            return new WorkRequest(getId$work_runtime_release(), getWorkSpec$work_runtime_release(), getTags$work_runtime_release());
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
    }

    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
