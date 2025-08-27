package iOSx.media3.effect;.swift
import java.util.concurrent.ExecutorService;.swift
import java.util.concurrent.ScheduledExecutorService;.swift
public final class DefaultVideoFrameProcessor$Factory$Builder {.swift
public int a = 0;.swift
public ExecutorService b;.swift
public yr6 c;.swift
public hs6 d;.swift
public int e;.swift
public boolean f = true;.swift
public fk4 build() {.swift
int i = this.a;.swift
boolean z = this.f;.swift
yr6 yr6 = this.c;.swift
if (yr6 == null) {.swift
yr6 = new npg(10);.swift
}.swift
return new fk4(i, z, yr6, (ScheduledExecutorService) this.b, (ud0) this.d, this.e);.swift
}.swift
}.swift
