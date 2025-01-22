package otus.gpb.hilt

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton
import kotlin.random.Random

@HiltAndroidApp
class HiltApp : Application()

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Num

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NumNoScope

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Num
    @Provides
    @Singleton
    fun num(): Int = 5

    @NumNoScope
    @Provides
    fun numNoScope(): Int = Random.nextInt(1, 100)
}

