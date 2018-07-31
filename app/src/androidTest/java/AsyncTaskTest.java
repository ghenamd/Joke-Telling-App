import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest  {


    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testResult() throws Throwable {
        final EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(mRule.getActivity()) {
            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                Assert.assertNotNull(result);
                Assert.assertTrue(!result.isEmpty() );
            }
        };

        // Executed on UiThread due to the mProgressBar error:
        // {Only the original thread that created a view hierarchy can touch its views}
        mRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                asyncTask.execute();
            }
        });

    }




}
