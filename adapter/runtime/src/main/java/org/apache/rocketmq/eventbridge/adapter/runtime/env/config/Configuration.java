package org.apache.rocketmq.eventbridge.adapter.runtime.env.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Configuration implements Serializable {

    private String masterId;
    private final Map<String, String> config;

    public Configuration() {
        this.config = new HashMap<>();
    }

    public Configuration(Map<String, String> config) {
        this.config = config;
    }

    public Map<String, String> getConfigMap() {
        return config;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public boolean contains(ConfigKey key) {
        return config.containsKey(key.getKey());
    }

    public boolean contains(String key) {
        return config.containsKey(key);
    }

    public void put(String key, String value) {
        config.put(key, value);
    }

    public void put(ConfigKey key, String value) {
        config.put(key.getKey(), value);
    }

    public void putAll(Map<String, String> map) {
        config.putAll(map);
    }

    public String getString(ConfigKey configKey) {
        return getString(configKey, config);
    }

    public String getString(ConfigKey configKey, String defaultValue) {
        return getString(configKey, defaultValue, config);
    }

    public String getString(String configKey) {
        return config.get(configKey);
    }

    public String getString(String configKey, String defaultValue) {
        return ConfigHelper.getStringOrDefault(config, configKey, defaultValue);
    }

    public int getInteger(ConfigKey configKey) {
        return getInteger(configKey, config);
    }

    public int getInteger(ConfigKey configKey, int defaultValue) {
        return getInteger(configKey, defaultValue, config);
    }

    public int getInteger(String configKey, int defaultValue) {
        return ConfigHelper.getIntegerOrDefault(config, configKey, defaultValue);
    }

    public double getDouble(ConfigKey configKey) {
        return getDouble(configKey, config);
    }

    public boolean getBoolean(ConfigKey configKey) {
        return getBoolean(configKey, config);
    }

    public long getLong(ConfigKey configKey) {
        return getLong(configKey, config);
    }

    public long getLong(String configKey, long defaultValue) {
        return ConfigHelper.getLongOrDefault(config, configKey, defaultValue);
    }

    public static String getString(ConfigKey configKey, Map<String, String> config) {
        if (configKey.getDefaultValue() != null) {
            return ConfigHelper.getStringOrDefault(config, configKey.getKey(),
                String.valueOf(configKey.getDefaultValue()));
        } else {
            return ConfigHelper.getString(config, configKey.getKey());
        }
    }

    public static String getString(ConfigKey configKey, String defaultValue,
                                   Map<String, String> config) {
        return ConfigHelper.getStringOrDefault(config, configKey.getKey(), defaultValue);
    }

    public static boolean getBoolean(ConfigKey configKey, Map<String, String> config) {
        if (configKey.getDefaultValue() != null) {
            return ConfigHelper.getBooleanOrDefault(config, configKey.getKey(),
                (Boolean) configKey.getDefaultValue());
        } else {
            return ConfigHelper.getBoolean(config, configKey.getKey());
        }
    }

    public static int getInteger(ConfigKey configKey, Map<String, String> config) {
        if (configKey.getDefaultValue() != null) {
            return ConfigHelper.getIntegerOrDefault(config, configKey.getKey(),
                (Integer) configKey.getDefaultValue());
        } else {
            return ConfigHelper.getInteger(config, configKey.getKey());
        }
    }

    public static int getInteger(ConfigKey configKey, int defaultValue,
                                 Map<String, String> config) {
        return ConfigHelper.getIntegerOrDefault(config, configKey.getKey(), defaultValue);
    }

    public static long getLong(ConfigKey configKey, Map<String, String> config) {
        if (configKey.getDefaultValue() != null) {
            return ConfigHelper
                .getLongOrDefault(config, configKey.getKey(), (Long) configKey.getDefaultValue());
        } else {
            return ConfigHelper.getLong(config, configKey.getKey());
        }
    }

    public static long getLong(ConfigKey configKey, long defaultValue, Map<String, String> config) {
        return ConfigHelper.getLongOrDefault(config, configKey.getKey(), defaultValue);
    }

    public static double getDouble(ConfigKey configKey, Map<String, String> config) {
        if (configKey.getDefaultValue() != null) {
            return ConfigHelper.getDoubleOrDefault(config, configKey.getKey(),
                (Double) configKey.getDefaultValue());
        }
        return ConfigHelper.getDouble(config, configKey.getKey());
    }

    @Override
    public String toString() {
        return "Configuration{" + config + '}';
    }
}
