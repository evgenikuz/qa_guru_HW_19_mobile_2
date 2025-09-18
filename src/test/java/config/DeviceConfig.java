package config;

import org.aeonbits.owner.Config;

public interface DeviceConfig extends Config {
    @Key("device")
    @DefaultValue("Google Pixel 5")
    String getDevice();

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("version")
    @DefaultValue("11.0")
    String getVersion();
}
