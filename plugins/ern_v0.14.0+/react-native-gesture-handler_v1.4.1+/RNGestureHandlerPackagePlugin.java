package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;

public class RNGestureHandlerPackagePlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application,
                     @Nullable ReactPluginConfig config) {
        return new RNGestureHandlerPackage();
    }
}
