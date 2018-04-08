package com.particlereact;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import io.particle.android.sdk.devicesetup.ParticleDeviceSetupLibrary;

/**
 * Created by Julius.
 */
public class ParticleModule extends ReactContextBaseJavaModule {

    public ParticleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ParticleSetup";
    }

    @ReactMethod
    public void startSetup() {
        ParticleDeviceSetupLibrary.startDeviceSetup(getReactApplicationContext(), MainActivity.class);
    }
}