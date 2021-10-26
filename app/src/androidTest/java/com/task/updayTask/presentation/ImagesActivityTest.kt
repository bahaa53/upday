package com.task.updayTask.presentation

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.LargeTest
import androidx.test.filters.MediumTest
import androidx.test.runner.AndroidJUnit4
import com.google.common.truth.Truth
import com.task.updayTask.R
import com.task.updayTask.domain.repositories.Result
import com.task.updayTask.presentation.imagesStory.ImagesActivity
import kotlinx.coroutines.delay
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.logging.Handler


@RunWith(AndroidJUnit4::class)
@LargeTest
class ImagesActivityTest {

    val page : Int = 1

    @Test
    fun testLoadMoreAction() {
        ActivityScenario.launch(ImagesActivity::class.java)
        Espresso.onView(withId(R.id.rv_images))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(20))
        //delay(15000L)
        android.os.Handler().postDelayed(
             {
                 //Still need more thinking to handle it as expected
                Truth.assertThat(page).isEqualTo(2)
            },15000)

    }
}