package model.puzzlegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sh.elmoezstreet.R;

import model.stories.Stories;

public class WinGame extends AppCompatActivity {

    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
String activityName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        activityName=extras.getString("activity_name");


        if(activityName.equals("Al-Hakim")){

            setContentView(R.layout.alhakim_info);


        }
        else if(activityName.equals("Barquq")){

            setContentView(R.layout.barqoq_info);


        }
        else if(activityName.equals("Qalawoun")){

            setContentView(R.layout.qalwoun_info);


        }


        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);



        fade_in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
//sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();


        TextView storyText=(TextView)findViewById(R.id.storyText);
        storyText.setText(Stories.AL_HAKIM);
    }
}
