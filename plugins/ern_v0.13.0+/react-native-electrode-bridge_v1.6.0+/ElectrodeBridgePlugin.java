package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactPackage;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgePackage;

public class ElectrodeBridgePlugin implements ReactPlugin {
    @Override
    public ReactPackage hook(@NonNull Application application,
                      @Nullable ReactPluginConfig config) {
        return new ElectrodeBridgePackage();
    }
}
