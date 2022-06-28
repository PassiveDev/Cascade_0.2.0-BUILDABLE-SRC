/*
 * Decompiled with CFR 0.151.
 */
package cascade.event.events;

import cascade.event.EventStage;
import cascade.features.modules.Module;

public class ModuleToggleEvent
extends EventStage {

    public static class Disable
    extends ModuleToggleEvent {
        Module module;

        public Disable(Module module) {
            this.module = module;
        }

        public Module getModule() {
            return this.module;
        }
    }

    public static class Enable
    extends ModuleToggleEvent {
        Module module;

        public Enable(Module module) {
            this.module = module;
        }

        public Module getModule() {
            return this.module;
        }
    }
}

