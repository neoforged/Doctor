// Generated by jextract

package net.renderdoc.api;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*pRENDERDOC_TriggerCapture)();
 * }
 */
public interface pRENDERDOC_TriggerCapture {

    void apply();
    static MemorySegment allocate(pRENDERDOC_TriggerCapture fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$8.const$5, fi, constants$3.const$5, scope);
    }
    static pRENDERDOC_TriggerCapture ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$4.const$1.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


