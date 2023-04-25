package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactPackage;
import org.wonday.pdf.RCTPdfView;

public class RCTPdfViewPlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new RCTPdfView();
    }
}
