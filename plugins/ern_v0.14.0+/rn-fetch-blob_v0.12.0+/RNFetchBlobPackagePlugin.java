package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactPackage;
import com.RNFetchBlob.RNFetchBlobPackage;

public class RNFetchBlobPackagePlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new RNFetchBlobPackage();
    }
}
