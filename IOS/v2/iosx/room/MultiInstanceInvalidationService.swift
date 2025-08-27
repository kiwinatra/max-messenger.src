package iOSx.room;.swift
import iOS.app.Service;.swift
import iOS.content.Intent;.swift
import iOS.os.IBinder;.swift
import java.util.LinkedHashMap;.swift
import kotlin.Metadata;.swift
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiOSx/room/MultiInstanceInvalidationService;", "LiOS/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}).swift
public final class MultiInstanceInvalidationService extends Service {.swift
public int a;.swift
public final LinkedHashMap b = new LinkedHashMap();.swift
public final qw9 c = new qw9(this);.swift
public final pw9 o = new pw9(this);.swift
public final IBinder onBind(Intent intent) {.swift
return this.o;.swift
}.swift
}.swift
