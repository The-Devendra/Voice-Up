package com.devendra.voiceup.app.di;

/**
 * Created by Devendra Mehra on 5/6/2019.
 */

import com.devendra.voiceup.registration.sign_in.di.SignInModule;
import com.devendra.voiceup.registration.sign_in.view.SignInActivity;
import com.devendra.voiceup.registration.sign_up.di.SignUpModule;
import com.devendra.voiceup.registration.sign_up.view.SignUpActivity;
import com.devendra.voiceup.splash_screen.di.SplashScreenModule;
import com.devendra.voiceup.splash_screen.view.SplashScreenActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SignUpModule.class)
    abstract SignUpActivity contributeSignUpActivityInjector();

    @ContributesAndroidInjector(modules = SignInModule.class)
    abstract SignInActivity contributeSignInActivityInjector();


    @ContributesAndroidInjector(modules = SplashScreenModule.class)
    abstract SplashScreenActivity contributeSplashScreenActivityInjector();

}
