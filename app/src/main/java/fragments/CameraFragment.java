package fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import model.camera.ImageTargets;
import com.example.sh.elmoezstreet.R;

/**
 * Created by sh on 6/6/2016.
 */
public class CameraFragment extends Fragment {

    View cameraView;
    Button startCameraActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("cameraView", "called");
        cameraView=inflater.inflate(R.layout.activity_camera,container,false);

        return cameraView;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        startCameraActivity=(Button)cameraView.findViewById(R.id.startCamera);
        TextView info = (TextView) cameraView.findViewById(R.id.textView1);
        info.setText("We will show you our history.Click the button and focus the camera, you will see everything ^_^");

        //when click on startCameraActivity button will open gps activity
        startCameraActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ImageTargets.class);
                startActivity(intent);


            }
        });
    }


}
