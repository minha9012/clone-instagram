package minggu.com.instagramclone.materialcamera;

import android.app.Fragment;
import androidx.annotation.NonNull;

import minggu.com.instagramclone.materialcamera.internal.BaseCaptureActivity;
import minggu.com.instagramclone.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
