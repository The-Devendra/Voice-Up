package com.devendra.voiceup.post.di;

import androidx.lifecycle.MutableLiveData;

import com.devendra.voiceup.database.AppDatabase;
import com.devendra.voiceup.home.model.HomeModel;
import com.devendra.voiceup.home.view_model.HomeViewModelFactory;
import com.devendra.voiceup.post.model.PostModel;
import com.devendra.voiceup.post.view_model.PostViewModelFactory;
import com.devendra.voiceup.utils.Preferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Devendra Mehra on 6/13/2019.
 */
@Module
public class PostModule {

    @Provides
    PostViewModelFactory providePostViewModelFactory(PostModel postModel) {
        return new PostViewModelFactory(postModel);
    }

    @Provides
    PostModel providePostModel(AppDatabase appDatabase, Preferences preferences) {
        return new PostModel(appDatabase, preferences);
    }

}
