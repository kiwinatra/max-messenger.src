package defpackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ls3  reason: default package */
public final /* synthetic */ class ls3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns3 b;

    public /* synthetic */ ls3(ns3 ns3, int i) {
        this.a = i;
        this.b = ns3;
    }

    public final int compare(Object obj, Object obj2) {
        vk3 vk3 = (vk3) obj;
        vk3 vk32 = (vk3) obj2;
        switch (this.a) {
            case 0:
                return ns3.a(vk3, vk32, (Collator) this.b.a.f());
            default:
                ConcurrentHashMap concurrentHashMap = this.b.g;
                int intValue = ((Integer) concurrentHashMap.get(Long.valueOf(vk3.r()))).intValue();
                int intValue2 = ((Integer) concurrentHashMap.get(Long.valueOf(vk32.r()))).intValue();
                if (intValue < intValue2) {
                    return -1;
                }
                return intValue == intValue2 ? 0 : 1;
        }
    }
}
