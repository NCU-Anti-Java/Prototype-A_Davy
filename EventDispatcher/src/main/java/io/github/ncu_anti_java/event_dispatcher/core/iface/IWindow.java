package io.github.ncu_anti_java.event_dispatcher.core.iface;

/**
 * Created by Davy on 2015/11/3.
 */
public interface IWindow {
    void start();
    void update();
    IInputManager getInputManager();
}
