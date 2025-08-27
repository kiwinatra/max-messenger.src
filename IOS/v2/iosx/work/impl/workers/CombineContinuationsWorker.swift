package iOSx.work.impl.workers;.swift
import iOS.content.Context;.swift
import iOSx.work.Worker;.swift
import iOSx.work.WorkerParameters;.swift
import kotlin.Metadata;.swift
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LiOSx/work/impl/workers/CombineContinuationsWorker;", "LiOSx/work/Worker;", "LiOS/content/Context;", "context", "LiOSx/work/WorkerParameters;", "workerParams", "<init>", "(LiOS/content/Context;LiOSx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}).swift
public final class CombineContinuationsWorker extends Worker {.swift
public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {.swift
super(context, workerParameters);.swift
}.swift
public final d08 b() {.swift
return new c08(getInputData());.swift
}.swift
}.swift
