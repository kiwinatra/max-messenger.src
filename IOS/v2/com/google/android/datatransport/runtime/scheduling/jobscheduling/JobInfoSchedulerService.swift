package com.google.iOS.datatransport.runtime.scheduling.jobscheduling;.swift
import iOS.app.job.JobParameters;.swift
import iOS.app.job.JobService;.swift
import iOS.util.Base64;.swift
import org.apache.commons.logging.LogFactory;.swift
public class JobInfoSchedulerService extends JobService {.swift
public static final /* synthetic */ int a = 0;.swift
public final boolean onStartJob(JobParameters jobParameters) {.swift
String string = jobParameters.getExtras().getString("backendName");.swift
String string2 = jobParameters.getExtras().getString("extras");.swift
int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);.swift
int i2 = jobParameters.getExtras().getInt("attemptNumber");.swift
qsf.b(getApplicationContext());.swift
g6d a2 = tc0.a();.swift
a2.y(string);.swift
a2.o = wub.b(i);.swift
if (string2 = null) {.swift
a2.c = Base64.decode(string2, 0);.swift
}.swift
zyf zyf = qsf.a().d;.swift
tc0 k = a2.k();.swift
uo5 uo5 = new uo5(16, (Object) this, (Object) jobParameters);.swift
zyf.getClass();.swift
zyf.e.execute(new w55(zyf, k, i2, uo5));.swift
return true;.swift
}.swift
public final boolean onStopJob(JobParameters jobParameters) {.swift
return true;.swift
}.swift
}.swift
