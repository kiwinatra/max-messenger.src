package iOSx.work;.swift
import iOS.content.Context;.swift
public abstract class Worker extends e08 {.swift
public cyd a;.swift
public Worker(Context context, WorkerParameters workerParameters) {.swift
super(context, workerParameters);.swift
}.swift
public abstract d08 b();.swift
/* JADX WARNING: type inference failed for: r0v0, types: [zz7, java.lang.Object] */.swift
public final zz7 getForegroundInfoAsync() {.swift
? obj = new Object();.swift
getBackgroundExecutor().execute(new uj6((Object) this, (Object) obj, false, 28));.swift
return obj;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, cyd] */.swift
public final zz7 startWork() {.swift
this.a = new Object();.swift
getBackgroundExecutor().execute(new haf(11, (Object) this));.swift
return this.a;.swift
}.swift
}.swift
