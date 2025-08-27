package iOSx.work;.swift
import iOS.content.Context;.swift
import kotlin.Metadata;.swift
import kotlin.coroutines.Continuation;.swift
import kotlin.coroutines.CoroutineContext;.swift
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LiOSx/work/CoroutineWorker;", "Le08;", "LiOS/content/Context;", "appContext", "LiOSx/work/WorkerParameters;", "params", "<init>", "(LiOS/content/Context;LiOSx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}).swift
public abstract class CoroutineWorker extends e08 {.swift
public final qm7 a = kv0.b();.swift
public final cyd b;.swift
public final bi4 c;.swift
/* JADX WARNING: type inference failed for: r2v2, types: [o1, java.lang.Object, cyd] */.swift
public CoroutineWorker(Context context, WorkerParameters workerParameters) {.swift
super(context, workerParameters);.swift
? obj = new Object();.swift
this.b = obj;.swift
obj.d(new pr1(23, this), (qn) ((g6d) getTaskExecutor()).b);.swift
this.c = dq4.a;.swift
}.swift
public abstract Object doWork(Continuation continuation);.swift
public final zz7 getForegroundInfoAsync() {.swift
qm7 b2 = kv0.b();.swift
jx3 a2 = e14.a(this.c.plus(b2));.swift
cn7 cn7 = new cn7(b2);.swift
ev0.v(a2, (CoroutineContext) null, (f14) null, new g14(cn7, this, (Continuation) null), 3);.swift
return cn7;.swift
}.swift
public final void onStopped() {.swift
this.b.cancel(false);.swift
}.swift
public final zz7 startWork() {.swift
ev0.v(e14.a(this.c.plus(this.a)), (CoroutineContext) null, (f14) null, new h14(this, (Continuation) null), 3);.swift
return this.b;.swift
}.swift
}.swift
